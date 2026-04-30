// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.core

import com.browserbase.api.core.http.HttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun putHeader_canOverwriteDefaultHeader() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .putHeader("User-Agent", "My User Agent")
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()

        assertThat(clientOptions.headers.values("User-Agent")).containsExactly("My User Agent")
    }

    @Test
    fun toBuilder_bbApiKeyAuthCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()

        clientOptions =
            clientOptions.toBuilder().browserbaseApiKey("another My Browserbase API Key").build()

        assertThat(clientOptions.headers.values("x-bb-api-key"))
            .containsExactly("another My Browserbase API Key")
    }

    @Test
    fun fromEnv_prefersStagehandApiUrl() {
        val env =
            mapOf(
                "STAGEHAND_API_URL" to "https://example.com/from-api-env",
                "STAGEHAND_BASE_URL" to "https://example.com/from-base-env",
            )
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .fromEnv(env::get)
                .build()

        assertThat(clientOptions.baseUrl()).isEqualTo("https://example.com/from-api-env")
    }

    @Test
    fun fromEnv_usesLegacyStagehandBaseUrl() {
        val env = mapOf("STAGEHAND_BASE_URL" to "https://example.com/from-base-env")
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .fromEnv(env::get)
                .build()

        assertThat(clientOptions.baseUrl()).isEqualTo("https://example.com/from-base-env")
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
