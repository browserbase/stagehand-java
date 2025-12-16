// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.services.blocking

import com.stagehand.api.TestServerExtension
import com.stagehand.api.client.okhttp.BrowserbaseOkHttpClient
import com.stagehand.api.core.JsonValue
import com.stagehand.api.models.sessions.ModelConfig
import com.stagehand.api.models.sessions.SessionActParams
import com.stagehand.api.models.sessions.SessionExecuteAgentParams
import com.stagehand.api.models.sessions.SessionExtractParams
import com.stagehand.api.models.sessions.SessionNavigateParams
import com.stagehand.api.models.sessions.SessionObserveParams
import com.stagehand.api.models.sessions.SessionStartParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun act() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.act(
                SessionActParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                    .input("click the sign in button")
                    .frameId("frameId")
                    .options(
                        SessionActParams.Options.builder()
                            .model(
                                ModelConfig.builder()
                                    .apiKey("apiKey")
                                    .baseUrl("https://example.com")
                                    .model("model")
                                    .provider(ModelConfig.Provider.OPENAI)
                                    .build()
                            )
                            .timeout(0L)
                            .variables(
                                SessionActParams.Options.Variables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response = sessionService.end("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun executeAgent() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.executeAgent(
                SessionExecuteAgentParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xStreamResponse(SessionExecuteAgentParams.XStreamResponse.TRUE)
                    .agentConfig(
                        SessionExecuteAgentParams.AgentConfig.builder()
                            .cua(true)
                            .model("openai/gpt-4o")
                            .provider(SessionExecuteAgentParams.AgentConfig.Provider.OPENAI)
                            .systemPrompt("systemPrompt")
                            .build()
                    )
                    .executeOptions(
                        SessionExecuteAgentParams.ExecuteOptions.builder()
                            .instruction("Find and click the first product")
                            .highlightCursor(true)
                            .maxSteps(10L)
                            .build()
                    )
                    .frameId("frameId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun extract() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.extract(
                SessionExtractParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("extract the page title")
                    .options(
                        SessionExtractParams.Options.builder()
                            .model(
                                ModelConfig.builder()
                                    .apiKey("apiKey")
                                    .baseUrl("https://example.com")
                                    .model("model")
                                    .provider(ModelConfig.Provider.OPENAI)
                                    .build()
                            )
                            .selector("selector")
                            .timeout(0L)
                            .build()
                    )
                    .schema(
                        SessionExtractParams.Schema.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun navigate() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.navigate(
                SessionNavigateParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xStreamResponse(SessionNavigateParams.XStreamResponse.TRUE)
                    .url("https://example.com")
                    .frameId("frameId")
                    .options(
                        SessionNavigateParams.Options.builder()
                            .waitUntil(SessionNavigateParams.Options.WaitUntil.LOAD)
                            .build()
                    )
                    .build()
            )

        val unwrappedResponse = response.getOrNull()
        unwrappedResponse?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun observe() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val actions =
            sessionService.observe(
                SessionObserveParams.builder()
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("instruction")
                    .options(
                        SessionObserveParams.Options.builder()
                            .model(
                                ModelConfig.builder()
                                    .apiKey("apiKey")
                                    .baseUrl("https://example.com")
                                    .model("model")
                                    .provider(ModelConfig.Provider.OPENAI)
                                    .build()
                            )
                            .selector("selector")
                            .timeout(0L)
                            .build()
                    )
                    .build()
            )

        actions.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.start(
                SessionStartParams.builder()
                    .env(SessionStartParams.Env.LOCAL)
                    .apiKey("apiKey")
                    .domSettleTimeout(0L)
                    .localBrowserLaunchOptions(
                        SessionStartParams.LocalBrowserLaunchOptions.builder()
                            .headless(true)
                            .build()
                    )
                    .model("openai/gpt-4o")
                    .projectId("projectId")
                    .selfHeal(true)
                    .systemPrompt("systemPrompt")
                    .verbose(1L)
                    .build()
            )

        response.validate()
    }
}
