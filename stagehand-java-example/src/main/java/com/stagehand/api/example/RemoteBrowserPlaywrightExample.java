package com.stagehand.api.example;

import com.browserbase.api.client.StagehandClient;
import com.browserbase.api.client.okhttp.StagehandOkHttpClient;
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.core.RequestOptions;
import com.browserbase.api.core.http.StreamResponse;
import com.browserbase.api.models.sessions.ModelConfig;
import com.browserbase.api.models.sessions.SessionActParams;
import com.browserbase.api.models.sessions.SessionEndParams;
import com.browserbase.api.models.sessions.SessionExecuteParams;
import com.browserbase.api.models.sessions.SessionExtractParams;
import com.browserbase.api.models.sessions.SessionNavigateParams;
import com.browserbase.api.models.sessions.SessionObserveParams;
import com.browserbase.api.models.sessions.SessionStartParams;
import com.browserbase.api.models.sessions.SessionStartResponse;
import com.browserbase.api.models.sessions.StreamEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;

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
        Env.load();
        // Create client using environment variables
        // BROWSERBASE_API_KEY, BROWSERBASE_PROJECT_ID, MODEL_API_KEY
        StagehandClient client = StagehandOkHttpClient.builder().fromEnv().build();

        // Start a new remote Browserbase session (Playwright)
        SessionStartResponse startResponse = client.sessions()
                .start(SessionStartParams.builder()
                        .modelName("anthropic/claude-sonnet-4-6")
                        .browser(SessionStartParams.Browser.builder()
                                .type(SessionStartParams.Browser.Type.BROWSERBASE)
                                .build())
                        .browserbaseSessionCreateParams(SessionStartParams.BrowserbaseSessionCreateParams.builder()
                                .projectId(System.getProperty("stagehand.browserbaseProjectId"))
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
                    .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                    .build();
            try (StreamResponse<StreamEvent> observeStream = client.sessions().observeStreaming(observeParams)) {
                printStreamEvents("observe", observeStream);
            }

            // Pass the structured action to Act (streaming)
            SessionActParams actParams = SessionActParams.builder()
                    .id(sessionId)
                    .input("Click the comments link for the top post")
                    .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                    .build();
            try (StreamResponse<StreamEvent> actStream = client.sessions().actStreaming(actParams)) {
                printStreamEvents("act", actStream);
            }

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
                    .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                    .build();
            try (StreamResponse<StreamEvent> extractStream = client.sessions().extractStreaming(extractParams)) {
                printStreamEvents("extract", extractStream);
            }

            // Use the Agent to find the author's profile (streaming)
            SessionExecuteParams executeParams = SessionExecuteParams.builder()
                    .id(sessionId)
                    .executeOptions(SessionExecuteParams.ExecuteOptions.builder()
                            .instruction(String.format("Find any personal website, GitHub, LinkedIn, or other best"
                                    + " profile URL for the top comment author on this page."
                                    + " Click on the username to go to their profile page and"
                                    + " look for any links they have shared. Use Google Search"
                                    + " with their username or other details from their profile"
                                    + " if you don't find any direct links."))
                            .maxSteps(15.0)
                            .build())
                    .agentConfig(SessionExecuteParams.AgentConfig.builder()
                            .model(ModelConfig.builder()
                                    .modelName("anthropic/claude-sonnet-4-6")
                                    .apiKey(System.getProperty("stagehand.modelApiKey"))
                                    .build())
                            .cua(false)
                            .build())
                    .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                    .build();
            try (StreamResponse<StreamEvent> executeStream = client.sessions()
                    .executeStreaming(
                            executeParams,
                            RequestOptions.builder()
                                    .timeout(Duration.ofMinutes(5))
                                    .build())) {
                printStreamEvents("execute", executeStream);
            }

        } finally {
            // End the session to clean up resources
            client.sessions().end(SessionEndParams.builder().id(sessionId).build());
            System.out.println("Session ended");
        }
    }

    private static void printStreamEvents(String label, StreamResponse<StreamEvent> stream) {
        stream.stream().forEach(event -> System.out.println("[" + label + "] " + event.type() + " " + event.data()));
        System.out.println("[" + label + "] stream complete");
    }
}
