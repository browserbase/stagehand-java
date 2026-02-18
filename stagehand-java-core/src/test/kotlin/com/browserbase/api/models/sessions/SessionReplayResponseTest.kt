// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
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
                                        .parameters(
                                            SessionReplayResponse.Data.Page.Action.Parameters
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .result(
                                            SessionReplayResponse.Data.Page.Action.Result.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .timestamp(0.0)
                                        .endTime(0.0)
                                        .tokenUsage(
                                            SessionReplayResponse.Data.Page.Action.TokenUsage
                                                .builder()
                                                .cost(0.0)
                                                .inputTokens(0.0)
                                                .outputTokens(0.0)
                                                .timeMs(0.0)
                                                .build()
                                        )
                                        .build()
                                )
                                .duration(0.0)
                                .timestamp(0.0)
                                .url("url")
                                .build()
                        )
                        .clientLanguage("clientLanguage")
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
                                    .parameters(
                                        SessionReplayResponse.Data.Page.Action.Parameters.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .result(
                                        SessionReplayResponse.Data.Page.Action.Result.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .timestamp(0.0)
                                    .endTime(0.0)
                                    .tokenUsage(
                                        SessionReplayResponse.Data.Page.Action.TokenUsage.builder()
                                            .cost(0.0)
                                            .inputTokens(0.0)
                                            .outputTokens(0.0)
                                            .timeMs(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .duration(0.0)
                            .timestamp(0.0)
                            .url("url")
                            .build()
                    )
                    .clientLanguage("clientLanguage")
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
                                        .parameters(
                                            SessionReplayResponse.Data.Page.Action.Parameters
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .result(
                                            SessionReplayResponse.Data.Page.Action.Result.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .timestamp(0.0)
                                        .endTime(0.0)
                                        .tokenUsage(
                                            SessionReplayResponse.Data.Page.Action.TokenUsage
                                                .builder()
                                                .cost(0.0)
                                                .inputTokens(0.0)
                                                .outputTokens(0.0)
                                                .timeMs(0.0)
                                                .build()
                                        )
                                        .build()
                                )
                                .duration(0.0)
                                .timestamp(0.0)
                                .url("url")
                                .build()
                        )
                        .clientLanguage("clientLanguage")
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
