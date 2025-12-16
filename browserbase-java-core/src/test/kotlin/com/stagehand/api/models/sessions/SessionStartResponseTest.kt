// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stagehand.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartResponseTest {

    @Test
    fun create() {
        val sessionStartResponse =
            SessionStartResponse.builder()
                .available(true)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(sessionStartResponse.available()).isEqualTo(true)
        assertThat(sessionStartResponse.sessionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionStartResponse =
            SessionStartResponse.builder()
                .available(true)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedSessionStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionStartResponse),
                jacksonTypeRef<SessionStartResponse>(),
            )

        assertThat(roundtrippedSessionStartResponse).isEqualTo(sessionStartResponse)
    }
}
