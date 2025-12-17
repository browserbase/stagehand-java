// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.Enum
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.Params
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.http.Headers
import com.browserbase.api.core.http.QueryParams
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Navigates the browser to the specified URL. */
class SessionNavigateParams
private constructor(
    private val id: String?,
    private val xLanguage: XLanguage?,
    private val xSdkVersion: String?,
    private val xSentAt: OffsetDateTime?,
    private val xStreamResponse: XStreamResponse?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique session identifier */
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Client SDK language */
    fun xLanguage(): Optional<XLanguage> = Optional.ofNullable(xLanguage)

    /** Version of the Stagehand SDK */
    fun xSdkVersion(): Optional<String> = Optional.ofNullable(xSdkVersion)

    /** ISO timestamp when request was sent */
    fun xSentAt(): Optional<OffsetDateTime> = Optional.ofNullable(xSentAt)

    /** Whether to stream the response via SSE */
    fun xStreamResponse(): Optional<XStreamResponse> = Optional.ofNullable(xStreamResponse)

    /**
     * URL to navigate to
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = body.url()

    /**
     * Target frame ID for the navigation
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameId(): Optional<String> = body.frameId()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    /**
     * Returns the raw JSON value of [frameId].
     *
     * Unlike [frameId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frameId(): JsonField<String> = body._frameId()

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionNavigateParams].
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionNavigateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xLanguage: XLanguage? = null
        private var xSdkVersion: String? = null
        private var xSentAt: OffsetDateTime? = null
        private var xStreamResponse: XStreamResponse? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionNavigateParams: SessionNavigateParams) = apply {
            id = sessionNavigateParams.id
            xLanguage = sessionNavigateParams.xLanguage
            xSdkVersion = sessionNavigateParams.xSdkVersion
            xSentAt = sessionNavigateParams.xSentAt
            xStreamResponse = sessionNavigateParams.xStreamResponse
            body = sessionNavigateParams.body.toBuilder()
            additionalHeaders = sessionNavigateParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionNavigateParams.additionalQueryParams.toBuilder()
        }

        /** Unique session identifier */
        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

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
         * - [url]
         * - [frameId]
         * - [options]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** URL to navigate to */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

        /** Target frame ID for the navigation */
        fun frameId(frameId: String) = apply { body.frameId(frameId) }

        /**
         * Sets [Builder.frameId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frameId(frameId: JsonField<String>) = apply { body.frameId(frameId) }

        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

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
         * Returns an immutable instance of [SessionNavigateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .url()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionNavigateParams =
            SessionNavigateParams(
                id,
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

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

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
        private val url: JsonField<String>,
        private val frameId: JsonField<String>,
        private val options: JsonField<Options>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("frameId") @ExcludeMissing frameId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
        ) : this(url, frameId, options, mutableMapOf())

        /**
         * URL to navigate to
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun url(): String = url.getRequired("url")

        /**
         * Target frame ID for the navigation
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frameId(): Optional<String> = frameId.getOptional("frameId")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [frameId].
         *
         * Unlike [frameId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frameId") @ExcludeMissing fun _frameId(): JsonField<String> = frameId

        /**
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

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
             * .url()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var url: JsonField<String>? = null
            private var frameId: JsonField<String> = JsonMissing.of()
            private var options: JsonField<Options> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                url = body.url
                frameId = body.frameId
                options = body.options
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** URL to navigate to */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            /** Target frame ID for the navigation */
            fun frameId(frameId: String) = frameId(JsonField.of(frameId))

            /**
             * Sets [Builder.frameId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frameId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frameId(frameId: JsonField<String>) = apply { this.frameId = frameId }

            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

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
             * .url()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("url", url),
                    frameId,
                    options,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            url()
            frameId()
            options().ifPresent { it.validate() }
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
            (if (url.asKnown().isPresent) 1 else 0) +
                (if (frameId.asKnown().isPresent) 1 else 0) +
                (options.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                url == other.url &&
                frameId == other.frameId &&
                options == other.options &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(url, frameId, options, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{url=$url, frameId=$frameId, options=$options, additionalProperties=$additionalProperties}"
    }

    class Options
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val referer: JsonField<String>,
        private val timeout: JsonField<Double>,
        private val waitUntil: JsonField<WaitUntil>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("referer") @ExcludeMissing referer: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeout") @ExcludeMissing timeout: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("waitUntil")
            @ExcludeMissing
            waitUntil: JsonField<WaitUntil> = JsonMissing.of(),
        ) : this(referer, timeout, waitUntil, mutableMapOf())

        /**
         * Referer header to send with the request
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun referer(): Optional<String> = referer.getOptional("referer")

        /**
         * Timeout in ms for the navigation
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeout(): Optional<Double> = timeout.getOptional("timeout")

        /**
         * When to consider navigation complete
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun waitUntil(): Optional<WaitUntil> = waitUntil.getOptional("waitUntil")

        /**
         * Returns the raw JSON value of [referer].
         *
         * Unlike [referer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("referer") @ExcludeMissing fun _referer(): JsonField<String> = referer

        /**
         * Returns the raw JSON value of [timeout].
         *
         * Unlike [timeout], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeout") @ExcludeMissing fun _timeout(): JsonField<Double> = timeout

        /**
         * Returns the raw JSON value of [waitUntil].
         *
         * Unlike [waitUntil], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("waitUntil")
        @ExcludeMissing
        fun _waitUntil(): JsonField<WaitUntil> = waitUntil

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

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var referer: JsonField<String> = JsonMissing.of()
            private var timeout: JsonField<Double> = JsonMissing.of()
            private var waitUntil: JsonField<WaitUntil> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                referer = options.referer
                timeout = options.timeout
                waitUntil = options.waitUntil
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /** Referer header to send with the request */
            fun referer(referer: String) = referer(JsonField.of(referer))

            /**
             * Sets [Builder.referer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referer(referer: JsonField<String>) = apply { this.referer = referer }

            /** Timeout in ms for the navigation */
            fun timeout(timeout: Double) = timeout(JsonField.of(timeout))

            /**
             * Sets [Builder.timeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeout] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeout(timeout: JsonField<Double>) = apply { this.timeout = timeout }

            /** When to consider navigation complete */
            fun waitUntil(waitUntil: WaitUntil) = waitUntil(JsonField.of(waitUntil))

            /**
             * Sets [Builder.waitUntil] to an arbitrary JSON value.
             *
             * You should usually call [Builder.waitUntil] with a well-typed [WaitUntil] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun waitUntil(waitUntil: JsonField<WaitUntil>) = apply { this.waitUntil = waitUntil }

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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options =
                Options(referer, timeout, waitUntil, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            referer()
            timeout()
            waitUntil().ifPresent { it.validate() }
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
            (if (referer.asKnown().isPresent) 1 else 0) +
                (if (timeout.asKnown().isPresent) 1 else 0) +
                (waitUntil.asKnown().getOrNull()?.validity() ?: 0)

        /** When to consider navigation complete */
        class WaitUntil @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val LOAD = of("load")

                @JvmField val DOMCONTENTLOADED = of("domcontentloaded")

                @JvmField val NETWORKIDLE = of("networkidle")

                @JvmStatic fun of(value: String) = WaitUntil(JsonField.of(value))
            }

            /** An enum containing [WaitUntil]'s known values. */
            enum class Known {
                LOAD,
                DOMCONTENTLOADED,
                NETWORKIDLE,
            }

            /**
             * An enum containing [WaitUntil]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [WaitUntil] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOAD,
                DOMCONTENTLOADED,
                NETWORKIDLE,
                /**
                 * An enum member indicating that [WaitUntil] was instantiated with an unknown
                 * value.
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
                    LOAD -> Value.LOAD
                    DOMCONTENTLOADED -> Value.DOMCONTENTLOADED
                    NETWORKIDLE -> Value.NETWORKIDLE
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
                    LOAD -> Known.LOAD
                    DOMCONTENTLOADED -> Known.DOMCONTENTLOADED
                    NETWORKIDLE -> Known.NETWORKIDLE
                    else -> throw StagehandInvalidDataException("Unknown WaitUntil: $value")
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

            fun validate(): WaitUntil = apply {
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

                return other is WaitUntil && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                referer == other.referer &&
                timeout == other.timeout &&
                waitUntil == other.waitUntil &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(referer, timeout, waitUntil, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{referer=$referer, timeout=$timeout, waitUntil=$waitUntil, additionalProperties=$additionalProperties}"
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

        return other is SessionNavigateParams &&
            id == other.id &&
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
            id,
            xLanguage,
            xSdkVersion,
            xSentAt,
            xStreamResponse,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionNavigateParams{id=$id, xLanguage=$xLanguage, xSdkVersion=$xSdkVersion, xSentAt=$xSentAt, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
