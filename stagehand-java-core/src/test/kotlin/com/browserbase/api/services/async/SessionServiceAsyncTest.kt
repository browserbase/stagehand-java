// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.TestServerExtension
import com.browserbase.api.client.okhttp.StagehandOkHttpClientAsync
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.SessionStartParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            StagehandOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionServiceAsync = client.sessions()

        val responseFuture =
            sessionServiceAsync.start(
                SessionStartParams.builder()
                    .xLanguage(JsonValue.from(mapOf<String, Any>()))
                    .xSdkVersion(JsonValue.from(mapOf<String, Any>()))
                    .xSentAt(JsonValue.from(mapOf<String, Any>()))
                    .xStreamResponse(JsonValue.from(mapOf<String, Any>()))
                    .body(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
