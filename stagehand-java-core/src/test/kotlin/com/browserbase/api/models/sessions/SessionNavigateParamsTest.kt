// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNavigateParamsTest {

    @Test
    fun create() {
        SessionNavigateParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xLanguage(SessionNavigateParams.XLanguage.TYPESCRIPT)
            .xSdkVersion("3.0.6")
            .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
            .xStreamResponse(SessionNavigateParams.XStreamResponse.TRUE)
            .url("https://example.com")
            .frameId("frameId")
            .options(
                SessionNavigateParams.Options.builder()
                    .referer("referer")
                    .timeout(30000.0)
                    .waitUntil(SessionNavigateParams.Options.WaitUntil.NETWORKIDLE)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionNavigateParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .url("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionNavigateParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xLanguage(SessionNavigateParams.XLanguage.TYPESCRIPT)
                .xSdkVersion("3.0.6")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                .xStreamResponse(SessionNavigateParams.XStreamResponse.TRUE)
                .url("https://example.com")
                .frameId("frameId")
                .options(
                    SessionNavigateParams.Options.builder()
                        .referer("referer")
                        .timeout(30000.0)
                        .waitUntil(SessionNavigateParams.Options.WaitUntil.NETWORKIDLE)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("x-language", "typescript")
                    .put("x-sdk-version", "3.0.6")
                    .put("x-sent-at", "2025-01-15T10:30:00.000Z")
                    .put("x-stream-response", "true")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionNavigateParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .url("https://example.com")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionNavigateParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xLanguage(SessionNavigateParams.XLanguage.TYPESCRIPT)
                .xSdkVersion("3.0.6")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                .xStreamResponse(SessionNavigateParams.XStreamResponse.TRUE)
                .url("https://example.com")
                .frameId("frameId")
                .options(
                    SessionNavigateParams.Options.builder()
                        .referer("referer")
                        .timeout(30000.0)
                        .waitUntil(SessionNavigateParams.Options.WaitUntil.NETWORKIDLE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.frameId()).contains("frameId")
        assertThat(body.options())
            .contains(
                SessionNavigateParams.Options.builder()
                    .referer("referer")
                    .timeout(30000.0)
                    .waitUntil(SessionNavigateParams.Options.WaitUntil.NETWORKIDLE)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionNavigateParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .url("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
