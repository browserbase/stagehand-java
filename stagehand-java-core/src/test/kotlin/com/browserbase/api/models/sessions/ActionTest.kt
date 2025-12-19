// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionTest {

    @Test
    fun create() {
        val action =
            Action.builder()
                .description("Click the submit button")
                .selector("[data-testid='submit-button']")
                .addArgument("Hello World")
                .backendNodeId(0.0)
                .method("click")
                .build()

        assertThat(action.description()).isEqualTo("Click the submit button")
        assertThat(action.selector()).isEqualTo("[data-testid='submit-button']")
        assertThat(action.arguments().getOrNull()).containsExactly("Hello World")
        assertThat(action.backendNodeId()).contains(0.0)
        assertThat(action.method()).contains("click")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val action =
            Action.builder()
                .description("Click the submit button")
                .selector("[data-testid='submit-button']")
                .addArgument("Hello World")
                .backendNodeId(0.0)
                .method("click")
                .build()

        val roundtrippedAction =
            jsonMapper.readValue(jsonMapper.writeValueAsString(action), jacksonTypeRef<Action>())

        assertThat(roundtrippedAction).isEqualTo(action)
    }
}
