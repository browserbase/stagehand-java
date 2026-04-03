// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelConfigTest {

    @Test
    fun create() {
        val modelConfig =
            ModelConfig.builder()
                .modelName("openai/gpt-5.4-mini")
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .provider(ModelConfig.Provider.OPENAI)
                .build()

        assertThat(modelConfig.modelName()).isEqualTo("openai/gpt-5.4-mini")
        assertThat(modelConfig.apiKey()).contains("sk-some-openai-api-key")
        assertThat(modelConfig.baseUrl()).contains("https://api.openai.com/v1")
        assertThat(modelConfig.headers())
            .contains(
                ModelConfig.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(modelConfig.provider()).contains(ModelConfig.Provider.OPENAI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.builder()
                .modelName("openai/gpt-5.4-mini")
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .provider(ModelConfig.Provider.OPENAI)
                .build()

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }
}
