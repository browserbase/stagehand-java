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
import com.browserbase.api.models.sessions.SessionActParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
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
                .browserbaseApiKey("My Browserbase API Key")
                .browserbaseProjectId("My Browserbase Project ID")
                .modelApiKey("My Model API Key")
                .build()
    }

    @Test
    fun sessionsAct400() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct400WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct401() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct401WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct403() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct403WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct404() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct404WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct422() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct422WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct429() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct429WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct500() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct500WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct999() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsAct999WithRawResponse() {
        val sessionService = client.sessions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun sessionsActInvalidJsonBody() {
        val sessionService = client.sessions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<StagehandException> {
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
                                        .putAdditionalProperty(
                                            "username",
                                            JsonValue.from("john_doe"),
                                        )
                                        .build()
                                )
                                .build()
                        )
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
