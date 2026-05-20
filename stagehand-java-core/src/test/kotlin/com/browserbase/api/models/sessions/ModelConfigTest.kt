// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ModelConfigTest {

    @Test
    fun create() {
        val modelConfig =
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
                                    ModelConfig.GoogleAuthOptions.Credentials.Type.SERVICE_ACCOUNT
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

        assertThat(modelConfig.modelName()).isEqualTo("openai/gpt-5.4-mini")
        assertThat(modelConfig.apiKey()).contains("sk-some-openai-api-key")
        assertThat(modelConfig.baseUrl()).contains("https://api.openai.com/v1")
        assertThat(modelConfig.googleAuthOptions())
            .contains(
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
                            .type(ModelConfig.GoogleAuthOptions.Credentials.Type.SERVICE_ACCOUNT)
                            .universeDomain("universe_domain")
                            .build()
                    )
                    .projectId("projectId")
                    .scopes("string")
                    .universeDomain("universeDomain")
                    .build()
            )
        assertThat(modelConfig.headers())
            .contains(
                ModelConfig.Headers.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(modelConfig.location()).contains("us-central1")
        assertThat(modelConfig.project()).contains("my-gcp-project")
        assertThat(modelConfig.provider()).contains(ModelConfig.Provider.OPENAI)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val modelConfig =
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
                                    ModelConfig.GoogleAuthOptions.Credentials.Type.SERVICE_ACCOUNT
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

        val roundtrippedModelConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(modelConfig),
                jacksonTypeRef<ModelConfig>(),
            )

        assertThat(roundtrippedModelConfig).isEqualTo(modelConfig)
    }
}
