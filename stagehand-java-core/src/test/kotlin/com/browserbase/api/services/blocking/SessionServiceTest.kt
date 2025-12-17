// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

import com.browserbase.api.TestServerExtension
import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionEndParams
import com.browserbase.api.models.sessions.SessionExecuteParams
import com.browserbase.api.models.sessions.SessionExtractParams
import com.browserbase.api.models.sessions.SessionNavigateParams
import com.browserbase.api.models.sessions.SessionObserveParams
import com.browserbase.api.models.sessions.SessionStartParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun act() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.act(
                SessionActParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionActParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                    .input("Click the login button")
                    .frameId("frameId")
                    .options(
                        SessionActParams.Options.builder()
                            .model("string")
                            .timeout(30000.0)
                            .variables(
                                SessionActParams.Options.Variables.builder()
                                    .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.end(
                SessionEndParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionEndParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionEndParams.XStreamResponse.TRUE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.execute(
                SessionExecuteParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionExecuteParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionExecuteParams.XStreamResponse.TRUE)
                    .agentConfig(
                        SessionExecuteParams.AgentConfig.builder()
                            .cua(true)
                            .model("string")
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
                            .build()
                    )
                    .frameId("frameId")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun extract() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.extract(
                SessionExtractParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionExtractParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionExtractParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("Extract all product names and prices from the page")
                    .options(
                        SessionExtractParams.Options.builder()
                            .model("string")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun navigate() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.navigate(
                SessionNavigateParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionNavigateParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
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
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun observe() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.observe(
                SessionObserveParams.builder()
                    .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                    .xLanguage(SessionObserveParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionObserveParams.XStreamResponse.TRUE)
                    .frameId("frameId")
                    .instruction("Find all clickable navigation links")
                    .options(
                        SessionObserveParams.Options.builder()
                            .model("string")
                            .selector("nav")
                            .timeout(30000.0)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun start() {
        val client =
            StagehandOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
        val sessionService = client.sessions()

        val response =
            sessionService.start(
                SessionStartParams.builder()
                    .xLanguage(SessionStartParams.XLanguage.TYPESCRIPT)
                    .xSdkVersion("3.0.6")
                    .xSentAt(OffsetDateTime.parse("2025-01-15T10:30:00.000Z"))
                    .xStreamResponse(SessionStartParams.XStreamResponse.TRUE)
                    .modelName("gpt-4o")
                    .actTimeoutMs(30000.0)
                    .browser(
                        SessionStartParams.Browser.builder()
                            .cdpUrl("ws://localhost:9222")
                            .launchOptions(
                                SessionStartParams.Browser.LaunchOptions.builder()
                                    .acceptDownloads(true)
                                    .addArg("string")
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
                                    .recordSession(true)
                                    .solveCaptchas(true)
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
                    .debugDom(true)
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
