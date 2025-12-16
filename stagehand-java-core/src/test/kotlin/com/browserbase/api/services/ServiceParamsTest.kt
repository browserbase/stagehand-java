// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services

import com.browserbase.api.client.StagehandClient
import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.ModelConfig
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionStartParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: StagehandClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StagehandOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sessionService.start(
            SessionStartParams.builder()
                .browserbaseApiKey("BROWSERBASE_API_KEY")
                .browserbaseProjectId("BROWSERBASE_PROJECT_ID")
                .domSettleTimeout(0L)
                .model("openai/gpt-4o")
                .selfHeal(true)
                .systemPrompt("systemPrompt")
                .verbose(1L)
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun act() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
