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

/** Runs an autonomous agent that can perform multiple actions to complete a complex task. */
class SessionExecuteAgentParams
private constructor(
    private val sessionId: String?,
    private val xStreamResponse: XStreamResponse?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

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
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frameId(): Optional<String> = body.frameId()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionExecuteAgentParams].
         *
         * The following fields are required:
         * ```java
         * .agentConfig()
         * .executeOptions()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionExecuteAgentParams]. */
    class Builder internal constructor() {

        private var sessionId: String? = null
        private var xStreamResponse: XStreamResponse? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionExecuteAgentParams: SessionExecuteAgentParams) = apply {
            sessionId = sessionExecuteAgentParams.sessionId
            xStreamResponse = sessionExecuteAgentParams.xStreamResponse
            body = sessionExecuteAgentParams.body.toBuilder()
            additionalHeaders = sessionExecuteAgentParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionExecuteAgentParams.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

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

        fun frameId(frameId: String) = apply { body.frameId(frameId) }

        /**
         * Sets [Builder.frameId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frameId(frameId: JsonField<String>) = apply { body.frameId(frameId) }

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
         * Returns an immutable instance of [SessionExecuteAgentParams].
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
        fun build(): SessionExecuteAgentParams =
            SessionExecuteAgentParams(
                sessionId,
                xStreamResponse,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId ?: ""
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
        ) : this(agentConfig, executeOptions, frameId, mutableMapOf())

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
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frameId(): Optional<String> = frameId.getOptional("frameId")

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agentConfig = body.agentConfig
                executeOptions = body.executeOptions
                frameId = body.frameId
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

            fun frameId(frameId: String) = frameId(JsonField.of(frameId))

            /**
             * Sets [Builder.frameId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frameId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frameId(frameId: JsonField<String>) = apply { this.frameId = frameId }

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
                (if (frameId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agentConfig == other.agentConfig &&
                executeOptions == other.executeOptions &&
                frameId == other.frameId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(agentConfig, executeOptions, frameId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agentConfig=$agentConfig, executeOptions=$executeOptions, frameId=$frameId, additionalProperties=$additionalProperties}"
    }

    class AgentConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cua: JsonField<Boolean>,
        private val model: JsonField<Model>,
        private val provider: JsonField<Provider>,
        private val systemPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cua") @ExcludeMissing cua: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(cua, model, provider, systemPrompt, mutableMapOf())

        /**
         * Enable Computer Use Agent mode
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cua(): Optional<Boolean> = cua.getOptional("cua")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun model(): Optional<Model> = model.getOptional("model")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
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
            private var model: JsonField<Model> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agentConfig: AgentConfig) = apply {
                cua = agentConfig.cua
                model = agentConfig.model
                provider = agentConfig.provider
                systemPrompt = agentConfig.systemPrompt
                additionalProperties = agentConfig.additionalProperties.toMutableMap()
            }

            /** Enable Computer Use Agent mode */
            fun cua(cua: Boolean) = cua(JsonField.of(cua))

            /**
             * Sets [Builder.cua] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cua] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cua(cua: JsonField<Boolean>) = apply { this.cua = cua }

            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

            /** Alias for calling [model] with `Model.ofString(string)`. */
            fun model(string: String) = model(Model.ofString(string))

            /** Alias for calling [model] with `Model.ofConfig(config)`. */
            fun model(config: ModelConfig) = model(Model.ofConfig(config))

            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
                AgentConfig(cua, model, provider, systemPrompt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AgentConfig = apply {
            if (validated) {
                return@apply
            }

            cua()
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
                (model.asKnown().getOrNull()?.validity() ?: 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (systemPrompt.asKnown().isPresent) 1 else 0)

        @JsonDeserialize(using = Model.Deserializer::class)
        @JsonSerialize(using = Model.Serializer::class)
        class Model
        private constructor(
            private val string: String? = null,
            private val config: ModelConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun config(): Optional<ModelConfig> = Optional.ofNullable(config)

            fun isString(): Boolean = string != null

            fun isConfig(): Boolean = config != null

            fun asString(): String = string.getOrThrow("string")

            fun asConfig(): ModelConfig = config.getOrThrow("config")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    config != null -> visitor.visitConfig(config)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Model = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitConfig(config: ModelConfig) {
                            config.validate()
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
                        override fun visitString(string: String) = 1

                        override fun visitConfig(config: ModelConfig) = config.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Model && string == other.string && config == other.config
            }

            override fun hashCode(): Int = Objects.hash(string, config)

            override fun toString(): String =
                when {
                    string != null -> "Model{string=$string}"
                    config != null -> "Model{config=$config}"
                    _json != null -> "Model{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Model")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = Model(string = string)

                @JvmStatic fun ofConfig(config: ModelConfig) = Model(config = config)
            }

            /**
             * An interface that defines how to map each variant of [Model] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitConfig(config: ModelConfig): T

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
                        // with all the possible variants (e.g. deserializing from array).
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
                        value.string != null -> generator.writeObject(value.string)
                        value.config != null -> generator.writeObject(value.config)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Model")
                    }
                }
            }
        }

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

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                OPENAI,
                ANTHROPIC,
                GOOGLE,
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
                model == other.model &&
                provider == other.provider &&
                systemPrompt == other.systemPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cua, model, provider, systemPrompt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentConfig{cua=$cua, model=$model, provider=$provider, systemPrompt=$systemPrompt, additionalProperties=$additionalProperties}"
    }

    class ExecuteOptions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val instruction: JsonField<String>,
        private val highlightCursor: JsonField<Boolean>,
        private val maxSteps: JsonField<Long>,
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
            @JsonProperty("maxSteps") @ExcludeMissing maxSteps: JsonField<Long> = JsonMissing.of(),
        ) : this(instruction, highlightCursor, maxSteps, mutableMapOf())

        /**
         * Task for the agent to complete
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instruction(): String = instruction.getRequired("instruction")

        /**
         * Visually highlight the cursor during actions
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
        fun maxSteps(): Optional<Long> = maxSteps.getOptional("maxSteps")

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
        @JsonProperty("maxSteps") @ExcludeMissing fun _maxSteps(): JsonField<Long> = maxSteps

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
            private var maxSteps: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(executeOptions: ExecuteOptions) = apply {
                instruction = executeOptions.instruction
                highlightCursor = executeOptions.highlightCursor
                maxSteps = executeOptions.maxSteps
                additionalProperties = executeOptions.additionalProperties.toMutableMap()
            }

            /** Task for the agent to complete */
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

            /** Visually highlight the cursor during actions */
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
            fun maxSteps(maxSteps: Long) = maxSteps(JsonField.of(maxSteps))

            /**
             * Sets [Builder.maxSteps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSteps] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSteps(maxSteps: JsonField<Long>) = apply { this.maxSteps = maxSteps }

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

        return other is SessionExecuteAgentParams &&
            sessionId == other.sessionId &&
            xStreamResponse == other.xStreamResponse &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(sessionId, xStreamResponse, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SessionExecuteAgentParams{sessionId=$sessionId, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
