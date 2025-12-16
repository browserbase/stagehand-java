// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionTest {

    @Test
    fun create() {
        val action =
            Action.builder()
                .addArgument("string")
                .description("description")
                .method("method")
                .selector("selector")
                .backendNodeId(0L)
                .build()

        assertThat(action.arguments()).containsExactly("string")
        assertThat(action.description()).isEqualTo("description")
        assertThat(action.method()).isEqualTo("method")
        assertThat(action.selector()).isEqualTo("selector")
        assertThat(action.backendNodeId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val action =
            Action.builder()
                .addArgument("string")
                .description("description")
                .method("method")
                .selector("selector")
                .backendNodeId(0L)
                .build()

        val roundtrippedAction =
            jsonMapper.readValue(jsonMapper.writeValueAsString(action), jacksonTypeRef<Action>())

        assertThat(roundtrippedAction).isEqualTo(action)
    }
}
