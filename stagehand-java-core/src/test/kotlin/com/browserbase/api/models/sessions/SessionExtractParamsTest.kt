// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExtractParamsTest {

    @Test
    fun create() {
        SessionExtractParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
            .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
            .frameId("frameId")
            .instruction("Extract all product names and prices from the page")
            .options(
                SessionExtractParams.Options.builder()
                    .model("openai/gpt-5-nano")
                    .selector("#main-content")
                    .timeout(30000.0)
                    .build()
            )
            .schema(
                SessionExtractParams.Schema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionExtractParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Extract all product names and prices from the page")
                .options(
                    SessionExtractParams.Options.builder()
                        .model("openai/gpt-5-nano")
                        .selector("#main-content")
                        .timeout(30000.0)
                        .build()
                )
                .schema(
                    SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("x-sent-at", "2025-01-15T10:30:00Z")
                    .put("x-stream-response", "true")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionExtractParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Extract all product names and prices from the page")
                .options(
                    SessionExtractParams.Options.builder()
                        .model("openai/gpt-5-nano")
                        .selector("#main-content")
                        .timeout(30000.0)
                        .build()
                )
                .schema(
                    SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.frameId()).contains("frameId")
        assertThat(body.instruction())
            .contains("Extract all product names and prices from the page")
        assertThat(body.options())
            .contains(
                SessionExtractParams.Options.builder()
                    .model("openai/gpt-5-nano")
                    .selector("#main-content")
                    .timeout(30000.0)
                    .build()
            )
        assertThat(body.schema())
            .contains(
                SessionExtractParams.Schema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val body = params._body()
    }
}
