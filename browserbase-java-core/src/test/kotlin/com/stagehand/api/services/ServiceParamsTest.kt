// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.services

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
import com.stagehand.api.client.BrowserbaseClient
import com.stagehand.api.client.okhttp.BrowserbaseOkHttpClient
import com.stagehand.api.core.JsonValue
import com.stagehand.api.models.sessions.SessionStartParams
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: BrowserbaseClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            BrowserbaseOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sessionService.start(
            SessionStartParams.builder()
                .env(SessionStartParams.Env.LOCAL)
                .apiKey("apiKey")
                .domSettleTimeout(0L)
                .localBrowserLaunchOptions(
                    SessionStartParams.LocalBrowserLaunchOptions.builder().headless(true).build()
                )
                .model("openai/gpt-4o")
                .projectId("projectId")
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
}
