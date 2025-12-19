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
                .data(
                    SessionActResponse.Data.builder()
                        .result(
                            SessionActResponse.Data.Result.builder()
                                .actionDescription("Clicked button with text 'Login'")
                                .addAction(
                                    SessionActResponse.Data.Result.Action.builder()
                                        .description("Click the submit button")
                                        .selector("[data-testid='submit-button']")
                                        .addArgument("Hello World")
                                        .backendNodeId(0.0)
                                        .method("click")
                                        .build()
                                )
                                .message("Successfully clicked the login button")
                                .success(true)
                                .build()
                        )
                        .actionId("actionId")
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionActResponse.data())
            .isEqualTo(
                SessionActResponse.Data.builder()
                    .result(
                        SessionActResponse.Data.Result.builder()
                            .actionDescription("Clicked button with text 'Login'")
                            .addAction(
                                SessionActResponse.Data.Result.Action.builder()
                                    .description("Click the submit button")
                                    .selector("[data-testid='submit-button']")
                                    .addArgument("Hello World")
                                    .backendNodeId(0.0)
                                    .method("click")
                                    .build()
                            )
                            .message("Successfully clicked the login button")
                            .success(true)
                            .build()
                    )
                    .actionId("actionId")
                    .build()
            )
        assertThat(sessionActResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionActResponse =
            SessionActResponse.builder()
                .data(
                    SessionActResponse.Data.builder()
                        .result(
                            SessionActResponse.Data.Result.builder()
                                .actionDescription("Clicked button with text 'Login'")
                                .addAction(
                                    SessionActResponse.Data.Result.Action.builder()
                                        .description("Click the submit button")
                                        .selector("[data-testid='submit-button']")
                                        .addArgument("Hello World")
                                        .backendNodeId(0.0)
                                        .method("click")
                                        .build()
                                )
                                .message("Successfully clicked the login button")
                                .success(true)
                                .build()
                        )
                        .actionId("actionId")
                        .build()
                )
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
