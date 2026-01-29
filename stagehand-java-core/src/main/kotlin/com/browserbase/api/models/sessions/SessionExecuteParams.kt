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
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.getOrThrow
import com.browserbase.api.core.http.Headers
import com.browserbase.api.core.http.QueryParams
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
class SessionExecuteParams
private constructor(
    private val id: String?,
    private val xStreamResponse: XStreamResponse?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Unique session identifier */
    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Whether to stream the response via SSE */
    fun xStreamResponse(): Optional<XStreamResponse> = Optional.ofNullable(xStreamResponse)

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentConfig(): AgentConfig = body.agentConfig()

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun executeOptions(): ExecuteOptions = body.executeOptions()

    /**
     * Target frame ID for the agent
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameId(): Optional<String> = body.frameId()

    /**
     * If true, the server captures a cache entry and returns it to the client
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shouldCache(): Optional<Boolean> = body.shouldCache()

    /**
     * Returns the raw JSON value of [agentConfig].
     *
     * Unlike [agentConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agentConfig(): JsonField<AgentConfig> = body._agentConfig()

    /**
     * Returns the raw JSON value of [executeOptions].
     *
     * Unlike [executeOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _executeOptions(): JsonField<ExecuteOptions> = body._executeOptions()

    /**
     * Returns the raw JSON value of [frameId].
     *
     * Unlike [frameId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _frameId(): JsonField<String> = body._frameId()

    /**
     * Returns the raw JSON value of [shouldCache].
     *
     * Unlike [shouldCache], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shouldCache(): JsonField<Boolean> = body._shouldCache()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionExecuteParams].
         *
         * The following fields are required:
         * ```java
         * .agentConfig()
         * .executeOptions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionExecuteParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var xStreamResponse: XStreamResponse? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionExecuteParams: SessionExecuteParams) = apply {
            id = sessionExecuteParams.id
            xStreamResponse = sessionExecuteParams.xStreamResponse
            body = sessionExecuteParams.body.toBuilder()
            additionalHeaders = sessionExecuteParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionExecuteParams.additionalQueryParams.toBuilder()
        }

        /** Unique session identifier */
        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

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
         * - [agentConfig]
         * - [executeOptions]
         * - [frameId]
         * - [shouldCache]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun agentConfig(agentConfig: AgentConfig) = apply { body.agentConfig(agentConfig) }

        /**
         * Sets [Builder.agentConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentConfig] with a well-typed [AgentConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun agentConfig(agentConfig: JsonField<AgentConfig>) = apply {
            body.agentConfig(agentConfig)
        }

        fun executeOptions(executeOptions: ExecuteOptions) = apply {
            body.executeOptions(executeOptions)
        }

        /**
         * Sets [Builder.executeOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executeOptions] with a well-typed [ExecuteOptions] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executeOptions(executeOptions: JsonField<ExecuteOptions>) = apply {
            body.executeOptions(executeOptions)
        }

        /** Target frame ID for the agent */
        fun frameId(frameId: String?) = apply { body.frameId(frameId) }

        /** Alias for calling [Builder.frameId] with `frameId.orElse(null)`. */
        fun frameId(frameId: Optional<String>) = frameId(frameId.getOrNull())

        /**
         * Sets [Builder.frameId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frameId(frameId: JsonField<String>) = apply { body.frameId(frameId) }

        /** If true, the server captures a cache entry and returns it to the client */
        fun shouldCache(shouldCache: Boolean) = apply { body.shouldCache(shouldCache) }

        /**
         * Sets [Builder.shouldCache] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldCache] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shouldCache(shouldCache: JsonField<Boolean>) = apply { body.shouldCache(shouldCache) }

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
         * Returns an immutable instance of [SessionExecuteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agentConfig()
         * .executeOptions()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionExecuteParams =
            SessionExecuteParams(
                id,
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
                xStreamResponse?.let { put("x-stream-response", it.toString()) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val agentConfig: JsonField<AgentConfig>,
        private val executeOptions: JsonField<ExecuteOptions>,
        private val frameId: JsonField<String>,
        private val shouldCache: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agentConfig")
            @ExcludeMissing
            agentConfig: JsonField<AgentConfig> = JsonMissing.of(),
            @JsonProperty("executeOptions")
            @ExcludeMissing
            executeOptions: JsonField<ExecuteOptions> = JsonMissing.of(),
            @JsonProperty("frameId") @ExcludeMissing frameId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shouldCache")
            @ExcludeMissing
            shouldCache: JsonField<Boolean> = JsonMissing.of(),
        ) : this(agentConfig, executeOptions, frameId, shouldCache, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agentConfig(): AgentConfig = agentConfig.getRequired("agentConfig")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun executeOptions(): ExecuteOptions = executeOptions.getRequired("executeOptions")

        /**
         * Target frame ID for the agent
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frameId(): Optional<String> = frameId.getOptional("frameId")

        /**
         * If true, the server captures a cache entry and returns it to the client
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shouldCache(): Optional<Boolean> = shouldCache.getOptional("shouldCache")

        /**
         * Returns the raw JSON value of [agentConfig].
         *
         * Unlike [agentConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agentConfig")
        @ExcludeMissing
        fun _agentConfig(): JsonField<AgentConfig> = agentConfig

        /**
         * Returns the raw JSON value of [executeOptions].
         *
         * Unlike [executeOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("executeOptions")
        @ExcludeMissing
        fun _executeOptions(): JsonField<ExecuteOptions> = executeOptions

        /**
         * Returns the raw JSON value of [frameId].
         *
         * Unlike [frameId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frameId") @ExcludeMissing fun _frameId(): JsonField<String> = frameId

        /**
         * Returns the raw JSON value of [shouldCache].
         *
         * Unlike [shouldCache], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shouldCache")
        @ExcludeMissing
        fun _shouldCache(): JsonField<Boolean> = shouldCache

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
             * .agentConfig()
             * .executeOptions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agentConfig: JsonField<AgentConfig>? = null
            private var executeOptions: JsonField<ExecuteOptions>? = null
            private var frameId: JsonField<String> = JsonMissing.of()
            private var shouldCache: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentConfig = body.agentConfig
                executeOptions = body.executeOptions
                frameId = body.frameId
                shouldCache = body.shouldCache
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun agentConfig(agentConfig: AgentConfig) = agentConfig(JsonField.of(agentConfig))

            /**
             * Sets [Builder.agentConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentConfig] with a well-typed [AgentConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentConfig(agentConfig: JsonField<AgentConfig>) = apply {
                this.agentConfig = agentConfig
            }

            fun executeOptions(executeOptions: ExecuteOptions) =
                executeOptions(JsonField.of(executeOptions))

            /**
             * Sets [Builder.executeOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executeOptions] with a well-typed [ExecuteOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun executeOptions(executeOptions: JsonField<ExecuteOptions>) = apply {
                this.executeOptions = executeOptions
            }

            /** Target frame ID for the agent */
            fun frameId(frameId: String?) = frameId(JsonField.ofNullable(frameId))

            /** Alias for calling [Builder.frameId] with `frameId.orElse(null)`. */
            fun frameId(frameId: Optional<String>) = frameId(frameId.getOrNull())

            /**
             * Sets [Builder.frameId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frameId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frameId(frameId: JsonField<String>) = apply { this.frameId = frameId }

            /** If true, the server captures a cache entry and returns it to the client */
            fun shouldCache(shouldCache: Boolean) = shouldCache(JsonField.of(shouldCache))

            /**
             * Sets [Builder.shouldCache] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shouldCache] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shouldCache(shouldCache: JsonField<Boolean>) = apply {
                this.shouldCache = shouldCache
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
             * .agentConfig()
             * .executeOptions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("agentConfig", agentConfig),
                    checkRequired("executeOptions", executeOptions),
                    frameId,
                    shouldCache,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            agentConfig().validate()
            executeOptions().validate()
            frameId()
            shouldCache()
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
            (agentConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (executeOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (frameId.asKnown().isPresent) 1 else 0) +
                (if (shouldCache.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentConfig == other.agentConfig &&
                executeOptions == other.executeOptions &&
                frameId == other.frameId &&
                shouldCache == other.shouldCache &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agentConfig, executeOptions, frameId, shouldCache, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentConfig=$agentConfig, executeOptions=$executeOptions, frameId=$frameId, shouldCache=$shouldCache, additionalProperties=$additionalProperties}"
    }

    class AgentConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cua: JsonField<Boolean>,
        private val executionModel: JsonField<ExecutionModel>,
        private val mode: JsonField<Mode>,
        private val model: JsonField<Model>,
        private val provider: JsonField<Provider>,
        private val systemPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cua") @ExcludeMissing cua: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("executionModel")
            @ExcludeMissing
            executionModel: JsonField<ExecutionModel> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(cua, executionModel, mode, model, provider, systemPrompt, mutableMapOf())

        /**
         * Deprecated. Use mode: 'cua' instead. If both are provided, mode takes precedence.
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cua(): Optional<Boolean> = cua.getOptional("cua")

        /**
         * Model configuration object or model name string (e.g., 'openai/gpt-5-nano') for tool
         * execution (observe/act calls within agent tools). If not specified, inherits from the
         * main model configuration.
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun executionModel(): Optional<ExecutionModel> =
            executionModel.getOptional("executionModel")

        /**
         * Tool mode for the agent (dom, hybrid, cua). If set, overrides cua.
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun mode(): Optional<Mode> = mode.getOptional("mode")

        /**
         * Model configuration object or model name string (e.g., 'openai/gpt-5-nano')
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<Model> = model.getOptional("model")

        /**
         * AI provider for the agent (legacy, use model: openai/gpt-5-nano instead)
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * Custom system prompt for the agent
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun systemPrompt(): Optional<String> = systemPrompt.getOptional("systemPrompt")

        /**
         * Returns the raw JSON value of [cua].
         *
         * Unlike [cua], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cua") @ExcludeMissing fun _cua(): JsonField<Boolean> = cua

        /**
         * Returns the raw JSON value of [executionModel].
         *
         * Unlike [executionModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("executionModel")
        @ExcludeMissing
        fun _executionModel(): JsonField<ExecutionModel> = executionModel

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [systemPrompt].
         *
         * Unlike [systemPrompt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("systemPrompt")
        @ExcludeMissing
        fun _systemPrompt(): JsonField<String> = systemPrompt

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

            /** Returns a mutable builder for constructing an instance of [AgentConfig]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AgentConfig]. */
        class Builder internal constructor() {

            private var cua: JsonField<Boolean> = JsonMissing.of()
            private var executionModel: JsonField<ExecutionModel> = JsonMissing.of()
            private var mode: JsonField<Mode> = JsonMissing.of()
            private var model: JsonField<Model> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agentConfig: AgentConfig) = apply {
                cua = agentConfig.cua
                executionModel = agentConfig.executionModel
                mode = agentConfig.mode
                model = agentConfig.model
                provider = agentConfig.provider
                systemPrompt = agentConfig.systemPrompt
                additionalProperties = agentConfig.additionalProperties.toMutableMap()
            }

            /** Deprecated. Use mode: 'cua' instead. If both are provided, mode takes precedence. */
            fun cua(cua: Boolean) = cua(JsonField.of(cua))

            /**
             * Sets [Builder.cua] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cua] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cua(cua: JsonField<Boolean>) = apply { this.cua = cua }

            /**
             * Model configuration object or model name string (e.g., 'openai/gpt-5-nano') for tool
             * execution (observe/act calls within agent tools). If not specified, inherits from the
             * main model configuration.
             */
            fun executionModel(executionModel: ExecutionModel) =
                executionModel(JsonField.of(executionModel))

            /**
             * Sets [Builder.executionModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executionModel] with a well-typed [ExecutionModel]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun executionModel(executionModel: JsonField<ExecutionModel>) = apply {
                this.executionModel = executionModel
            }

            /**
             * Alias for calling [executionModel] with `ExecutionModel.ofModelConfig(modelConfig)`.
             */
            fun executionModel(modelConfig: ModelConfig) =
                executionModel(ExecutionModel.ofModelConfig(modelConfig))

            /** Alias for calling [executionModel] with `ExecutionModel.ofString(string)`. */
            fun executionModel(string: String) = executionModel(ExecutionModel.ofString(string))

            /** Tool mode for the agent (dom, hybrid, cua). If set, overrides cua. */
            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            /** Model configuration object or model name string (e.g., 'openai/gpt-5-nano') */
            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

            /** Alias for calling [model] with `Model.ofConfig(config)`. */
            fun model(config: ModelConfig) = model(Model.ofConfig(config))

            /** Alias for calling [model] with `Model.ofString(string)`. */
            fun model(string: String) = model(Model.ofString(string))

            /** AI provider for the agent (legacy, use model: openai/gpt-5-nano instead) */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /** Custom system prompt for the agent */
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
             * Returns an immutable instance of [AgentConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AgentConfig =
                AgentConfig(
                    cua,
                    executionModel,
                    mode,
                    model,
                    provider,
                    systemPrompt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AgentConfig = apply {
            if (validated) {
                return@apply
            }

            cua()
            executionModel().ifPresent { it.validate() }
            mode().ifPresent { it.validate() }
            model().ifPresent { it.validate() }
            provider().ifPresent { it.validate() }
            systemPrompt()
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
            (if (cua.asKnown().isPresent) 1 else 0) +
                (executionModel.asKnown().getOrNull()?.validity() ?: 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (model.asKnown().getOrNull()?.validity() ?: 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0)

        /**
         * Model configuration object or model name string (e.g., 'openai/gpt-5-nano') for tool
         * execution (observe/act calls within agent tools). If not specified, inherits from the
         * main model configuration.
         */
        @JsonDeserialize(using = ExecutionModel.Deserializer::class)
        @JsonSerialize(using = ExecutionModel.Serializer::class)
        class ExecutionModel
        private constructor(
            private val modelConfig: ModelConfig? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun modelConfig(): Optional<ModelConfig> = Optional.ofNullable(modelConfig)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isModelConfig(): Boolean = modelConfig != null

            fun isString(): Boolean = string != null

            fun asModelConfig(): ModelConfig = modelConfig.getOrThrow("modelConfig")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    modelConfig != null -> visitor.visitModelConfig(modelConfig)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): ExecutionModel = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitModelConfig(modelConfig: ModelConfig) {
                            modelConfig.validate()
                        }

                        override fun visitString(string: String) {}
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
                        override fun visitModelConfig(modelConfig: ModelConfig) =
                            modelConfig.validity()

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExecutionModel &&
                    modelConfig == other.modelConfig &&
                    string == other.string
            }

            override fun hashCode(): Int = Objects.hash(modelConfig, string)

            override fun toString(): String =
                when {
                    modelConfig != null -> "ExecutionModel{modelConfig=$modelConfig}"
                    string != null -> "ExecutionModel{string=$string}"
                    _json != null -> "ExecutionModel{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid ExecutionModel")
                }

            companion object {

                @JvmStatic
                fun ofModelConfig(modelConfig: ModelConfig) =
                    ExecutionModel(modelConfig = modelConfig)

                @JvmStatic fun ofString(string: String) = ExecutionModel(string = string)
            }

            /**
             * An interface that defines how to map each variant of [ExecutionModel] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitModelConfig(modelConfig: ModelConfig): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [ExecutionModel] to a value of type [T].
                 *
                 * An instance of [ExecutionModel] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws StagehandInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StagehandInvalidDataException("Unknown ExecutionModel: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<ExecutionModel>(ExecutionModel::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): ExecutionModel {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ModelConfig>())?.let {
                                    ExecutionModel(modelConfig = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    ExecutionModel(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> ExecutionModel(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<ExecutionModel>(ExecutionModel::class) {

                override fun serialize(
                    value: ExecutionModel,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.modelConfig != null -> generator.writeObject(value.modelConfig)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid ExecutionModel")
                    }
                }
            }
        }

        /** Tool mode for the agent (dom, hybrid, cua). If set, overrides cua. */
        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DOM = of("dom")

                @JvmField val HYBRID = of("hybrid")

                @JvmField val CUA = of("cua")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                DOM,
                HYBRID,
                CUA,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DOM,
                HYBRID,
                CUA,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
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
                    DOM -> Value.DOM
                    HYBRID -> Value.HYBRID
                    CUA -> Value.CUA
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
                    DOM -> Known.DOM
                    HYBRID -> Known.HYBRID
                    CUA -> Known.CUA
                    else -> throw StagehandInvalidDataException("Unknown Mode: $value")
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

            fun validate(): Mode = apply {
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

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Model configuration object or model name string (e.g., 'openai/gpt-5-nano') */
        @JsonDeserialize(using = Model.Deserializer::class)
        @JsonSerialize(using = Model.Serializer::class)
        class Model
        private constructor(
            private val config: ModelConfig? = null,
            private val string: String? = null,
            private val _json: JsonValue? = null,
        ) {

            fun config(): Optional<ModelConfig> = Optional.ofNullable(config)

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun isConfig(): Boolean = config != null

            fun isString(): Boolean = string != null

            fun asConfig(): ModelConfig = config.getOrThrow("config")

            fun asString(): String = string.getOrThrow("string")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    config != null -> visitor.visitConfig(config)
                    string != null -> visitor.visitString(string)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Model = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitConfig(config: ModelConfig) {
                            config.validate()
                        }

                        override fun visitString(string: String) {}
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
                        override fun visitConfig(config: ModelConfig) = config.validity()

                        override fun visitString(string: String) = 1

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Model && config == other.config && string == other.string
            }

            override fun hashCode(): Int = Objects.hash(config, string)

            override fun toString(): String =
                when {
                    config != null -> "Model{config=$config}"
                    string != null -> "Model{string=$string}"
                    _json != null -> "Model{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Model")
                }

            companion object {

                @JvmStatic fun ofConfig(config: ModelConfig) = Model(config = config)

                @JvmStatic fun ofString(string: String) = Model(string = string)
            }

            /**
             * An interface that defines how to map each variant of [Model] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitConfig(config: ModelConfig): T

                fun visitString(string: String): T

                /**
                 * Maps an unknown variant of [Model] to a value of type [T].
                 *
                 * An instance of [Model] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws StagehandInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw StagehandInvalidDataException("Unknown Model: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Model>(Model::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Model {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ModelConfig>())?.let {
                                    Model(config = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Model(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Model(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Model>(Model::class) {

                override fun serialize(
                    value: Model,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.config != null -> generator.writeObject(value.config)
                        value.string != null -> generator.writeObject(value.string)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Model")
                    }
                }
            }
        }

        /** AI provider for the agent (legacy, use model: openai/gpt-5-nano instead) */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val OPENAI = of("openai")

                @JvmField val ANTHROPIC = of("anthropic")

                @JvmField val GOOGLE = of("google")

                @JvmField val MICROSOFT = of("microsoft")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                OPENAI,
                ANTHROPIC,
                GOOGLE,
                MICROSOFT,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OPENAI,
                ANTHROPIC,
                GOOGLE,
                MICROSOFT,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    OPENAI -> Value.OPENAI
                    ANTHROPIC -> Value.ANTHROPIC
                    GOOGLE -> Value.GOOGLE
                    MICROSOFT -> Value.MICROSOFT
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
                    OPENAI -> Known.OPENAI
                    ANTHROPIC -> Known.ANTHROPIC
                    GOOGLE -> Known.GOOGLE
                    MICROSOFT -> Known.MICROSOFT
                    else -> throw StagehandInvalidDataException("Unknown Provider: $value")
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

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgentConfig &&
                cua == other.cua &&
                executionModel == other.executionModel &&
                mode == other.mode &&
                model == other.model &&
                provider == other.provider &&
                systemPrompt == other.systemPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cua,
                executionModel,
                mode,
                model,
                provider,
                systemPrompt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentConfig{cua=$cua, executionModel=$executionModel, mode=$mode, model=$model, provider=$provider, systemPrompt=$systemPrompt, additionalProperties=$additionalProperties}"
    }

    class ExecuteOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instruction: JsonField<String>,
        private val highlightCursor: JsonField<Boolean>,
        private val maxSteps: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("instruction")
            @ExcludeMissing
            instruction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("highlightCursor")
            @ExcludeMissing
            highlightCursor: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("maxSteps") @ExcludeMissing maxSteps: JsonField<Double> = JsonMissing.of(),
        ) : this(instruction, highlightCursor, maxSteps, mutableMapOf())

        /**
         * Natural language instruction for the agent
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instruction(): String = instruction.getRequired("instruction")

        /**
         * Whether to visually highlight the cursor during execution
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun highlightCursor(): Optional<Boolean> = highlightCursor.getOptional("highlightCursor")

        /**
         * Maximum number of steps the agent can take
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxSteps(): Optional<Double> = maxSteps.getOptional("maxSteps")

        /**
         * Returns the raw JSON value of [instruction].
         *
         * Unlike [instruction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("instruction")
        @ExcludeMissing
        fun _instruction(): JsonField<String> = instruction

        /**
         * Returns the raw JSON value of [highlightCursor].
         *
         * Unlike [highlightCursor], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("highlightCursor")
        @ExcludeMissing
        fun _highlightCursor(): JsonField<Boolean> = highlightCursor

        /**
         * Returns the raw JSON value of [maxSteps].
         *
         * Unlike [maxSteps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxSteps") @ExcludeMissing fun _maxSteps(): JsonField<Double> = maxSteps

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
             * Returns a mutable builder for constructing an instance of [ExecuteOptions].
             *
             * The following fields are required:
             * ```java
             * .instruction()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExecuteOptions]. */
        class Builder internal constructor() {

            private var instruction: JsonField<String>? = null
            private var highlightCursor: JsonField<Boolean> = JsonMissing.of()
            private var maxSteps: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(executeOptions: ExecuteOptions) = apply {
                instruction = executeOptions.instruction
                highlightCursor = executeOptions.highlightCursor
                maxSteps = executeOptions.maxSteps
                additionalProperties = executeOptions.additionalProperties.toMutableMap()
            }

            /** Natural language instruction for the agent */
            fun instruction(instruction: String) = instruction(JsonField.of(instruction))

            /**
             * Sets [Builder.instruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instruction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instruction(instruction: JsonField<String>) = apply {
                this.instruction = instruction
            }

            /** Whether to visually highlight the cursor during execution */
            fun highlightCursor(highlightCursor: Boolean) =
                highlightCursor(JsonField.of(highlightCursor))

            /**
             * Sets [Builder.highlightCursor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.highlightCursor] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun highlightCursor(highlightCursor: JsonField<Boolean>) = apply {
                this.highlightCursor = highlightCursor
            }

            /** Maximum number of steps the agent can take */
            fun maxSteps(maxSteps: Double) = maxSteps(JsonField.of(maxSteps))

            /**
             * Sets [Builder.maxSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSteps] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSteps(maxSteps: JsonField<Double>) = apply { this.maxSteps = maxSteps }

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
             * Returns an immutable instance of [ExecuteOptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .instruction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExecuteOptions =
                ExecuteOptions(
                    checkRequired("instruction", instruction),
                    highlightCursor,
                    maxSteps,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExecuteOptions = apply {
            if (validated) {
                return@apply
            }

            instruction()
            highlightCursor()
            maxSteps()
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
            (if (instruction.asKnown().isPresent) 1 else 0) +
                (if (highlightCursor.asKnown().isPresent) 1 else 0) +
                (if (maxSteps.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExecuteOptions &&
                instruction == other.instruction &&
                highlightCursor == other.highlightCursor &&
                maxSteps == other.maxSteps &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(instruction, highlightCursor, maxSteps, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExecuteOptions{instruction=$instruction, highlightCursor=$highlightCursor, maxSteps=$maxSteps, additionalProperties=$additionalProperties}"
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

        return other is SessionExecuteParams &&
            id == other.id &&
            xStreamResponse == other.xStreamResponse &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(id, xStreamResponse, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SessionExecuteParams{id=$id, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
