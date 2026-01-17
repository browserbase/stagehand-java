// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ModelConfigTest {

    @Test
    fun ofString() {
        val string = "openai/gpt-4o"

        val modelConfig = ModelConfig.ofString(string)

        assertThat(modelConfig.string()).contains(string)
        assertThat(modelConfig.modelConfigObject()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig = ModelConfig.ofString("openai/gpt-4o")

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
                .modelName("openai/gpt-4o")
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .provider(ModelConfig.ModelConfigObject.Provider.OPENAI)
                .build()

        val modelConfig = ModelConfig.ofModelConfigObject(modelConfigObject)

        assertThat(modelConfig.string()).isEmpty
        assertThat(modelConfig.modelConfigObject()).contains(modelConfigObject)
    }

    @Test
    fun ofModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofModelConfigObject(
                ModelConfig.ModelConfigObject.builder()
                    .modelName("openai/gpt-4o")
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

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val modelConfig = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ModelConfig>())

        val e = assertThrows<StagehandInvalidDataException> { modelConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
