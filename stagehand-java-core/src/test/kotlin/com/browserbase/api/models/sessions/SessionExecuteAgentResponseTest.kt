// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExecuteAgentResponseTest {

    @Test
    fun create() {
        val sessionExecuteAgentResponse = SessionExecuteAgentResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExecuteAgentResponse = SessionExecuteAgentResponse.builder().build()

        val roundtrippedSessionExecuteAgentResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExecuteAgentResponse),
                jacksonTypeRef<SessionExecuteAgentResponse>(),
            )

        assertThat(roundtrippedSessionExecuteAgentResponse).isEqualTo(sessionExecuteAgentResponse)
    }
}
