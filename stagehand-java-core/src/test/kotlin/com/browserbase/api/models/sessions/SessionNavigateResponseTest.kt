// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNavigateResponseTest {

    @Test
    fun create() {
        val sessionNavigateResponse = SessionNavigateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionNavigateResponse = SessionNavigateResponse.builder().build()

        val roundtrippedSessionNavigateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionNavigateResponse),
                jacksonTypeRef<SessionNavigateResponse>(),
            )

        assertThat(roundtrippedSessionNavigateResponse).isEqualTo(sessionNavigateResponse)
    }
}
