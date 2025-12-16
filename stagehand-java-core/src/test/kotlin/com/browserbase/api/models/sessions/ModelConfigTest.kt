// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelConfigTest {

    @Test
    fun create() {
        val modelConfig =
            ModelConfig.builder()
                .apiKey("apiKey")
                .baseUrl("https://example.com")
                .model("model")
                .provider(ModelConfig.Provider.OPENAI)
                .build()

        assertThat(modelConfig.apiKey()).contains("apiKey")
        assertThat(modelConfig.baseUrl()).contains("https://example.com")
        assertThat(modelConfig.model()).contains("model")
        assertThat(modelConfig.provider()).contains(ModelConfig.Provider.OPENAI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.builder()
                .apiKey("apiKey")
                .baseUrl("https://example.com")
                .model("model")
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
