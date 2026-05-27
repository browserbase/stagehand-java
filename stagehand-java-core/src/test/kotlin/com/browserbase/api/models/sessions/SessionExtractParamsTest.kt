// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionExtractParamsTest {

    @Test
    fun create() {
        SessionExtractParams.builder()
            .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
            .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
            .frameId("frameId")
            .instruction("Extract all product names and prices from the page")
            .options(
                SessionExtractParams.Options.builder()
                    .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                    .model(
                        SessionExtractParams.Options.Model.VertexModelConfigObject.builder()
                            .auth(
                                SessionExtractParams.Options.Model.VertexModelConfigObject.Auth
                                    .builder()
                                    .credentials(
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
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
                                                SessionExtractParams.Options.Model
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
                                SessionExtractParams.Options.Model.VertexModelConfigObject
                                    .ProviderOptions
                                    .builder()
                                    .vertex(
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .Vertex
                                            .builder()
                                            .location("us-central1")
                                            .project("my-gcp-project")
                                            .baseUrl("https://example.com")
                                            .headers(
                                                SessionExtractParams.Options.Model
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
                                SessionExtractParams.Options.Model.VertexModelConfigObject.Headers
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .screenshot(false)
                    .selector("#main-content")
                    .timeout(30000.0)
                    .build()
            )
            .schema(
                SessionExtractParams.Schema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        assertThat(params._pathParam(0)).isEqualTo("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionExtractParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Extract all product names and prices from the page")
                .options(
                    SessionExtractParams.Options.builder()
                        .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                        .model(
                            SessionExtractParams.Options.Model.VertexModelConfigObject.builder()
                                .auth(
                                    SessionExtractParams.Options.Model.VertexModelConfigObject.Auth
                                        .builder()
                                        .credentials(
                                            SessionExtractParams.Options.Model
                                                .VertexModelConfigObject
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
                                                    SessionExtractParams.Options.Model
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
                                    SessionExtractParams.Options.Model.VertexModelConfigObject
                                        .ProviderOptions
                                        .builder()
                                        .vertex(
                                            SessionExtractParams.Options.Model
                                                .VertexModelConfigObject
                                                .ProviderOptions
                                                .Vertex
                                                .builder()
                                                .location("us-central1")
                                                .project("my-gcp-project")
                                                .baseUrl("https://example.com")
                                                .headers(
                                                    SessionExtractParams.Options.Model
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
                                    SessionExtractParams.Options.Model.VertexModelConfigObject
                                        .Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .screenshot(false)
                        .selector("#main-content")
                        .timeout(30000.0)
                        .build()
                )
                .schema(
                    SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("x-stream-response", "true").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionExtractParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                .frameId("frameId")
                .instruction("Extract all product names and prices from the page")
                .options(
                    SessionExtractParams.Options.builder()
                        .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                        .model(
                            SessionExtractParams.Options.Model.VertexModelConfigObject.builder()
                                .auth(
                                    SessionExtractParams.Options.Model.VertexModelConfigObject.Auth
                                        .builder()
                                        .credentials(
                                            SessionExtractParams.Options.Model
                                                .VertexModelConfigObject
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
                                                    SessionExtractParams.Options.Model
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
                                    SessionExtractParams.Options.Model.VertexModelConfigObject
                                        .ProviderOptions
                                        .builder()
                                        .vertex(
                                            SessionExtractParams.Options.Model
                                                .VertexModelConfigObject
                                                .ProviderOptions
                                                .Vertex
                                                .builder()
                                                .location("us-central1")
                                                .project("my-gcp-project")
                                                .baseUrl("https://example.com")
                                                .headers(
                                                    SessionExtractParams.Options.Model
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
                                    SessionExtractParams.Options.Model.VertexModelConfigObject
                                        .Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .screenshot(false)
                        .selector("#main-content")
                        .timeout(30000.0)
                        .build()
                )
                .schema(
                    SessionExtractParams.Schema.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.frameId()).contains("frameId")
        assertThat(body.instruction())
            .contains("Extract all product names and prices from the page")
        assertThat(body.options())
            .contains(
                SessionExtractParams.Options.builder()
                    .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                    .model(
                        SessionExtractParams.Options.Model.VertexModelConfigObject.builder()
                            .auth(
                                SessionExtractParams.Options.Model.VertexModelConfigObject.Auth
                                    .builder()
                                    .credentials(
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
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
                                                SessionExtractParams.Options.Model
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
                                SessionExtractParams.Options.Model.VertexModelConfigObject
                                    .ProviderOptions
                                    .builder()
                                    .vertex(
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .Vertex
                                            .builder()
                                            .location("us-central1")
                                            .project("my-gcp-project")
                                            .baseUrl("https://example.com")
                                            .headers(
                                                SessionExtractParams.Options.Model
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
                                SessionExtractParams.Options.Model.VertexModelConfigObject.Headers
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .screenshot(false)
                    .selector("#main-content")
                    .timeout(30000.0)
                    .build()
            )
        assertThat(body.schema())
            .contains(
                SessionExtractParams.Schema.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionExtractParams.builder().id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123").build()

        val body = params._body()
    }
}
