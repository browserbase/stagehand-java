// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionStartParamsTest {

    @Test
    fun create() {
        SessionStartParams.builder()
            .env(SessionStartParams.Env.LOCAL)
            .apiKey("apiKey")
            .domSettleTimeout(0L)
            .localBrowserLaunchOptions(
                SessionStartParams.LocalBrowserLaunchOptions.builder().headless(true).build()
            )
            .model("openai/gpt-4o")
            .projectId("projectId")
            .selfHeal(true)
            .systemPrompt("systemPrompt")
            .verbose(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            SessionStartParams.builder()
                .env(SessionStartParams.Env.LOCAL)
                .apiKey("apiKey")
                .domSettleTimeout(0L)
                .localBrowserLaunchOptions(
                    SessionStartParams.LocalBrowserLaunchOptions.builder().headless(true).build()
                )
                .model("openai/gpt-4o")
                .projectId("projectId")
                .selfHeal(true)
                .systemPrompt("systemPrompt")
                .verbose(1L)
                .build()

        val body = params._body()

        assertThat(body.env()).isEqualTo(SessionStartParams.Env.LOCAL)
        assertThat(body.apiKey()).contains("apiKey")
        assertThat(body.domSettleTimeout()).contains(0L)
        assertThat(body.localBrowserLaunchOptions())
            .contains(SessionStartParams.LocalBrowserLaunchOptions.builder().headless(true).build())
        assertThat(body.model()).contains("openai/gpt-4o")
        assertThat(body.projectId()).contains("projectId")
        assertThat(body.selfHeal()).contains(true)
        assertThat(body.systemPrompt()).contains("systemPrompt")
        assertThat(body.verbose()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SessionStartParams.builder().env(SessionStartParams.Env.LOCAL).build()

        val body = params._body()

        assertThat(body.env()).isEqualTo(SessionStartParams.Env.LOCAL)
    }
}
