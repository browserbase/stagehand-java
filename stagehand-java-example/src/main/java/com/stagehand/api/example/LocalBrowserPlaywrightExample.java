package com.stagehand.api.example;

import com.browserbase.api.client.StagehandClient;
import com.browserbase.api.client.okhttp.StagehandOkHttpClient;
import com.browserbase.api.core.JsonValue;
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
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocalBrowserPlaywrightExample {
    public static void main(String[] args) {
        StagehandClient client = StagehandOkHttpClient.fromEnv();

        SessionStartParams startParams = SessionStartParams.builder()
                .modelName("openai/gpt-5-nano")
                .browser(SessionStartParams.Browser.builder()
                        .type(SessionStartParams.Browser.Type.LOCAL)
                        .launchOptions(SessionStartParams.Browser.LaunchOptions.builder()
                                .headless(true)
                                .build())
                        .build())
                .build();

        SessionStartResponse startResponse = client.sessions().start(startParams);
        String sessionId = startResponse.data().sessionId();
        String cdpUrl = startResponse.data().cdpUrl().orElse(null);
        if (cdpUrl == null || cdpUrl.isEmpty()) {
            throw new IllegalStateException("No cdpUrl returned for local session.");
        }

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().connectOverCDP(cdpUrl);
            BrowserContext context = browser.contexts().isEmpty()
                    ? browser.newContext()
                    : browser.contexts().get(0);
            Page page = context.pages().isEmpty()
                    ? context.newPage()
                    : context.pages().get(0);

            try {
                client.sessions()
                        .navigate(SessionNavigateParams.builder()
                                .id(sessionId)
                                .url("https://example.com")
                                .build());
                page.navigate("https://example.com");

                try (StreamResponse<StreamEvent> observeStream = client.sessions()
                        .observeStreaming(SessionObserveParams.builder()
                                .id(sessionId)
                                .instruction("Find the most relevant click target on this page")
                                .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                                .build())) {
                    printStreamEvents("observe", observeStream);
                }

                try (StreamResponse<StreamEvent> actStream = client.sessions()
                        .actStreaming(SessionActParams.builder()
                                .id(sessionId)
                                .input("Click the 'Learn more' link")
                                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                                .build())) {
                    printStreamEvents("act", actStream);
                }

                SessionExtractParams.Schema schema = SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("type", JsonValue.from("object"))
                        .putAdditionalProperty(
                                "properties",
                                JsonValue.from(java.util.Map.of(
                                        "title", java.util.Map.of("type", "string"),
                                        "h1", java.util.Map.of("type", "string"))))
                        .putAdditionalProperty("required", JsonValue.from(java.util.List.of("title", "h1")))
                        .build();

                try (StreamResponse<StreamEvent> extractStream = client.sessions()
                        .extractStreaming(SessionExtractParams.builder()
                                .id(sessionId)
                                .instruction("Extract the page title and the primary heading (h1) text")
                                .schema(schema)
                                .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                                .build())) {
                    printStreamEvents("extract", extractStream);
                }

                try (StreamResponse<StreamEvent> executeStream = client.sessions()
                        .executeStreaming(SessionExecuteParams.builder()
                                .id(sessionId)
                                .executeOptions(SessionExecuteParams.ExecuteOptions.builder()
                                        .instruction("Click the 'Learn more' link if available")
                                        .maxSteps(3.0)
                                        .build())
                                .agentConfig(SessionExecuteParams.AgentConfig.builder()
                                        .model(ModelConfig.builder()
                                                .modelName("openai/gpt-5-nano")
                                                .apiKey(System.getenv("MODEL_API_KEY"))
                                                .build())
                                        .cua(false)
                                        .build())
                                .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                                .build())) {
                    printStreamEvents("execute", executeStream);
                }
            } finally {
                client.sessions().end(SessionEndParams.builder().id(sessionId).build());
                browser.close();
            }
        }
    }

    private static void printStreamEvents(String label, StreamResponse<StreamEvent> stream) {
        stream.stream().forEach(event -> System.out.println("[" + label + "] " + event.type() + " " + event.data()));
        System.out.println("[" + label + "] stream complete");
    }
}
