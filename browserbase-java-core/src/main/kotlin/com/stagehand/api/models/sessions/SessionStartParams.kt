// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stagehand.api.core.Enum
import com.stagehand.api.core.ExcludeMissing
import com.stagehand.api.core.JsonField
import com.stagehand.api.core.JsonMissing
import com.stagehand.api.core.JsonValue
import com.stagehand.api.core.Params
import com.stagehand.api.core.checkRequired
import com.stagehand.api.core.http.Headers
import com.stagehand.api.core.http.QueryParams
import com.stagehand.api.errors.BrowserbaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

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
     * Environment to run the browser in
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun env(): Env = body.env()

    /**
     * API key for Browserbase (required when env=BROWSERBASE)
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = body.apiKey()

    /**
     * Timeout in ms to wait for DOM to settle
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun domSettleTimeout(): Optional<Long> = body.domSettleTimeout()

    /**
     * Options for local browser launch
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun localBrowserLaunchOptions(): Optional<LocalBrowserLaunchOptions> =
        body.localBrowserLaunchOptions()

    /**
     * AI model to use for actions
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = body.model()

    /**
     * Project ID for Browserbase (required when env=BROWSERBASE)
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projectId(): Optional<String> = body.projectId()

    /**
     * Enable self-healing for failed actions
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun selfHeal(): Optional<Boolean> = body.selfHeal()

    /**
     * Custom system prompt for AI actions
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun systemPrompt(): Optional<String> = body.systemPrompt()

    /**
     * Logging verbosity level
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun verbose(): Optional<Long> = body.verbose()

    /**
     * Returns the raw JSON value of [env].
     *
     * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _env(): JsonField<Env> = body._env()

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _apiKey(): JsonField<String> = body._apiKey()

    /**
     * Returns the raw JSON value of [domSettleTimeout].
     *
     * Unlike [domSettleTimeout], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _domSettleTimeout(): JsonField<Long> = body._domSettleTimeout()

    /**
     * Returns the raw JSON value of [localBrowserLaunchOptions].
     *
     * Unlike [localBrowserLaunchOptions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _localBrowserLaunchOptions(): JsonField<LocalBrowserLaunchOptions> =
        body._localBrowserLaunchOptions()

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _model(): JsonField<String> = body._model()

    /**
     * Returns the raw JSON value of [projectId].
     *
     * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _projectId(): JsonField<String> = body._projectId()

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
         * .env()
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
         * - [env]
         * - [apiKey]
         * - [domSettleTimeout]
         * - [localBrowserLaunchOptions]
         * - [model]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Environment to run the browser in */
        fun env(env: Env) = apply { body.env(env) }

        /**
         * Sets [Builder.env] to an arbitrary JSON value.
         *
         * You should usually call [Builder.env] with a well-typed [Env] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun env(env: JsonField<Env>) = apply { body.env(env) }

        /** API key for Browserbase (required when env=BROWSERBASE) */
        fun apiKey(apiKey: String) = apply { body.apiKey(apiKey) }

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { body.apiKey(apiKey) }

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

        /** Options for local browser launch */
        fun localBrowserLaunchOptions(localBrowserLaunchOptions: LocalBrowserLaunchOptions) =
            apply {
                body.localBrowserLaunchOptions(localBrowserLaunchOptions)
            }

        /**
         * Sets [Builder.localBrowserLaunchOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localBrowserLaunchOptions] with a well-typed
         * [LocalBrowserLaunchOptions] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun localBrowserLaunchOptions(
            localBrowserLaunchOptions: JsonField<LocalBrowserLaunchOptions>
        ) = apply { body.localBrowserLaunchOptions(localBrowserLaunchOptions) }

        /** AI model to use for actions */
        fun model(model: String) = apply { body.model(model) }

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { body.model(model) }

        /** Project ID for Browserbase (required when env=BROWSERBASE) */
        fun projectId(projectId: String) = apply { body.projectId(projectId) }

        /**
         * Sets [Builder.projectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectId(projectId: JsonField<String>) = apply { body.projectId(projectId) }

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
         * .env()
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
        private val env: JsonField<Env>,
        private val apiKey: JsonField<String>,
        private val domSettleTimeout: JsonField<Long>,
        private val localBrowserLaunchOptions: JsonField<LocalBrowserLaunchOptions>,
        private val model: JsonField<String>,
        private val projectId: JsonField<String>,
        private val selfHeal: JsonField<Boolean>,
        private val systemPrompt: JsonField<String>,
        private val verbose: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("env") @ExcludeMissing env: JsonField<Env> = JsonMissing.of(),
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("domSettleTimeout")
            @ExcludeMissing
            domSettleTimeout: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("localBrowserLaunchOptions")
            @ExcludeMissing
            localBrowserLaunchOptions: JsonField<LocalBrowserLaunchOptions> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
            @JsonProperty("projectId")
            @ExcludeMissing
            projectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("selfHeal")
            @ExcludeMissing
            selfHeal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verbose") @ExcludeMissing verbose: JsonField<Long> = JsonMissing.of(),
        ) : this(
            env,
            apiKey,
            domSettleTimeout,
            localBrowserLaunchOptions,
            model,
            projectId,
            selfHeal,
            systemPrompt,
            verbose,
            mutableMapOf(),
        )

        /**
         * Environment to run the browser in
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun env(): Env = env.getRequired("env")

        /**
         * API key for Browserbase (required when env=BROWSERBASE)
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

        /**
         * Timeout in ms to wait for DOM to settle
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun domSettleTimeout(): Optional<Long> = domSettleTimeout.getOptional("domSettleTimeout")

        /**
         * Options for local browser launch
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun localBrowserLaunchOptions(): Optional<LocalBrowserLaunchOptions> =
            localBrowserLaunchOptions.getOptional("localBrowserLaunchOptions")

        /**
         * AI model to use for actions
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<String> = model.getOptional("model")

        /**
         * Project ID for Browserbase (required when env=BROWSERBASE)
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun projectId(): Optional<String> = projectId.getOptional("projectId")

        /**
         * Enable self-healing for failed actions
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun selfHeal(): Optional<Boolean> = selfHeal.getOptional("selfHeal")

        /**
         * Custom system prompt for AI actions
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("systemPrompt")

        /**
         * Logging verbosity level
         *
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun verbose(): Optional<Long> = verbose.getOptional("verbose")

        /**
         * Returns the raw JSON value of [env].
         *
         * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<Env> = env

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

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
         * Returns the raw JSON value of [localBrowserLaunchOptions].
         *
         * Unlike [localBrowserLaunchOptions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("localBrowserLaunchOptions")
        @ExcludeMissing
        fun _localBrowserLaunchOptions(): JsonField<LocalBrowserLaunchOptions> =
            localBrowserLaunchOptions

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

        /**
         * Returns the raw JSON value of [projectId].
         *
         * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("projectId") @ExcludeMissing fun _projectId(): JsonField<String> = projectId

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
             * .env()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var env: JsonField<Env>? = null
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var domSettleTimeout: JsonField<Long> = JsonMissing.of()
            private var localBrowserLaunchOptions: JsonField<LocalBrowserLaunchOptions> =
                JsonMissing.of()
            private var model: JsonField<String> = JsonMissing.of()
            private var projectId: JsonField<String> = JsonMissing.of()
            private var selfHeal: JsonField<Boolean> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var verbose: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                env = body.env
                apiKey = body.apiKey
                domSettleTimeout = body.domSettleTimeout
                localBrowserLaunchOptions = body.localBrowserLaunchOptions
                model = body.model
                projectId = body.projectId
                selfHeal = body.selfHeal
                systemPrompt = body.systemPrompt
                verbose = body.verbose
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Environment to run the browser in */
            fun env(env: Env) = env(JsonField.of(env))

            /**
             * Sets [Builder.env] to an arbitrary JSON value.
             *
             * You should usually call [Builder.env] with a well-typed [Env] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun env(env: JsonField<Env>) = apply { this.env = env }

            /** API key for Browserbase (required when env=BROWSERBASE) */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

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

            /** Options for local browser launch */
            fun localBrowserLaunchOptions(localBrowserLaunchOptions: LocalBrowserLaunchOptions) =
                localBrowserLaunchOptions(JsonField.of(localBrowserLaunchOptions))

            /**
             * Sets [Builder.localBrowserLaunchOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.localBrowserLaunchOptions] with a well-typed
             * [LocalBrowserLaunchOptions] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun localBrowserLaunchOptions(
                localBrowserLaunchOptions: JsonField<LocalBrowserLaunchOptions>
            ) = apply { this.localBrowserLaunchOptions = localBrowserLaunchOptions }

            /** AI model to use for actions */
            fun model(model: String) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<String>) = apply { this.model = model }

            /** Project ID for Browserbase (required when env=BROWSERBASE) */
            fun projectId(projectId: String) = projectId(JsonField.of(projectId))

            /**
             * Sets [Builder.projectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

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
             * .env()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("env", env),
                    apiKey,
                    domSettleTimeout,
                    localBrowserLaunchOptions,
                    model,
                    projectId,
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

            env().validate()
            apiKey()
            domSettleTimeout()
            localBrowserLaunchOptions().ifPresent { it.validate() }
            model()
            projectId()
            selfHeal()
            systemPrompt()
            verbose()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BrowserbaseInvalidDataException) {
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
            (env.asKnown().getOrNull()?.validity() ?: 0) +
                (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (domSettleTimeout.asKnown().isPresent) 1 else 0) +
                (localBrowserLaunchOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (model.asKnown().isPresent) 1 else 0) +
                (if (projectId.asKnown().isPresent) 1 else 0) +
                (if (selfHeal.asKnown().isPresent) 1 else 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0) +
                (if (verbose.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                env == other.env &&
                apiKey == other.apiKey &&
                domSettleTimeout == other.domSettleTimeout &&
                localBrowserLaunchOptions == other.localBrowserLaunchOptions &&
                model == other.model &&
                projectId == other.projectId &&
                selfHeal == other.selfHeal &&
                systemPrompt == other.systemPrompt &&
                verbose == other.verbose &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                env,
                apiKey,
                domSettleTimeout,
                localBrowserLaunchOptions,
                model,
                projectId,
                selfHeal,
                systemPrompt,
                verbose,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{env=$env, apiKey=$apiKey, domSettleTimeout=$domSettleTimeout, localBrowserLaunchOptions=$localBrowserLaunchOptions, model=$model, projectId=$projectId, selfHeal=$selfHeal, systemPrompt=$systemPrompt, verbose=$verbose, additionalProperties=$additionalProperties}"
    }

    /** Environment to run the browser in */
    class Env @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LOCAL = of("LOCAL")

            @JvmField val BROWSERBASE = of("BROWSERBASE")

            @JvmStatic fun of(value: String) = Env(JsonField.of(value))
        }

        /** An enum containing [Env]'s known values. */
        enum class Known {
            LOCAL,
            BROWSERBASE,
        }

        /**
         * An enum containing [Env]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Env] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOCAL,
            BROWSERBASE,
            /** An enum member indicating that [Env] was instantiated with an unknown value. */
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
                LOCAL -> Value.LOCAL
                BROWSERBASE -> Value.BROWSERBASE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws BrowserbaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LOCAL -> Known.LOCAL
                BROWSERBASE -> Known.BROWSERBASE
                else -> throw BrowserbaseInvalidDataException("Unknown Env: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws BrowserbaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                BrowserbaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Env = apply {
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
            } catch (e: BrowserbaseInvalidDataException) {
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

            return other is Env && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Options for local browser launch */
    class LocalBrowserLaunchOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val headless: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("headless")
            @ExcludeMissing
            headless: JsonField<Boolean> = JsonMissing.of()
        ) : this(headless, mutableMapOf())

        /**
         * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headless(): Optional<Boolean> = headless.getOptional("headless")

        /**
         * Returns the raw JSON value of [headless].
         *
         * Unlike [headless], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("headless") @ExcludeMissing fun _headless(): JsonField<Boolean> = headless

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
             * [LocalBrowserLaunchOptions].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LocalBrowserLaunchOptions]. */
        class Builder internal constructor() {

            private var headless: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(localBrowserLaunchOptions: LocalBrowserLaunchOptions) = apply {
                headless = localBrowserLaunchOptions.headless
                additionalProperties = localBrowserLaunchOptions.additionalProperties.toMutableMap()
            }

            fun headless(headless: Boolean) = headless(JsonField.of(headless))

            /**
             * Sets [Builder.headless] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headless] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headless(headless: JsonField<Boolean>) = apply { this.headless = headless }

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
             * Returns an immutable instance of [LocalBrowserLaunchOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LocalBrowserLaunchOptions =
                LocalBrowserLaunchOptions(headless, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): LocalBrowserLaunchOptions = apply {
            if (validated) {
                return@apply
            }

            headless()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: BrowserbaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (if (headless.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LocalBrowserLaunchOptions &&
                headless == other.headless &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(headless, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LocalBrowserLaunchOptions{headless=$headless, additionalProperties=$additionalProperties}"
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
