// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNavigateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            SessionNavigateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("x-stream-response", "true").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionNavigateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("https://example.com")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.frameId()).contains("frameId")
        assertThat(body.options())
            .contains(
                SessionNavigateParams.Options.builder()
                    .waitUntil(SessionNavigateParams.Options.WaitUntil.LOAD)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionNavigateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
