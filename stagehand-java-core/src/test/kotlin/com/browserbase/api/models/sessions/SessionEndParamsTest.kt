// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionEndParamsTest {

    @Test
    fun create() {
        SessionEndParams.builder()
            .id(JsonValue.from(mapOf<String, Any>()))
            .xLanguage(JsonValue.from(mapOf<String, Any>()))
            .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
            .xSentAt(JsonValue.from(mapOf<String, Any>()))
            .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params = SessionEndParams.builder().id(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionEndParams.builder()
                .id(JsonValue.from(mapOf<String, Any>()))
                .xLanguage(JsonValue.from(mapOf<String, Any>()))
                .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
                .xSentAt(JsonValue.from(mapOf<String, Any>()))
                .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = SessionEndParams.builder().id(JsonValue.from(mapOf<String, Any>())).build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
