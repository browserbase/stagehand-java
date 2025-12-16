// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

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
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Initializes a new Stagehand session with a browser instance. Returns a session ID that must be
 * used for all subsequent requests.
 */
class SessionStartParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * API key for Browserbase Cloud
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun browserbaseApiKey(): String = body.browserbaseApiKey()

    /**
     * Project ID for Browserbase
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun browserbaseProjectId(): String = body.browserbaseProjectId()

    /**
     * Timeout in ms to wait for DOM to settle
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domSettleTimeout(): Optional<Long> = body.domSettleTimeout()

    /**
     * AI model to use for actions (must be prefixed with provider/)
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Enable self-healing for failed actions
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selfHeal(): Optional<Boolean> = body.selfHeal()

    /**
     * Custom system prompt for AI actions
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * Logging verbosity level
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verbose(): Optional<Long> = body.verbose()

    /**
     * Returns the raw JSON value of [browserbaseApiKey].
     *
     * Unlike [browserbaseApiKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _browserbaseApiKey(): JsonField<String> = body._browserbaseApiKey()

    /**
     * Returns the raw JSON value of [browserbaseProjectId].
     *
     * Unlike [browserbaseProjectId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _browserbaseProjectId(): JsonField<String> = body._browserbaseProjectId()

    /**
     * Returns the raw JSON value of [domSettleTimeout].
     *
     * Unlike [domSettleTimeout], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _domSettleTimeout(): JsonField<Long> = body._domSettleTimeout()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

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
         * .browserbaseApiKey()
         * .browserbaseProjectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionStartParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionStartParams: SessionStartParams) = apply {
            body = sessionStartParams.body.toBuilder()
            additionalHeaders = sessionStartParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionStartParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [browserbaseApiKey]
         * - [browserbaseProjectId]
         * - [domSettleTimeout]
         * - [model]
         * - [selfHeal]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** API key for Browserbase Cloud */
        fun browserbaseApiKey(browserbaseApiKey: String) = apply {
            body.browserbaseApiKey(browserbaseApiKey)
        }

        /**
         * Sets [Builder.browserbaseApiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browserbaseApiKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun browserbaseApiKey(browserbaseApiKey: JsonField<String>) = apply {
            body.browserbaseApiKey(browserbaseApiKey)
        }

        /** Project ID for Browserbase */
        fun browserbaseProjectId(browserbaseProjectId: String) = apply {
            body.browserbaseProjectId(browserbaseProjectId)
        }

        /**
         * Sets [Builder.browserbaseProjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.browserbaseProjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun browserbaseProjectId(browserbaseProjectId: JsonField<String>) = apply {
            body.browserbaseProjectId(browserbaseProjectId)
        }

        /** Timeout in ms to wait for DOM to settle */
        fun domSettleTimeout(domSettleTimeout: Long) = apply {
            body.domSettleTimeout(domSettleTimeout)
        }

        /**
         * Sets [Builder.domSettleTimeout] to an arbitrary JSON value.
         *
         * You should usually call [Builder.domSettleTimeout] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun domSettleTimeout(domSettleTimeout: JsonField<Long>) = apply {
            body.domSettleTimeout(domSettleTimeout)
        }

        /** AI model to use for actions (must be prefixed with provider/) */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

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

        /** Custom system prompt for AI actions */
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

        /** Logging verbosity level */
        fun verbose(verbose: Long) = apply { body.verbose(verbose) }

        /**
         * Sets [Builder.verbose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verbose] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verbose(verbose: JsonField<Long>) = apply { body.verbose(verbose) }

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
         * .browserbaseApiKey()
         * .browserbaseProjectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionStartParams =
            SessionStartParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val browserbaseApiKey: JsonField<String>,
        private val browserbaseProjectId: JsonField<String>,
        private val domSettleTimeout: JsonField<Long>,
        private val model: JsonField<String>,
        private val selfHeal: JsonField<Boolean>,
        private val systemPrompt: JsonField<String>,
        private val verbose: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("BROWSERBASE_API_KEY")
            @ExcludeMissing
            browserbaseApiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("BROWSERBASE_PROJECT_ID")
            @ExcludeMissing
            browserbaseProjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domSettleTimeout")
            @ExcludeMissing
            domSettleTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("selfHeal")
            @ExcludeMissing
            selfHeal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verbose") @ExcludeMissing verbose: JsonField<Long> = JsonMissing.of(),
        ) : this(
            browserbaseApiKey,
            browserbaseProjectId,
            domSettleTimeout,
            model,
            selfHeal,
            systemPrompt,
            verbose,
            mutableMapOf(),
        )

        /**
         * API key for Browserbase Cloud
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun browserbaseApiKey(): String = browserbaseApiKey.getRequired("BROWSERBASE_API_KEY")

        /**
         * Project ID for Browserbase
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun browserbaseProjectId(): String =
            browserbaseProjectId.getRequired("BROWSERBASE_PROJECT_ID")

        /**
         * Timeout in ms to wait for DOM to settle
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domSettleTimeout(): Optional<Long> = domSettleTimeout.getOptional("domSettleTimeout")

        /**
         * AI model to use for actions (must be prefixed with provider/)
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Enable self-healing for failed actions
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selfHeal(): Optional<Boolean> = selfHeal.getOptional("selfHeal")

        /**
         * Custom system prompt for AI actions
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("systemPrompt")

        /**
         * Logging verbosity level
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun verbose(): Optional<Long> = verbose.getOptional("verbose")

        /**
         * Returns the raw JSON value of [browserbaseApiKey].
         *
         * Unlike [browserbaseApiKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("BROWSERBASE_API_KEY")
        @ExcludeMissing
        fun _browserbaseApiKey(): JsonField<String> = browserbaseApiKey

        /**
         * Returns the raw JSON value of [browserbaseProjectId].
         *
         * Unlike [browserbaseProjectId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("BROWSERBASE_PROJECT_ID")
        @ExcludeMissing
        fun _browserbaseProjectId(): JsonField<String> = browserbaseProjectId

        /**
         * Returns the raw JSON value of [domSettleTimeout].
         *
         * Unlike [domSettleTimeout], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("domSettleTimeout")
        @ExcludeMissing
        fun _domSettleTimeout(): JsonField<Long> = domSettleTimeout

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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
             * .browserbaseApiKey()
             * .browserbaseProjectId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var browserbaseApiKey: JsonField<String>? = null
            private var browserbaseProjectId: JsonField<String>? = null
            private var domSettleTimeout: JsonField<Long> = JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var selfHeal: JsonField<Boolean> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var verbose: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                browserbaseApiKey = body.browserbaseApiKey
                browserbaseProjectId = body.browserbaseProjectId
                domSettleTimeout = body.domSettleTimeout
                model = body.model
                selfHeal = body.selfHeal
                systemPrompt = body.systemPrompt
                verbose = body.verbose
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** API key for Browserbase Cloud */
            fun browserbaseApiKey(browserbaseApiKey: String) =
                browserbaseApiKey(JsonField.of(browserbaseApiKey))

            /**
             * Sets [Builder.browserbaseApiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browserbaseApiKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun browserbaseApiKey(browserbaseApiKey: JsonField<String>) = apply {
                this.browserbaseApiKey = browserbaseApiKey
            }

            /** Project ID for Browserbase */
            fun browserbaseProjectId(browserbaseProjectId: String) =
                browserbaseProjectId(JsonField.of(browserbaseProjectId))

            /**
             * Sets [Builder.browserbaseProjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.browserbaseProjectId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun browserbaseProjectId(browserbaseProjectId: JsonField<String>) = apply {
                this.browserbaseProjectId = browserbaseProjectId
            }

            /** Timeout in ms to wait for DOM to settle */
            fun domSettleTimeout(domSettleTimeout: Long) =
                domSettleTimeout(JsonField.of(domSettleTimeout))

            /**
             * Sets [Builder.domSettleTimeout] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domSettleTimeout] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domSettleTimeout(domSettleTimeout: JsonField<Long>) = apply {
                this.domSettleTimeout = domSettleTimeout
            }

            /** AI model to use for actions (must be prefixed with provider/) */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

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

            /** Custom system prompt for AI actions */
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

            /** Logging verbosity level */
            fun verbose(verbose: Long) = verbose(JsonField.of(verbose))

            /**
             * Sets [Builder.verbose] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verbose] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verbose(verbose: JsonField<Long>) = apply { this.verbose = verbose }

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
             * .browserbaseApiKey()
             * .browserbaseProjectId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("browserbaseApiKey", browserbaseApiKey),
                    checkRequired("browserbaseProjectId", browserbaseProjectId),
                    domSettleTimeout,
                    model,
                    selfHeal,
                    systemPrompt,
                    verbose,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            browserbaseApiKey()
            browserbaseProjectId()
            domSettleTimeout()
            model()
            selfHeal()
            systemPrompt()
            verbose()
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
            (if (browserbaseApiKey.asKnown().isPresent) 1 else 0) +
                (if (browserbaseProjectId.asKnown().isPresent) 1 else 0) +
                (if (domSettleTimeout.asKnown().isPresent) 1 else 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (selfHeal.asKnown().isPresent) 1 else 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (verbose.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                browserbaseApiKey == other.browserbaseApiKey &&
                browserbaseProjectId == other.browserbaseProjectId &&
                domSettleTimeout == other.domSettleTimeout &&
                model == other.model &&
                selfHeal == other.selfHeal &&
                systemPrompt == other.systemPrompt &&
                verbose == other.verbose &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                browserbaseApiKey,
                browserbaseProjectId,
                domSettleTimeout,
                model,
                selfHeal,
                systemPrompt,
                verbose,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{browserbaseApiKey=$browserbaseApiKey, browserbaseProjectId=$browserbaseProjectId, domSettleTimeout=$domSettleTimeout, model=$model, selfHeal=$selfHeal, systemPrompt=$systemPrompt, verbose=$verbose, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionStartParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SessionStartParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
