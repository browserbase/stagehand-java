// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionEndResponseTest {

    @Test
    fun create() {
        val sessionEndResponse = SessionEndResponse.builder().success(true).build()

        assertThat(sessionEndResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionEndResponse = SessionEndResponse.builder().success(true).build()

        val roundtrippedSessionEndResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionEndResponse),
                jacksonTypeRef<SessionEndResponse>(),
            )

        assertThat(roundtrippedSessionEndResponse).isEqualTo(sessionEndResponse)
    }
}
