// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services

import com.browserbase.api.client.StagehandClient
import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.models.sessions.ModelConfig
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionStartParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: StagehandClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StagehandOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun start() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sessionService.start(
            SessionStartParams.builder()
                .xStreamResponse(SessionStartParams.XStreamResponse.TRUE)
                .modelName("openai/gpt-4o")
                .actTimeoutMs(0.0)
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
                        .region(SessionStartParams.BrowserbaseSessionCreateParams.Region.US_WEST_2)
                        .timeout(0.0)
                        .userMetadata(
                            SessionStartParams.BrowserbaseSessionCreateParams.UserMetadata.builder()
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun act() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sessionService.act(
            SessionActParams.builder()
                .id("c4dbf3a9-9a58-4b22-8a1c-9f20f9f9e123")
                .xStreamResponse(SessionActParams.XStreamResponse.TRUE)
                .input("Click the login button")
                .frameId("frameId")
                .options(
                    SessionActParams.Options.builder()
                        .model(
                            ModelConfig.builder()
                                .modelName("openai/gpt-5-nano")
                                .apiKey("sk-some-openai-api-key")
                                .baseUrl("https://api.openai.com/v1")
                                .provider(ModelConfig.Provider.OPENAI)
                                .build()
                        )
                        .timeout(30000.0)
                        .variables(
                            SessionActParams.Options.Variables.builder()
                                .putAdditionalProperty("username", JsonValue.from("john_doe"))
                                .build()
                        )
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
