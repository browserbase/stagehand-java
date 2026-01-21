// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExecuteResponseTest {

    @Test
    fun create() {
        val sessionExecuteResponse =
            SessionExecuteResponse.builder()
                .data(
                    SessionExecuteResponse.Data.builder()
                        .result(
                            SessionExecuteResponse.Data.Result.builder()
                                .addAction(
                                    SessionExecuteResponse.Data.Result.Action.builder()
                                        .type("click")
                                        .action("action")
                                        .instruction("instruction")
                                        .pageText("pageText")
                                        .pageUrl("pageUrl")
                                        .reasoning("reasoning")
                                        .taskCompleted(true)
                                        .timeMs(0.0)
                                        .build()
                                )
                                .completed(true)
                                .message("Successfully logged in and navigated to dashboard")
                                .success(true)
                                .metadata(
                                    SessionExecuteResponse.Data.Result.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .usage(
                                    SessionExecuteResponse.Data.Result.Usage.builder()
                                        .inferenceTimeMs(2500.0)
                                        .inputTokens(1500.0)
                                        .outputTokens(250.0)
                                        .cachedInputTokens(0.0)
                                        .reasoningTokens(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .cacheEntry(
                            SessionExecuteResponse.Data.CacheEntry.builder()
                                .cacheKey("cacheKey")
                                .entry(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        assertThat(sessionExecuteResponse.data())
            .isEqualTo(
                SessionExecuteResponse.Data.builder()
                    .result(
                        SessionExecuteResponse.Data.Result.builder()
                            .addAction(
                                SessionExecuteResponse.Data.Result.Action.builder()
                                    .type("click")
                                    .action("action")
                                    .instruction("instruction")
                                    .pageText("pageText")
                                    .pageUrl("pageUrl")
                                    .reasoning("reasoning")
                                    .taskCompleted(true)
                                    .timeMs(0.0)
                                    .build()
                            )
                            .completed(true)
                            .message("Successfully logged in and navigated to dashboard")
                            .success(true)
                            .metadata(
                                SessionExecuteResponse.Data.Result.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .usage(
                                SessionExecuteResponse.Data.Result.Usage.builder()
                                    .inferenceTimeMs(2500.0)
                                    .inputTokens(1500.0)
                                    .outputTokens(250.0)
                                    .cachedInputTokens(0.0)
                                    .reasoningTokens(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .cacheEntry(
                        SessionExecuteResponse.Data.CacheEntry.builder()
                            .cacheKey("cacheKey")
                            .entry(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
        assertThat(sessionExecuteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExecuteResponse =
            SessionExecuteResponse.builder()
                .data(
                    SessionExecuteResponse.Data.builder()
                        .result(
                            SessionExecuteResponse.Data.Result.builder()
                                .addAction(
                                    SessionExecuteResponse.Data.Result.Action.builder()
                                        .type("click")
                                        .action("action")
                                        .instruction("instruction")
                                        .pageText("pageText")
                                        .pageUrl("pageUrl")
                                        .reasoning("reasoning")
                                        .taskCompleted(true)
                                        .timeMs(0.0)
                                        .build()
                                )
                                .completed(true)
                                .message("Successfully logged in and navigated to dashboard")
                                .success(true)
                                .metadata(
                                    SessionExecuteResponse.Data.Result.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .usage(
                                    SessionExecuteResponse.Data.Result.Usage.builder()
                                        .inferenceTimeMs(2500.0)
                                        .inputTokens(1500.0)
                                        .outputTokens(250.0)
                                        .cachedInputTokens(0.0)
                                        .reasoningTokens(0.0)
                                        .build()
                                )
                                .build()
                        )
                        .cacheEntry(
                            SessionExecuteResponse.Data.CacheEntry.builder()
                                .cacheKey("cacheKey")
                                .entry(JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedSessionExecuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExecuteResponse),
                jacksonTypeRef<SessionExecuteResponse>(),
            )

        assertThat(roundtrippedSessionExecuteResponse).isEqualTo(sessionExecuteResponse)
    }
}
