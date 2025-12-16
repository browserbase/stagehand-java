// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.stagehand.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionObserveParamsTest {

    @Test
    fun create() {
        SessionObserveParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
            .frameId("frameId")
            .instruction("instruction")
            .options(
                SessionObserveParams.Options.builder()
                    .model(
                        ModelConfig.builder()
                            .apiKey("apiKey")
                            .baseUrl("https://example.com")
                            .model("model")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .selector("selector")
                    .timeout(0L)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionObserveParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionObserveParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("instruction")
                .options(
                    SessionObserveParams.Options.builder()
                        .model(
                            ModelConfig.builder()
                                .apiKey("apiKey")
                                .baseUrl("https://example.com")
                                .model("model")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .selector("selector")
                        .timeout(0L)
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("x-stream-response", "true").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionObserveParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionObserveParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("instruction")
                .options(
                    SessionObserveParams.Options.builder()
                        .model(
                            ModelConfig.builder()
                                .apiKey("apiKey")
                                .baseUrl("https://example.com")
                                .model("model")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .selector("selector")
                        .timeout(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.frameId()).contains("frameId")
        assertThat(body.instruction()).contains("instruction")
        assertThat(body.options())
            .contains(
                SessionObserveParams.Options.builder()
                    .model(
                        ModelConfig.builder()
                            .apiKey("apiKey")
                            .baseUrl("https://example.com")
                            .model("model")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .selector("selector")
                    .timeout(0L)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionObserveParams.builder().sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
