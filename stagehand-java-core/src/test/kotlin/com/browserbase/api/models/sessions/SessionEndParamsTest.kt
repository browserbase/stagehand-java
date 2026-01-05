// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionEndParamsTest {

    @Test
    fun create() {
        SessionEndParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xLanguage(SessionEndParams.XLanguage.TYPESCRIPT)
            .xSdkVersion("3.0.6")
            .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
            .xStreamResponse(SessionEndParams.XStreamResponse.TRUE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = SessionEndParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionEndParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xLanguage(SessionEndParams.XLanguage.TYPESCRIPT)
                .xSdkVersion("3.0.6")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                .xStreamResponse(SessionEndParams.XStreamResponse.TRUE)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("x-language", "typescript")
                    .put("x-sdk-version", "3.0.6")
                    .put("x-sent-at", "2025-01-15T10:30:00Z")
                    .put("x-stream-response", "true")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SessionEndParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
