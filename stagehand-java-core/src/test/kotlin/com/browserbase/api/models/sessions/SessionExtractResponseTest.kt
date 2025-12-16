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

internal class SessionExtractResponseTest {

    @Test
    fun ofExtraction() {
        val extraction =
            SessionExtractResponse.Extraction.builder().extraction("extraction").build()

        val sessionExtractResponse = SessionExtractResponse.ofExtraction(extraction)

        assertThat(sessionExtractResponse.extraction()).contains(extraction)
        assertThat(sessionExtractResponse.custom()).isEmpty
    }

    @Test
    fun ofExtractionRoundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse =
            SessionExtractResponse.ofExtraction(
                SessionExtractResponse.Extraction.builder().extraction("extraction").build()
            )

        val roundtrippedSessionExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExtractResponse),
                jacksonTypeRef<SessionExtractResponse>(),
            )

        assertThat(roundtrippedSessionExtractResponse).isEqualTo(sessionExtractResponse)
    }

    @Test
    fun ofCustom() {
        val custom =
            SessionExtractResponse.Custom.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val sessionExtractResponse = SessionExtractResponse.ofCustom(custom)

        assertThat(sessionExtractResponse.extraction()).isEmpty
        assertThat(sessionExtractResponse.custom()).contains(custom)
    }

    @Test
    fun ofCustomRoundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse =
            SessionExtractResponse.ofCustom(
                SessionExtractResponse.Custom.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedSessionExtractResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionExtractResponse),
                jacksonTypeRef<SessionExtractResponse>(),
            )

        assertThat(roundtrippedSessionExtractResponse).isEqualTo(sessionExtractResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val sessionExtractResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<SessionExtractResponse>())

        val e = assertThrows<StagehandInvalidDataException> { sessionExtractResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
