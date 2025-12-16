// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartParamsTest {

    @Test
    fun create() {
        SessionStartParams.builder()
            .browserbaseApiKey("BROWSERBASE_API_KEY")
            .browserbaseProjectId("BROWSERBASE_PROJECT_ID")
            .domSettleTimeout(0L)
            .model("openai/gpt-4o")
            .selfHeal(true)
            .systemPrompt("systemPrompt")
            .verbose(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SessionStartParams.builder()
                .browserbaseApiKey("BROWSERBASE_API_KEY")
                .browserbaseProjectId("BROWSERBASE_PROJECT_ID")
                .domSettleTimeout(0L)
                .model("openai/gpt-4o")
                .selfHeal(true)
                .systemPrompt("systemPrompt")
                .verbose(1L)
                .build()

        val body = params._body()

        assertThat(body.browserbaseApiKey()).isEqualTo("BROWSERBASE_API_KEY")
        assertThat(body.browserbaseProjectId()).isEqualTo("BROWSERBASE_PROJECT_ID")
        assertThat(body.domSettleTimeout()).contains(0L)
        assertThat(body.model()).contains("openai/gpt-4o")
        assertThat(body.selfHeal()).contains(true)
        assertThat(body.systemPrompt()).contains("systemPrompt")
        assertThat(body.verbose()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionStartParams.builder()
                .browserbaseApiKey("BROWSERBASE_API_KEY")
                .browserbaseProjectId("BROWSERBASE_PROJECT_ID")
                .build()

        val body = params._body()

        assertThat(body.browserbaseApiKey()).isEqualTo("BROWSERBASE_API_KEY")
        assertThat(body.browserbaseProjectId()).isEqualTo("BROWSERBASE_PROJECT_ID")
    }
}
