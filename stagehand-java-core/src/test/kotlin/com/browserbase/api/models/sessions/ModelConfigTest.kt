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
    fun ofString() {
        val string = "string"

        val modelConfig = ModelConfig.ofString(string)

        assertThat(modelConfig.string()).contains(string)
        assertThat(modelConfig.unionMember1()).isEmpty
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig = ModelConfig.ofString("string")

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            ModelConfig.UnionMember1.builder()
                .modelName("modelName")
                .apiKey("apiKey")
                .baseUrl("https://example.com")
                .build()

        val modelConfig = ModelConfig.ofUnionMember1(unionMember1)

        assertThat(modelConfig.string()).isEmpty
        assertThat(modelConfig.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofUnionMember1(
                ModelConfig.UnionMember1.builder()
                    .modelName("modelName")
                    .apiKey("apiKey")
                    .baseUrl("https://example.com")
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
