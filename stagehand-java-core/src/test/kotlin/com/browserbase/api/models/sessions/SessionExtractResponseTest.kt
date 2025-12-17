// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExtractResponseTest {

    @Test
    fun create() {
        val sessionExtractResponse = SessionExtractResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse = SessionExtractResponse.builder().build()

        val roundtrippedSessionExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExtractResponse),
                jacksonTypeRef<SessionExtractResponse>(),
            )

        assertThat(roundtrippedSessionExtractResponse).isEqualTo(sessionExtractResponse)
    }
}
