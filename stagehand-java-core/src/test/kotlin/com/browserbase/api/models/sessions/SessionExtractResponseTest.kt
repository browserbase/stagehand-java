// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExtractResponseTest {

    @Test
    fun create() {
        val sessionExtractResponse =
            SessionExtractResponse.builder()
                .data(
                    SessionExtractResponse.Data.builder()
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .actionId("actionId")
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionExtractResponse.data())
            .isEqualTo(
                SessionExtractResponse.Data.builder()
                    .result(JsonValue.from(mapOf<String, Any>()))
                    .actionId("actionId")
                    .build()
            )
        assertThat(sessionExtractResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse =
            SessionExtractResponse.builder()
                .data(
                    SessionExtractResponse.Data.builder()
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .actionId("actionId")
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedSessionExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExtractResponse),
                jacksonTypeRef<SessionExtractResponse>(),
            )

        assertThat(roundtrippedSessionExtractResponse).isEqualTo(sessionExtractResponse)
    }
}
