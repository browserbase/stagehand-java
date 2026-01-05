// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class ModelConfigTest {

    @Test
    fun ofName() {
        val name = "openai/gpt-5-nano"

        val modelConfig = ModelConfig.ofName(name)

        assertThat(modelConfig.name()).contains(name)
        assertThat(modelConfig.modelConfigObject()).isEmpty
    }

    @Test
    fun ofNameRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig = ModelConfig.ofName("openai/gpt-5-nano")

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun ofModelConfigObject() {
        val modelConfigObject =
            ModelConfig.ModelConfigObject.builder()
                .modelName("gpt-5-nano")
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .provider(ModelConfig.ModelConfigObject.Provider.OPENAI)
                .build()

        val modelConfig = ModelConfig.ofModelConfigObject(modelConfigObject)

        assertThat(modelConfig.name()).isEmpty
        assertThat(modelConfig.modelConfigObject()).contains(modelConfigObject)
    }

    @Test
    fun ofModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofModelConfigObject(
                ModelConfig.ModelConfigObject.builder()
                    .modelName("gpt-5-nano")
                    .apiKey("sk-some-openai-api-key")
                    .baseUrl("https://api.openai.com/v1")
                    .provider(ModelConfig.ModelConfigObject.Provider.OPENAI)
                    .build()
            )

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(listOf("invalid", "array"))
        val modelConfig = jsonMapper().convertValue(value, jacksonTypeRef<ModelConfig>())

        val e = assertThrows<StagehandInvalidDataException> { modelConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
