// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class ModelConfigTest {

    @Test
    fun ofVertexModelConfigObject() {
        val vertexModelConfigObject =
            ModelConfig.VertexModelConfigObject.builder()
                .auth(
                    ModelConfig.VertexModelConfigObject.Auth.builder()
                        .credentials(
                            ModelConfig.VertexModelConfigObject.Auth.Credentials.builder()
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
                                    ModelConfig.VertexModelConfigObject.Auth.Credentials.Type
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
                    ModelConfig.VertexModelConfigObject.ProviderOptions.builder()
                        .vertex(
                            ModelConfig.VertexModelConfigObject.ProviderOptions.Vertex.builder()
                                .location("us-central1")
                                .project("my-gcp-project")
                                .baseUrl("https://example.com")
                                .headers(
                                    ModelConfig.VertexModelConfigObject.ProviderOptions.Vertex
                                        .Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.VertexModelConfigObject.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val modelConfig = ModelConfig.ofVertexModelConfigObject(vertexModelConfigObject)

        assertThat(modelConfig.vertexModelConfigObject()).contains(vertexModelConfigObject)
        assertThat(modelConfig.azureEntraModelConfigObject()).isEmpty
        assertThat(modelConfig.azureApiKeyModelConfigObject()).isEmpty
        assertThat(modelConfig.genericModelConfigObject()).isEmpty
    }

    @Test
    fun ofVertexModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofVertexModelConfigObject(
                ModelConfig.VertexModelConfigObject.builder()
                    .auth(
                        ModelConfig.VertexModelConfigObject.Auth.builder()
                            .credentials(
                                ModelConfig.VertexModelConfigObject.Auth.Credentials.builder()
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
                                        ModelConfig.VertexModelConfigObject.Auth.Credentials.Type
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
                        ModelConfig.VertexModelConfigObject.ProviderOptions.builder()
                            .vertex(
                                ModelConfig.VertexModelConfigObject.ProviderOptions.Vertex.builder()
                                    .location("us-central1")
                                    .project("my-gcp-project")
                                    .baseUrl("https://example.com")
                                    .headers(
                                        ModelConfig.VertexModelConfigObject.ProviderOptions.Vertex
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .apiKey("sk-some-openai-api-key")
                    .baseUrl("https://api.openai.com/v1")
                    .headers(
                        ModelConfig.VertexModelConfigObject.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun ofAzureEntraModelConfigObject() {
        val azureEntraModelConfigObject =
            ModelConfig.AzureEntraModelConfigObject.builder()
                .auth(ModelConfig.AzureEntraModelConfigObject.Auth.builder().token("x").build())
                .modelName("openai/gpt-5.4-mini")
                .providerOptions(
                    ModelConfig.AzureEntraModelConfigObject.ProviderOptions.builder()
                        .azure(
                            ModelConfig.AzureEntraModelConfigObject.ProviderOptions.Azure.builder()
                                .apiVersion("2024-10-01-preview")
                                .baseUrl("https://example.com")
                                .headers(
                                    ModelConfig.AzureEntraModelConfigObject.ProviderOptions.Azure
                                        .Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .resourceName("my-azure-openai-resource")
                                .useDeploymentBasedUrls(true)
                                .build()
                        )
                        .build()
                )
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.AzureEntraModelConfigObject.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val modelConfig = ModelConfig.ofAzureEntraModelConfigObject(azureEntraModelConfigObject)

        assertThat(modelConfig.vertexModelConfigObject()).isEmpty
        assertThat(modelConfig.azureEntraModelConfigObject()).contains(azureEntraModelConfigObject)
        assertThat(modelConfig.azureApiKeyModelConfigObject()).isEmpty
        assertThat(modelConfig.genericModelConfigObject()).isEmpty
    }

    @Test
    fun ofAzureEntraModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofAzureEntraModelConfigObject(
                ModelConfig.AzureEntraModelConfigObject.builder()
                    .auth(ModelConfig.AzureEntraModelConfigObject.Auth.builder().token("x").build())
                    .modelName("openai/gpt-5.4-mini")
                    .providerOptions(
                        ModelConfig.AzureEntraModelConfigObject.ProviderOptions.builder()
                            .azure(
                                ModelConfig.AzureEntraModelConfigObject.ProviderOptions.Azure
                                    .builder()
                                    .apiVersion("2024-10-01-preview")
                                    .baseUrl("https://example.com")
                                    .headers(
                                        ModelConfig.AzureEntraModelConfigObject.ProviderOptions
                                            .Azure
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .resourceName("my-azure-openai-resource")
                                    .useDeploymentBasedUrls(true)
                                    .build()
                            )
                            .build()
                    )
                    .baseUrl("https://api.openai.com/v1")
                    .headers(
                        ModelConfig.AzureEntraModelConfigObject.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun ofAzureApiKeyModelConfigObject() {
        val azureApiKeyModelConfigObject =
            ModelConfig.AzureApiKeyModelConfigObject.builder()
                .modelName("openai/gpt-5.4-mini")
                .providerOptions(
                    ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions.builder()
                        .azure(
                            ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions.Azure.builder()
                                .apiVersion("2024-10-01-preview")
                                .baseUrl("https://example.com")
                                .headers(
                                    ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions.Azure
                                        .Headers
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .resourceName("my-azure-openai-resource")
                                .useDeploymentBasedUrls(true)
                                .build()
                        )
                        .build()
                )
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.AzureApiKeyModelConfigObject.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val modelConfig = ModelConfig.ofAzureApiKeyModelConfigObject(azureApiKeyModelConfigObject)

        assertThat(modelConfig.vertexModelConfigObject()).isEmpty
        assertThat(modelConfig.azureEntraModelConfigObject()).isEmpty
        assertThat(modelConfig.azureApiKeyModelConfigObject())
            .contains(azureApiKeyModelConfigObject)
        assertThat(modelConfig.genericModelConfigObject()).isEmpty
    }

    @Test
    fun ofAzureApiKeyModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofAzureApiKeyModelConfigObject(
                ModelConfig.AzureApiKeyModelConfigObject.builder()
                    .modelName("openai/gpt-5.4-mini")
                    .providerOptions(
                        ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions.builder()
                            .azure(
                                ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions.Azure
                                    .builder()
                                    .apiVersion("2024-10-01-preview")
                                    .baseUrl("https://example.com")
                                    .headers(
                                        ModelConfig.AzureApiKeyModelConfigObject.ProviderOptions
                                            .Azure
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .resourceName("my-azure-openai-resource")
                                    .useDeploymentBasedUrls(true)
                                    .build()
                            )
                            .build()
                    )
                    .apiKey("sk-some-openai-api-key")
                    .baseUrl("https://api.openai.com/v1")
                    .headers(
                        ModelConfig.AzureApiKeyModelConfigObject.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    @Test
    fun ofGenericModelConfigObject() {
        val genericModelConfigObject =
            ModelConfig.GenericModelConfigObject.builder()
                .modelName("openai/gpt-5.4-mini")
                .apiKey("sk-some-openai-api-key")
                .baseUrl("https://api.openai.com/v1")
                .headers(
                    ModelConfig.GenericModelConfigObject.Headers.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .provider(ModelConfig.GenericModelConfigObject.Provider.OPENAI)
                .build()

        val modelConfig = ModelConfig.ofGenericModelConfigObject(genericModelConfigObject)

        assertThat(modelConfig.vertexModelConfigObject()).isEmpty
        assertThat(modelConfig.azureEntraModelConfigObject()).isEmpty
        assertThat(modelConfig.azureApiKeyModelConfigObject()).isEmpty
        assertThat(modelConfig.genericModelConfigObject()).contains(genericModelConfigObject)
    }

    @Test
    fun ofGenericModelConfigObjectRoundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
            ModelConfig.ofGenericModelConfigObject(
                ModelConfig.GenericModelConfigObject.builder()
                    .modelName("openai/gpt-5.4-mini")
                    .apiKey("sk-some-openai-api-key")
                    .baseUrl("https://api.openai.com/v1")
                    .headers(
                        ModelConfig.GenericModelConfigObject.Headers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .provider(ModelConfig.GenericModelConfigObject.Provider.OPENAI)
                    .build()
            )

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val modelConfig = jsonMapper().convertValue(testCase.value, jacksonTypeRef<ModelConfig>())

        val e = assertThrows<StagehandInvalidDataException> { modelConfig.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
