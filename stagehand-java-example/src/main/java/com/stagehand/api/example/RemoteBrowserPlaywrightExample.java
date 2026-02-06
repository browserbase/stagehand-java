package com.stagehand.api.example;

import com.browserbase.api.client.StagehandClient;
import com.browserbase.api.client.okhttp.StagehandOkHttpClient;
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.core.RequestOptions;
import com.browserbase.api.core.http.StreamResponse;
import com.browserbase.api.models.sessions.Action;
import com.browserbase.api.models.sessions.ModelConfig;
import com.browserbase.api.models.sessions.SessionActParams;
import com.browserbase.api.models.sessions.SessionActResponse;
import com.browserbase.api.models.sessions.SessionEndParams;
import com.browserbase.api.models.sessions.SessionExecuteParams;
import com.browserbase.api.models.sessions.SessionExecuteResponse;
import com.browserbase.api.models.sessions.SessionExtractParams;
import com.browserbase.api.models.sessions.SessionExtractResponse;
import com.browserbase.api.models.sessions.SessionNavigateParams;
import com.browserbase.api.models.sessions.SessionObserveParams;
import com.browserbase.api.models.sessions.SessionObserveResponse;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;
import com.browserbase.api.models.sessions.StreamEvent;
import com.browserbase.api.models.sessions.StreamEvent.Data.StreamEventLogDataOutput;
import com.browserbase.api.models.sessions.StreamEvent.Data.StreamEventSystemDataOutput;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Remote Browserbase + Playwright example demonstrating SSE streaming.
 *
 * This example shows the full flow of:
 * 1. Starting a remote Browserbase session (Playwright)
 * 2. Navigating to a webpage
 * 3. Observing possible actions (streaming)
 * 4. Acting on an element (streaming)
 * 5. Extracting structured data (streaming)
 * 6. Running an autonomous agent (streaming)
 * 7. Ending the session
 *
 * Required environment variables:
 * - BROWSERBASE_API_KEY: Your Browserbase API key
 * - BROWSERBASE_PROJECT_ID: Your Browserbase project ID
 * - MODEL_API_KEY: Your OpenAI API key
 */
public class RemoteBrowserPlaywrightExample {
    public static void main(String[] args) {
        // Create client using environment variables
        // BROWSERBASE_API_KEY, BROWSERBASE_PROJECT_ID, MODEL_API_KEY
        StagehandClient client = StagehandOkHttpClient.fromEnv();

        // Start a new remote Browserbase session (Playwright)
        SessionStartResponse startResponse = client.sessions()
                .start(SessionStartParams.builder()
                        .modelName("openai/gpt-5-nano")
                        .browser(SessionStartParams.Browser.builder()
                                .type(SessionStartParams.Browser.Type.BROWSERBASE)
                                .build())
                        .browserbaseSessionCreateParams(SessionStartParams.BrowserbaseSessionCreateParams.builder()
                                .projectId(System.getenv("BROWSERBASE_PROJECT_ID"))
                                .build())
                        .build());

        String sessionId = startResponse.data().sessionId();
        System.out.println("Session started: " + sessionId);

        try {
            // Navigate to Hacker News
            client.sessions()
                    .navigate(SessionNavigateParams.builder()
                            .id(sessionId)
                            .url("https://news.ycombinator.com")
                            .build());
            System.out.println("Navigated to Hacker News");

            // Observe to find possible actions - looking for the comments link (streaming)
            SessionObserveParams observeParams = SessionObserveParams.builder()
                    .id(sessionId)
                    .instruction("find the link to view comments for the top post")
                    .build();
            SessionObserveResponse observeResponse = streamResponse(
                    "observe", client.sessions().observeStreaming(observeParams), SessionObserveResponse.class);

            List<SessionObserveResponse.Data.Result> results =
                    observeResponse.data().result();
            System.out.println("Found " + results.size() + " possible actions");

            if (results.isEmpty()) {
                System.out.println("No actions found");
                return;
            }

            // Use the first result - convert to Action since they share the same shape
            SessionObserveResponse.Data.Result result = results.get(0);
            Action action = JsonValue.from(result).convert(Action.class);
            System.out.println("Acting on: " + action.description());

            // Pass the structured action to Act (streaming)
            SessionActParams actParams =
                    SessionActParams.builder().id(sessionId).input(action).build();
            SessionActResponse actResponse =
                    streamResponse("act", client.sessions().actStreaming(actParams), SessionActResponse.class);
            System.out.println("Act completed: " + actResponse.data().result().message());

            // Extract data from the page (streaming)
            SessionExtractParams extractParams = SessionExtractParams.builder()
                    .id(sessionId)
                    .instruction("extract the text of the top comment on this page")
                    .schema(SessionExtractParams.Schema.builder()
                            .putAdditionalProperty("type", JsonValue.from("object"))
                            .putAdditionalProperty(
                                    "properties",
                                    JsonValue.from(Map.of(
                                            "commentText",
                                            Map.of(
                                                    "type",
                                                    "string",
                                                    "description",
                                                    "The text content of the top comment"),
                                            "author",
                                            Map.of(
                                                    "type",
                                                    "string",
                                                    "description",
                                                    "The username of the comment author"))))
                            .putAdditionalProperty("required", JsonValue.from(List.of("commentText")))
                            .build())
                    .build();
            SessionExtractResponse extractResponse = streamResponse(
                    "extract", client.sessions().extractStreaming(extractParams), SessionExtractResponse.class);

            // Get the extracted result
            JsonValue extractedResult = extractResponse.data()._result();
            System.out.println("Extracted data: " + extractedResult);

            // Get the author from the extracted data
            String author = "unknown";
            Optional<Map<String, JsonValue>> extractedObject = extractedResult.asObject();
            if (extractedObject.isPresent()) {
                JsonValue authorValue = extractedObject.get().get("author");
                if (authorValue != null) {
                    author = (String) authorValue.asString().orElse("unknown");
                }
            }
            System.out.println("Looking up profile for author: " + author);

            // Use the Agent to find the author's profile (streaming)
            SessionExecuteParams executeParams = SessionExecuteParams.builder()
                    .id(sessionId)
                    .executeOptions(SessionExecuteParams.ExecuteOptions.builder()
                            .instruction(String.format(
                                    "Find any personal website, GitHub, LinkedIn, or other best"
                                            + " profile URL for the Hacker News user '%s'. Click on their"
                                            + " username to go to their profile page and look for any"
                                            + " links they have shared. Use Google Search with their"
                                            + " username or other details from their profile if you dont"
                                            + " find any direct links.",
                                    author))
                            .maxSteps(15.0)
                            .build())
                    .agentConfig(SessionExecuteParams.AgentConfig.builder()
                            .model(ModelConfig.builder()
                                    .modelName("openai/gpt-5-nano")
                                    .apiKey(System.getenv("MODEL_API_KEY"))
                                    .build())
                            .cua(false)
                            .build())
                    .build();
            SessionExecuteResponse executeResponse = streamResponse(
                    "agent",
                    client.sessions()
                            .executeStreaming(
                                    executeParams,
                                    RequestOptions.builder()
                                            .timeout(Duration.ofMinutes(5))
                                            .build()),
                    SessionExecuteResponse.class);

            System.out.println(
                    "Agent completed: " + executeResponse.data().result().message());
            System.out.println(
                    "Agent success: " + executeResponse.data().result().success());
            System.out.println("Agent actions taken: "
                    + executeResponse.data().result().actions().size());

        } finally {
            // End the session to clean up resources
            client.sessions().end(SessionEndParams.builder().id(sessionId).build());
            System.out.println("Session ended");
        }
    }

    private static <T> T streamResponse(
            String label, StreamResponse<StreamEvent> streamResponse, Class<T> responseClass) {
        StreamEventSystemDataOutput finalEvent = null;

        try (StreamResponse<StreamEvent> response = streamResponse) {
            for (StreamEvent event : (Iterable<StreamEvent>) response.stream()::iterator) {
                StreamEvent.Data data = event.data();

                if (data.isStreamEventLogDataOutput()) {
                    StreamEventLogDataOutput log = data.asStreamEventLogDataOutput();
                    System.out.println("[" + label + "] " + log.message());
                    continue;
                }

                if (data.isStreamEventSystemDataOutput()) {
                    StreamEventSystemDataOutput systemData = data.asStreamEventSystemDataOutput();
                    System.out.println(
                            "[" + label + "] status=" + systemData.status().value());

                    if (systemData.status().value() == StreamEventSystemDataOutput.Status.Value.ERROR) {
                        throw new RuntimeException(
                                "Stream error: " + systemData.error().orElse("unknown"));
                    }

                    if (systemData.status().value() == StreamEventSystemDataOutput.Status.Value.FINISHED) {
                        finalEvent = systemData;
                    }
                }
            }
        }

        if (finalEvent == null) {
            throw new IllegalStateException("No final stream result for " + label);
        }

        return finalEvent._result().convert(responseClass);
    }
}
