// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNavigateResponseTest {

    @Test
    fun create() {
        val sessionNavigateResponse =
            SessionNavigateResponse.builder()
                .data(
                    SessionNavigateResponse.Data.builder()
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .actionId("actionId")
                        .build()
                )
                .success(SessionNavigateResponse.Success.TRUE)
                .build()

        assertThat(sessionNavigateResponse.data())
            .isEqualTo(
                SessionNavigateResponse.Data.builder()
                    .result(JsonValue.from(mapOf<String, Any>()))
                    .actionId("actionId")
                    .build()
            )
        assertThat(sessionNavigateResponse.success())
            .isEqualTo(SessionNavigateResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionNavigateResponse =
            SessionNavigateResponse.builder()
                .data(
                    SessionNavigateResponse.Data.builder()
                        .result(JsonValue.from(mapOf<String, Any>()))
                        .actionId("actionId")
                        .build()
                )
                .success(SessionNavigateResponse.Success.TRUE)
                .build()

        val roundtrippedSessionNavigateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionNavigateResponse),
                jacksonTypeRef<SessionNavigateResponse>(),
            )

        assertThat(roundtrippedSessionNavigateResponse).isEqualTo(sessionNavigateResponse)
    }
}
