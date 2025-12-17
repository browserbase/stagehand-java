// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartResponseTest {

    @Test
    fun create() {
        val sessionStartResponse = SessionStartResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionStartResponse = SessionStartResponse.builder().build()

        val roundtrippedSessionStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionStartResponse),
                jacksonTypeRef<SessionStartResponse>(),
            )

        assertThat(roundtrippedSessionStartResponse).isEqualTo(sessionStartResponse)
    }
}
