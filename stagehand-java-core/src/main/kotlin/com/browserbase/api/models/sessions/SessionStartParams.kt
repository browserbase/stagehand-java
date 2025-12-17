// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.BaseDeserializer
import com.browserbase.api.core.BaseSerializer
import com.browserbase.api.core.Enum
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.Params
import com.browserbase.api.core.allMaxBy
import com.browserbase.api.core.checkKnown
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.getOrThrow
import com.browserbase.api.core.http.Headers
import com.browserbase.api.core.http.QueryParams
import com.browserbase.api.core.toImmutable
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new browser session with the specified configuration. Returns a session ID used for all
 * subsequent operations.
 */
class SessionStartParams
private constructor(
    private val xLanguage: XLanguage?,
    private val xSdkVersion: String?,
    private val xSentAt: OffsetDateTime?,
    private val xStreamResponse: XStreamResponse?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Client SDK language */
    fun xLanguage(): Optional<XLanguage> = Optional.ofNullable(xLanguage)

    /** Version of the Stagehand SDK */
    fun xSdkVersion(): Optional<String> = Optional.ofNullable(xSdkVersion)

    /** ISO timestamp when request was sent */
    fun xSentAt(): Optional<OffsetDateTime> = Optional.ofNullable(xSentAt)

    /** Whether to stream the response via SSE */
    fun xStreamResponse(): Optional<XStreamResponse> = Optional.ofNullable(xStreamResponse)

    /**
     * Model name to use for AI operations
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelName(): String = body.modelName()

    /**
     * Timeout in ms for act operations
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actTimeoutMs(): Optional<Double> = body.actTimeoutMs()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browser(): Optional<Browser> = body.browser()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browserbaseSessionCreateParams(): Optional<BrowserbaseSessionCreateParams> =
        body.browserbaseSessionCreateParams()

    /**
     * Existing Browserbase session ID to resume
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun browserbaseSessionId(): Optional<String> = body.browserbaseSessionId()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debugDom(): Optional<Boolean> = body.debugDom()

    /**
     * Timeout in ms to wait for DOM to settle
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domSettleTimeoutMs(): Optional<Double> = body.domSettleTimeoutMs()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun experimental(): Optional<Boolean> = body.experimental()

    /**
     * Enable self-healing for failed actions
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selfHeal(): Optional<Boolean> = body.selfHeal()

    /**
     * Custom system prompt for AI operations
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * Logging verbosity level (0=quiet, 1=normal, 2=debug)
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verbose(): Optional<Long> = body.verbose()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun waitForCaptchaSolves(): Optional<Boolean> = body.waitForCaptchaSolves()

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _modelName(): JsonField<String> = body._modelName()

    /**
     * Returns the raw JSON value of [actTimeoutMs].
     *
     * Unlike [actTimeoutMs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _actTimeoutMs(): JsonField<Double> = body._actTimeoutMs()

    /**
     * Returns the raw JSON value of [browser].
     *
     * Unlike [browser], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _browser(): JsonField<Browser> = body._browser()

    /**
     * Returns the raw JSON value of [browserbaseSessionCreateParams].
     *
     * Unlike [browserbaseSessionCreateParams], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _browserbaseSessionCreateParams(): JsonField<BrowserbaseSessionCreateParams> =
        body._browserbaseSessionCreateParams()

    /**
     * Returns the raw JSON value of [browserbaseSessionId].
     *
     * Unlike [browserbaseSessionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _browserbaseSessionId(): JsonField<String> = body._browserbaseSessionId()

    /**
     * Returns the raw JSON value of [debugDom].
     *
     * Unlike [debugDom], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debugDom(): JsonField<Boolean> = body._debugDom()

    /**
     * Returns the raw JSON value of [domSettleTimeoutMs].
     *
     * Unlike [domSettleTimeoutMs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _domSettleTimeoutMs(): JsonField<Double> = body._domSettleTimeoutMs()

    /**
     * Returns the raw JSON value of [experimental].
     *
     * Unlike [experimental], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _experimental(): JsonField<Boolean> = body._experimental()

    /**
     * Returns the raw JSON value of [selfHeal].
     *
     * Unlike [selfHeal], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _selfHeal(): JsonField<Boolean> = body._selfHeal()

    /**
     * Returns the raw JSON value of [systemPrompt].
     *
     * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _systemPrompt(): JsonField<String> = body._systemPrompt()

    /**
     * Returns the raw JSON value of [verbose].
     *
     * Unlike [verbose], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _verbose(): JsonField<Long> = body._verbose()

    /**
     * Returns the raw JSON value of [waitForCaptchaSolves].
     *
     * Unlike [waitForCaptchaSolves], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _waitForCaptchaSolves(): JsonField<Boolean> = body._waitForCaptchaSolves()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionStartParams].
         *
         * The following fields are required:
         * ```java
         * .modelName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionStartParams]. */
    class Builder internal constructor() {

        private var xLanguage: XLanguage? = null
        private var xSdkVersion: String? = null
        private var xSentAt: OffsetDateTime? = null
        private var xStreamResponse: XStreamResponse? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionStartParams: SessionStartParams) = apply {
            xLanguage = sessionStartParams.xLanguage
            xSdkVersion = sessionStartParams.xSdkVersion
            xSentAt = sessionStartParams.xSentAt
            xStreamResponse = sessionStartParams.xStreamResponse
            body = sessionStartParams.body.toBuilder()
            additionalHeaders = sessionStartParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionStartParams.additionalQueryParams.toBuilder()
        }

        /** Client SDK language */
        fun xLanguage(xLanguage: XLanguage?) = apply { this.xLanguage = xLanguage }

        /** Alias for calling [Builder.xLanguage] with `xLanguage.orElse(null)`. */
        fun xLanguage(xLanguage: Optional<XLanguage>) = xLanguage(xLanguage.getOrNull())

        /** Version of the Stagehand SDK */
        fun xSdkVersion(xSdkVersion: String?) = apply { this.xSdkVersion = xSdkVersion }

        /** Alias for calling [Builder.xSdkVersion] with `xSdkVersion.orElse(null)`. */
        fun xSdkVersion(xSdkVersion: Optional<String>) = xSdkVersion(xSdkVersion.getOrNull())

        /** ISO timestamp when request was sent */
        fun xSentAt(xSentAt: OffsetDateTime?) = apply { this.xSentAt = xSentAt }

        /** Alias for calling [Builder.xSentAt] with `xSentAt.orElse(null)`. */
        fun xSentAt(xSentAt: Optional<OffsetDateTime>) = xSentAt(xSentAt.getOrNull())

        /** Whether to stream the response via SSE */
        fun xStreamResponse(xStreamResponse: XStreamResponse?) = apply {
            this.xStreamResponse = xStreamResponse
        }

        /** Alias for calling [Builder.xStreamResponse] with `xStreamResponse.orElse(null)`. */
        fun xStreamResponse(xStreamResponse: Optional<XStreamResponse>) =
            xStreamResponse(xStreamResponse.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [modelName]
         * - [actTimeoutMs]
         * - [browser]
         * - [browserbaseSessionCreateParams]
         * - [browserbaseSessionId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Model name to use for AI operations */
        fun modelName(modelName: String) = apply { body.modelName(modelName) }

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { body.modelName(modelName) }

        /** Timeout in ms for act operations */
        fun actTimeoutMs(actTimeoutMs: Double) = apply { body.actTimeoutMs(actTimeoutMs) }

        /**
         * Sets [Builder.actTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actTimeoutMs] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actTimeoutMs(actTimeoutMs: JsonField<Double>) = apply {
            body.actTimeoutMs(actTimeoutMs)
        }

        fun browser(browser: Browser) = apply { body.browser(browser) }

        /**
         * Sets [Builder.browser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browser] with a well-typed [Browser] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun browser(browser: JsonField<Browser>) = apply { body.browser(browser) }

        fun browserbaseSessionCreateParams(
            browserbaseSessionCreateParams: BrowserbaseSessionCreateParams
        ) = apply { body.browserbaseSessionCreateParams(browserbaseSessionCreateParams) }

        /**
         * Sets [Builder.browserbaseSessionCreateParams] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browserbaseSessionCreateParams] with a well-typed
         * [BrowserbaseSessionCreateParams] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun browserbaseSessionCreateParams(
            browserbaseSessionCreateParams: JsonField<BrowserbaseSessionCreateParams>
        ) = apply { body.browserbaseSessionCreateParams(browserbaseSessionCreateParams) }

        /** Existing Browserbase session ID to resume */
        fun browserbaseSessionId(browserbaseSessionId: String) = apply {
            body.browserbaseSessionId(browserbaseSessionId)
        }

        /**
         * Sets [Builder.browserbaseSessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browserbaseSessionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun browserbaseSessionId(browserbaseSessionId: JsonField<String>) = apply {
            body.browserbaseSessionId(browserbaseSessionId)
        }

        fun debugDom(debugDom: Boolean) = apply { body.debugDom(debugDom) }

        /**
         * Sets [Builder.debugDom] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debugDom] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debugDom(debugDom: JsonField<Boolean>) = apply { body.debugDom(debugDom) }

        /** Timeout in ms to wait for DOM to settle */
        fun domSettleTimeoutMs(domSettleTimeoutMs: Double) = apply {
            body.domSettleTimeoutMs(domSettleTimeoutMs)
        }

        /**
         * Sets [Builder.domSettleTimeoutMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domSettleTimeoutMs] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun domSettleTimeoutMs(domSettleTimeoutMs: JsonField<Double>) = apply {
            body.domSettleTimeoutMs(domSettleTimeoutMs)
        }

        fun experimental(experimental: Boolean) = apply { body.experimental(experimental) }

        /**
         * Sets [Builder.experimental] to an arbitrary JSON value.
         *
         * You should usually call [Builder.experimental] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun experimental(experimental: JsonField<Boolean>) = apply {
            body.experimental(experimental)
        }

        /** Enable self-healing for failed actions */
        fun selfHeal(selfHeal: Boolean) = apply { body.selfHeal(selfHeal) }

        /**
         * Sets [Builder.selfHeal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selfHeal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun selfHeal(selfHeal: JsonField<Boolean>) = apply { body.selfHeal(selfHeal) }

        /** Custom system prompt for AI operations */
        fun systemPrompt(systemPrompt: String) = apply { body.systemPrompt(systemPrompt) }

        /**
         * Sets [Builder.systemPrompt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.systemPrompt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun systemPrompt(systemPrompt: JsonField<String>) = apply {
            body.systemPrompt(systemPrompt)
        }

        /** Logging verbosity level (0=quiet, 1=normal, 2=debug) */
        fun verbose(verbose: Long) = apply { body.verbose(verbose) }

        /**
         * Sets [Builder.verbose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verbose] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verbose(verbose: JsonField<Long>) = apply { body.verbose(verbose) }

        fun waitForCaptchaSolves(waitForCaptchaSolves: Boolean) = apply {
            body.waitForCaptchaSolves(waitForCaptchaSolves)
        }

        /**
         * Sets [Builder.waitForCaptchaSolves] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waitForCaptchaSolves] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waitForCaptchaSolves(waitForCaptchaSolves: JsonField<Boolean>) = apply {
            body.waitForCaptchaSolves(waitForCaptchaSolves)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SessionStartParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .modelName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionStartParams =
            SessionStartParams(
                xLanguage,
                xSdkVersion,
                xSentAt,
                xStreamResponse,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                xLanguage?.let { put("x-language", it.toString()) }
                xSdkVersion?.let { put("x-sdk-version", it) }
                xSentAt?.let { put("x-sent-at", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                xStreamResponse?.let { put("x-stream-response", it.toString()) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val actTimeoutMs: JsonField<Double>,
        private val browser: JsonField<Browser>,
        private val browserbaseSessionCreateParams: JsonField<BrowserbaseSessionCreateParams>,
        private val browserbaseSessionId: JsonField<String>,
        private val debugDom: JsonField<Boolean>,
        private val domSettleTimeoutMs: JsonField<Double>,
        private val experimental: JsonField<Boolean>,
        private val selfHeal: JsonField<Boolean>,
        private val systemPrompt: JsonField<String>,
        private val verbose: JsonField<Long>,
        private val waitForCaptchaSolves: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actTimeoutMs")
            @ExcludeMissing
            actTimeoutMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("browser") @ExcludeMissing browser: JsonField<Browser> = JsonMissing.of(),
            @JsonProperty("browserbaseSessionCreateParams")
            @ExcludeMissing
            browserbaseSessionCreateParams: JsonField<BrowserbaseSessionCreateParams> =
                JsonMissing.of(),
            @JsonProperty("browserbaseSessionID")
            @ExcludeMissing
            browserbaseSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debugDom")
            @ExcludeMissing
            debugDom: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("domSettleTimeoutMs")
            @ExcludeMissing
            domSettleTimeoutMs: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("experimental")
            @ExcludeMissing
            experimental: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("selfHeal")
            @ExcludeMissing
            selfHeal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verbose") @ExcludeMissing verbose: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("waitForCaptchaSolves")
            @ExcludeMissing
            waitForCaptchaSolves: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            modelName,
            actTimeoutMs,
            browser,
            browserbaseSessionCreateParams,
            browserbaseSessionId,
            debugDom,
            domSettleTimeoutMs,
            experimental,
            selfHeal,
            systemPrompt,
            verbose,
            waitForCaptchaSolves,
            mutableMapOf(),
        )

        /**
         * Model name to use for AI operations
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("modelName")

        /**
         * Timeout in ms for act operations
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun actTimeoutMs(): Optional<Double> = actTimeoutMs.getOptional("actTimeoutMs")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun browser(): Optional<Browser> = browser.getOptional("browser")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun browserbaseSessionCreateParams(): Optional<BrowserbaseSessionCreateParams> =
            browserbaseSessionCreateParams.getOptional("browserbaseSessionCreateParams")

        /**
         * Existing Browserbase session ID to resume
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun browserbaseSessionId(): Optional<String> =
            browserbaseSessionId.getOptional("browserbaseSessionID")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debugDom(): Optional<Boolean> = debugDom.getOptional("debugDom")

        /**
         * Timeout in ms to wait for DOM to settle
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domSettleTimeoutMs(): Optional<Double> =
            domSettleTimeoutMs.getOptional("domSettleTimeoutMs")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun experimental(): Optional<Boolean> = experimental.getOptional("experimental")

        /**
         * Enable self-healing for failed actions
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selfHeal(): Optional<Boolean> = selfHeal.getOptional("selfHeal")

        /**
         * Custom system prompt for AI operations
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("systemPrompt")

        /**
         * Logging verbosity level (0=quiet, 1=normal, 2=debug)
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun verbose(): Optional<Long> = verbose.getOptional("verbose")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun waitForCaptchaSolves(): Optional<Boolean> =
            waitForCaptchaSolves.getOptional("waitForCaptchaSolves")

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [actTimeoutMs].
         *
         * Unlike [actTimeoutMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actTimeoutMs")
        @ExcludeMissing
        fun _actTimeoutMs(): JsonField<Double> = actTimeoutMs

        /**
         * Returns the raw JSON value of [browser].
         *
         * Unlike [browser], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("browser") @ExcludeMissing fun _browser(): JsonField<Browser> = browser

        /**
         * Returns the raw JSON value of [browserbaseSessionCreateParams].
         *
         * Unlike [browserbaseSessionCreateParams], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("browserbaseSessionCreateParams")
        @ExcludeMissing
        fun _browserbaseSessionCreateParams(): JsonField<BrowserbaseSessionCreateParams> =
            browserbaseSessionCreateParams

        /**
         * Returns the raw JSON value of [browserbaseSessionId].
         *
         * Unlike [browserbaseSessionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("browserbaseSessionID")
        @ExcludeMissing
        fun _browserbaseSessionId(): JsonField<String> = browserbaseSessionId

        /**
         * Returns the raw JSON value of [debugDom].
         *
         * Unlike [debugDom], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debugDom") @ExcludeMissing fun _debugDom(): JsonField<Boolean> = debugDom

        /**
         * Returns the raw JSON value of [domSettleTimeoutMs].
         *
         * Unlike [domSettleTimeoutMs], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("domSettleTimeoutMs")
        @ExcludeMissing
        fun _domSettleTimeoutMs(): JsonField<Double> = domSettleTimeoutMs

        /**
         * Returns the raw JSON value of [experimental].
         *
         * Unlike [experimental], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("experimental")
        @ExcludeMissing
        fun _experimental(): JsonField<Boolean> = experimental

        /**
         * Returns the raw JSON value of [selfHeal].
         *
         * Unlike [selfHeal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("selfHeal") @ExcludeMissing fun _selfHeal(): JsonField<Boolean> = selfHeal

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("systemPrompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

        /**
         * Returns the raw JSON value of [verbose].
         *
         * Unlike [verbose], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verbose") @ExcludeMissing fun _verbose(): JsonField<Long> = verbose

        /**
         * Returns the raw JSON value of [waitForCaptchaSolves].
         *
         * Unlike [waitForCaptchaSolves], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("waitForCaptchaSolves")
        @ExcludeMissing
        fun _waitForCaptchaSolves(): JsonField<Boolean> = waitForCaptchaSolves

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var actTimeoutMs: JsonField<Double> = JsonMissing.of()
            private var browser: JsonField<Browser> = JsonMissing.of()
            private var browserbaseSessionCreateParams: JsonField<BrowserbaseSessionCreateParams> =
                JsonMissing.of()
            private var browserbaseSessionId: JsonField<String> = JsonMissing.of()
            private var debugDom: JsonField<Boolean> = JsonMissing.of()
            private var domSettleTimeoutMs: JsonField<Double> = JsonMissing.of()
            private var experimental: JsonField<Boolean> = JsonMissing.of()
            private var selfHeal: JsonField<Boolean> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var verbose: JsonField<Long> = JsonMissing.of()
            private var waitForCaptchaSolves: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                modelName = body.modelName
                actTimeoutMs = body.actTimeoutMs
                browser = body.browser
                browserbaseSessionCreateParams = body.browserbaseSessionCreateParams
                browserbaseSessionId = body.browserbaseSessionId
                debugDom = body.debugDom
                domSettleTimeoutMs = body.domSettleTimeoutMs
                experimental = body.experimental
                selfHeal = body.selfHeal
                systemPrompt = body.systemPrompt
                verbose = body.verbose
                waitForCaptchaSolves = body.waitForCaptchaSolves
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Model name to use for AI operations */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** Timeout in ms for act operations */
            fun actTimeoutMs(actTimeoutMs: Double) = actTimeoutMs(JsonField.of(actTimeoutMs))

            /**
             * Sets [Builder.actTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actTimeoutMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actTimeoutMs(actTimeoutMs: JsonField<Double>) = apply {
                this.actTimeoutMs = actTimeoutMs
            }

            fun browser(browser: Browser) = browser(JsonField.of(browser))

            /**
             * Sets [Builder.browser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browser] with a well-typed [Browser] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun browser(browser: JsonField<Browser>) = apply { this.browser = browser }

            fun browserbaseSessionCreateParams(
                browserbaseSessionCreateParams: BrowserbaseSessionCreateParams
            ) = browserbaseSessionCreateParams(JsonField.of(browserbaseSessionCreateParams))

            /**
             * Sets [Builder.browserbaseSessionCreateParams] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browserbaseSessionCreateParams] with a well-typed
             * [BrowserbaseSessionCreateParams] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun browserbaseSessionCreateParams(
                browserbaseSessionCreateParams: JsonField<BrowserbaseSessionCreateParams>
            ) = apply { this.browserbaseSessionCreateParams = browserbaseSessionCreateParams }

            /** Existing Browserbase session ID to resume */
            fun browserbaseSessionId(browserbaseSessionId: String) =
                browserbaseSessionId(JsonField.of(browserbaseSessionId))

            /**
             * Sets [Builder.browserbaseSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browserbaseSessionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun browserbaseSessionId(browserbaseSessionId: JsonField<String>) = apply {
                this.browserbaseSessionId = browserbaseSessionId
            }

            fun debugDom(debugDom: Boolean) = debugDom(JsonField.of(debugDom))

            /**
             * Sets [Builder.debugDom] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debugDom] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debugDom(debugDom: JsonField<Boolean>) = apply { this.debugDom = debugDom }

            /** Timeout in ms to wait for DOM to settle */
            fun domSettleTimeoutMs(domSettleTimeoutMs: Double) =
                domSettleTimeoutMs(JsonField.of(domSettleTimeoutMs))

            /**
             * Sets [Builder.domSettleTimeoutMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domSettleTimeoutMs] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domSettleTimeoutMs(domSettleTimeoutMs: JsonField<Double>) = apply {
                this.domSettleTimeoutMs = domSettleTimeoutMs
            }

            fun experimental(experimental: Boolean) = experimental(JsonField.of(experimental))

            /**
             * Sets [Builder.experimental] to an arbitrary JSON value.
             *
             * You should usually call [Builder.experimental] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun experimental(experimental: JsonField<Boolean>) = apply {
                this.experimental = experimental
            }

            /** Enable self-healing for failed actions */
            fun selfHeal(selfHeal: Boolean) = selfHeal(JsonField.of(selfHeal))

            /**
             * Sets [Builder.selfHeal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.selfHeal] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun selfHeal(selfHeal: JsonField<Boolean>) = apply { this.selfHeal = selfHeal }

            /** Custom system prompt for AI operations */
            fun systemPrompt(systemPrompt: String) = systemPrompt(JsonField.of(systemPrompt))

            /**
             * Sets [Builder.systemPrompt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.systemPrompt] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun systemPrompt(systemPrompt: JsonField<String>) = apply {
                this.systemPrompt = systemPrompt
            }

            /** Logging verbosity level (0=quiet, 1=normal, 2=debug) */
            fun verbose(verbose: Long) = verbose(JsonField.of(verbose))

            /**
             * Sets [Builder.verbose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verbose] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verbose(verbose: JsonField<Long>) = apply { this.verbose = verbose }

            fun waitForCaptchaSolves(waitForCaptchaSolves: Boolean) =
                waitForCaptchaSolves(JsonField.of(waitForCaptchaSolves))

            /**
             * Sets [Builder.waitForCaptchaSolves] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitForCaptchaSolves] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun waitForCaptchaSolves(waitForCaptchaSolves: JsonField<Boolean>) = apply {
                this.waitForCaptchaSolves = waitForCaptchaSolves
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("modelName", modelName),
                    actTimeoutMs,
                    browser,
                    browserbaseSessionCreateParams,
                    browserbaseSessionId,
                    debugDom,
                    domSettleTimeoutMs,
                    experimental,
                    selfHeal,
                    systemPrompt,
                    verbose,
                    waitForCaptchaSolves,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            modelName()
            actTimeoutMs()
            browser().ifPresent { it.validate() }
            browserbaseSessionCreateParams().ifPresent { it.validate() }
            browserbaseSessionId()
            debugDom()
            domSettleTimeoutMs()
            experimental()
            selfHeal()
            systemPrompt()
            verbose()
            waitForCaptchaSolves()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (modelName.asKnown().isPresent) 1 else 0) +
                (if (actTimeoutMs.asKnown().isPresent) 1 else 0) +
                (browser.asKnown().getOrNull()?.validity() ?: 0) +
                (browserbaseSessionCreateParams.asKnown().getOrNull()?.validity() ?: 0) +
                (if (browserbaseSessionId.asKnown().isPresent) 1 else 0) +
                (if (debugDom.asKnown().isPresent) 1 else 0) +
                (if (domSettleTimeoutMs.asKnown().isPresent) 1 else 0) +
                (if (experimental.asKnown().isPresent) 1 else 0) +
                (if (selfHeal.asKnown().isPresent) 1 else 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (verbose.asKnown().isPresent) 1 else 0) +
                (if (waitForCaptchaSolves.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                modelName == other.modelName &&
                actTimeoutMs == other.actTimeoutMs &&
                browser == other.browser &&
                browserbaseSessionCreateParams == other.browserbaseSessionCreateParams &&
                browserbaseSessionId == other.browserbaseSessionId &&
                debugDom == other.debugDom &&
                domSettleTimeoutMs == other.domSettleTimeoutMs &&
                experimental == other.experimental &&
                selfHeal == other.selfHeal &&
                systemPrompt == other.systemPrompt &&
                verbose == other.verbose &&
                waitForCaptchaSolves == other.waitForCaptchaSolves &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                modelName,
                actTimeoutMs,
                browser,
                browserbaseSessionCreateParams,
                browserbaseSessionId,
                debugDom,
                domSettleTimeoutMs,
                experimental,
                selfHeal,
                systemPrompt,
                verbose,
                waitForCaptchaSolves,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{modelName=$modelName, actTimeoutMs=$actTimeoutMs, browser=$browser, browserbaseSessionCreateParams=$browserbaseSessionCreateParams, browserbaseSessionId=$browserbaseSessionId, debugDom=$debugDom, domSettleTimeoutMs=$domSettleTimeoutMs, experimental=$experimental, selfHeal=$selfHeal, systemPrompt=$systemPrompt, verbose=$verbose, waitForCaptchaSolves=$waitForCaptchaSolves, additionalProperties=$additionalProperties}"
    }

    class Browser
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cdpUrl: JsonField<String>,
        private val launchOptions: JsonField<LaunchOptions>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cdpUrl") @ExcludeMissing cdpUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("launchOptions")
            @ExcludeMissing
            launchOptions: JsonField<LaunchOptions> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(cdpUrl, launchOptions, type, mutableMapOf())

        /**
         * Chrome DevTools Protocol URL for connecting to existing browser
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cdpUrl(): Optional<String> = cdpUrl.getOptional("cdpUrl")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun launchOptions(): Optional<LaunchOptions> = launchOptions.getOptional("launchOptions")

        /**
         * Browser type to use
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [cdpUrl].
         *
         * Unlike [cdpUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cdpUrl") @ExcludeMissing fun _cdpUrl(): JsonField<String> = cdpUrl

        /**
         * Returns the raw JSON value of [launchOptions].
         *
         * Unlike [launchOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("launchOptions")
        @ExcludeMissing
        fun _launchOptions(): JsonField<LaunchOptions> = launchOptions

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Browser]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Browser]. */
        class Builder internal constructor() {

            private var cdpUrl: JsonField<String> = JsonMissing.of()
            private var launchOptions: JsonField<LaunchOptions> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(browser: Browser) = apply {
                cdpUrl = browser.cdpUrl
                launchOptions = browser.launchOptions
                type = browser.type
                additionalProperties = browser.additionalProperties.toMutableMap()
            }

            /** Chrome DevTools Protocol URL for connecting to existing browser */
            fun cdpUrl(cdpUrl: String) = cdpUrl(JsonField.of(cdpUrl))

            /**
             * Sets [Builder.cdpUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cdpUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cdpUrl(cdpUrl: JsonField<String>) = apply { this.cdpUrl = cdpUrl }

            fun launchOptions(launchOptions: LaunchOptions) =
                launchOptions(JsonField.of(launchOptions))

            /**
             * Sets [Builder.launchOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.launchOptions] with a well-typed [LaunchOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun launchOptions(launchOptions: JsonField<LaunchOptions>) = apply {
                this.launchOptions = launchOptions
            }

            /** Browser type to use */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Browser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Browser =
                Browser(cdpUrl, launchOptions, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Browser = apply {
            if (validated) {
                return@apply
            }

            cdpUrl()
            launchOptions().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (cdpUrl.asKnown().isPresent) 1 else 0) +
                (launchOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class LaunchOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val acceptDownloads: JsonField<Boolean>,
            private val args: JsonField<List<String>>,
            private val cdpUrl: JsonField<String>,
            private val chromiumSandbox: JsonField<Boolean>,
            private val connectTimeoutMs: JsonField<Double>,
            private val deviceScaleFactor: JsonField<Double>,
            private val devtools: JsonField<Boolean>,
            private val downloadsPath: JsonField<String>,
            private val executablePath: JsonField<String>,
            private val hasTouch: JsonField<Boolean>,
            private val headless: JsonField<Boolean>,
            private val ignoreDefaultArgs: JsonField<IgnoreDefaultArgs>,
            private val ignoreHttpsErrors: JsonField<Boolean>,
            private val locale: JsonField<String>,
            private val preserveUserDataDir: JsonField<Boolean>,
            private val proxy: JsonField<Proxy>,
            private val userDataDir: JsonField<String>,
            private val viewport: JsonField<Viewport>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("acceptDownloads")
                @ExcludeMissing
                acceptDownloads: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("args")
                @ExcludeMissing
                args: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("cdpUrl")
                @ExcludeMissing
                cdpUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("chromiumSandbox")
                @ExcludeMissing
                chromiumSandbox: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("connectTimeoutMs")
                @ExcludeMissing
                connectTimeoutMs: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("deviceScaleFactor")
                @ExcludeMissing
                deviceScaleFactor: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("devtools")
                @ExcludeMissing
                devtools: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("downloadsPath")
                @ExcludeMissing
                downloadsPath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("executablePath")
                @ExcludeMissing
                executablePath: JsonField<String> = JsonMissing.of(),
                @JsonProperty("hasTouch")
                @ExcludeMissing
                hasTouch: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("headless")
                @ExcludeMissing
                headless: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ignoreDefaultArgs")
                @ExcludeMissing
                ignoreDefaultArgs: JsonField<IgnoreDefaultArgs> = JsonMissing.of(),
                @JsonProperty("ignoreHTTPSErrors")
                @ExcludeMissing
                ignoreHttpsErrors: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("locale")
                @ExcludeMissing
                locale: JsonField<String> = JsonMissing.of(),
                @JsonProperty("preserveUserDataDir")
                @ExcludeMissing
                preserveUserDataDir: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("proxy") @ExcludeMissing proxy: JsonField<Proxy> = JsonMissing.of(),
                @JsonProperty("userDataDir")
                @ExcludeMissing
                userDataDir: JsonField<String> = JsonMissing.of(),
                @JsonProperty("viewport")
                @ExcludeMissing
                viewport: JsonField<Viewport> = JsonMissing.of(),
            ) : this(
                acceptDownloads,
                args,
                cdpUrl,
                chromiumSandbox,
                connectTimeoutMs,
                deviceScaleFactor,
                devtools,
                downloadsPath,
                executablePath,
                hasTouch,
                headless,
                ignoreDefaultArgs,
                ignoreHttpsErrors,
                locale,
                preserveUserDataDir,
                proxy,
                userDataDir,
                viewport,
                mutableMapOf(),
            )

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun acceptDownloads(): Optional<Boolean> =
                acceptDownloads.getOptional("acceptDownloads")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun args(): Optional<List<String>> = args.getOptional("args")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun cdpUrl(): Optional<String> = cdpUrl.getOptional("cdpUrl")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chromiumSandbox(): Optional<Boolean> =
                chromiumSandbox.getOptional("chromiumSandbox")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun connectTimeoutMs(): Optional<Double> =
                connectTimeoutMs.getOptional("connectTimeoutMs")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun deviceScaleFactor(): Optional<Double> =
                deviceScaleFactor.getOptional("deviceScaleFactor")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun devtools(): Optional<Boolean> = devtools.getOptional("devtools")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun downloadsPath(): Optional<String> = downloadsPath.getOptional("downloadsPath")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun executablePath(): Optional<String> = executablePath.getOptional("executablePath")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun hasTouch(): Optional<Boolean> = hasTouch.getOptional("hasTouch")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun headless(): Optional<Boolean> = headless.getOptional("headless")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ignoreDefaultArgs(): Optional<IgnoreDefaultArgs> =
                ignoreDefaultArgs.getOptional("ignoreDefaultArgs")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun ignoreHttpsErrors(): Optional<Boolean> =
                ignoreHttpsErrors.getOptional("ignoreHTTPSErrors")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun locale(): Optional<String> = locale.getOptional("locale")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun preserveUserDataDir(): Optional<Boolean> =
                preserveUserDataDir.getOptional("preserveUserDataDir")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun proxy(): Optional<Proxy> = proxy.getOptional("proxy")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun userDataDir(): Optional<String> = userDataDir.getOptional("userDataDir")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun viewport(): Optional<Viewport> = viewport.getOptional("viewport")

            /**
             * Returns the raw JSON value of [acceptDownloads].
             *
             * Unlike [acceptDownloads], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("acceptDownloads")
            @ExcludeMissing
            fun _acceptDownloads(): JsonField<Boolean> = acceptDownloads

            /**
             * Returns the raw JSON value of [args].
             *
             * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<String>> = args

            /**
             * Returns the raw JSON value of [cdpUrl].
             *
             * Unlike [cdpUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cdpUrl") @ExcludeMissing fun _cdpUrl(): JsonField<String> = cdpUrl

            /**
             * Returns the raw JSON value of [chromiumSandbox].
             *
             * Unlike [chromiumSandbox], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("chromiumSandbox")
            @ExcludeMissing
            fun _chromiumSandbox(): JsonField<Boolean> = chromiumSandbox

            /**
             * Returns the raw JSON value of [connectTimeoutMs].
             *
             * Unlike [connectTimeoutMs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("connectTimeoutMs")
            @ExcludeMissing
            fun _connectTimeoutMs(): JsonField<Double> = connectTimeoutMs

            /**
             * Returns the raw JSON value of [deviceScaleFactor].
             *
             * Unlike [deviceScaleFactor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("deviceScaleFactor")
            @ExcludeMissing
            fun _deviceScaleFactor(): JsonField<Double> = deviceScaleFactor

            /**
             * Returns the raw JSON value of [devtools].
             *
             * Unlike [devtools], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("devtools") @ExcludeMissing fun _devtools(): JsonField<Boolean> = devtools

            /**
             * Returns the raw JSON value of [downloadsPath].
             *
             * Unlike [downloadsPath], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("downloadsPath")
            @ExcludeMissing
            fun _downloadsPath(): JsonField<String> = downloadsPath

            /**
             * Returns the raw JSON value of [executablePath].
             *
             * Unlike [executablePath], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("executablePath")
            @ExcludeMissing
            fun _executablePath(): JsonField<String> = executablePath

            /**
             * Returns the raw JSON value of [hasTouch].
             *
             * Unlike [hasTouch], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("hasTouch") @ExcludeMissing fun _hasTouch(): JsonField<Boolean> = hasTouch

            /**
             * Returns the raw JSON value of [headless].
             *
             * Unlike [headless], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("headless") @ExcludeMissing fun _headless(): JsonField<Boolean> = headless

            /**
             * Returns the raw JSON value of [ignoreDefaultArgs].
             *
             * Unlike [ignoreDefaultArgs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ignoreDefaultArgs")
            @ExcludeMissing
            fun _ignoreDefaultArgs(): JsonField<IgnoreDefaultArgs> = ignoreDefaultArgs

            /**
             * Returns the raw JSON value of [ignoreHttpsErrors].
             *
             * Unlike [ignoreHttpsErrors], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ignoreHTTPSErrors")
            @ExcludeMissing
            fun _ignoreHttpsErrors(): JsonField<Boolean> = ignoreHttpsErrors

            /**
             * Returns the raw JSON value of [locale].
             *
             * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

            /**
             * Returns the raw JSON value of [preserveUserDataDir].
             *
             * Unlike [preserveUserDataDir], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("preserveUserDataDir")
            @ExcludeMissing
            fun _preserveUserDataDir(): JsonField<Boolean> = preserveUserDataDir

            /**
             * Returns the raw JSON value of [proxy].
             *
             * Unlike [proxy], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("proxy") @ExcludeMissing fun _proxy(): JsonField<Proxy> = proxy

            /**
             * Returns the raw JSON value of [userDataDir].
             *
             * Unlike [userDataDir], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("userDataDir")
            @ExcludeMissing
            fun _userDataDir(): JsonField<String> = userDataDir

            /**
             * Returns the raw JSON value of [viewport].
             *
             * Unlike [viewport], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("viewport")
            @ExcludeMissing
            fun _viewport(): JsonField<Viewport> = viewport

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [LaunchOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [LaunchOptions]. */
            class Builder internal constructor() {

                private var acceptDownloads: JsonField<Boolean> = JsonMissing.of()
                private var args: JsonField<MutableList<String>>? = null
                private var cdpUrl: JsonField<String> = JsonMissing.of()
                private var chromiumSandbox: JsonField<Boolean> = JsonMissing.of()
                private var connectTimeoutMs: JsonField<Double> = JsonMissing.of()
                private var deviceScaleFactor: JsonField<Double> = JsonMissing.of()
                private var devtools: JsonField<Boolean> = JsonMissing.of()
                private var downloadsPath: JsonField<String> = JsonMissing.of()
                private var executablePath: JsonField<String> = JsonMissing.of()
                private var hasTouch: JsonField<Boolean> = JsonMissing.of()
                private var headless: JsonField<Boolean> = JsonMissing.of()
                private var ignoreDefaultArgs: JsonField<IgnoreDefaultArgs> = JsonMissing.of()
                private var ignoreHttpsErrors: JsonField<Boolean> = JsonMissing.of()
                private var locale: JsonField<String> = JsonMissing.of()
                private var preserveUserDataDir: JsonField<Boolean> = JsonMissing.of()
                private var proxy: JsonField<Proxy> = JsonMissing.of()
                private var userDataDir: JsonField<String> = JsonMissing.of()
                private var viewport: JsonField<Viewport> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(launchOptions: LaunchOptions) = apply {
                    acceptDownloads = launchOptions.acceptDownloads
                    args = launchOptions.args.map { it.toMutableList() }
                    cdpUrl = launchOptions.cdpUrl
                    chromiumSandbox = launchOptions.chromiumSandbox
                    connectTimeoutMs = launchOptions.connectTimeoutMs
                    deviceScaleFactor = launchOptions.deviceScaleFactor
                    devtools = launchOptions.devtools
                    downloadsPath = launchOptions.downloadsPath
                    executablePath = launchOptions.executablePath
                    hasTouch = launchOptions.hasTouch
                    headless = launchOptions.headless
                    ignoreDefaultArgs = launchOptions.ignoreDefaultArgs
                    ignoreHttpsErrors = launchOptions.ignoreHttpsErrors
                    locale = launchOptions.locale
                    preserveUserDataDir = launchOptions.preserveUserDataDir
                    proxy = launchOptions.proxy
                    userDataDir = launchOptions.userDataDir
                    viewport = launchOptions.viewport
                    additionalProperties = launchOptions.additionalProperties.toMutableMap()
                }

                fun acceptDownloads(acceptDownloads: Boolean) =
                    acceptDownloads(JsonField.of(acceptDownloads))

                /**
                 * Sets [Builder.acceptDownloads] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acceptDownloads] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun acceptDownloads(acceptDownloads: JsonField<Boolean>) = apply {
                    this.acceptDownloads = acceptDownloads
                }

                fun args(args: List<String>) = args(JsonField.of(args))

                /**
                 * Sets [Builder.args] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.args] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun args(args: JsonField<List<String>>) = apply {
                    this.args = args.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [args].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addArg(arg: String) = apply {
                    args =
                        (args ?: JsonField.of(mutableListOf())).also {
                            checkKnown("args", it).add(arg)
                        }
                }

                fun cdpUrl(cdpUrl: String) = cdpUrl(JsonField.of(cdpUrl))

                /**
                 * Sets [Builder.cdpUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cdpUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cdpUrl(cdpUrl: JsonField<String>) = apply { this.cdpUrl = cdpUrl }

                fun chromiumSandbox(chromiumSandbox: Boolean) =
                    chromiumSandbox(JsonField.of(chromiumSandbox))

                /**
                 * Sets [Builder.chromiumSandbox] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chromiumSandbox] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun chromiumSandbox(chromiumSandbox: JsonField<Boolean>) = apply {
                    this.chromiumSandbox = chromiumSandbox
                }

                fun connectTimeoutMs(connectTimeoutMs: Double) =
                    connectTimeoutMs(JsonField.of(connectTimeoutMs))

                /**
                 * Sets [Builder.connectTimeoutMs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.connectTimeoutMs] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun connectTimeoutMs(connectTimeoutMs: JsonField<Double>) = apply {
                    this.connectTimeoutMs = connectTimeoutMs
                }

                fun deviceScaleFactor(deviceScaleFactor: Double) =
                    deviceScaleFactor(JsonField.of(deviceScaleFactor))

                /**
                 * Sets [Builder.deviceScaleFactor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deviceScaleFactor] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deviceScaleFactor(deviceScaleFactor: JsonField<Double>) = apply {
                    this.deviceScaleFactor = deviceScaleFactor
                }

                fun devtools(devtools: Boolean) = devtools(JsonField.of(devtools))

                /**
                 * Sets [Builder.devtools] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.devtools] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun devtools(devtools: JsonField<Boolean>) = apply { this.devtools = devtools }

                fun downloadsPath(downloadsPath: String) =
                    downloadsPath(JsonField.of(downloadsPath))

                /**
                 * Sets [Builder.downloadsPath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.downloadsPath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun downloadsPath(downloadsPath: JsonField<String>) = apply {
                    this.downloadsPath = downloadsPath
                }

                fun executablePath(executablePath: String) =
                    executablePath(JsonField.of(executablePath))

                /**
                 * Sets [Builder.executablePath] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.executablePath] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun executablePath(executablePath: JsonField<String>) = apply {
                    this.executablePath = executablePath
                }

                fun hasTouch(hasTouch: Boolean) = hasTouch(JsonField.of(hasTouch))

                /**
                 * Sets [Builder.hasTouch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hasTouch] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hasTouch(hasTouch: JsonField<Boolean>) = apply { this.hasTouch = hasTouch }

                fun headless(headless: Boolean) = headless(JsonField.of(headless))

                /**
                 * Sets [Builder.headless] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headless] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headless(headless: JsonField<Boolean>) = apply { this.headless = headless }

                fun ignoreDefaultArgs(ignoreDefaultArgs: IgnoreDefaultArgs) =
                    ignoreDefaultArgs(JsonField.of(ignoreDefaultArgs))

                /**
                 * Sets [Builder.ignoreDefaultArgs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ignoreDefaultArgs] with a well-typed
                 * [IgnoreDefaultArgs] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun ignoreDefaultArgs(ignoreDefaultArgs: JsonField<IgnoreDefaultArgs>) = apply {
                    this.ignoreDefaultArgs = ignoreDefaultArgs
                }

                /** Alias for calling [ignoreDefaultArgs] with `IgnoreDefaultArgs.ofBool(bool)`. */
                fun ignoreDefaultArgs(bool: Boolean) =
                    ignoreDefaultArgs(IgnoreDefaultArgs.ofBool(bool))

                /**
                 * Alias for calling [ignoreDefaultArgs] with
                 * `IgnoreDefaultArgs.ofStrings(strings)`.
                 */
                fun ignoreDefaultArgsOfStrings(strings: List<String>) =
                    ignoreDefaultArgs(IgnoreDefaultArgs.ofStrings(strings))

                fun ignoreHttpsErrors(ignoreHttpsErrors: Boolean) =
                    ignoreHttpsErrors(JsonField.of(ignoreHttpsErrors))

                /**
                 * Sets [Builder.ignoreHttpsErrors] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ignoreHttpsErrors] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ignoreHttpsErrors(ignoreHttpsErrors: JsonField<Boolean>) = apply {
                    this.ignoreHttpsErrors = ignoreHttpsErrors
                }

                fun locale(locale: String) = locale(JsonField.of(locale))

                /**
                 * Sets [Builder.locale] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.locale] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun locale(locale: JsonField<String>) = apply { this.locale = locale }

                fun preserveUserDataDir(preserveUserDataDir: Boolean) =
                    preserveUserDataDir(JsonField.of(preserveUserDataDir))

                /**
                 * Sets [Builder.preserveUserDataDir] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.preserveUserDataDir] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun preserveUserDataDir(preserveUserDataDir: JsonField<Boolean>) = apply {
                    this.preserveUserDataDir = preserveUserDataDir
                }

                fun proxy(proxy: Proxy) = proxy(JsonField.of(proxy))

                /**
                 * Sets [Builder.proxy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.proxy] with a well-typed [Proxy] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun proxy(proxy: JsonField<Proxy>) = apply { this.proxy = proxy }

                fun userDataDir(userDataDir: String) = userDataDir(JsonField.of(userDataDir))

                /**
                 * Sets [Builder.userDataDir] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.userDataDir] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun userDataDir(userDataDir: JsonField<String>) = apply {
                    this.userDataDir = userDataDir
                }

                fun viewport(viewport: Viewport) = viewport(JsonField.of(viewport))

                /**
                 * Sets [Builder.viewport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewport] with a well-typed [Viewport] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun viewport(viewport: JsonField<Viewport>) = apply { this.viewport = viewport }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [LaunchOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): LaunchOptions =
                    LaunchOptions(
                        acceptDownloads,
                        (args ?: JsonMissing.of()).map { it.toImmutable() },
                        cdpUrl,
                        chromiumSandbox,
                        connectTimeoutMs,
                        deviceScaleFactor,
                        devtools,
                        downloadsPath,
                        executablePath,
                        hasTouch,
                        headless,
                        ignoreDefaultArgs,
                        ignoreHttpsErrors,
                        locale,
                        preserveUserDataDir,
                        proxy,
                        userDataDir,
                        viewport,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): LaunchOptions = apply {
                if (validated) {
                    return@apply
                }

                acceptDownloads()
                args()
                cdpUrl()
                chromiumSandbox()
                connectTimeoutMs()
                deviceScaleFactor()
                devtools()
                downloadsPath()
                executablePath()
                hasTouch()
                headless()
                ignoreDefaultArgs().ifPresent { it.validate() }
                ignoreHttpsErrors()
                locale()
                preserveUserDataDir()
                proxy().ifPresent { it.validate() }
                userDataDir()
                viewport().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (acceptDownloads.asKnown().isPresent) 1 else 0) +
                    (args.asKnown().getOrNull()?.size ?: 0) +
                    (if (cdpUrl.asKnown().isPresent) 1 else 0) +
                    (if (chromiumSandbox.asKnown().isPresent) 1 else 0) +
                    (if (connectTimeoutMs.asKnown().isPresent) 1 else 0) +
                    (if (deviceScaleFactor.asKnown().isPresent) 1 else 0) +
                    (if (devtools.asKnown().isPresent) 1 else 0) +
                    (if (downloadsPath.asKnown().isPresent) 1 else 0) +
                    (if (executablePath.asKnown().isPresent) 1 else 0) +
                    (if (hasTouch.asKnown().isPresent) 1 else 0) +
                    (if (headless.asKnown().isPresent) 1 else 0) +
                    (ignoreDefaultArgs.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (ignoreHttpsErrors.asKnown().isPresent) 1 else 0) +
                    (if (locale.asKnown().isPresent) 1 else 0) +
                    (if (preserveUserDataDir.asKnown().isPresent) 1 else 0) +
                    (proxy.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (userDataDir.asKnown().isPresent) 1 else 0) +
                    (viewport.asKnown().getOrNull()?.validity() ?: 0)

            @JsonDeserialize(using = IgnoreDefaultArgs.Deserializer::class)
            @JsonSerialize(using = IgnoreDefaultArgs.Serializer::class)
            class IgnoreDefaultArgs
            private constructor(
                private val bool: Boolean? = null,
                private val strings: List<String>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

                fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                fun isBool(): Boolean = bool != null

                fun isStrings(): Boolean = strings != null

                fun asBool(): Boolean = bool.getOrThrow("bool")

                fun asStrings(): List<String> = strings.getOrThrow("strings")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        bool != null -> visitor.visitBool(bool)
                        strings != null -> visitor.visitStrings(strings)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): IgnoreDefaultArgs = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitBool(bool: Boolean) {}

                            override fun visitStrings(strings: List<String>) {}
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitBool(bool: Boolean) = 1

                            override fun visitStrings(strings: List<String>) = strings.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is IgnoreDefaultArgs &&
                        bool == other.bool &&
                        strings == other.strings
                }

                override fun hashCode(): Int = Objects.hash(bool, strings)

                override fun toString(): String =
                    when {
                        bool != null -> "IgnoreDefaultArgs{bool=$bool}"
                        strings != null -> "IgnoreDefaultArgs{strings=$strings}"
                        _json != null -> "IgnoreDefaultArgs{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid IgnoreDefaultArgs")
                    }

                companion object {

                    @JvmStatic fun ofBool(bool: Boolean) = IgnoreDefaultArgs(bool = bool)

                    @JvmStatic
                    fun ofStrings(strings: List<String>) =
                        IgnoreDefaultArgs(strings = strings.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [IgnoreDefaultArgs] to a
                 * value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitBool(bool: Boolean): T

                    fun visitStrings(strings: List<String>): T

                    /**
                     * Maps an unknown variant of [IgnoreDefaultArgs] to a value of type [T].
                     *
                     * An instance of [IgnoreDefaultArgs] can contain an unknown variant if it was
                     * deserialized from data that doesn't match any known variant. For example, if
                     * the SDK is on an older version than the API, then the API may respond with
                     * new variants that the SDK is unaware of.
                     *
                     * @throws StagehandInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw StagehandInvalidDataException("Unknown IgnoreDefaultArgs: $json")
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<IgnoreDefaultArgs>(IgnoreDefaultArgs::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): IgnoreDefaultArgs {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                        IgnoreDefaultArgs(bool = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        IgnoreDefaultArgs(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // string).
                            0 -> IgnoreDefaultArgs(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<IgnoreDefaultArgs>(IgnoreDefaultArgs::class) {

                    override fun serialize(
                        value: IgnoreDefaultArgs,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.bool != null -> generator.writeObject(value.bool)
                            value.strings != null -> generator.writeObject(value.strings)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid IgnoreDefaultArgs")
                        }
                    }
                }
            }

            class Proxy
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val server: JsonField<String>,
                private val bypass: JsonField<String>,
                private val password: JsonField<String>,
                private val username: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("server")
                    @ExcludeMissing
                    server: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("bypass")
                    @ExcludeMissing
                    bypass: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("password")
                    @ExcludeMissing
                    password: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("username")
                    @ExcludeMissing
                    username: JsonField<String> = JsonMissing.of(),
                ) : this(server, bypass, password, username, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun server(): String = server.getRequired("server")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun bypass(): Optional<String> = bypass.getOptional("bypass")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun password(): Optional<String> = password.getOptional("password")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun username(): Optional<String> = username.getOptional("username")

                /**
                 * Returns the raw JSON value of [server].
                 *
                 * Unlike [server], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("server") @ExcludeMissing fun _server(): JsonField<String> = server

                /**
                 * Returns the raw JSON value of [bypass].
                 *
                 * Unlike [bypass], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("bypass") @ExcludeMissing fun _bypass(): JsonField<String> = bypass

                /**
                 * Returns the raw JSON value of [password].
                 *
                 * Unlike [password], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("password")
                @ExcludeMissing
                fun _password(): JsonField<String> = password

                /**
                 * Returns the raw JSON value of [username].
                 *
                 * Unlike [username], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("username")
                @ExcludeMissing
                fun _username(): JsonField<String> = username

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Proxy].
                     *
                     * The following fields are required:
                     * ```java
                     * .server()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Proxy]. */
                class Builder internal constructor() {

                    private var server: JsonField<String>? = null
                    private var bypass: JsonField<String> = JsonMissing.of()
                    private var password: JsonField<String> = JsonMissing.of()
                    private var username: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(proxy: Proxy) = apply {
                        server = proxy.server
                        bypass = proxy.bypass
                        password = proxy.password
                        username = proxy.username
                        additionalProperties = proxy.additionalProperties.toMutableMap()
                    }

                    fun server(server: String) = server(JsonField.of(server))

                    /**
                     * Sets [Builder.server] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.server] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun server(server: JsonField<String>) = apply { this.server = server }

                    fun bypass(bypass: String) = bypass(JsonField.of(bypass))

                    /**
                     * Sets [Builder.bypass] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bypass] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun bypass(bypass: JsonField<String>) = apply { this.bypass = bypass }

                    fun password(password: String) = password(JsonField.of(password))

                    /**
                     * Sets [Builder.password] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.password] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun password(password: JsonField<String>) = apply { this.password = password }

                    fun username(username: String) = username(JsonField.of(username))

                    /**
                     * Sets [Builder.username] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.username] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun username(username: JsonField<String>) = apply { this.username = username }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Proxy].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .server()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Proxy =
                        Proxy(
                            checkRequired("server", server),
                            bypass,
                            password,
                            username,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Proxy = apply {
                    if (validated) {
                        return@apply
                    }

                    server()
                    bypass()
                    password()
                    username()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (server.asKnown().isPresent) 1 else 0) +
                        (if (bypass.asKnown().isPresent) 1 else 0) +
                        (if (password.asKnown().isPresent) 1 else 0) +
                        (if (username.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Proxy &&
                        server == other.server &&
                        bypass == other.bypass &&
                        password == other.password &&
                        username == other.username &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(server, bypass, password, username, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Proxy{server=$server, bypass=$bypass, password=$password, username=$username, additionalProperties=$additionalProperties}"
            }

            class Viewport
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val height: JsonField<Double>,
                private val width: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("width")
                    @ExcludeMissing
                    width: JsonField<Double> = JsonMissing.of(),
                ) : this(height, width, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun height(): Double = height.getRequired("height")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun width(): Double = width.getRequired("width")

                /**
                 * Returns the raw JSON value of [height].
                 *
                 * Unlike [height], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

                /**
                 * Returns the raw JSON value of [width].
                 *
                 * Unlike [width], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Viewport].
                     *
                     * The following fields are required:
                     * ```java
                     * .height()
                     * .width()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Viewport]. */
                class Builder internal constructor() {

                    private var height: JsonField<Double>? = null
                    private var width: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(viewport: Viewport) = apply {
                        height = viewport.height
                        width = viewport.width
                        additionalProperties = viewport.additionalProperties.toMutableMap()
                    }

                    fun height(height: Double) = height(JsonField.of(height))

                    /**
                     * Sets [Builder.height] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.height] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun height(height: JsonField<Double>) = apply { this.height = height }

                    fun width(width: Double) = width(JsonField.of(width))

                    /**
                     * Sets [Builder.width] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.width] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun width(width: JsonField<Double>) = apply { this.width = width }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Viewport].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .height()
                     * .width()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Viewport =
                        Viewport(
                            checkRequired("height", height),
                            checkRequired("width", width),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Viewport = apply {
                    if (validated) {
                        return@apply
                    }

                    height()
                    width()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Viewport &&
                        height == other.height &&
                        width == other.width &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(height, width, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Viewport{height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LaunchOptions &&
                    acceptDownloads == other.acceptDownloads &&
                    args == other.args &&
                    cdpUrl == other.cdpUrl &&
                    chromiumSandbox == other.chromiumSandbox &&
                    connectTimeoutMs == other.connectTimeoutMs &&
                    deviceScaleFactor == other.deviceScaleFactor &&
                    devtools == other.devtools &&
                    downloadsPath == other.downloadsPath &&
                    executablePath == other.executablePath &&
                    hasTouch == other.hasTouch &&
                    headless == other.headless &&
                    ignoreDefaultArgs == other.ignoreDefaultArgs &&
                    ignoreHttpsErrors == other.ignoreHttpsErrors &&
                    locale == other.locale &&
                    preserveUserDataDir == other.preserveUserDataDir &&
                    proxy == other.proxy &&
                    userDataDir == other.userDataDir &&
                    viewport == other.viewport &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    acceptDownloads,
                    args,
                    cdpUrl,
                    chromiumSandbox,
                    connectTimeoutMs,
                    deviceScaleFactor,
                    devtools,
                    downloadsPath,
                    executablePath,
                    hasTouch,
                    headless,
                    ignoreDefaultArgs,
                    ignoreHttpsErrors,
                    locale,
                    preserveUserDataDir,
                    proxy,
                    userDataDir,
                    viewport,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LaunchOptions{acceptDownloads=$acceptDownloads, args=$args, cdpUrl=$cdpUrl, chromiumSandbox=$chromiumSandbox, connectTimeoutMs=$connectTimeoutMs, deviceScaleFactor=$deviceScaleFactor, devtools=$devtools, downloadsPath=$downloadsPath, executablePath=$executablePath, hasTouch=$hasTouch, headless=$headless, ignoreDefaultArgs=$ignoreDefaultArgs, ignoreHttpsErrors=$ignoreHttpsErrors, locale=$locale, preserveUserDataDir=$preserveUserDataDir, proxy=$proxy, userDataDir=$userDataDir, viewport=$viewport, additionalProperties=$additionalProperties}"
        }

        /** Browser type to use */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOCAL = of("local")

                @JvmField val BROWSERBASE = of("browserbase")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                LOCAL,
                BROWSERBASE,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                BROWSERBASE,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LOCAL -> Value.LOCAL
                    BROWSERBASE -> Value.BROWSERBASE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StagehandInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LOCAL -> Known.LOCAL
                    BROWSERBASE -> Known.BROWSERBASE
                    else -> throw StagehandInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws StagehandInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    StagehandInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Browser &&
                cdpUrl == other.cdpUrl &&
                launchOptions == other.launchOptions &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cdpUrl, launchOptions, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Browser{cdpUrl=$cdpUrl, launchOptions=$launchOptions, type=$type, additionalProperties=$additionalProperties}"
    }

    class BrowserbaseSessionCreateParams
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val browserSettings: JsonField<BrowserSettings>,
        private val extensionId: JsonField<String>,
        private val keepAlive: JsonField<Boolean>,
        private val projectId: JsonField<String>,
        private val proxies: JsonField<Proxies>,
        private val region: JsonField<Region>,
        private val timeout: JsonField<Double>,
        private val userMetadata: JsonField<UserMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("browserSettings")
            @ExcludeMissing
            browserSettings: JsonField<BrowserSettings> = JsonMissing.of(),
            @JsonProperty("extensionId")
            @ExcludeMissing
            extensionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("keepAlive")
            @ExcludeMissing
            keepAlive: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proxies") @ExcludeMissing proxies: JsonField<Proxies> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("userMetadata")
            @ExcludeMissing
            userMetadata: JsonField<UserMetadata> = JsonMissing.of(),
        ) : this(
            browserSettings,
            extensionId,
            keepAlive,
            projectId,
            proxies,
            region,
            timeout,
            userMetadata,
            mutableMapOf(),
        )

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun browserSettings(): Optional<BrowserSettings> =
            browserSettings.getOptional("browserSettings")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extensionId(): Optional<String> = extensionId.getOptional("extensionId")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun keepAlive(): Optional<Boolean> = keepAlive.getOptional("keepAlive")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("projectId")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun proxies(): Optional<Proxies> = proxies.getOptional("proxies")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun region(): Optional<Region> = region.getOptional("region")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeout(): Optional<Double> = timeout.getOptional("timeout")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userMetadata(): Optional<UserMetadata> = userMetadata.getOptional("userMetadata")

        /**
         * Returns the raw JSON value of [browserSettings].
         *
         * Unlike [browserSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("browserSettings")
        @ExcludeMissing
        fun _browserSettings(): JsonField<BrowserSettings> = browserSettings

        /**
         * Returns the raw JSON value of [extensionId].
         *
         * Unlike [extensionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extensionId")
        @ExcludeMissing
        fun _extensionId(): JsonField<String> = extensionId

        /**
         * Returns the raw JSON value of [keepAlive].
         *
         * Unlike [keepAlive], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keepAlive") @ExcludeMissing fun _keepAlive(): JsonField<Boolean> = keepAlive

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

        /**
         * Returns the raw JSON value of [proxies].
         *
         * Unlike [proxies], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proxies") @ExcludeMissing fun _proxies(): JsonField<Proxies> = proxies

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

        /**
         * Returns the raw JSON value of [userMetadata].
         *
         * Unlike [userMetadata], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("userMetadata")
        @ExcludeMissing
        fun _userMetadata(): JsonField<UserMetadata> = userMetadata

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [BrowserbaseSessionCreateParams].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BrowserbaseSessionCreateParams]. */
        class Builder internal constructor() {

            private var browserSettings: JsonField<BrowserSettings> = JsonMissing.of()
            private var extensionId: JsonField<String> = JsonMissing.of()
            private var keepAlive: JsonField<Boolean> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var proxies: JsonField<Proxies> = JsonMissing.of()
            private var region: JsonField<Region> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var userMetadata: JsonField<UserMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(browserbaseSessionCreateParams: BrowserbaseSessionCreateParams) =
                apply {
                    browserSettings = browserbaseSessionCreateParams.browserSettings
                    extensionId = browserbaseSessionCreateParams.extensionId
                    keepAlive = browserbaseSessionCreateParams.keepAlive
                    projectId = browserbaseSessionCreateParams.projectId
                    proxies = browserbaseSessionCreateParams.proxies
                    region = browserbaseSessionCreateParams.region
                    timeout = browserbaseSessionCreateParams.timeout
                    userMetadata = browserbaseSessionCreateParams.userMetadata
                    additionalProperties =
                        browserbaseSessionCreateParams.additionalProperties.toMutableMap()
                }

            fun browserSettings(browserSettings: BrowserSettings) =
                browserSettings(JsonField.of(browserSettings))

            /**
             * Sets [Builder.browserSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browserSettings] with a well-typed [BrowserSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun browserSettings(browserSettings: JsonField<BrowserSettings>) = apply {
                this.browserSettings = browserSettings
            }

            fun extensionId(extensionId: String) = extensionId(JsonField.of(extensionId))

            /**
             * Sets [Builder.extensionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extensionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extensionId(extensionId: JsonField<String>) = apply {
                this.extensionId = extensionId
            }

            fun keepAlive(keepAlive: Boolean) = keepAlive(JsonField.of(keepAlive))

            /**
             * Sets [Builder.keepAlive] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keepAlive] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keepAlive(keepAlive: JsonField<Boolean>) = apply { this.keepAlive = keepAlive }

            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

            fun proxies(proxies: Proxies) = proxies(JsonField.of(proxies))

            /**
             * Sets [Builder.proxies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxies] with a well-typed [Proxies] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proxies(proxies: JsonField<Proxies>) = apply { this.proxies = proxies }

            /** Alias for calling [proxies] with `Proxies.ofBool(bool)`. */
            fun proxies(bool: Boolean) = proxies(Proxies.ofBool(bool))

            /**
             * Alias for calling [proxies] with
             * `Proxies.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
             */
            fun proxiesOfUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<Proxies.UnnamedSchemaWithArrayParent0>
            ) = proxies(Proxies.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s))

            fun region(region: Region) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [Region] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<Region>) = apply { this.region = region }

            fun timeout(timeout: Double) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            fun userMetadata(userMetadata: UserMetadata) = userMetadata(JsonField.of(userMetadata))

            /**
             * Sets [Builder.userMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userMetadata] with a well-typed [UserMetadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userMetadata(userMetadata: JsonField<UserMetadata>) = apply {
                this.userMetadata = userMetadata
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [BrowserbaseSessionCreateParams].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BrowserbaseSessionCreateParams =
                BrowserbaseSessionCreateParams(
                    browserSettings,
                    extensionId,
                    keepAlive,
                    projectId,
                    proxies,
                    region,
                    timeout,
                    userMetadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BrowserbaseSessionCreateParams = apply {
            if (validated) {
                return@apply
            }

            browserSettings().ifPresent { it.validate() }
            extensionId()
            keepAlive()
            projectId()
            proxies().ifPresent { it.validate() }
            region().ifPresent { it.validate() }
            timeout()
            userMetadata().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (browserSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (if (extensionId.asKnown().isPresent) 1 else 0) +
                (if (keepAlive.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (proxies.asKnown().getOrNull()?.validity() ?: 0) +
                (region.asKnown().getOrNull()?.validity() ?: 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (userMetadata.asKnown().getOrNull()?.validity() ?: 0)

        class BrowserSettings
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val advancedStealth: JsonField<Boolean>,
            private val blockAds: JsonField<Boolean>,
            private val context: JsonField<Context>,
            private val extensionId: JsonField<String>,
            private val fingerprint: JsonField<Fingerprint>,
            private val logSession: JsonField<Boolean>,
            private val recordSession: JsonField<Boolean>,
            private val solveCaptchas: JsonField<Boolean>,
            private val viewport: JsonField<Viewport>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("advancedStealth")
                @ExcludeMissing
                advancedStealth: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("blockAds")
                @ExcludeMissing
                blockAds: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("context")
                @ExcludeMissing
                context: JsonField<Context> = JsonMissing.of(),
                @JsonProperty("extensionId")
                @ExcludeMissing
                extensionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fingerprint")
                @ExcludeMissing
                fingerprint: JsonField<Fingerprint> = JsonMissing.of(),
                @JsonProperty("logSession")
                @ExcludeMissing
                logSession: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recordSession")
                @ExcludeMissing
                recordSession: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solveCaptchas")
                @ExcludeMissing
                solveCaptchas: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("viewport")
                @ExcludeMissing
                viewport: JsonField<Viewport> = JsonMissing.of(),
            ) : this(
                advancedStealth,
                blockAds,
                context,
                extensionId,
                fingerprint,
                logSession,
                recordSession,
                solveCaptchas,
                viewport,
                mutableMapOf(),
            )

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun advancedStealth(): Optional<Boolean> =
                advancedStealth.getOptional("advancedStealth")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun blockAds(): Optional<Boolean> = blockAds.getOptional("blockAds")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun context(): Optional<Context> = context.getOptional("context")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun extensionId(): Optional<String> = extensionId.getOptional("extensionId")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun fingerprint(): Optional<Fingerprint> = fingerprint.getOptional("fingerprint")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun logSession(): Optional<Boolean> = logSession.getOptional("logSession")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recordSession(): Optional<Boolean> = recordSession.getOptional("recordSession")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun solveCaptchas(): Optional<Boolean> = solveCaptchas.getOptional("solveCaptchas")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun viewport(): Optional<Viewport> = viewport.getOptional("viewport")

            /**
             * Returns the raw JSON value of [advancedStealth].
             *
             * Unlike [advancedStealth], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("advancedStealth")
            @ExcludeMissing
            fun _advancedStealth(): JsonField<Boolean> = advancedStealth

            /**
             * Returns the raw JSON value of [blockAds].
             *
             * Unlike [blockAds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("blockAds") @ExcludeMissing fun _blockAds(): JsonField<Boolean> = blockAds

            /**
             * Returns the raw JSON value of [context].
             *
             * Unlike [context], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("context") @ExcludeMissing fun _context(): JsonField<Context> = context

            /**
             * Returns the raw JSON value of [extensionId].
             *
             * Unlike [extensionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("extensionId")
            @ExcludeMissing
            fun _extensionId(): JsonField<String> = extensionId

            /**
             * Returns the raw JSON value of [fingerprint].
             *
             * Unlike [fingerprint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fingerprint")
            @ExcludeMissing
            fun _fingerprint(): JsonField<Fingerprint> = fingerprint

            /**
             * Returns the raw JSON value of [logSession].
             *
             * Unlike [logSession], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("logSession")
            @ExcludeMissing
            fun _logSession(): JsonField<Boolean> = logSession

            /**
             * Returns the raw JSON value of [recordSession].
             *
             * Unlike [recordSession], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recordSession")
            @ExcludeMissing
            fun _recordSession(): JsonField<Boolean> = recordSession

            /**
             * Returns the raw JSON value of [solveCaptchas].
             *
             * Unlike [solveCaptchas], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("solveCaptchas")
            @ExcludeMissing
            fun _solveCaptchas(): JsonField<Boolean> = solveCaptchas

            /**
             * Returns the raw JSON value of [viewport].
             *
             * Unlike [viewport], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("viewport")
            @ExcludeMissing
            fun _viewport(): JsonField<Viewport> = viewport

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [BrowserSettings]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BrowserSettings]. */
            class Builder internal constructor() {

                private var advancedStealth: JsonField<Boolean> = JsonMissing.of()
                private var blockAds: JsonField<Boolean> = JsonMissing.of()
                private var context: JsonField<Context> = JsonMissing.of()
                private var extensionId: JsonField<String> = JsonMissing.of()
                private var fingerprint: JsonField<Fingerprint> = JsonMissing.of()
                private var logSession: JsonField<Boolean> = JsonMissing.of()
                private var recordSession: JsonField<Boolean> = JsonMissing.of()
                private var solveCaptchas: JsonField<Boolean> = JsonMissing.of()
                private var viewport: JsonField<Viewport> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(browserSettings: BrowserSettings) = apply {
                    advancedStealth = browserSettings.advancedStealth
                    blockAds = browserSettings.blockAds
                    context = browserSettings.context
                    extensionId = browserSettings.extensionId
                    fingerprint = browserSettings.fingerprint
                    logSession = browserSettings.logSession
                    recordSession = browserSettings.recordSession
                    solveCaptchas = browserSettings.solveCaptchas
                    viewport = browserSettings.viewport
                    additionalProperties = browserSettings.additionalProperties.toMutableMap()
                }

                fun advancedStealth(advancedStealth: Boolean) =
                    advancedStealth(JsonField.of(advancedStealth))

                /**
                 * Sets [Builder.advancedStealth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.advancedStealth] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun advancedStealth(advancedStealth: JsonField<Boolean>) = apply {
                    this.advancedStealth = advancedStealth
                }

                fun blockAds(blockAds: Boolean) = blockAds(JsonField.of(blockAds))

                /**
                 * Sets [Builder.blockAds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockAds] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockAds(blockAds: JsonField<Boolean>) = apply { this.blockAds = blockAds }

                fun context(context: Context) = context(JsonField.of(context))

                /**
                 * Sets [Builder.context] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.context] with a well-typed [Context] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun context(context: JsonField<Context>) = apply { this.context = context }

                fun extensionId(extensionId: String) = extensionId(JsonField.of(extensionId))

                /**
                 * Sets [Builder.extensionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extensionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun extensionId(extensionId: JsonField<String>) = apply {
                    this.extensionId = extensionId
                }

                fun fingerprint(fingerprint: Fingerprint) = fingerprint(JsonField.of(fingerprint))

                /**
                 * Sets [Builder.fingerprint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fingerprint] with a well-typed [Fingerprint]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fingerprint(fingerprint: JsonField<Fingerprint>) = apply {
                    this.fingerprint = fingerprint
                }

                fun logSession(logSession: Boolean) = logSession(JsonField.of(logSession))

                /**
                 * Sets [Builder.logSession] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.logSession] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun logSession(logSession: JsonField<Boolean>) = apply {
                    this.logSession = logSession
                }

                fun recordSession(recordSession: Boolean) =
                    recordSession(JsonField.of(recordSession))

                /**
                 * Sets [Builder.recordSession] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordSession] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordSession(recordSession: JsonField<Boolean>) = apply {
                    this.recordSession = recordSession
                }

                fun solveCaptchas(solveCaptchas: Boolean) =
                    solveCaptchas(JsonField.of(solveCaptchas))

                /**
                 * Sets [Builder.solveCaptchas] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solveCaptchas] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solveCaptchas(solveCaptchas: JsonField<Boolean>) = apply {
                    this.solveCaptchas = solveCaptchas
                }

                fun viewport(viewport: Viewport) = viewport(JsonField.of(viewport))

                /**
                 * Sets [Builder.viewport] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewport] with a well-typed [Viewport] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun viewport(viewport: JsonField<Viewport>) = apply { this.viewport = viewport }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BrowserSettings].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): BrowserSettings =
                    BrowserSettings(
                        advancedStealth,
                        blockAds,
                        context,
                        extensionId,
                        fingerprint,
                        logSession,
                        recordSession,
                        solveCaptchas,
                        viewport,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BrowserSettings = apply {
                if (validated) {
                    return@apply
                }

                advancedStealth()
                blockAds()
                context().ifPresent { it.validate() }
                extensionId()
                fingerprint().ifPresent { it.validate() }
                logSession()
                recordSession()
                solveCaptchas()
                viewport().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (advancedStealth.asKnown().isPresent) 1 else 0) +
                    (if (blockAds.asKnown().isPresent) 1 else 0) +
                    (context.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (extensionId.asKnown().isPresent) 1 else 0) +
                    (fingerprint.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (logSession.asKnown().isPresent) 1 else 0) +
                    (if (recordSession.asKnown().isPresent) 1 else 0) +
                    (if (solveCaptchas.asKnown().isPresent) 1 else 0) +
                    (viewport.asKnown().getOrNull()?.validity() ?: 0)

            class Context
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val persist: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("persist")
                    @ExcludeMissing
                    persist: JsonField<Boolean> = JsonMissing.of(),
                ) : this(id, persist, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun persist(): Optional<Boolean> = persist.getOptional("persist")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [persist].
                 *
                 * Unlike [persist], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("persist")
                @ExcludeMissing
                fun _persist(): JsonField<Boolean> = persist

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Context].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Context]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var persist: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(context: Context) = apply {
                        id = context.id
                        persist = context.persist
                        additionalProperties = context.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun persist(persist: Boolean) = persist(JsonField.of(persist))

                    /**
                     * Sets [Builder.persist] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.persist] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun persist(persist: JsonField<Boolean>) = apply { this.persist = persist }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Context].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Context =
                        Context(
                            checkRequired("id", id),
                            persist,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Context = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    persist()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (persist.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Context &&
                        id == other.id &&
                        persist == other.persist &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, persist, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Context{id=$id, persist=$persist, additionalProperties=$additionalProperties}"
            }

            class Fingerprint
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val browsers: JsonField<List<Browser>>,
                private val devices: JsonField<List<Device>>,
                private val httpVersion: JsonField<HttpVersion>,
                private val locales: JsonField<List<String>>,
                private val operatingSystems: JsonField<List<OperatingSystem>>,
                private val screen: JsonField<Screen>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("browsers")
                    @ExcludeMissing
                    browsers: JsonField<List<Browser>> = JsonMissing.of(),
                    @JsonProperty("devices")
                    @ExcludeMissing
                    devices: JsonField<List<Device>> = JsonMissing.of(),
                    @JsonProperty("httpVersion")
                    @ExcludeMissing
                    httpVersion: JsonField<HttpVersion> = JsonMissing.of(),
                    @JsonProperty("locales")
                    @ExcludeMissing
                    locales: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("operatingSystems")
                    @ExcludeMissing
                    operatingSystems: JsonField<List<OperatingSystem>> = JsonMissing.of(),
                    @JsonProperty("screen")
                    @ExcludeMissing
                    screen: JsonField<Screen> = JsonMissing.of(),
                ) : this(
                    browsers,
                    devices,
                    httpVersion,
                    locales,
                    operatingSystems,
                    screen,
                    mutableMapOf(),
                )

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun browsers(): Optional<List<Browser>> = browsers.getOptional("browsers")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun devices(): Optional<List<Device>> = devices.getOptional("devices")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun httpVersion(): Optional<HttpVersion> = httpVersion.getOptional("httpVersion")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun locales(): Optional<List<String>> = locales.getOptional("locales")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun operatingSystems(): Optional<List<OperatingSystem>> =
                    operatingSystems.getOptional("operatingSystems")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun screen(): Optional<Screen> = screen.getOptional("screen")

                /**
                 * Returns the raw JSON value of [browsers].
                 *
                 * Unlike [browsers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("browsers")
                @ExcludeMissing
                fun _browsers(): JsonField<List<Browser>> = browsers

                /**
                 * Returns the raw JSON value of [devices].
                 *
                 * Unlike [devices], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("devices")
                @ExcludeMissing
                fun _devices(): JsonField<List<Device>> = devices

                /**
                 * Returns the raw JSON value of [httpVersion].
                 *
                 * Unlike [httpVersion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("httpVersion")
                @ExcludeMissing
                fun _httpVersion(): JsonField<HttpVersion> = httpVersion

                /**
                 * Returns the raw JSON value of [locales].
                 *
                 * Unlike [locales], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("locales")
                @ExcludeMissing
                fun _locales(): JsonField<List<String>> = locales

                /**
                 * Returns the raw JSON value of [operatingSystems].
                 *
                 * Unlike [operatingSystems], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("operatingSystems")
                @ExcludeMissing
                fun _operatingSystems(): JsonField<List<OperatingSystem>> = operatingSystems

                /**
                 * Returns the raw JSON value of [screen].
                 *
                 * Unlike [screen], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("screen") @ExcludeMissing fun _screen(): JsonField<Screen> = screen

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Fingerprint]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Fingerprint]. */
                class Builder internal constructor() {

                    private var browsers: JsonField<MutableList<Browser>>? = null
                    private var devices: JsonField<MutableList<Device>>? = null
                    private var httpVersion: JsonField<HttpVersion> = JsonMissing.of()
                    private var locales: JsonField<MutableList<String>>? = null
                    private var operatingSystems: JsonField<MutableList<OperatingSystem>>? = null
                    private var screen: JsonField<Screen> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(fingerprint: Fingerprint) = apply {
                        browsers = fingerprint.browsers.map { it.toMutableList() }
                        devices = fingerprint.devices.map { it.toMutableList() }
                        httpVersion = fingerprint.httpVersion
                        locales = fingerprint.locales.map { it.toMutableList() }
                        operatingSystems = fingerprint.operatingSystems.map { it.toMutableList() }
                        screen = fingerprint.screen
                        additionalProperties = fingerprint.additionalProperties.toMutableMap()
                    }

                    fun browsers(browsers: List<Browser>) = browsers(JsonField.of(browsers))

                    /**
                     * Sets [Builder.browsers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.browsers] with a well-typed `List<Browser>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun browsers(browsers: JsonField<List<Browser>>) = apply {
                        this.browsers = browsers.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Browser] to [browsers].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addBrowser(browser: Browser) = apply {
                        browsers =
                            (browsers ?: JsonField.of(mutableListOf())).also {
                                checkKnown("browsers", it).add(browser)
                            }
                    }

                    fun devices(devices: List<Device>) = devices(JsonField.of(devices))

                    /**
                     * Sets [Builder.devices] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.devices] with a well-typed `List<Device>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun devices(devices: JsonField<List<Device>>) = apply {
                        this.devices = devices.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Device] to [devices].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addDevice(device: Device) = apply {
                        devices =
                            (devices ?: JsonField.of(mutableListOf())).also {
                                checkKnown("devices", it).add(device)
                            }
                    }

                    fun httpVersion(httpVersion: HttpVersion) =
                        httpVersion(JsonField.of(httpVersion))

                    /**
                     * Sets [Builder.httpVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.httpVersion] with a well-typed [HttpVersion]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun httpVersion(httpVersion: JsonField<HttpVersion>) = apply {
                        this.httpVersion = httpVersion
                    }

                    fun locales(locales: List<String>) = locales(JsonField.of(locales))

                    /**
                     * Sets [Builder.locales] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.locales] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun locales(locales: JsonField<List<String>>) = apply {
                        this.locales = locales.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [locales].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addLocale(locale: String) = apply {
                        locales =
                            (locales ?: JsonField.of(mutableListOf())).also {
                                checkKnown("locales", it).add(locale)
                            }
                    }

                    fun operatingSystems(operatingSystems: List<OperatingSystem>) =
                        operatingSystems(JsonField.of(operatingSystems))

                    /**
                     * Sets [Builder.operatingSystems] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operatingSystems] with a well-typed
                     * `List<OperatingSystem>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun operatingSystems(operatingSystems: JsonField<List<OperatingSystem>>) =
                        apply {
                            this.operatingSystems = operatingSystems.map { it.toMutableList() }
                        }

                    /**
                     * Adds a single [OperatingSystem] to [operatingSystems].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addOperatingSystem(operatingSystem: OperatingSystem) = apply {
                        operatingSystems =
                            (operatingSystems ?: JsonField.of(mutableListOf())).also {
                                checkKnown("operatingSystems", it).add(operatingSystem)
                            }
                    }

                    fun screen(screen: Screen) = screen(JsonField.of(screen))

                    /**
                     * Sets [Builder.screen] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.screen] with a well-typed [Screen] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun screen(screen: JsonField<Screen>) = apply { this.screen = screen }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Fingerprint].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Fingerprint =
                        Fingerprint(
                            (browsers ?: JsonMissing.of()).map { it.toImmutable() },
                            (devices ?: JsonMissing.of()).map { it.toImmutable() },
                            httpVersion,
                            (locales ?: JsonMissing.of()).map { it.toImmutable() },
                            (operatingSystems ?: JsonMissing.of()).map { it.toImmutable() },
                            screen,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Fingerprint = apply {
                    if (validated) {
                        return@apply
                    }

                    browsers().ifPresent { it.forEach { it.validate() } }
                    devices().ifPresent { it.forEach { it.validate() } }
                    httpVersion().ifPresent { it.validate() }
                    locales()
                    operatingSystems().ifPresent { it.forEach { it.validate() } }
                    screen().ifPresent { it.validate() }
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (browsers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (devices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (httpVersion.asKnown().getOrNull()?.validity() ?: 0) +
                        (locales.asKnown().getOrNull()?.size ?: 0) +
                        (operatingSystems.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (screen.asKnown().getOrNull()?.validity() ?: 0)

                class Browser
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CHROME = of("chrome")

                        @JvmField val EDGE = of("edge")

                        @JvmField val FIREFOX = of("firefox")

                        @JvmField val SAFARI = of("safari")

                        @JvmStatic fun of(value: String) = Browser(JsonField.of(value))
                    }

                    /** An enum containing [Browser]'s known values. */
                    enum class Known {
                        CHROME,
                        EDGE,
                        FIREFOX,
                        SAFARI,
                    }

                    /**
                     * An enum containing [Browser]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Browser] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        CHROME,
                        EDGE,
                        FIREFOX,
                        SAFARI,
                        /**
                         * An enum member indicating that [Browser] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            CHROME -> Value.CHROME
                            EDGE -> Value.EDGE
                            FIREFOX -> Value.FIREFOX
                            SAFARI -> Value.SAFARI
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            CHROME -> Known.CHROME
                            EDGE -> Known.EDGE
                            FIREFOX -> Known.FIREFOX
                            SAFARI -> Known.SAFARI
                            else -> throw StagehandInvalidDataException("Unknown Browser: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StagehandInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Browser = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Browser && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Device
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DESKTOP = of("desktop")

                        @JvmField val MOBILE = of("mobile")

                        @JvmStatic fun of(value: String) = Device(JsonField.of(value))
                    }

                    /** An enum containing [Device]'s known values. */
                    enum class Known {
                        DESKTOP,
                        MOBILE,
                    }

                    /**
                     * An enum containing [Device]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Device] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DESKTOP,
                        MOBILE,
                        /**
                         * An enum member indicating that [Device] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DESKTOP -> Value.DESKTOP
                            MOBILE -> Value.MOBILE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DESKTOP -> Known.DESKTOP
                            MOBILE -> Known.MOBILE
                            else -> throw StagehandInvalidDataException("Unknown Device: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StagehandInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): Device = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Device && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class HttpVersion
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val _1 = of("1")

                        @JvmField val _2 = of("2")

                        @JvmStatic fun of(value: String) = HttpVersion(JsonField.of(value))
                    }

                    /** An enum containing [HttpVersion]'s known values. */
                    enum class Known {
                        _1,
                        _2,
                    }

                    /**
                     * An enum containing [HttpVersion]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [HttpVersion] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        _1,
                        _2,
                        /**
                         * An enum member indicating that [HttpVersion] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            _1 -> Value._1
                            _2 -> Value._2
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            _1 -> Known._1
                            _2 -> Known._2
                            else ->
                                throw StagehandInvalidDataException("Unknown HttpVersion: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StagehandInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): HttpVersion = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is HttpVersion && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class OperatingSystem
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val ANDROID = of("android")

                        @JvmField val IOS = of("ios")

                        @JvmField val LINUX = of("linux")

                        @JvmField val MACOS = of("macos")

                        @JvmField val WINDOWS = of("windows")

                        @JvmStatic fun of(value: String) = OperatingSystem(JsonField.of(value))
                    }

                    /** An enum containing [OperatingSystem]'s known values. */
                    enum class Known {
                        ANDROID,
                        IOS,
                        LINUX,
                        MACOS,
                        WINDOWS,
                    }

                    /**
                     * An enum containing [OperatingSystem]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [OperatingSystem] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANDROID,
                        IOS,
                        LINUX,
                        MACOS,
                        WINDOWS,
                        /**
                         * An enum member indicating that [OperatingSystem] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANDROID -> Value.ANDROID
                            IOS -> Value.IOS
                            LINUX -> Value.LINUX
                            MACOS -> Value.MACOS
                            WINDOWS -> Value.WINDOWS
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANDROID -> Known.ANDROID
                            IOS -> Known.IOS
                            LINUX -> Known.LINUX
                            MACOS -> Known.MACOS
                            WINDOWS -> Known.WINDOWS
                            else ->
                                throw StagehandInvalidDataException(
                                    "Unknown OperatingSystem: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws StagehandInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            StagehandInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): OperatingSystem = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is OperatingSystem && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Screen
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val maxHeight: JsonField<Double>,
                    private val maxWidth: JsonField<Double>,
                    private val minHeight: JsonField<Double>,
                    private val minWidth: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("maxHeight")
                        @ExcludeMissing
                        maxHeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("maxWidth")
                        @ExcludeMissing
                        maxWidth: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("minHeight")
                        @ExcludeMissing
                        minHeight: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("minWidth")
                        @ExcludeMissing
                        minWidth: JsonField<Double> = JsonMissing.of(),
                    ) : this(maxHeight, maxWidth, minHeight, minWidth, mutableMapOf())

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxHeight(): Optional<Double> = maxHeight.getOptional("maxHeight")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun maxWidth(): Optional<Double> = maxWidth.getOptional("maxWidth")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun minHeight(): Optional<Double> = minHeight.getOptional("minHeight")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun minWidth(): Optional<Double> = minWidth.getOptional("minWidth")

                    /**
                     * Returns the raw JSON value of [maxHeight].
                     *
                     * Unlike [maxHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("maxHeight")
                    @ExcludeMissing
                    fun _maxHeight(): JsonField<Double> = maxHeight

                    /**
                     * Returns the raw JSON value of [maxWidth].
                     *
                     * Unlike [maxWidth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("maxWidth")
                    @ExcludeMissing
                    fun _maxWidth(): JsonField<Double> = maxWidth

                    /**
                     * Returns the raw JSON value of [minHeight].
                     *
                     * Unlike [minHeight], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minHeight")
                    @ExcludeMissing
                    fun _minHeight(): JsonField<Double> = minHeight

                    /**
                     * Returns the raw JSON value of [minWidth].
                     *
                     * Unlike [minWidth], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minWidth")
                    @ExcludeMissing
                    fun _minWidth(): JsonField<Double> = minWidth

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /** Returns a mutable builder for constructing an instance of [Screen]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Screen]. */
                    class Builder internal constructor() {

                        private var maxHeight: JsonField<Double> = JsonMissing.of()
                        private var maxWidth: JsonField<Double> = JsonMissing.of()
                        private var minHeight: JsonField<Double> = JsonMissing.of()
                        private var minWidth: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(screen: Screen) = apply {
                            maxHeight = screen.maxHeight
                            maxWidth = screen.maxWidth
                            minHeight = screen.minHeight
                            minWidth = screen.minWidth
                            additionalProperties = screen.additionalProperties.toMutableMap()
                        }

                        fun maxHeight(maxHeight: Double) = maxHeight(JsonField.of(maxHeight))

                        /**
                         * Sets [Builder.maxHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxHeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxHeight(maxHeight: JsonField<Double>) = apply {
                            this.maxHeight = maxHeight
                        }

                        fun maxWidth(maxWidth: Double) = maxWidth(JsonField.of(maxWidth))

                        /**
                         * Sets [Builder.maxWidth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maxWidth] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun maxWidth(maxWidth: JsonField<Double>) = apply {
                            this.maxWidth = maxWidth
                        }

                        fun minHeight(minHeight: Double) = minHeight(JsonField.of(minHeight))

                        /**
                         * Sets [Builder.minHeight] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minHeight] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun minHeight(minHeight: JsonField<Double>) = apply {
                            this.minHeight = minHeight
                        }

                        fun minWidth(minWidth: Double) = minWidth(JsonField.of(minWidth))

                        /**
                         * Sets [Builder.minWidth] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minWidth] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun minWidth(minWidth: JsonField<Double>) = apply {
                            this.minWidth = minWidth
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Screen].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Screen =
                            Screen(
                                maxHeight,
                                maxWidth,
                                minHeight,
                                minWidth,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Screen = apply {
                        if (validated) {
                            return@apply
                        }

                        maxHeight()
                        maxWidth()
                        minHeight()
                        minWidth()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (maxHeight.asKnown().isPresent) 1 else 0) +
                            (if (maxWidth.asKnown().isPresent) 1 else 0) +
                            (if (minHeight.asKnown().isPresent) 1 else 0) +
                            (if (minWidth.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Screen &&
                            maxHeight == other.maxHeight &&
                            maxWidth == other.maxWidth &&
                            minHeight == other.minHeight &&
                            minWidth == other.minWidth &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(maxHeight, maxWidth, minHeight, minWidth, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Screen{maxHeight=$maxHeight, maxWidth=$maxWidth, minHeight=$minHeight, minWidth=$minWidth, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Fingerprint &&
                        browsers == other.browsers &&
                        devices == other.devices &&
                        httpVersion == other.httpVersion &&
                        locales == other.locales &&
                        operatingSystems == other.operatingSystems &&
                        screen == other.screen &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        browsers,
                        devices,
                        httpVersion,
                        locales,
                        operatingSystems,
                        screen,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Fingerprint{browsers=$browsers, devices=$devices, httpVersion=$httpVersion, locales=$locales, operatingSystems=$operatingSystems, screen=$screen, additionalProperties=$additionalProperties}"
            }

            class Viewport
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val height: JsonField<Double>,
                private val width: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("height")
                    @ExcludeMissing
                    height: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("width")
                    @ExcludeMissing
                    width: JsonField<Double> = JsonMissing.of(),
                ) : this(height, width, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun height(): Optional<Double> = height.getOptional("height")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun width(): Optional<Double> = width.getOptional("width")

                /**
                 * Returns the raw JSON value of [height].
                 *
                 * Unlike [height], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

                /**
                 * Returns the raw JSON value of [width].
                 *
                 * Unlike [width], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Viewport]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Viewport]. */
                class Builder internal constructor() {

                    private var height: JsonField<Double> = JsonMissing.of()
                    private var width: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(viewport: Viewport) = apply {
                        height = viewport.height
                        width = viewport.width
                        additionalProperties = viewport.additionalProperties.toMutableMap()
                    }

                    fun height(height: Double) = height(JsonField.of(height))

                    /**
                     * Sets [Builder.height] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.height] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun height(height: JsonField<Double>) = apply { this.height = height }

                    fun width(width: Double) = width(JsonField.of(width))

                    /**
                     * Sets [Builder.width] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.width] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun width(width: JsonField<Double>) = apply { this.width = width }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Viewport].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Viewport =
                        Viewport(height, width, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Viewport = apply {
                    if (validated) {
                        return@apply
                    }

                    height()
                    width()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (height.asKnown().isPresent) 1 else 0) +
                        (if (width.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Viewport &&
                        height == other.height &&
                        width == other.width &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(height, width, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Viewport{height=$height, width=$width, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BrowserSettings &&
                    advancedStealth == other.advancedStealth &&
                    blockAds == other.blockAds &&
                    context == other.context &&
                    extensionId == other.extensionId &&
                    fingerprint == other.fingerprint &&
                    logSession == other.logSession &&
                    recordSession == other.recordSession &&
                    solveCaptchas == other.solveCaptchas &&
                    viewport == other.viewport &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    advancedStealth,
                    blockAds,
                    context,
                    extensionId,
                    fingerprint,
                    logSession,
                    recordSession,
                    solveCaptchas,
                    viewport,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BrowserSettings{advancedStealth=$advancedStealth, blockAds=$blockAds, context=$context, extensionId=$extensionId, fingerprint=$fingerprint, logSession=$logSession, recordSession=$recordSession, solveCaptchas=$solveCaptchas, viewport=$viewport, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = Proxies.Deserializer::class)
        @JsonSerialize(using = Proxies.Serializer::class)
        class Proxies
        private constructor(
            private val bool: Boolean? = null,
            private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? = null,
            private val _json: JsonValue? = null,
        ) {

            fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

            fun unnamedSchemaWithArrayParent0s(): Optional<List<UnnamedSchemaWithArrayParent0>> =
                Optional.ofNullable(unnamedSchemaWithArrayParent0s)

            fun isBool(): Boolean = bool != null

            fun isUnnamedSchemaWithArrayParent0s(): Boolean = unnamedSchemaWithArrayParent0s != null

            fun asBool(): Boolean = bool.getOrThrow("bool")

            fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
                unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    bool != null -> visitor.visitBool(bool)
                    unnamedSchemaWithArrayParent0s != null ->
                        visitor.visitUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Proxies = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitBool(bool: Boolean) {}

                        override fun visitUnnamedSchemaWithArrayParent0s(
                            unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                        ) {
                            unnamedSchemaWithArrayParent0s.forEach { it.validate() }
                        }
                    }
                )
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitBool(bool: Boolean) = 1

                        override fun visitUnnamedSchemaWithArrayParent0s(
                            unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                        ) = unnamedSchemaWithArrayParent0s.sumOf { it.validity().toInt() }

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Proxies &&
                    bool == other.bool &&
                    unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s
            }

            override fun hashCode(): Int = Objects.hash(bool, unnamedSchemaWithArrayParent0s)

            override fun toString(): String =
                when {
                    bool != null -> "Proxies{bool=$bool}"
                    unnamedSchemaWithArrayParent0s != null ->
                        "Proxies{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                    _json != null -> "Proxies{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Proxies")
                }

            companion object {

                @JvmStatic fun ofBool(bool: Boolean) = Proxies(bool = bool)

                @JvmStatic
                fun ofUnnamedSchemaWithArrayParent0s(
                    unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                ) =
                    Proxies(
                        unnamedSchemaWithArrayParent0s =
                            unnamedSchemaWithArrayParent0s.toImmutable()
                    )
            }

            /**
             * An interface that defines how to map each variant of [Proxies] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitBool(bool: Boolean): T

                fun visitUnnamedSchemaWithArrayParent0s(
                    unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
                ): T

                /**
                 * Maps an unknown variant of [Proxies] to a value of type [T].
                 *
                 * An instance of [Proxies] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws StagehandInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StagehandInvalidDataException("Unknown Proxies: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Proxies>(Proxies::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Proxies {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                    Proxies(bool = it, _json = json)
                                },
                                tryDeserialize(
                                        node,
                                        jacksonTypeRef<List<UnnamedSchemaWithArrayParent0>>(),
                                    )
                                    ?.let {
                                        Proxies(unnamedSchemaWithArrayParent0s = it, _json = json)
                                    },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from string).
                        0 -> Proxies(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Proxies>(Proxies::class) {

                override fun serialize(
                    value: Proxies,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.bool != null -> generator.writeObject(value.bool)
                        value.unnamedSchemaWithArrayParent0s != null ->
                            generator.writeObject(value.unnamedSchemaWithArrayParent0s)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Proxies")
                    }
                }
            }

            @JsonDeserialize(using = UnnamedSchemaWithArrayParent0.Deserializer::class)
            @JsonSerialize(using = UnnamedSchemaWithArrayParent0.Serializer::class)
            class UnnamedSchemaWithArrayParent0
            private constructor(
                private val browserbaseProxyConfig: BrowserbaseProxyConfig? = null,
                private val externalProxyConfig: ExternalProxyConfig? = null,
                private val _json: JsonValue? = null,
            ) {

                fun browserbaseProxyConfig(): Optional<BrowserbaseProxyConfig> =
                    Optional.ofNullable(browserbaseProxyConfig)

                fun externalProxyConfig(): Optional<ExternalProxyConfig> =
                    Optional.ofNullable(externalProxyConfig)

                fun isBrowserbaseProxyConfig(): Boolean = browserbaseProxyConfig != null

                fun isExternalProxyConfig(): Boolean = externalProxyConfig != null

                fun asBrowserbaseProxyConfig(): BrowserbaseProxyConfig =
                    browserbaseProxyConfig.getOrThrow("browserbaseProxyConfig")

                fun asExternalProxyConfig(): ExternalProxyConfig =
                    externalProxyConfig.getOrThrow("externalProxyConfig")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        browserbaseProxyConfig != null ->
                            visitor.visitBrowserbaseProxyConfig(browserbaseProxyConfig)
                        externalProxyConfig != null ->
                            visitor.visitExternalProxyConfig(externalProxyConfig)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): UnnamedSchemaWithArrayParent0 = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitBrowserbaseProxyConfig(
                                browserbaseProxyConfig: BrowserbaseProxyConfig
                            ) {
                                browserbaseProxyConfig.validate()
                            }

                            override fun visitExternalProxyConfig(
                                externalProxyConfig: ExternalProxyConfig
                            ) {
                                externalProxyConfig.validate()
                            }
                        }
                    )
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: StagehandInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitBrowserbaseProxyConfig(
                                browserbaseProxyConfig: BrowserbaseProxyConfig
                            ) = browserbaseProxyConfig.validity()

                            override fun visitExternalProxyConfig(
                                externalProxyConfig: ExternalProxyConfig
                            ) = externalProxyConfig.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is UnnamedSchemaWithArrayParent0 &&
                        browserbaseProxyConfig == other.browserbaseProxyConfig &&
                        externalProxyConfig == other.externalProxyConfig
                }

                override fun hashCode(): Int =
                    Objects.hash(browserbaseProxyConfig, externalProxyConfig)

                override fun toString(): String =
                    when {
                        browserbaseProxyConfig != null ->
                            "UnnamedSchemaWithArrayParent0{browserbaseProxyConfig=$browserbaseProxyConfig}"
                        externalProxyConfig != null ->
                            "UnnamedSchemaWithArrayParent0{externalProxyConfig=$externalProxyConfig}"
                        _json != null -> "UnnamedSchemaWithArrayParent0{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                    }

                companion object {

                    @JvmStatic
                    fun ofBrowserbaseProxyConfig(browserbaseProxyConfig: BrowserbaseProxyConfig) =
                        UnnamedSchemaWithArrayParent0(
                            browserbaseProxyConfig = browserbaseProxyConfig
                        )

                    @JvmStatic
                    fun ofExternalProxyConfig(externalProxyConfig: ExternalProxyConfig) =
                        UnnamedSchemaWithArrayParent0(externalProxyConfig = externalProxyConfig)
                }

                /**
                 * An interface that defines how to map each variant of
                 * [UnnamedSchemaWithArrayParent0] to a value of type [T].
                 */
                interface Visitor<out T> {

                    fun visitBrowserbaseProxyConfig(
                        browserbaseProxyConfig: BrowserbaseProxyConfig
                    ): T

                    fun visitExternalProxyConfig(externalProxyConfig: ExternalProxyConfig): T

                    /**
                     * Maps an unknown variant of [UnnamedSchemaWithArrayParent0] to a value of type
                     * [T].
                     *
                     * An instance of [UnnamedSchemaWithArrayParent0] can contain an unknown variant
                     * if it was deserialized from data that doesn't match any known variant. For
                     * example, if the SDK is on an older version than the API, then the API may
                     * respond with new variants that the SDK is unaware of.
                     *
                     * @throws StagehandInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw StagehandInvalidDataException(
                            "Unknown UnnamedSchemaWithArrayParent0: $json"
                        )
                    }
                }

                internal class Deserializer :
                    BaseDeserializer<UnnamedSchemaWithArrayParent0>(
                        UnnamedSchemaWithArrayParent0::class
                    ) {

                    override fun ObjectCodec.deserialize(
                        node: JsonNode
                    ): UnnamedSchemaWithArrayParent0 {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<BrowserbaseProxyConfig>())
                                        ?.let {
                                            UnnamedSchemaWithArrayParent0(
                                                browserbaseProxyConfig = it,
                                                _json = json,
                                            )
                                        },
                                    tryDeserialize(node, jacksonTypeRef<ExternalProxyConfig>())
                                        ?.let {
                                            UnnamedSchemaWithArrayParent0(
                                                externalProxyConfig = it,
                                                _json = json,
                                            )
                                        },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> UnnamedSchemaWithArrayParent0(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer :
                    BaseSerializer<UnnamedSchemaWithArrayParent0>(
                        UnnamedSchemaWithArrayParent0::class
                    ) {

                    override fun serialize(
                        value: UnnamedSchemaWithArrayParent0,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.browserbaseProxyConfig != null ->
                                generator.writeObject(value.browserbaseProxyConfig)
                            value.externalProxyConfig != null ->
                                generator.writeObject(value.externalProxyConfig)
                            value._json != null -> generator.writeObject(value._json)
                            else ->
                                throw IllegalStateException("Invalid UnnamedSchemaWithArrayParent0")
                        }
                    }
                }

                class BrowserbaseProxyConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val type: JsonValue,
                    private val domainPattern: JsonField<String>,
                    private val geolocation: JsonField<Geolocation>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("domainPattern")
                        @ExcludeMissing
                        domainPattern: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("geolocation")
                        @ExcludeMissing
                        geolocation: JsonField<Geolocation> = JsonMissing.of(),
                    ) : this(type, domainPattern, geolocation, mutableMapOf())

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("browserbase")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun domainPattern(): Optional<String> =
                        domainPattern.getOptional("domainPattern")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun geolocation(): Optional<Geolocation> =
                        geolocation.getOptional("geolocation")

                    /**
                     * Returns the raw JSON value of [domainPattern].
                     *
                     * Unlike [domainPattern], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("domainPattern")
                    @ExcludeMissing
                    fun _domainPattern(): JsonField<String> = domainPattern

                    /**
                     * Returns the raw JSON value of [geolocation].
                     *
                     * Unlike [geolocation], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("geolocation")
                    @ExcludeMissing
                    fun _geolocation(): JsonField<Geolocation> = geolocation

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [BrowserbaseProxyConfig].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [BrowserbaseProxyConfig]. */
                    class Builder internal constructor() {

                        private var type: JsonValue = JsonValue.from("browserbase")
                        private var domainPattern: JsonField<String> = JsonMissing.of()
                        private var geolocation: JsonField<Geolocation> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(browserbaseProxyConfig: BrowserbaseProxyConfig) = apply {
                            type = browserbaseProxyConfig.type
                            domainPattern = browserbaseProxyConfig.domainPattern
                            geolocation = browserbaseProxyConfig.geolocation
                            additionalProperties =
                                browserbaseProxyConfig.additionalProperties.toMutableMap()
                        }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("browserbase")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun domainPattern(domainPattern: String) =
                            domainPattern(JsonField.of(domainPattern))

                        /**
                         * Sets [Builder.domainPattern] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.domainPattern] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun domainPattern(domainPattern: JsonField<String>) = apply {
                            this.domainPattern = domainPattern
                        }

                        fun geolocation(geolocation: Geolocation) =
                            geolocation(JsonField.of(geolocation))

                        /**
                         * Sets [Builder.geolocation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.geolocation] with a well-typed
                         * [Geolocation] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun geolocation(geolocation: JsonField<Geolocation>) = apply {
                            this.geolocation = geolocation
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [BrowserbaseProxyConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): BrowserbaseProxyConfig =
                            BrowserbaseProxyConfig(
                                type,
                                domainPattern,
                                geolocation,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): BrowserbaseProxyConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        _type().let {
                            if (it != JsonValue.from("browserbase")) {
                                throw StagehandInvalidDataException(
                                    "'type' is invalid, received $it"
                                )
                            }
                        }
                        domainPattern()
                        geolocation().ifPresent { it.validate() }
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        type.let { if (it == JsonValue.from("browserbase")) 1 else 0 } +
                            (if (domainPattern.asKnown().isPresent) 1 else 0) +
                            (geolocation.asKnown().getOrNull()?.validity() ?: 0)

                    class Geolocation
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val country: JsonField<String>,
                        private val city: JsonField<String>,
                        private val state: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("country")
                            @ExcludeMissing
                            country: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("city")
                            @ExcludeMissing
                            city: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("state")
                            @ExcludeMissing
                            state: JsonField<String> = JsonMissing.of(),
                        ) : this(country, city, state, mutableMapOf())

                        /**
                         * @throws StagehandInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun country(): String = country.getRequired("country")

                        /**
                         * @throws StagehandInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun city(): Optional<String> = city.getOptional("city")

                        /**
                         * @throws StagehandInvalidDataException if the JSON field has an unexpected
                         *   type (e.g. if the server responded with an unexpected value).
                         */
                        fun state(): Optional<String> = state.getOptional("state")

                        /**
                         * Returns the raw JSON value of [country].
                         *
                         * Unlike [country], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("country")
                        @ExcludeMissing
                        fun _country(): JsonField<String> = country

                        /**
                         * Returns the raw JSON value of [city].
                         *
                         * Unlike [city], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                        /**
                         * Returns the raw JSON value of [state].
                         *
                         * Unlike [state], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("state")
                        @ExcludeMissing
                        fun _state(): JsonField<String> = state

                        @JsonAnySetter
                        private fun putAdditionalProperty(key: String, value: JsonValue) {
                            additionalProperties.put(key, value)
                        }

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> =
                            Collections.unmodifiableMap(additionalProperties)

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            /**
                             * Returns a mutable builder for constructing an instance of
                             * [Geolocation].
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Geolocation]. */
                        class Builder internal constructor() {

                            private var country: JsonField<String>? = null
                            private var city: JsonField<String> = JsonMissing.of()
                            private var state: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(geolocation: Geolocation) = apply {
                                country = geolocation.country
                                city = geolocation.city
                                state = geolocation.state
                                additionalProperties =
                                    geolocation.additionalProperties.toMutableMap()
                            }

                            fun country(country: String) = country(JsonField.of(country))

                            /**
                             * Sets [Builder.country] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.country] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun country(country: JsonField<String>) = apply {
                                this.country = country
                            }

                            fun city(city: String) = city(JsonField.of(city))

                            /**
                             * Sets [Builder.city] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.city] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun city(city: JsonField<String>) = apply { this.city = city }

                            fun state(state: String) = state(JsonField.of(state))

                            /**
                             * Sets [Builder.state] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.state] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun state(state: JsonField<String>) = apply { this.state = state }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Geolocation].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .country()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Geolocation =
                                Geolocation(
                                    checkRequired("country", country),
                                    city,
                                    state,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Geolocation = apply {
                            if (validated) {
                                return@apply
                            }

                            country()
                            city()
                            state()
                            validated = true
                        }

                        fun isValid(): Boolean =
                            try {
                                validate()
                                true
                            } catch (e: StagehandInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (country.asKnown().isPresent) 1 else 0) +
                                (if (city.asKnown().isPresent) 1 else 0) +
                                (if (state.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Geolocation &&
                                country == other.country &&
                                city == other.city &&
                                state == other.state &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(country, city, state, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Geolocation{country=$country, city=$city, state=$state, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BrowserbaseProxyConfig &&
                            type == other.type &&
                            domainPattern == other.domainPattern &&
                            geolocation == other.geolocation &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(type, domainPattern, geolocation, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "BrowserbaseProxyConfig{type=$type, domainPattern=$domainPattern, geolocation=$geolocation, additionalProperties=$additionalProperties}"
                }

                class ExternalProxyConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val server: JsonField<String>,
                    private val type: JsonValue,
                    private val domainPattern: JsonField<String>,
                    private val password: JsonField<String>,
                    private val username: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("server")
                        @ExcludeMissing
                        server: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                        @JsonProperty("domainPattern")
                        @ExcludeMissing
                        domainPattern: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("password")
                        @ExcludeMissing
                        password: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("username")
                        @ExcludeMissing
                        username: JsonField<String> = JsonMissing.of(),
                    ) : this(server, type, domainPattern, password, username, mutableMapOf())

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type or is unexpectedly missing or null (e.g. if the server responded with
                     *   an unexpected value).
                     */
                    fun server(): String = server.getRequired("server")

                    /**
                     * Expected to always return the following:
                     * ```java
                     * JsonValue.from("external")
                     * ```
                     *
                     * However, this method can be useful for debugging and logging (e.g. if the
                     * server responded with an unexpected value).
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun domainPattern(): Optional<String> =
                        domainPattern.getOptional("domainPattern")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun password(): Optional<String> = password.getOptional("password")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun username(): Optional<String> = username.getOptional("username")

                    /**
                     * Returns the raw JSON value of [server].
                     *
                     * Unlike [server], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("server")
                    @ExcludeMissing
                    fun _server(): JsonField<String> = server

                    /**
                     * Returns the raw JSON value of [domainPattern].
                     *
                     * Unlike [domainPattern], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("domainPattern")
                    @ExcludeMissing
                    fun _domainPattern(): JsonField<String> = domainPattern

                    /**
                     * Returns the raw JSON value of [password].
                     *
                     * Unlike [password], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("password")
                    @ExcludeMissing
                    fun _password(): JsonField<String> = password

                    /**
                     * Returns the raw JSON value of [username].
                     *
                     * Unlike [username], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("username")
                    @ExcludeMissing
                    fun _username(): JsonField<String> = username

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [ExternalProxyConfig].
                         *
                         * The following fields are required:
                         * ```java
                         * .server()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ExternalProxyConfig]. */
                    class Builder internal constructor() {

                        private var server: JsonField<String>? = null
                        private var type: JsonValue = JsonValue.from("external")
                        private var domainPattern: JsonField<String> = JsonMissing.of()
                        private var password: JsonField<String> = JsonMissing.of()
                        private var username: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(externalProxyConfig: ExternalProxyConfig) = apply {
                            server = externalProxyConfig.server
                            type = externalProxyConfig.type
                            domainPattern = externalProxyConfig.domainPattern
                            password = externalProxyConfig.password
                            username = externalProxyConfig.username
                            additionalProperties =
                                externalProxyConfig.additionalProperties.toMutableMap()
                        }

                        fun server(server: String) = server(JsonField.of(server))

                        /**
                         * Sets [Builder.server] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.server] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun server(server: JsonField<String>) = apply { this.server = server }

                        /**
                         * Sets the field to an arbitrary JSON value.
                         *
                         * It is usually unnecessary to call this method because the field defaults
                         * to the following:
                         * ```java
                         * JsonValue.from("external")
                         * ```
                         *
                         * This method is primarily for setting the field to an undocumented or not
                         * yet supported value.
                         */
                        fun type(type: JsonValue) = apply { this.type = type }

                        fun domainPattern(domainPattern: String) =
                            domainPattern(JsonField.of(domainPattern))

                        /**
                         * Sets [Builder.domainPattern] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.domainPattern] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun domainPattern(domainPattern: JsonField<String>) = apply {
                            this.domainPattern = domainPattern
                        }

                        fun password(password: String) = password(JsonField.of(password))

                        /**
                         * Sets [Builder.password] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.password] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun password(password: JsonField<String>) = apply {
                            this.password = password
                        }

                        fun username(username: String) = username(JsonField.of(username))

                        /**
                         * Sets [Builder.username] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.username] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun username(username: JsonField<String>) = apply {
                            this.username = username
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ExternalProxyConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .server()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): ExternalProxyConfig =
                            ExternalProxyConfig(
                                checkRequired("server", server),
                                type,
                                domainPattern,
                                password,
                                username,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ExternalProxyConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        server()
                        _type().let {
                            if (it != JsonValue.from("external")) {
                                throw StagehandInvalidDataException(
                                    "'type' is invalid, received $it"
                                )
                            }
                        }
                        domainPattern()
                        password()
                        username()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: StagehandInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (server.asKnown().isPresent) 1 else 0) +
                            type.let { if (it == JsonValue.from("external")) 1 else 0 } +
                            (if (domainPattern.asKnown().isPresent) 1 else 0) +
                            (if (password.asKnown().isPresent) 1 else 0) +
                            (if (username.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ExternalProxyConfig &&
                            server == other.server &&
                            type == other.type &&
                            domainPattern == other.domainPattern &&
                            password == other.password &&
                            username == other.username &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            server,
                            type,
                            domainPattern,
                            password,
                            username,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ExternalProxyConfig{server=$server, type=$type, domainPattern=$domainPattern, password=$password, username=$username, additionalProperties=$additionalProperties}"
                }
            }
        }

        class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val US_WEST_2 = of("us-west-2")

                @JvmField val US_EAST_1 = of("us-east-1")

                @JvmField val EU_CENTRAL_1 = of("eu-central-1")

                @JvmField val AP_SOUTHEAST_1 = of("ap-southeast-1")

                @JvmStatic fun of(value: String) = Region(JsonField.of(value))
            }

            /** An enum containing [Region]'s known values. */
            enum class Known {
                US_WEST_2,
                US_EAST_1,
                EU_CENTRAL_1,
                AP_SOUTHEAST_1,
            }

            /**
             * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Region] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                US_WEST_2,
                US_EAST_1,
                EU_CENTRAL_1,
                AP_SOUTHEAST_1,
                /**
                 * An enum member indicating that [Region] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    US_WEST_2 -> Value.US_WEST_2
                    US_EAST_1 -> Value.US_EAST_1
                    EU_CENTRAL_1 -> Value.EU_CENTRAL_1
                    AP_SOUTHEAST_1 -> Value.AP_SOUTHEAST_1
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws StagehandInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    US_WEST_2 -> Known.US_WEST_2
                    US_EAST_1 -> Known.US_EAST_1
                    EU_CENTRAL_1 -> Known.EU_CENTRAL_1
                    AP_SOUTHEAST_1 -> Known.AP_SOUTHEAST_1
                    else -> throw StagehandInvalidDataException("Unknown Region: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws StagehandInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    StagehandInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Region = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Region && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class UserMetadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UserMetadata]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UserMetadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(userMetadata: UserMetadata) = apply {
                    additionalProperties = userMetadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UserMetadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UserMetadata = UserMetadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UserMetadata = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: StagehandInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UserMetadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UserMetadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BrowserbaseSessionCreateParams &&
                browserSettings == other.browserSettings &&
                extensionId == other.extensionId &&
                keepAlive == other.keepAlive &&
                projectId == other.projectId &&
                proxies == other.proxies &&
                region == other.region &&
                timeout == other.timeout &&
                userMetadata == other.userMetadata &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                browserSettings,
                extensionId,
                keepAlive,
                projectId,
                proxies,
                region,
                timeout,
                userMetadata,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BrowserbaseSessionCreateParams{browserSettings=$browserSettings, extensionId=$extensionId, keepAlive=$keepAlive, projectId=$projectId, proxies=$proxies, region=$region, timeout=$timeout, userMetadata=$userMetadata, additionalProperties=$additionalProperties}"
    }

    /** Client SDK language */
    class XLanguage @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TYPESCRIPT = of("typescript")

            @JvmField val PYTHON = of("python")

            @JvmField val PLAYGROUND = of("playground")

            @JvmStatic fun of(value: String) = XLanguage(JsonField.of(value))
        }

        /** An enum containing [XLanguage]'s known values. */
        enum class Known {
            TYPESCRIPT,
            PYTHON,
            PLAYGROUND,
        }

        /**
         * An enum containing [XLanguage]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [XLanguage] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TYPESCRIPT,
            PYTHON,
            PLAYGROUND,
            /**
             * An enum member indicating that [XLanguage] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TYPESCRIPT -> Value.TYPESCRIPT
                PYTHON -> Value.PYTHON
                PLAYGROUND -> Value.PLAYGROUND
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StagehandInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TYPESCRIPT -> Known.TYPESCRIPT
                PYTHON -> Known.PYTHON
                PLAYGROUND -> Known.PLAYGROUND
                else -> throw StagehandInvalidDataException("Unknown XLanguage: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StagehandInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                StagehandInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): XLanguage = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is XLanguage && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether to stream the response via SSE */
    class XStreamResponse @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmStatic fun of(value: String) = XStreamResponse(JsonField.of(value))
        }

        /** An enum containing [XStreamResponse]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
        }

        /**
         * An enum containing [XStreamResponse]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [XStreamResponse] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            /**
             * An enum member indicating that [XStreamResponse] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws StagehandInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                else -> throw StagehandInvalidDataException("Unknown XStreamResponse: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws StagehandInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                StagehandInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): XStreamResponse = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: StagehandInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is XStreamResponse && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionStartParams &&
            xLanguage == other.xLanguage &&
            xSdkVersion == other.xSdkVersion &&
            xSentAt == other.xSentAt &&
            xStreamResponse == other.xStreamResponse &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            xLanguage,
            xSdkVersion,
            xSentAt,
            xStreamResponse,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionStartParams{xLanguage=$xLanguage, xSdkVersion=$xSdkVersion, xSentAt=$xSentAt, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
