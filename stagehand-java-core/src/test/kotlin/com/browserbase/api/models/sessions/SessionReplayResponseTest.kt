// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionReplayResponseTest {

    @Test
    fun create() {
        val sessionReplayResponse =
            SessionReplayResponse.builder()
                .data(
                    SessionReplayResponse.Data.builder()
                        .addPage(
                            SessionReplayResponse.Data.Page.builder()
                                .addAction(
                                    SessionReplayResponse.Data.Page.Action.builder()
                                        .method("method")
                                        .tokenUsage(
                                            SessionReplayResponse.Data.Page.Action.TokenUsage
                                                .builder()
                                                .cachedInputTokens(0.0)
                                                .inputTokens(0.0)
                                                .outputTokens(0.0)
                                                .reasoningTokens(0.0)
                                                .timeMs(0.0)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionReplayResponse.data())
            .isEqualTo(
                SessionReplayResponse.Data.builder()
                    .addPage(
                        SessionReplayResponse.Data.Page.builder()
                            .addAction(
                                SessionReplayResponse.Data.Page.Action.builder()
                                    .method("method")
                                    .tokenUsage(
                                        SessionReplayResponse.Data.Page.Action.TokenUsage.builder()
                                            .cachedInputTokens(0.0)
                                            .inputTokens(0.0)
                                            .outputTokens(0.0)
                                            .reasoningTokens(0.0)
                                            .timeMs(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(sessionReplayResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionReplayResponse =
            SessionReplayResponse.builder()
                .data(
                    SessionReplayResponse.Data.builder()
                        .addPage(
                            SessionReplayResponse.Data.Page.builder()
                                .addAction(
                                    SessionReplayResponse.Data.Page.Action.builder()
                                        .method("method")
                                        .tokenUsage(
                                            SessionReplayResponse.Data.Page.Action.TokenUsage
                                                .builder()
                                                .cachedInputTokens(0.0)
                                                .inputTokens(0.0)
                                                .outputTokens(0.0)
                                                .reasoningTokens(0.0)
                                                .timeMs(0.0)
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedSessionReplayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionReplayResponse),
                jacksonTypeRef<SessionReplayResponse>(),
            )

        assertThat(roundtrippedSessionReplayResponse).isEqualTo(sessionReplayResponse)
    }
}
