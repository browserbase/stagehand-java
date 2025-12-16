// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionActResponseTest {

    @Test
    fun create() {
        val sessionActResponse =
            SessionActResponse.builder()
                .addAction(
                    Action.builder()
                        .addArgument("string")
                        .description("description")
                        .method("method")
                        .selector("selector")
                        .backendNodeId(0L)
                        .build()
                )
                .message("message")
                .success(true)
                .build()

        assertThat(sessionActResponse.actions())
            .containsExactly(
                Action.builder()
                    .addArgument("string")
                    .description("description")
                    .method("method")
                    .selector("selector")
                    .backendNodeId(0L)
                    .build()
            )
        assertThat(sessionActResponse.message()).isEqualTo("message")
        assertThat(sessionActResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionActResponse =
            SessionActResponse.builder()
                .addAction(
                    Action.builder()
                        .addArgument("string")
                        .description("description")
                        .method("method")
                        .selector("selector")
                        .backendNodeId(0L)
                        .build()
                )
                .message("message")
                .success(true)
                .build()

        val roundtrippedSessionActResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionActResponse),
                jacksonTypeRef<SessionActResponse>(),
            )

        assertThat(roundtrippedSessionActResponse).isEqualTo(sessionActResponse)
    }
}
