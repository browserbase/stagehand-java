// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stagehand.api.core.JsonValue
import com.stagehand.api.core.jsonMapper
import com.stagehand.api.errors.BrowserbaseInvalidDataException
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
        assertThat(sessionExtractResponse.unionMember1()).isEmpty
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
    fun ofUnionMember1() {
        val unionMember1 =
            SessionExtractResponse.UnionMember1.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val sessionExtractResponse = SessionExtractResponse.ofUnionMember1(unionMember1)

        assertThat(sessionExtractResponse.extraction()).isEmpty
        assertThat(sessionExtractResponse.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionExtractResponse =
            SessionExtractResponse.ofUnionMember1(
                SessionExtractResponse.UnionMember1.builder()
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

        val e = assertThrows<BrowserbaseInvalidDataException> { sessionExtractResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
