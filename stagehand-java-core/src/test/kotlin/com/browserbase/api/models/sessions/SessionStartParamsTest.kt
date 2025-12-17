// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartParamsTest {

    @Test
    fun create() {
        SessionStartParams.builder()
            .xLanguage(JsonValue.from(mapOf<String, Any>()))
            .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
            .xSentAt(JsonValue.from(mapOf<String, Any>()))
            .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
            .body(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun headers() {
        val params =
            SessionStartParams.builder()
                .xLanguage(JsonValue.from(mapOf<String, Any>()))
                .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
                .xSentAt(JsonValue.from(mapOf<String, Any>()))
                .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SessionStartParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionStartParams.builder()
                .xLanguage(JsonValue.from(mapOf<String, Any>()))
                .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
                .xSentAt(JsonValue.from(mapOf<String, Any>()))
                .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
                .body(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SessionStartParams.builder().build()

        val body = params._body()
    }
}
