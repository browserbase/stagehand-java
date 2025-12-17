// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionActResponseTest {

    @Test
    fun create() {
        val sessionActResponse = SessionActResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionActResponse = SessionActResponse.builder().build()

        val roundtrippedSessionActResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionActResponse),
                jacksonTypeRef<SessionActResponse>(),
            )

        assertThat(roundtrippedSessionActResponse).isEqualTo(sessionActResponse)
    }
}
