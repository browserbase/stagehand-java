// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionNavigateResponseTest {

    @Test
    fun create() {
        val sessionNavigateResponse =
            SessionNavigateResponse.builder().ok(true).status(0L).url("url").build()

        assertThat(sessionNavigateResponse.ok()).contains(true)
        assertThat(sessionNavigateResponse.status()).contains(0L)
        assertThat(sessionNavigateResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionNavigateResponse =
            SessionNavigateResponse.builder().ok(true).status(0L).url("url").build()

        val roundtrippedSessionNavigateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionNavigateResponse),
                jacksonTypeRef<SessionNavigateResponse>(),
            )

        assertThat(roundtrippedSessionNavigateResponse).isEqualTo(sessionNavigateResponse)
    }
}
