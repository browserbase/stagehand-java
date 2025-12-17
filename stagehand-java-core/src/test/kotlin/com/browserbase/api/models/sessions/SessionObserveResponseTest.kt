// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionObserveResponseTest {

    @Test
    fun create() {
        val sessionObserveResponse = SessionObserveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionObserveResponse = SessionObserveResponse.builder().build()

        val roundtrippedSessionObserveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionObserveResponse),
                jacksonTypeRef<SessionObserveResponse>(),
            )

        assertThat(roundtrippedSessionObserveResponse).isEqualTo(sessionObserveResponse)
    }
}
