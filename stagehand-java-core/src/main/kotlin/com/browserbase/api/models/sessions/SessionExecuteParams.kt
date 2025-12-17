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

/** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
class SessionExecuteParams
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
        private var xLanguage: XLanguage? = null
        private var xSdkVersion: String? = null
        private var xSentAt: OffsetDateTime? = null
        private var xStreamResponse: XStreamResponse? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionExecuteParams: SessionExecuteParams) = apply {
            id = sessionExecuteParams.id
            xLanguage = sessionExecuteParams.xLanguage
            xSdkVersion = sessionExecuteParams.xSdkVersion
            xSentAt = sessionExecuteParams.xSentAt
            xStreamResponse = sessionExecuteParams.xStreamResponse
            body = sessionExecuteParams.body.toBuilder()
            additionalHeaders = sessionExecuteParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionExecuteParams.additionalQueryParams.toBuilder()
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

        /** Target frame ID for the agent */
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
         * Target frame ID for the agent
         *
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

            /** Target frame ID for the agent */
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
        private val model: JsonField<ModelConfig>,
        private val systemPrompt: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cua") @ExcludeMissing cua: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("model") @ExcludeMissing model: JsonField<ModelConfig> = JsonMissing.of(),
            @JsonProperty("systemPrompt")
            @ExcludeMissing
            systemPrompt: JsonField<String> = JsonMissing.of(),
        ) : this(cua, model, systemPrompt, mutableMapOf())

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
        fun model(): Optional<ModelConfig> = model.getOptional("model")

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
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<ModelConfig> = model

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
            private var model: JsonField<ModelConfig> = JsonMissing.of()
            private var systemPrompt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(agentConfig: AgentConfig) = apply {
                cua = agentConfig.cua
                model = agentConfig.model
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

            fun model(model: ModelConfig) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [ModelConfig] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun model(model: JsonField<ModelConfig>) = apply { this.model = model }

            /** Alias for calling [model] with `ModelConfig.ofString(string)`. */
            fun model(string: String) = model(ModelConfig.ofString(string))

            /** Alias for calling [model] with `ModelConfig.ofUnionMember1(unionMember1)`. */
            fun model(unionMember1: ModelConfig.UnionMember1) =
                model(ModelConfig.ofUnionMember1(unionMember1))

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
                AgentConfig(cua, model, systemPrompt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AgentConfig = apply {
            if (validated) {
                return@apply
            }

            cua()
            model().ifPresent { it.validate() }
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
                (if (systemPrompt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgentConfig &&
                cua == other.cua &&
                model == other.model &&
                systemPrompt == other.systemPrompt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cua, model, systemPrompt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AgentConfig{cua=$cua, model=$model, systemPrompt=$systemPrompt, additionalProperties=$additionalProperties}"
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

        return other is SessionExecuteParams &&
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
        "SessionExecuteParams{id=$id, xLanguage=$xLanguage, xSdkVersion=$xSdkVersion, xSentAt=$xSentAt, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
