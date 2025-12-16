// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services

import com.browserbase.api.client.StagehandClient
import com.browserbase.api.client.okhttp.StagehandOkHttpClient
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers
import com.browserbase.api.core.jsonMapper
import com.browserbase.api.errors.BadRequestException
import com.browserbase.api.errors.InternalServerException
import com.browserbase.api.errors.NotFoundException
import com.browserbase.api.errors.PermissionDeniedException
import com.browserbase.api.errors.RateLimitException
import com.browserbase.api.errors.StagehandException
import com.browserbase.api.errors.UnauthorizedException
import com.browserbase.api.errors.UnexpectedStatusCodeException
import com.browserbase.api.errors.UnprocessableEntityException
import com.browserbase.api.models.sessions.SessionStartParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: StagehandClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            StagehandOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun sessionsStart400() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart400WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart401() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart401WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart403() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart403WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart404() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart404WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart422() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart422WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart429() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart429WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart500() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart500WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart999() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStart999WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsStartInvalidJsonBody() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<StagehandException> {
                sessionService.start(
                    SessionStartParams.builder()
                        .env(SessionStartParams.Env.LOCAL)
                        .apiKey("apiKey")
                        .domSettleTimeout(0L)
                        .localBrowserLaunchOptions(
                            SessionStartParams.LocalBrowserLaunchOptions.builder()
                                .headless(true)
                                .build()
                        )
                        .model("openai/gpt-4o")
                        .projectId("projectId")
                        .selfHeal(true)
                        .systemPrompt("systemPrompt")
                        .verbose(1L)
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
