// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionActParamsTest {

    @Test
    fun create() {
        SessionActParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
            .input("click the sign in button")
            .frameId("frameId")
            .options(
                SessionActParams.Options.builder()
                    .model(
                        ModelConfig.builder()
                            .apiKey("apiKey")
                            .baseUrl("https://example.com")
                            .model("model")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .timeout(0L)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionActParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .input("click the sign in button")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionActParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("click the sign in button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model(
                            ModelConfig.builder()
                                .apiKey("apiKey")
                                .baseUrl("https://example.com")
                                .model("model")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .timeout(0L)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("x-stream-response", "true").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionActParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .input("click the sign in button")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionActParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("click the sign in button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model(
                            ModelConfig.builder()
                                .apiKey("apiKey")
                                .baseUrl("https://example.com")
                                .model("model")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .timeout(0L)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("click the sign in button"))
        assertThat(body.frameId()).contains("frameId")
        assertThat(body.options())
            .contains(
                SessionActParams.Options.builder()
                    .model(
                        ModelConfig.builder()
                            .apiKey("apiKey")
                            .baseUrl("https://example.com")
                            .model("model")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .timeout(0L)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionActParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .input("click the sign in button")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("click the sign in button"))
    }
}
