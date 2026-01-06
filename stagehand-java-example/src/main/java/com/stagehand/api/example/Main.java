package com.stagehand.api.example;

import com.browserbase.api.client.StagehandClient;
import com.browserbase.api.client.okhttp.StagehandOkHttpClient;
import com.browserbase.api.core.JsonValue;
import com.browserbase.api.core.RequestOptions;
import com.browserbase.api.models.sessions.*;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Basic example demonstrating the Stagehand Java SDK.
 *
 * This example shows the full flow of:
 * 1. Starting a browser session
 * 2. Navigating to a webpage
 * 3. Observing to find possible actions
 * 4. Acting on an element
 * 5. Extracting structured data
 * 6. Running an autonomous agent
 * 7. Ending the session
 *
 * Required environment variables:
 * - BROWSERBASE_API_KEY: Your Browserbase API key
 * - BROWSERBASE_PROJECT_ID: Your Browserbase project ID
 * - MODEL_API_KEY: Your OpenAI API key
 */
public class Main {

    // SDK version for API compatibility (matches TypeScript SDK v3)
    private static final String SDK_VERSION = "3.0.6";

    public static void main(String[] args) {
        // Create client using environment variables
        // BROWSERBASE_API_KEY, BROWSERBASE_PROJECT_ID, MODEL_API_KEY
        StagehandClient client = StagehandOkHttpClient.fromEnv();

        // Start a new browser session
        SessionStartResponse startResponse = client.sessions().start(
            SessionStartParams.builder()
                .modelName("openai/gpt-5-nano")
                .xLanguage(SessionStartParams.XLanguage.TYPESCRIPT)
                .xSdkVersion(SDK_VERSION)
                .build()
        );

        String sessionId = startResponse.data().sessionId();
        System.out.println("Session started: " + sessionId);

        try {
            // Navigate to Hacker News
            client.sessions().navigate(
                SessionNavigateParams.builder()
                    .id(sessionId)
                    .url("https://news.ycombinator.com")
                    .frameId("")  // Empty string for main frame
                    .xLanguage(SessionNavigateParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build()
            );
            System.out.println("Navigated to Hacker News");

            // Observe to find possible actions - looking for the comments link
            SessionObserveResponse observeResponse = client.sessions().observe(
                SessionObserveParams.builder()
                    .id(sessionId)
                    .instruction("find the link to view comments for the top post")
                    .xLanguage(SessionObserveParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build()
            );

            List<SessionObserveResponse.Data.Result> results = observeResponse.data().result();
            System.out.println("Found " + results.size() + " possible actions");

            if (results.isEmpty()) {
                System.out.println("No actions found");
                return;
            }

            // Use the first result - convert to Action since they share the same shape
            SessionObserveResponse.Data.Result result = results.get(0);
            Action action = JsonValue.from(result).convert(Action.class);
            System.out.println("Acting on: " + action.description());

            // Pass the structured action to Act
            SessionActResponse actResponse = client.sessions().act(
                SessionActParams.builder()
                    .id(sessionId)
                    .input(action)
                    .xLanguage(SessionActParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build()
            );
            System.out.println("Act completed: " + actResponse.data().result().message());

            // Extract data from the page
            // We're now on the comments page, so extract the top comment text
            SessionExtractResponse extractResponse = client.sessions().extract(
                SessionExtractParams.builder()
                    .id(sessionId)
                    .instruction("extract the text of the top comment on this page")
                    .schema(SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("type", JsonValue.from("object"))
                        .putAdditionalProperty("properties", JsonValue.from(Map.of(
                            "commentText", Map.of(
                                "type", "string",
                                "description", "The text content of the top comment"
                            ),
                            "author", Map.of(
                                "type", "string",
                                "description", "The username of the comment author"
                            )
                        )))
                        .putAdditionalProperty("required", JsonValue.from(List.of("commentText")))
                        .build())
                    .xLanguage(SessionExtractParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build()
            );

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

            // Use the Agent to find the author's profile
            // Execute runs an autonomous agent that can navigate and interact with pages
            // Use a longer timeout (5 minutes) since agent execution can take a while
            SessionExecuteResponse executeResponse = client.sessions().execute(
                SessionExecuteParams.builder()
                    .id(sessionId)
                    .executeOptions(SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(String.format(
                            "Find any personal website, GitHub, LinkedIn, or other best profile URL for the Hacker News user '%s'. " +
                            "Click on their username to go to their profile page and look for any links they have shared. " +
                            "Use Google Search with their username or other details from their profile if you dont find any direct links.",
                            author
                        ))
                        .maxSteps(15.0)
                        .build())
                    .agentConfig(SessionExecuteParams.AgentConfig.builder()
                        .model(ModelConfig.ofModelConfigObject(
                            ModelConfig.ModelConfigObject.builder()
                                .modelName("openai/gpt-5-nano")
                                .apiKey(System.getenv("MODEL_API_KEY"))
                                .build()
                        ))
                        .cua(false)
                        .build())
                    .xLanguage(SessionExecuteParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build(),
                RequestOptions.builder().timeout(Duration.ofMinutes(5)).build()
            );

            System.out.println("Agent completed: " + executeResponse.data().result().message());
            System.out.println("Agent success: " + executeResponse.data().result().success());
            System.out.println("Agent actions taken: " + executeResponse.data().result().actions().size());

        } finally {
            // End the session to clean up resources
            client.sessions().end(
                SessionEndParams.builder()
                    .id(sessionId)
                    .xLanguage(SessionEndParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion(SDK_VERSION)
                    .build()
            );
            System.out.println("Session ended");
        }
    }
}
