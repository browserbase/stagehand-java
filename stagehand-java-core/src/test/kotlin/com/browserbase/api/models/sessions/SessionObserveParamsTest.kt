// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionObserveParamsTest {

    @Test
    fun create() {
        SessionObserveParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
            .frameId("frameId")
            .instruction("Find all clickable navigation links")
            .options(
                SessionObserveParams.Options.builder()
                    .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                    .model(
                        ModelConfig.builder()
                            .modelName("openai/gpt-5.4-mini")
                            .apiKey("sk-some-openai-api-key")
                            .baseUrl("https://api.openai.com/v1")
                            .googleAuthOptions(
                                ModelConfig.GoogleAuthOptions.builder()
                                    .credentials(
                                        ModelConfig.GoogleAuthOptions.Credentials.builder()
                                            .clientEmail("client_email")
                                            .privateKey("private_key")
                                            .authProviderX509CertUrl("https://example.com")
                                            .authUri("https://example.com")
                                            .clientId("client_id")
                                            .clientX509CertUrl("https://example.com")
                                            .privateKeyId("private_key_id")
                                            .projectId("project_id")
                                            .tokenUri("https://example.com")
                                            .type(
                                                ModelConfig.GoogleAuthOptions.Credentials.Type
                                                    .SERVICE_ACCOUNT
                                            )
                                            .universeDomain("universe_domain")
                                            .build()
                                    )
                                    .projectId("projectId")
                                    .scopes("string")
                                    .universeDomain("universeDomain")
                                    .build()
                            )
                            .headers(
                                ModelConfig.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .location("us-central1")
                            .project("my-gcp-project")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .selector("nav")
                    .timeout(30000.0)
                    .variables(
                        SessionObserveParams.Options.Variables.builder()
                            .putAdditionalProperty(
                                "username",
                                JsonValue.from(
                                    mapOf(
                                        "value" to "john@example.com",
                                        "description" to "The login email",
                                    )
                                ),
                            )
                            .putAdditionalProperty("rememberMe", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionObserveParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionObserveParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Find all clickable navigation links")
                .options(
                    SessionObserveParams.Options.builder()
                        .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                        .model(
                            ModelConfig.builder()
                                .modelName("openai/gpt-5.4-mini")
                                .apiKey("sk-some-openai-api-key")
                                .baseUrl("https://api.openai.com/v1")
                                .googleAuthOptions(
                                    ModelConfig.GoogleAuthOptions.builder()
                                        .credentials(
                                            ModelConfig.GoogleAuthOptions.Credentials.builder()
                                                .clientEmail("client_email")
                                                .privateKey("private_key")
                                                .authProviderX509CertUrl("https://example.com")
                                                .authUri("https://example.com")
                                                .clientId("client_id")
                                                .clientX509CertUrl("https://example.com")
                                                .privateKeyId("private_key_id")
                                                .projectId("project_id")
                                                .tokenUri("https://example.com")
                                                .type(
                                                    ModelConfig.GoogleAuthOptions.Credentials.Type
                                                        .SERVICE_ACCOUNT
                                                )
                                                .universeDomain("universe_domain")
                                                .build()
                                        )
                                        .projectId("projectId")
                                        .scopes("string")
                                        .universeDomain("universeDomain")
                                        .build()
                                )
                                .headers(
                                    ModelConfig.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .location("us-central1")
                                .project("my-gcp-project")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .selector("nav")
                        .timeout(30000.0)
                        .variables(
                            SessionObserveParams.Options.Variables.builder()
                                .putAdditionalProperty(
                                    "username",
                                    JsonValue.from(
                                        mapOf(
                                            "value" to "john@example.com",
                                            "description" to "The login email",
                                        )
                                    ),
                                )
                                .putAdditionalProperty("rememberMe", JsonValue.from(true))
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
            SessionObserveParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionObserveParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Find all clickable navigation links")
                .options(
                    SessionObserveParams.Options.builder()
                        .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                        .model(
                            ModelConfig.builder()
                                .modelName("openai/gpt-5.4-mini")
                                .apiKey("sk-some-openai-api-key")
                                .baseUrl("https://api.openai.com/v1")
                                .googleAuthOptions(
                                    ModelConfig.GoogleAuthOptions.builder()
                                        .credentials(
                                            ModelConfig.GoogleAuthOptions.Credentials.builder()
                                                .clientEmail("client_email")
                                                .privateKey("private_key")
                                                .authProviderX509CertUrl("https://example.com")
                                                .authUri("https://example.com")
                                                .clientId("client_id")
                                                .clientX509CertUrl("https://example.com")
                                                .privateKeyId("private_key_id")
                                                .projectId("project_id")
                                                .tokenUri("https://example.com")
                                                .type(
                                                    ModelConfig.GoogleAuthOptions.Credentials.Type
                                                        .SERVICE_ACCOUNT
                                                )
                                                .universeDomain("universe_domain")
                                                .build()
                                        )
                                        .projectId("projectId")
                                        .scopes("string")
                                        .universeDomain("universeDomain")
                                        .build()
                                )
                                .headers(
                                    ModelConfig.Headers.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .location("us-central1")
                                .project("my-gcp-project")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .selector("nav")
                        .timeout(30000.0)
                        .variables(
                            SessionObserveParams.Options.Variables.builder()
                                .putAdditionalProperty(
                                    "username",
                                    JsonValue.from(
                                        mapOf(
                                            "value" to "john@example.com",
                                            "description" to "The login email",
                                        )
                                    ),
                                )
                                .putAdditionalProperty("rememberMe", JsonValue.from(true))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.frameId()).contains("frameId")
        assertThat(body.instruction()).contains("Find all clickable navigation links")
        assertThat(body.options())
            .contains(
                SessionObserveParams.Options.builder()
                    .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                    .model(
                        ModelConfig.builder()
                            .modelName("openai/gpt-5.4-mini")
                            .apiKey("sk-some-openai-api-key")
                            .baseUrl("https://api.openai.com/v1")
                            .googleAuthOptions(
                                ModelConfig.GoogleAuthOptions.builder()
                                    .credentials(
                                        ModelConfig.GoogleAuthOptions.Credentials.builder()
                                            .clientEmail("client_email")
                                            .privateKey("private_key")
                                            .authProviderX509CertUrl("https://example.com")
                                            .authUri("https://example.com")
                                            .clientId("client_id")
                                            .clientX509CertUrl("https://example.com")
                                            .privateKeyId("private_key_id")
                                            .projectId("project_id")
                                            .tokenUri("https://example.com")
                                            .type(
                                                ModelConfig.GoogleAuthOptions.Credentials.Type
                                                    .SERVICE_ACCOUNT
                                            )
                                            .universeDomain("universe_domain")
                                            .build()
                                    )
                                    .projectId("projectId")
                                    .scopes("string")
                                    .universeDomain("universeDomain")
                                    .build()
                            )
                            .headers(
                                ModelConfig.Headers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .location("us-central1")
                            .project("my-gcp-project")
                            .provider(ModelConfig.Provider.OPENAI)
                            .build()
                    )
                    .selector("nav")
                    .timeout(30000.0)
                    .variables(
                        SessionObserveParams.Options.Variables.builder()
                            .putAdditionalProperty(
                                "username",
                                JsonValue.from(
                                    mapOf(
                                        "value" to "john@example.com",
                                        "description" to "The login email",
                                    )
                                ),
                            )
                            .putAdditionalProperty("rememberMe", JsonValue.from(true))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionObserveParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val body = params._body()
    }
}
