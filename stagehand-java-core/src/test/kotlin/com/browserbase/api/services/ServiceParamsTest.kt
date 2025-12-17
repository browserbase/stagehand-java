// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services

import com.browserbase.api.client.StagehandClient
import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.SessionStartParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
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
                .xLanguage(JsonValue.from(mapOf<String, Any>()))
                .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
                .xSentAt(JsonValue.from(mapOf<String, Any>()))
                .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
                .body(JsonValue.from(mapOf<String, Any>()))
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
