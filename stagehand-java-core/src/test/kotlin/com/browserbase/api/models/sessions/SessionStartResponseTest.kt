// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartResponseTest {

    @Test
    fun create() {
        val sessionStartResponse =
            SessionStartResponse.builder()
                .data(
                    SessionStartResponse.Data.builder()
                        .available(true)
                        .sessionId("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                        .cdpUrl("wss://connect.browserbase.com/?signingKey=abc123")
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionStartResponse.data())
            .isEqualTo(
                SessionStartResponse.Data.builder()
                    .available(true)
                    .sessionId("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .cdpUrl("wss://connect.browserbase.com/?signingKey=abc123")
                    .build()
            )
        assertThat(sessionStartResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionStartResponse =
            SessionStartResponse.builder()
                .data(
                    SessionStartResponse.Data.builder()
                        .available(true)
                        .sessionId("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                        .cdpUrl("wss://connect.browserbase.com/?signingKey=abc123")
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedSessionStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionStartResponse),
                jacksonTypeRef<SessionStartResponse>(),
            )

        assertThat(roundtrippedSessionStartResponse).isEqualTo(sessionStartResponse)
    }
}
