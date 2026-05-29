// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionEndParams
import com.browserbase.api.models.sessions.SessionExecuteParams
import com.browserbase.api.models.sessions.SessionExtractParams
import com.browserbase.api.models.sessions.SessionNavigateParams
import com.browserbase.api.models.sessions.SessionObserveParams
import com.browserbase.api.models.sessions.SessionReplayParams
import com.browserbase.api.models.sessions.SessionStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun act() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.act(
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
                                                SessionActParams.Options.Model
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
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
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
                                        SessionActParams.Options.Model.VertexModelConfigObject
                                            .Headers
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun actStreaming() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val responseStreamResponse =
            sessionService.actStreaming(
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
                                                SessionActParams.Options.Model
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
                                                SessionActParams.Options.Model
                                                    .VertexModelConfigObject
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
                                        SessionActParams.Options.Model.VertexModelConfigObject
                                            .Headers
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
            )

        responseStreamResponse.use {
            responseStreamResponse.stream().forEach { response -> response.validate() }
        }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun end() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.end(
                SessionEndParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionEndParams.XStreamResponse.TRUE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun execute() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.execute(
                SessionExecuteParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                    .agentConfig(
                        SessionExecuteParams.AgentConfig.builder()
                            .cua(true)
                            .executionModel(
                                SessionExecuteParams.AgentConfig.ExecutionModel
                                    .VertexModelConfigObject
                                    .builder()
                                    .auth(
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionExecuteParams.AgentConfig.ExecutionModel
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
                                                        SessionExecuteParams.AgentConfig
                                                            .ExecutionModel
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
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionExecuteParams.AgentConfig.ExecutionModel
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionExecuteParams.AgentConfig
                                                            .ExecutionModel
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
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .mode(SessionExecuteParams.AgentConfig.Mode.CUA)
                            .model(
                                SessionExecuteParams.AgentConfig.Model.VertexModelConfigObject
                                    .builder()
                                    .auth(
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionExecuteParams.AgentConfig.Model
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
                                                        SessionExecuteParams.AgentConfig.Model
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
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionExecuteParams.AgentConfig.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionExecuteParams.AgentConfig.Model
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
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
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
                            .toolTimeout(30000.0)
                            .useSearch(true)
                            .variables(
                                SessionExecuteParams.ExecuteOptions.Variables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .frameId("frameId")
                    .shouldCache(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun executeStreaming() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val responseStreamResponse =
            sessionService.executeStreaming(
                SessionExecuteParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                    .agentConfig(
                        SessionExecuteParams.AgentConfig.builder()
                            .cua(true)
                            .executionModel(
                                SessionExecuteParams.AgentConfig.ExecutionModel
                                    .VertexModelConfigObject
                                    .builder()
                                    .auth(
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionExecuteParams.AgentConfig.ExecutionModel
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
                                                        SessionExecuteParams.AgentConfig
                                                            .ExecutionModel
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
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionExecuteParams.AgentConfig.ExecutionModel
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionExecuteParams.AgentConfig
                                                            .ExecutionModel
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
                                        SessionExecuteParams.AgentConfig.ExecutionModel
                                            .VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
                            .mode(SessionExecuteParams.AgentConfig.Mode.CUA)
                            .model(
                                SessionExecuteParams.AgentConfig.Model.VertexModelConfigObject
                                    .builder()
                                    .auth(
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionExecuteParams.AgentConfig.Model
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
                                                        SessionExecuteParams.AgentConfig.Model
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
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionExecuteParams.AgentConfig.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionExecuteParams.AgentConfig.Model
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
                                        SessionExecuteParams.AgentConfig.Model
                                            .VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .build()
                            )
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
                            .toolTimeout(30000.0)
                            .useSearch(true)
                            .variables(
                                SessionExecuteParams.ExecuteOptions.Variables.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .frameId("frameId")
                    .shouldCache(true)
                    .build()
            )

        responseStreamResponse.use {
            responseStreamResponse.stream().forEach { response -> response.validate() }
        }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun extract() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.extract(
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
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
                                            .Auth
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun extractStreaming() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val responseStreamResponse =
            sessionService.extractStreaming(
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
                                        SessionExtractParams.Options.Model.VertexModelConfigObject
                                            .Auth
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
            )

        responseStreamResponse.use {
            responseStreamResponse.stream().forEach { response -> response.validate() }
        }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun navigate() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.navigate(
                SessionNavigateParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionNavigateParams.XStreamResponse.TRUE)
                    .url("https://example.com")
                    .frameId("frameId")
                    .options(
                        SessionNavigateParams.Options.builder()
                            .referer("referer")
                            .timeout(30000.0)
                            .waitUntil(SessionNavigateParams.Options.WaitUntil.NETWORKIDLE)
                            .build()
                    )
                    .streamResponse(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun observe() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.observe(
                SessionObserveParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("Find all clickable navigation links")
                    .options(
                        SessionObserveParams.Options.builder()
                            .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                            .model(
                                SessionObserveParams.Options.Model.VertexModelConfigObject.builder()
                                    .auth(
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionObserveParams.Options.Model
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
                                                        SessionObserveParams.Options.Model
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
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionObserveParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionObserveParams.Options.Model
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
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
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
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun observeStreaming() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val responseStreamResponse =
            sessionService.observeStreaming(
                SessionObserveParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("Find all clickable navigation links")
                    .options(
                        SessionObserveParams.Options.builder()
                            .ignoreSelectors(listOf("nav", ".cookie-banner", "#sidebar-ads"))
                            .model(
                                SessionObserveParams.Options.Model.VertexModelConfigObject.builder()
                                    .auth(
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .Auth
                                            .builder()
                                            .credentials(
                                                SessionObserveParams.Options.Model
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
                                                        SessionObserveParams.Options.Model
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
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .ProviderOptions
                                            .builder()
                                            .vertex(
                                                SessionObserveParams.Options.Model
                                                    .VertexModelConfigObject
                                                    .ProviderOptions
                                                    .Vertex
                                                    .builder()
                                                    .location("us-central1")
                                                    .project("my-gcp-project")
                                                    .baseUrl("https://example.com")
                                                    .headers(
                                                        SessionObserveParams.Options.Model
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
                                        SessionObserveParams.Options.Model.VertexModelConfigObject
                                            .Headers
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
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
            )

        responseStreamResponse.use {
            responseStreamResponse.stream().forEach { response -> response.validate() }
        }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replay() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.replay(
                SessionReplayParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xStreamResponse(SessionReplayParams.XStreamResponse.TRUE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val client =
            StagehandOkHttpClient.builder()
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.start(
                SessionStartParams.builder()
                    .xStreamResponse(SessionStartParams.XStreamResponse.TRUE)
                    .modelName("openai/gpt-5.4-mini")
                    .actTimeoutMs(0.0)
                    .browser(
                        SessionStartParams.Browser.builder()
                            .cdpUrl("ws://localhost:9222")
                            .launchOptions(
                                SessionStartParams.Browser.LaunchOptions.builder()
                                    .acceptDownloads(true)
                                    .addArg("string")
                                    .cdpHeaders(
                                        SessionStartParams.Browser.LaunchOptions.CdpHeaders
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .cdpUrl("cdpUrl")
                                    .chromiumSandbox(true)
                                    .connectTimeoutMs(0.0)
                                    .deviceScaleFactor(0.0)
                                    .devtools(true)
                                    .downloadsPath("downloadsPath")
                                    .executablePath("executablePath")
                                    .hasTouch(true)
                                    .headless(true)
                                    .ignoreDefaultArgs(true)
                                    .ignoreHttpsErrors(true)
                                    .locale("locale")
                                    .port(0.0)
                                    .preserveUserDataDir(true)
                                    .proxy(
                                        SessionStartParams.Browser.LaunchOptions.Proxy.builder()
                                            .server("server")
                                            .bypass("bypass")
                                            .password("password")
                                            .username("username")
                                            .build()
                                    )
                                    .userDataDir("userDataDir")
                                    .viewport(
                                        SessionStartParams.Browser.LaunchOptions.Viewport.builder()
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .type(SessionStartParams.Browser.Type.LOCAL)
                            .build()
                    )
                    .browserbaseSessionCreateParams(
                        SessionStartParams.BrowserbaseSessionCreateParams.builder()
                            .browserSettings(
                                SessionStartParams.BrowserbaseSessionCreateParams.BrowserSettings
                                    .builder()
                                    .advancedStealth(true)
                                    .blockAds(true)
                                    .captchaImageSelector("captchaImageSelector")
                                    .captchaInputSelector("captchaInputSelector")
                                    .context(
                                        SessionStartParams.BrowserbaseSessionCreateParams
                                            .BrowserSettings
                                            .Context
                                            .builder()
                                            .id("id")
                                            .persist(true)
                                            .build()
                                    )
                                    .extensionId("extensionId")
                                    .fingerprint(
                                        SessionStartParams.BrowserbaseSessionCreateParams
                                            .BrowserSettings
                                            .Fingerprint
                                            .builder()
                                            .addBrowser(
                                                SessionStartParams.BrowserbaseSessionCreateParams
                                                    .BrowserSettings
                                                    .Fingerprint
                                                    .Browser
                                                    .CHROME
                                            )
                                            .addDevice(
                                                SessionStartParams.BrowserbaseSessionCreateParams
                                                    .BrowserSettings
                                                    .Fingerprint
                                                    .Device
                                                    .DESKTOP
                                            )
                                            .httpVersion(
                                                SessionStartParams.BrowserbaseSessionCreateParams
                                                    .BrowserSettings
                                                    .Fingerprint
                                                    .HttpVersion
                                                    ._1
                                            )
                                            .addLocale("string")
                                            .addOperatingSystem(
                                                SessionStartParams.BrowserbaseSessionCreateParams
                                                    .BrowserSettings
                                                    .Fingerprint
                                                    .OperatingSystem
                                                    .ANDROID
                                            )
                                            .screen(
                                                SessionStartParams.BrowserbaseSessionCreateParams
                                                    .BrowserSettings
                                                    .Fingerprint
                                                    .Screen
                                                    .builder()
                                                    .maxHeight(0.0)
                                                    .maxWidth(0.0)
                                                    .minHeight(0.0)
                                                    .minWidth(0.0)
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .logSession(true)
                                    .os(
                                        SessionStartParams.BrowserbaseSessionCreateParams
                                            .BrowserSettings
                                            .Os
                                            .WINDOWS
                                    )
                                    .recordSession(true)
                                    .solveCaptchas(true)
                                    .verified(true)
                                    .viewport(
                                        SessionStartParams.BrowserbaseSessionCreateParams
                                            .BrowserSettings
                                            .Viewport
                                            .builder()
                                            .height(0.0)
                                            .width(0.0)
                                            .build()
                                    )
                                    .build()
                            )
                            .extensionId("extensionId")
                            .keepAlive(true)
                            .projectId("projectId")
                            .proxies(true)
                            .region(
                                SessionStartParams.BrowserbaseSessionCreateParams.Region.US_WEST_2
                            )
                            .timeout(0.0)
                            .userMetadata(
                                SessionStartParams.BrowserbaseSessionCreateParams.UserMetadata
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .build()
                    )
                    .browserbaseSessionId("browserbaseSessionID")
                    .domSettleTimeoutMs(5000.0)
                    .experimental(true)
                    .selfHeal(true)
                    .systemPrompt("systemPrompt")
                    .verbose(SessionStartParams.Verbose._1)
                    .waitForCaptchaSolves(true)
                    .build()
            )

        response.validate()
    }
}
