// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionObserveResponseTest {

    @Test
    fun create() {
        val sessionObserveResponse =
            SessionObserveResponse.builder()
                .data(
                    SessionObserveResponse.Data.builder()
                        .addResult(
                            SessionObserveResponse.Data.Result.builder()
                                .description("Click the submit button")
                                .selector("[data-testid='submit-button']")
                                .addArgument("Hello World")
                                .backendNodeId(0.0)
                                .method("click")
                                .build()
                        )
                        .actionId("actionId")
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionObserveResponse.data())
            .isEqualTo(
                SessionObserveResponse.Data.builder()
                    .addResult(
                        SessionObserveResponse.Data.Result.builder()
                            .description("Click the submit button")
                            .selector("[data-testid='submit-button']")
                            .addArgument("Hello World")
                            .backendNodeId(0.0)
                            .method("click")
                            .build()
                    )
                    .actionId("actionId")
                    .build()
            )
        assertThat(sessionObserveResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionObserveResponse =
            SessionObserveResponse.builder()
                .data(
                    SessionObserveResponse.Data.builder()
                        .addResult(
                            SessionObserveResponse.Data.Result.builder()
                                .description("Click the submit button")
                                .selector("[data-testid='submit-button']")
                                .addArgument("Hello World")
                                .backendNodeId(0.0)
                                .method("click")
                                .build()
                        )
                        .actionId("actionId")
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedSessionObserveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionObserveResponse),
                jacksonTypeRef<SessionObserveResponse>(),
            )

        assertThat(roundtrippedSessionObserveResponse).isEqualTo(sessionObserveResponse)
    }
}
