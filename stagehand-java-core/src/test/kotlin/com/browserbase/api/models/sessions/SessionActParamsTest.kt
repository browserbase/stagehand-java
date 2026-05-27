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
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
            .input("Click the login button")
            .frameId("frameId")
            .options(
                SessionActParams.Options.builder()
                    .model(
                        SessionActParams.Options.Model.VertexModelConfigObject.builder()
                            .auth(
                                SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                    .builder()
                                    .credentials(
                                        SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                            .Credentials
                                            .builder()
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
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .Auth
                                                    .Credentials
                                                    .Type
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
                            .modelName("openai/gpt-5.4-mini")
                            .providerOptions(
                                SessionActParams.Options.Model.VertexModelConfigObject
                                    .ProviderOptions
                                    .builder()
                                    .vertex(
                                        SessionActParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .Vertex
                                            .builder()
                                            .location("us-central1")
                                            .project("my-gcp-project")
                                            .baseUrl("https://example.com")
                                            .headers(
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .Headers
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .apiKey("sk-some-openai-api-key")
                            .baseUrl("https://api.openai.com/v1")
                            .headers(
                                SessionActParams.Options.Model.VertexModelConfigObject.Headers
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .timeout(30000.0)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("username", JsonValue.from("john_doe"))
                            .putAdditionalProperty(
                                "password",
                                JsonValue.from(
                                    mapOf(
                                        "value" to "secret123",
                                        "description" to "The login password",
                                    )
                                ),
                            )
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
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("Click the login button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model(
                            SessionActParams.Options.Model.VertexModelConfigObject.builder()
                                .auth(
                                    SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                        .builder()
                                        .credentials(
                                            SessionActParams.Options.Model.VertexModelConfigObject
                                                .Auth
                                                .Credentials
                                                .builder()
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
                                                    SessionActParams.Options.Model
                                                        .VertexModelConfigObject
                                                        .Auth
                                                        .Credentials
                                                        .Type
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
                                .modelName("openai/gpt-5.4-mini")
                                .providerOptions(
                                    SessionActParams.Options.Model.VertexModelConfigObject
                                        .ProviderOptions
                                        .builder()
                                        .vertex(
                                            SessionActParams.Options.Model.VertexModelConfigObject
                                                .ProviderOptions
                                                .Vertex
                                                .builder()
                                                .location("us-central1")
                                                .project("my-gcp-project")
                                                .baseUrl("https://example.com")
                                                .headers(
                                                    SessionActParams.Options.Model
                                                        .VertexModelConfigObject
                                                        .ProviderOptions
                                                        .Vertex
                                                        .Headers
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string"),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .apiKey("sk-some-openai-api-key")
                                .baseUrl("https://api.openai.com/v1")
                                .headers(
                                    SessionActParams.Options.Model.VertexModelConfigObject.Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .timeout(30000.0)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                .putAdditionalProperty(
                                    "password",
                                    JsonValue.from(
                                        mapOf(
                                            "value" to "secret123",
                                            "description" to "The login password",
                                        )
                                    ),
                                )
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
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("Click the login button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model(
                            SessionActParams.Options.Model.VertexModelConfigObject.builder()
                                .auth(
                                    SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                        .builder()
                                        .credentials(
                                            SessionActParams.Options.Model.VertexModelConfigObject
                                                .Auth
                                                .Credentials
                                                .builder()
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
                                                    SessionActParams.Options.Model
                                                        .VertexModelConfigObject
                                                        .Auth
                                                        .Credentials
                                                        .Type
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
                                .modelName("openai/gpt-5.4-mini")
                                .providerOptions(
                                    SessionActParams.Options.Model.VertexModelConfigObject
                                        .ProviderOptions
                                        .builder()
                                        .vertex(
                                            SessionActParams.Options.Model.VertexModelConfigObject
                                                .ProviderOptions
                                                .Vertex
                                                .builder()
                                                .location("us-central1")
                                                .project("my-gcp-project")
                                                .baseUrl("https://example.com")
                                                .headers(
                                                    SessionActParams.Options.Model
                                                        .VertexModelConfigObject
                                                        .ProviderOptions
                                                        .Vertex
                                                        .Headers
                                                        .builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string"),
                                                        )
                                                        .build()
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .apiKey("sk-some-openai-api-key")
                                .baseUrl("https://api.openai.com/v1")
                                .headers(
                                    SessionActParams.Options.Model.VertexModelConfigObject.Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .timeout(30000.0)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                .putAdditionalProperty(
                                    "password",
                                    JsonValue.from(
                                        mapOf(
                                            "value" to "secret123",
                                            "description" to "The login password",
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("Click the login button"))
        assertThat(body.frameId()).contains("frameId")
        assertThat(body.options())
            .contains(
                SessionActParams.Options.builder()
                    .model(
                        SessionActParams.Options.Model.VertexModelConfigObject.builder()
                            .auth(
                                SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                    .builder()
                                    .credentials(
                                        SessionActParams.Options.Model.VertexModelConfigObject.Auth
                                            .Credentials
                                            .builder()
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
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .Auth
                                                    .Credentials
                                                    .Type
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
                            .modelName("openai/gpt-5.4-mini")
                            .providerOptions(
                                SessionActParams.Options.Model.VertexModelConfigObject
                                    .ProviderOptions
                                    .builder()
                                    .vertex(
                                        SessionActParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .Vertex
                                            .builder()
                                            .location("us-central1")
                                            .project("my-gcp-project")
                                            .baseUrl("https://example.com")
                                            .headers(
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .Headers
                                                    .builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .apiKey("sk-some-openai-api-key")
                            .baseUrl("https://api.openai.com/v1")
                            .headers(
                                SessionActParams.Options.Model.VertexModelConfigObject.Headers
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .timeout(30000.0)
                    .variables(
                        SessionActParams.Options.Variables.builder()
                            .putAdditionalProperty("username", JsonValue.from("john_doe"))
                            .putAdditionalProperty(
                                "password",
                                JsonValue.from(
                                    mapOf(
                                        "value" to "secret123",
                                        "description" to "The login password",
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .input("Click the login button")
                .build()

        val body = params._body()

        assertThat(body.input())
            .isEqualTo(SessionActParams.Input.ofString("Click the login button"))
    }
}
