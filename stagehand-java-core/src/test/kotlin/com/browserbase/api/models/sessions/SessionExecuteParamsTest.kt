// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExecuteParamsTest {

    @Test
    fun create() {
        SessionExecuteParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
            .agentConfig(
                SessionExecuteParams.AgentConfig.builder()
                    .cua(true)
                    .model("openai/gpt-4o")
                    .provider(SessionExecuteParams.AgentConfig.Provider.OPENAI)
                    .systemPrompt("systemPrompt")
                    .build()
            )
            .executeOptions(
                SessionExecuteParams.ExecuteOptions.builder()
                    .instruction(
                        "Log in with username 'demo' and password 'test123', then navigate to settings"
                    )
                    .highlightCursor(true)
                    .maxSteps(20.0)
                    .build()
            )
            .frameId("frameId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionExecuteParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .agentConfig(SessionExecuteParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(
                            "Log in with username 'demo' and password 'test123', then navigate to settings"
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionExecuteParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                .agentConfig(
                    SessionExecuteParams.AgentConfig.builder()
                        .cua(true)
                        .model("openai/gpt-4o")
                        .provider(SessionExecuteParams.AgentConfig.Provider.OPENAI)
                        .systemPrompt("systemPrompt")
                        .build()
                )
                .executeOptions(
                    SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(
                            "Log in with username 'demo' and password 'test123', then navigate to settings"
                        )
                        .highlightCursor(true)
                        .maxSteps(20.0)
                        .build()
                )
                .frameId("frameId")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("x-stream-response", "true").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionExecuteParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .agentConfig(SessionExecuteParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(
                            "Log in with username 'demo' and password 'test123', then navigate to settings"
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionExecuteParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                .agentConfig(
                    SessionExecuteParams.AgentConfig.builder()
                        .cua(true)
                        .model("openai/gpt-4o")
                        .provider(SessionExecuteParams.AgentConfig.Provider.OPENAI)
                        .systemPrompt("systemPrompt")
                        .build()
                )
                .executeOptions(
                    SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(
                            "Log in with username 'demo' and password 'test123', then navigate to settings"
                        )
                        .highlightCursor(true)
                        .maxSteps(20.0)
                        .build()
                )
                .frameId("frameId")
                .build()

        val body = params._body()

        assertThat(body.agentConfig())
            .isEqualTo(
                SessionExecuteParams.AgentConfig.builder()
                    .cua(true)
                    .model("openai/gpt-4o")
                    .provider(SessionExecuteParams.AgentConfig.Provider.OPENAI)
                    .systemPrompt("systemPrompt")
                    .build()
            )
        assertThat(body.executeOptions())
            .isEqualTo(
                SessionExecuteParams.ExecuteOptions.builder()
                    .instruction(
                        "Log in with username 'demo' and password 'test123', then navigate to settings"
                    )
                    .highlightCursor(true)
                    .maxSteps(20.0)
                    .build()
            )
        assertThat(body.frameId()).contains("frameId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionExecuteParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .agentConfig(SessionExecuteParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteParams.ExecuteOptions.builder()
                        .instruction(
                            "Log in with username 'demo' and password 'test123', then navigate to settings"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.agentConfig()).isEqualTo(SessionExecuteParams.AgentConfig.builder().build())
        assertThat(body.executeOptions())
            .isEqualTo(
                SessionExecuteParams.ExecuteOptions.builder()
                    .instruction(
                        "Log in with username 'demo' and password 'test123', then navigate to settings"
                    )
                    .build()
            )
    }
}
