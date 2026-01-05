// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionActParamsTest {

    @Test
    fun create() {
        SessionActParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xLanguage(SessionActParams.XLanguage.TYPESCRIPT)
            .xSdkVersion("3.0.6")
            .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
            .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
            .input("Click the login button")
            .frameId("frameId")
            .options(
                SessionActParams.Options.builder()
                    .model("openai/gpt-5-nano")
                    .timeout(30000.0)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("username", JsonValue.from("john_doe"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xLanguage(SessionActParams.XLanguage.TYPESCRIPT)
                .xSdkVersion("3.0.6")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("Click the login button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model("openai/gpt-5-nano")
                        .timeout(30000.0)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                .build()
                        )
                        .build()
                )
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
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xLanguage(SessionActParams.XLanguage.TYPESCRIPT)
                .xSdkVersion("3.0.6")
                .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("Click the login button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model("openai/gpt-5-nano")
                        .timeout(30000.0)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("Click the login button"))
        assertThat(body.frameId()).contains("frameId")
        assertThat(body.options())
            .contains(
                SessionActParams.Options.builder()
                    .model("openai/gpt-5-nano")
                    .timeout(30000.0)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("username", JsonValue.from("john_doe"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("Click the login button"))
    }
}
