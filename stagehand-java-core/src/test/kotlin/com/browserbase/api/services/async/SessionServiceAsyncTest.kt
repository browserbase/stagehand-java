// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.TestServerExtension
import com.browserbase.api.client.okhttp.StagehandOkHttpClientAsync
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.ModelConfig
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionExecuteAgentParams
import com.browserbase.api.models.sessions.SessionExtractParams
import com.browserbase.api.models.sessions.SessionNavigateParams
import com.browserbase.api.models.sessions.SessionObserveParams
import com.browserbase.api.models.sessions.SessionStartParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun act() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.act(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture = sessionServiceAsync.end("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun executeAgent() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.executeAgent(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun extract() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.extract(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun navigate() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.navigate(
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

        val response = responseFuture.get()
        val unwrappedResponse = response.getOrNull()
        unwrappedResponse?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun observe() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val actionsFuture =
            sessionServiceAsync.observe(
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

        val actions = actionsFuture.get()
        actions.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.start(
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

        val response = responseFuture.get()
        response.validate()
    }
}
