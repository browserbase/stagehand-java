// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.stagehand.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExecuteAgentParamsTest {

    @Test
    fun create() {
        SessionExecuteAgentParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xStreamResponse(SessionExecuteAgentParams.XStreamResponse.TRUE)
            .agentConfig(
                SessionExecuteAgentParams.AgentConfig.builder()
                    .cua(true)
                    .model("openai/gpt-4o")
                    .provider(SessionExecuteAgentParams.AgentConfig.Provider.OPENAI)
                    .systemPrompt("systemPrompt")
                    .build()
            )
            .executeOptions(
                SessionExecuteAgentParams.ExecuteOptions.builder()
                    .instruction("Find and click the first product")
                    .highlightCursor(true)
                    .maxSteps(10L)
                    .build()
            )
            .frameId("frameId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionExecuteAgentParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentConfig(SessionExecuteAgentParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteAgentParams.ExecuteOptions.builder()
                        .instruction("Find and click the first product")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionExecuteAgentParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionExecuteAgentParams.XStreamResponse.TRUE)
                .agentConfig(
                    SessionExecuteAgentParams.AgentConfig.builder()
                        .cua(true)
                        .model("openai/gpt-4o")
                        .provider(SessionExecuteAgentParams.AgentConfig.Provider.OPENAI)
                        .systemPrompt("systemPrompt")
                        .build()
                )
                .executeOptions(
                    SessionExecuteAgentParams.ExecuteOptions.builder()
                        .instruction("Find and click the first product")
                        .highlightCursor(true)
                        .maxSteps(10L)
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
            SessionExecuteAgentParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentConfig(SessionExecuteAgentParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteAgentParams.ExecuteOptions.builder()
                        .instruction("Find and click the first product")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionExecuteAgentParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionExecuteAgentParams.XStreamResponse.TRUE)
                .agentConfig(
                    SessionExecuteAgentParams.AgentConfig.builder()
                        .cua(true)
                        .model("openai/gpt-4o")
                        .provider(SessionExecuteAgentParams.AgentConfig.Provider.OPENAI)
                        .systemPrompt("systemPrompt")
                        .build()
                )
                .executeOptions(
                    SessionExecuteAgentParams.ExecuteOptions.builder()
                        .instruction("Find and click the first product")
                        .highlightCursor(true)
                        .maxSteps(10L)
                        .build()
                )
                .frameId("frameId")
                .build()

        val body = params._body()

        assertThat(body.agentConfig())
            .isEqualTo(
                SessionExecuteAgentParams.AgentConfig.builder()
                    .cua(true)
                    .model("openai/gpt-4o")
                    .provider(SessionExecuteAgentParams.AgentConfig.Provider.OPENAI)
                    .systemPrompt("systemPrompt")
                    .build()
            )
        assertThat(body.executeOptions())
            .isEqualTo(
                SessionExecuteAgentParams.ExecuteOptions.builder()
                    .instruction("Find and click the first product")
                    .highlightCursor(true)
                    .maxSteps(10L)
                    .build()
            )
        assertThat(body.frameId()).contains("frameId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionExecuteAgentParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .agentConfig(SessionExecuteAgentParams.AgentConfig.builder().build())
                .executeOptions(
                    SessionExecuteAgentParams.ExecuteOptions.builder()
                        .instruction("Find and click the first product")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.agentConfig())
            .isEqualTo(SessionExecuteAgentParams.AgentConfig.builder().build())
        assertThat(body.executeOptions())
            .isEqualTo(
                SessionExecuteAgentParams.ExecuteOptions.builder()
                    .instruction("Find and click the first product")
                    .build()
            )
    }
}
