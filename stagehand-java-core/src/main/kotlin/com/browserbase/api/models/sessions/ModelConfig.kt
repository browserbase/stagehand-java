// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.BaseDeserializer
import com.browserbase.api.core.BaseSerializer
import com.browserbase.api.core.Enum
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.allMaxBy
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.getOrThrow
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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ModelConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val modelName: JsonField<String>,
    private val apiKey: JsonField<String>,
    private val baseUrl: JsonField<String>,
    private val headers: JsonField<Headers>,
    private val provider: JsonField<Provider>,
    private val providerOptions: JsonField<ProviderOptions>,
    private val skipApiKeyFallback: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("modelName") @ExcludeMissing modelName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("providerOptions")
        @ExcludeMissing
        providerOptions: JsonField<ProviderOptions> = JsonMissing.of(),
        @JsonProperty("skipApiKeyFallback")
        @ExcludeMissing
        skipApiKeyFallback: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        modelName,
        apiKey,
        baseUrl,
        headers,
        provider,
        providerOptions,
        skipApiKeyFallback,
        mutableMapOf(),
    )

    /**
     * Model name string with provider prefix (e.g., 'openai/gpt-5-nano')
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modelName(): String = modelName.getRequired("modelName")

    /**
     * API key for the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

    /**
     * Base URL for the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

    /**
     * Custom headers for the model provider
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headers(): Optional<Headers> = headers.getOptional("headers")

    /**
     * AI provider for the model (or provide a baseURL endpoint instead)
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

    /**
     * Provider-specific options passed through to the AI SDK provider constructor. For Bedrock: {
     * region, accessKeyId, secretAccessKey, sessionToken }. For Vertex: { project, location,
     * googleAuthOptions }.
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerOptions(): Optional<ProviderOptions> =
        providerOptions.getOptional("providerOptions")

    /**
     * When true, hosted sessions will not copy x-model-api-key into model.apiKey. Use this when
     * auth is carried through providerOptions instead of an API key.
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun skipApiKeyFallback(): Optional<Boolean> =
        skipApiKeyFallback.getOptional("skipApiKeyFallback")

    /**
     * Returns the raw JSON value of [modelName].
     *
     * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

    /**
     * Returns the raw JSON value of [apiKey].
     *
     * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * Returns the raw JSON value of [baseUrl].
     *
     * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("baseURL") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

    /**
     * Returns the raw JSON value of [headers].
     *
     * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [providerOptions].
     *
     * Unlike [providerOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providerOptions")
    @ExcludeMissing
    fun _providerOptions(): JsonField<ProviderOptions> = providerOptions

    /**
     * Returns the raw JSON value of [skipApiKeyFallback].
     *
     * Unlike [skipApiKeyFallback], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("skipApiKeyFallback")
    @ExcludeMissing
    fun _skipApiKeyFallback(): JsonField<Boolean> = skipApiKeyFallback

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
         * Returns a mutable builder for constructing an instance of [ModelConfig].
         *
         * The following fields are required:
         * ```java
         * .modelName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelConfig]. */
    class Builder internal constructor() {

        private var modelName: JsonField<String>? = null
        private var apiKey: JsonField<String> = JsonMissing.of()
        private var baseUrl: JsonField<String> = JsonMissing.of()
        private var headers: JsonField<Headers> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var providerOptions: JsonField<ProviderOptions> = JsonMissing.of()
        private var skipApiKeyFallback: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelConfig: ModelConfig) = apply {
            modelName = modelConfig.modelName
            apiKey = modelConfig.apiKey
            baseUrl = modelConfig.baseUrl
            headers = modelConfig.headers
            provider = modelConfig.provider
            providerOptions = modelConfig.providerOptions
            skipApiKeyFallback = modelConfig.skipApiKeyFallback
            additionalProperties = modelConfig.additionalProperties.toMutableMap()
        }

        /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
        fun modelName(modelName: String) = modelName(JsonField.of(modelName))

        /**
         * Sets [Builder.modelName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modelName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

        /** API key for the model provider */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** Base URL for the model provider */
        fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

        /** Custom headers for the model provider */
        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /**
         * Sets [Builder.headers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headers] with a well-typed [Headers] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** AI provider for the model (or provide a baseURL endpoint instead) */
        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        /**
         * Provider-specific options passed through to the AI SDK provider constructor. For Bedrock:
         * { region, accessKeyId, secretAccessKey, sessionToken }. For Vertex: { project, location,
         * googleAuthOptions }.
         */
        fun providerOptions(providerOptions: ProviderOptions) =
            providerOptions(JsonField.of(providerOptions))

        /**
         * Sets [Builder.providerOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerOptions] with a well-typed [ProviderOptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun providerOptions(providerOptions: JsonField<ProviderOptions>) = apply {
            this.providerOptions = providerOptions
        }

        /**
         * Alias for calling [providerOptions] with
         * `ProviderOptions.ofBedrockApiKey(bedrockApiKey)`.
         */
        fun providerOptions(bedrockApiKey: ProviderOptions.BedrockApiKeyProviderOptions) =
            providerOptions(ProviderOptions.ofBedrockApiKey(bedrockApiKey))

        /**
         * Alias for calling [providerOptions] with
         * `ProviderOptions.ofBedrockAwsCredentials(bedrockAwsCredentials)`.
         */
        fun providerOptions(
            bedrockAwsCredentials: ProviderOptions.BedrockAwsCredentialsProviderOptions
        ) = providerOptions(ProviderOptions.ofBedrockAwsCredentials(bedrockAwsCredentials))

        /**
         * Alias for calling [providerOptions] with `ProviderOptions.ofGoogleVertex(googleVertex)`.
         */
        fun providerOptions(googleVertex: ProviderOptions.GoogleVertexProviderOptions) =
            providerOptions(ProviderOptions.ofGoogleVertex(googleVertex))

        /**
         * When true, hosted sessions will not copy x-model-api-key into model.apiKey. Use this when
         * auth is carried through providerOptions instead of an API key.
         */
        fun skipApiKeyFallback(skipApiKeyFallback: Boolean) =
            skipApiKeyFallback(JsonField.of(skipApiKeyFallback))

        /**
         * Sets [Builder.skipApiKeyFallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.skipApiKeyFallback] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun skipApiKeyFallback(skipApiKeyFallback: JsonField<Boolean>) = apply {
            this.skipApiKeyFallback = skipApiKeyFallback
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
         * Returns an immutable instance of [ModelConfig].
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
        fun build(): ModelConfig =
            ModelConfig(
                checkRequired("modelName", modelName),
                apiKey,
                baseUrl,
                headers,
                provider,
                providerOptions,
                skipApiKeyFallback,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        modelName()
        apiKey()
        baseUrl()
        headers().ifPresent { it.validate() }
        provider().ifPresent { it.validate() }
        providerOptions().ifPresent { it.validate() }
        skipApiKeyFallback()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (modelName.asKnown().isPresent) 1 else 0) +
            (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (baseUrl.asKnown().isPresent) 1 else 0) +
            (headers.asKnown().getOrNull()?.validity() ?: 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
            (providerOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (skipApiKeyFallback.asKnown().isPresent) 1 else 0)

    /** Custom headers for the model provider */
    class Headers
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

            /** Returns a mutable builder for constructing an instance of [Headers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Headers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Headers = apply {
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

            return other is Headers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    /** AI provider for the model (or provide a baseURL endpoint instead) */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPENAI = of("openai")

            @JvmField val ANTHROPIC = of("anthropic")

            @JvmField val GOOGLE = of("google")

            @JvmField val MICROSOFT = of("microsoft")

            @JvmField val BEDROCK = of("bedrock")

            @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            OPENAI,
            ANTHROPIC,
            GOOGLE,
            MICROSOFT,
            BEDROCK,
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI,
            ANTHROPIC,
            GOOGLE,
            MICROSOFT,
            BEDROCK,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                OPENAI -> Value.OPENAI
                ANTHROPIC -> Value.ANTHROPIC
                GOOGLE -> Value.GOOGLE
                MICROSOFT -> Value.MICROSOFT
                BEDROCK -> Value.BEDROCK
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
                OPENAI -> Known.OPENAI
                ANTHROPIC -> Known.ANTHROPIC
                GOOGLE -> Known.GOOGLE
                MICROSOFT -> Known.MICROSOFT
                BEDROCK -> Known.BEDROCK
                else -> throw StagehandInvalidDataException("Unknown Provider: $value")
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

    /**
     * Provider-specific options passed through to the AI SDK provider constructor. For Bedrock: {
     * region, accessKeyId, secretAccessKey, sessionToken }. For Vertex: { project, location,
     * googleAuthOptions }.
     */
    @JsonDeserialize(using = ProviderOptions.Deserializer::class)
    @JsonSerialize(using = ProviderOptions.Serializer::class)
    class ProviderOptions
    private constructor(
        private val bedrockApiKey: BedrockApiKeyProviderOptions? = null,
        private val bedrockAwsCredentials: BedrockAwsCredentialsProviderOptions? = null,
        private val googleVertex: GoogleVertexProviderOptions? = null,
        private val _json: JsonValue? = null,
    ) {

        fun bedrockApiKey(): Optional<BedrockApiKeyProviderOptions> =
            Optional.ofNullable(bedrockApiKey)

        fun bedrockAwsCredentials(): Optional<BedrockAwsCredentialsProviderOptions> =
            Optional.ofNullable(bedrockAwsCredentials)

        fun googleVertex(): Optional<GoogleVertexProviderOptions> =
            Optional.ofNullable(googleVertex)

        fun isBedrockApiKey(): Boolean = bedrockApiKey != null

        fun isBedrockAwsCredentials(): Boolean = bedrockAwsCredentials != null

        fun isGoogleVertex(): Boolean = googleVertex != null

        fun asBedrockApiKey(): BedrockApiKeyProviderOptions =
            bedrockApiKey.getOrThrow("bedrockApiKey")

        fun asBedrockAwsCredentials(): BedrockAwsCredentialsProviderOptions =
            bedrockAwsCredentials.getOrThrow("bedrockAwsCredentials")

        fun asGoogleVertex(): GoogleVertexProviderOptions = googleVertex.getOrThrow("googleVertex")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                bedrockApiKey != null -> visitor.visitBedrockApiKey(bedrockApiKey)
                bedrockAwsCredentials != null ->
                    visitor.visitBedrockAwsCredentials(bedrockAwsCredentials)
                googleVertex != null -> visitor.visitGoogleVertex(googleVertex)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ProviderOptions = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitBedrockApiKey(bedrockApiKey: BedrockApiKeyProviderOptions) {
                        bedrockApiKey.validate()
                    }

                    override fun visitBedrockAwsCredentials(
                        bedrockAwsCredentials: BedrockAwsCredentialsProviderOptions
                    ) {
                        bedrockAwsCredentials.validate()
                    }

                    override fun visitGoogleVertex(googleVertex: GoogleVertexProviderOptions) {
                        googleVertex.validate()
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
                    override fun visitBedrockApiKey(bedrockApiKey: BedrockApiKeyProviderOptions) =
                        bedrockApiKey.validity()

                    override fun visitBedrockAwsCredentials(
                        bedrockAwsCredentials: BedrockAwsCredentialsProviderOptions
                    ) = bedrockAwsCredentials.validity()

                    override fun visitGoogleVertex(googleVertex: GoogleVertexProviderOptions) =
                        googleVertex.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProviderOptions &&
                bedrockApiKey == other.bedrockApiKey &&
                bedrockAwsCredentials == other.bedrockAwsCredentials &&
                googleVertex == other.googleVertex
        }

        override fun hashCode(): Int =
            Objects.hash(bedrockApiKey, bedrockAwsCredentials, googleVertex)

        override fun toString(): String =
            when {
                bedrockApiKey != null -> "ProviderOptions{bedrockApiKey=$bedrockApiKey}"
                bedrockAwsCredentials != null ->
                    "ProviderOptions{bedrockAwsCredentials=$bedrockAwsCredentials}"
                googleVertex != null -> "ProviderOptions{googleVertex=$googleVertex}"
                _json != null -> "ProviderOptions{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ProviderOptions")
            }

        companion object {

            @JvmStatic
            fun ofBedrockApiKey(bedrockApiKey: BedrockApiKeyProviderOptions) =
                ProviderOptions(bedrockApiKey = bedrockApiKey)

            @JvmStatic
            fun ofBedrockAwsCredentials(
                bedrockAwsCredentials: BedrockAwsCredentialsProviderOptions
            ) = ProviderOptions(bedrockAwsCredentials = bedrockAwsCredentials)

            @JvmStatic
            fun ofGoogleVertex(googleVertex: GoogleVertexProviderOptions) =
                ProviderOptions(googleVertex = googleVertex)
        }

        /**
         * An interface that defines how to map each variant of [ProviderOptions] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitBedrockApiKey(bedrockApiKey: BedrockApiKeyProviderOptions): T

            fun visitBedrockAwsCredentials(
                bedrockAwsCredentials: BedrockAwsCredentialsProviderOptions
            ): T

            fun visitGoogleVertex(googleVertex: GoogleVertexProviderOptions): T

            /**
             * Maps an unknown variant of [ProviderOptions] to a value of type [T].
             *
             * An instance of [ProviderOptions] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws StagehandInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw StagehandInvalidDataException("Unknown ProviderOptions: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ProviderOptions>(ProviderOptions::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ProviderOptions {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<BedrockApiKeyProviderOptions>())
                                ?.let { ProviderOptions(bedrockApiKey = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<BedrockAwsCredentialsProviderOptions>(),
                                )
                                ?.let { ProviderOptions(bedrockAwsCredentials = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<GoogleVertexProviderOptions>())
                                ?.let { ProviderOptions(googleVertex = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ProviderOptions(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ProviderOptions>(ProviderOptions::class) {

            override fun serialize(
                value: ProviderOptions,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.bedrockApiKey != null -> generator.writeObject(value.bedrockApiKey)
                    value.bedrockAwsCredentials != null ->
                        generator.writeObject(value.bedrockAwsCredentials)
                    value.googleVertex != null -> generator.writeObject(value.googleVertex)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ProviderOptions")
                }
            }
        }

        class BedrockApiKeyProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val region: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of()
            ) : this(region, mutableMapOf())

            /**
             * AWS region for Amazon Bedrock
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): String = region.getRequired("region")

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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
                 * [BedrockApiKeyProviderOptions].
                 *
                 * The following fields are required:
                 * ```java
                 * .region()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BedrockApiKeyProviderOptions]. */
            class Builder internal constructor() {

                private var region: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(bedrockApiKeyProviderOptions: BedrockApiKeyProviderOptions) =
                    apply {
                        region = bedrockApiKeyProviderOptions.region
                        additionalProperties =
                            bedrockApiKeyProviderOptions.additionalProperties.toMutableMap()
                    }

                /** AWS region for Amazon Bedrock */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

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
                 * Returns an immutable instance of [BedrockApiKeyProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .region()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BedrockApiKeyProviderOptions =
                    BedrockApiKeyProviderOptions(
                        checkRequired("region", region),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BedrockApiKeyProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                region()
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
            @JvmSynthetic internal fun validity(): Int = (if (region.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BedrockApiKeyProviderOptions &&
                    region == other.region &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(region, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BedrockApiKeyProviderOptions{region=$region, additionalProperties=$additionalProperties}"
        }

        class BedrockAwsCredentialsProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accessKeyId: JsonField<String>,
            private val region: JsonField<String>,
            private val secretAccessKey: JsonField<String>,
            private val sessionToken: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accessKeyId")
                @ExcludeMissing
                accessKeyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("secretAccessKey")
                @ExcludeMissing
                secretAccessKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sessionToken")
                @ExcludeMissing
                sessionToken: JsonField<String> = JsonMissing.of(),
            ) : this(accessKeyId, region, secretAccessKey, sessionToken, mutableMapOf())

            /**
             * AWS access key ID for Bedrock
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accessKeyId(): String = accessKeyId.getRequired("accessKeyId")

            /**
             * AWS region for Amazon Bedrock
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun region(): String = region.getRequired("region")

            /**
             * AWS secret access key for Bedrock
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun secretAccessKey(): String = secretAccessKey.getRequired("secretAccessKey")

            /**
             * Optional AWS session token for temporary credentials
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sessionToken(): Optional<String> = sessionToken.getOptional("sessionToken")

            /**
             * Returns the raw JSON value of [accessKeyId].
             *
             * Unlike [accessKeyId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accessKeyId")
            @ExcludeMissing
            fun _accessKeyId(): JsonField<String> = accessKeyId

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [secretAccessKey].
             *
             * Unlike [secretAccessKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("secretAccessKey")
            @ExcludeMissing
            fun _secretAccessKey(): JsonField<String> = secretAccessKey

            /**
             * Returns the raw JSON value of [sessionToken].
             *
             * Unlike [sessionToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sessionToken")
            @ExcludeMissing
            fun _sessionToken(): JsonField<String> = sessionToken

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
                 * [BedrockAwsCredentialsProviderOptions].
                 *
                 * The following fields are required:
                 * ```java
                 * .accessKeyId()
                 * .region()
                 * .secretAccessKey()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BedrockAwsCredentialsProviderOptions]. */
            class Builder internal constructor() {

                private var accessKeyId: JsonField<String>? = null
                private var region: JsonField<String>? = null
                private var secretAccessKey: JsonField<String>? = null
                private var sessionToken: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    bedrockAwsCredentialsProviderOptions: BedrockAwsCredentialsProviderOptions
                ) = apply {
                    accessKeyId = bedrockAwsCredentialsProviderOptions.accessKeyId
                    region = bedrockAwsCredentialsProviderOptions.region
                    secretAccessKey = bedrockAwsCredentialsProviderOptions.secretAccessKey
                    sessionToken = bedrockAwsCredentialsProviderOptions.sessionToken
                    additionalProperties =
                        bedrockAwsCredentialsProviderOptions.additionalProperties.toMutableMap()
                }

                /** AWS access key ID for Bedrock */
                fun accessKeyId(accessKeyId: String) = accessKeyId(JsonField.of(accessKeyId))

                /**
                 * Sets [Builder.accessKeyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accessKeyId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accessKeyId(accessKeyId: JsonField<String>) = apply {
                    this.accessKeyId = accessKeyId
                }

                /** AWS region for Amazon Bedrock */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /** AWS secret access key for Bedrock */
                fun secretAccessKey(secretAccessKey: String) =
                    secretAccessKey(JsonField.of(secretAccessKey))

                /**
                 * Sets [Builder.secretAccessKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secretAccessKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun secretAccessKey(secretAccessKey: JsonField<String>) = apply {
                    this.secretAccessKey = secretAccessKey
                }

                /** Optional AWS session token for temporary credentials */
                fun sessionToken(sessionToken: String) = sessionToken(JsonField.of(sessionToken))

                /**
                 * Sets [Builder.sessionToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sessionToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sessionToken(sessionToken: JsonField<String>) = apply {
                    this.sessionToken = sessionToken
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
                 * Returns an immutable instance of [BedrockAwsCredentialsProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accessKeyId()
                 * .region()
                 * .secretAccessKey()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BedrockAwsCredentialsProviderOptions =
                    BedrockAwsCredentialsProviderOptions(
                        checkRequired("accessKeyId", accessKeyId),
                        checkRequired("region", region),
                        checkRequired("secretAccessKey", secretAccessKey),
                        sessionToken,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BedrockAwsCredentialsProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                accessKeyId()
                region()
                secretAccessKey()
                sessionToken()
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
                (if (accessKeyId.asKnown().isPresent) 1 else 0) +
                    (if (region.asKnown().isPresent) 1 else 0) +
                    (if (secretAccessKey.asKnown().isPresent) 1 else 0) +
                    (if (sessionToken.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BedrockAwsCredentialsProviderOptions &&
                    accessKeyId == other.accessKeyId &&
                    region == other.region &&
                    secretAccessKey == other.secretAccessKey &&
                    sessionToken == other.sessionToken &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accessKeyId,
                    region,
                    secretAccessKey,
                    sessionToken,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BedrockAwsCredentialsProviderOptions{accessKeyId=$accessKeyId, region=$region, secretAccessKey=$secretAccessKey, sessionToken=$sessionToken, additionalProperties=$additionalProperties}"
        }

        class GoogleVertexProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val googleAuthOptions: JsonField<GoogleAuthOptions>,
            private val headers: JsonField<Headers>,
            private val location: JsonField<String>,
            private val project: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("googleAuthOptions")
                @ExcludeMissing
                googleAuthOptions: JsonField<GoogleAuthOptions> = JsonMissing.of(),
                @JsonProperty("headers")
                @ExcludeMissing
                headers: JsonField<Headers> = JsonMissing.of(),
                @JsonProperty("location")
                @ExcludeMissing
                location: JsonField<String> = JsonMissing.of(),
                @JsonProperty("project")
                @ExcludeMissing
                project: JsonField<String> = JsonMissing.of(),
            ) : this(googleAuthOptions, headers, location, project, mutableMapOf())

            /**
             * Optional Google auth options for Vertex AI
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun googleAuthOptions(): Optional<GoogleAuthOptions> =
                googleAuthOptions.getOptional("googleAuthOptions")

            /**
             * Custom headers for Vertex AI requests
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun headers(): Optional<Headers> = headers.getOptional("headers")

            /**
             * Google Cloud location for Vertex AI
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun location(): Optional<String> = location.getOptional("location")

            /**
             * Google Cloud project ID for Vertex AI
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun project(): Optional<String> = project.getOptional("project")

            /**
             * Returns the raw JSON value of [googleAuthOptions].
             *
             * Unlike [googleAuthOptions], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("googleAuthOptions")
            @ExcludeMissing
            fun _googleAuthOptions(): JsonField<GoogleAuthOptions> = googleAuthOptions

            /**
             * Returns the raw JSON value of [headers].
             *
             * Unlike [headers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

            /**
             * Returns the raw JSON value of [location].
             *
             * Unlike [location], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("location") @ExcludeMissing fun _location(): JsonField<String> = location

            /**
             * Returns the raw JSON value of [project].
             *
             * Unlike [project], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<String> = project

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
                 * [GoogleVertexProviderOptions].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GoogleVertexProviderOptions]. */
            class Builder internal constructor() {

                private var googleAuthOptions: JsonField<GoogleAuthOptions> = JsonMissing.of()
                private var headers: JsonField<Headers> = JsonMissing.of()
                private var location: JsonField<String> = JsonMissing.of()
                private var project: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(googleVertexProviderOptions: GoogleVertexProviderOptions) =
                    apply {
                        googleAuthOptions = googleVertexProviderOptions.googleAuthOptions
                        headers = googleVertexProviderOptions.headers
                        location = googleVertexProviderOptions.location
                        project = googleVertexProviderOptions.project
                        additionalProperties =
                            googleVertexProviderOptions.additionalProperties.toMutableMap()
                    }

                /** Optional Google auth options for Vertex AI */
                fun googleAuthOptions(googleAuthOptions: GoogleAuthOptions) =
                    googleAuthOptions(JsonField.of(googleAuthOptions))

                /**
                 * Sets [Builder.googleAuthOptions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.googleAuthOptions] with a well-typed
                 * [GoogleAuthOptions] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun googleAuthOptions(googleAuthOptions: JsonField<GoogleAuthOptions>) = apply {
                    this.googleAuthOptions = googleAuthOptions
                }

                /** Custom headers for Vertex AI requests */
                fun headers(headers: Headers) = headers(JsonField.of(headers))

                /**
                 * Sets [Builder.headers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.headers] with a well-typed [Headers] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

                /** Google Cloud location for Vertex AI */
                fun location(location: String) = location(JsonField.of(location))

                /**
                 * Sets [Builder.location] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.location] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun location(location: JsonField<String>) = apply { this.location = location }

                /** Google Cloud project ID for Vertex AI */
                fun project(project: String) = project(JsonField.of(project))

                /**
                 * Sets [Builder.project] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.project] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun project(project: JsonField<String>) = apply { this.project = project }

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
                 * Returns an immutable instance of [GoogleVertexProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GoogleVertexProviderOptions =
                    GoogleVertexProviderOptions(
                        googleAuthOptions,
                        headers,
                        location,
                        project,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GoogleVertexProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                googleAuthOptions().ifPresent { it.validate() }
                headers().ifPresent { it.validate() }
                location()
                project()
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
                (googleAuthOptions.asKnown().getOrNull()?.validity() ?: 0) +
                    (headers.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (location.asKnown().isPresent) 1 else 0) +
                    (if (project.asKnown().isPresent) 1 else 0)

            /** Optional Google auth options for Vertex AI */
            class GoogleAuthOptions
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val credentials: JsonField<Credentials>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("credentials")
                    @ExcludeMissing
                    credentials: JsonField<Credentials> = JsonMissing.of()
                ) : this(credentials, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun credentials(): Optional<Credentials> = credentials.getOptional("credentials")

                /**
                 * Returns the raw JSON value of [credentials].
                 *
                 * Unlike [credentials], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("credentials")
                @ExcludeMissing
                fun _credentials(): JsonField<Credentials> = credentials

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
                     * [GoogleAuthOptions].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GoogleAuthOptions]. */
                class Builder internal constructor() {

                    private var credentials: JsonField<Credentials> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(googleAuthOptions: GoogleAuthOptions) = apply {
                        credentials = googleAuthOptions.credentials
                        additionalProperties = googleAuthOptions.additionalProperties.toMutableMap()
                    }

                    fun credentials(credentials: Credentials) =
                        credentials(JsonField.of(credentials))

                    /**
                     * Sets [Builder.credentials] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.credentials] with a well-typed [Credentials]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun credentials(credentials: JsonField<Credentials>) = apply {
                        this.credentials = credentials
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
                     * Returns an immutable instance of [GoogleAuthOptions].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): GoogleAuthOptions =
                        GoogleAuthOptions(credentials, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): GoogleAuthOptions = apply {
                    if (validated) {
                        return@apply
                    }

                    credentials().ifPresent { it.validate() }
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
                internal fun validity(): Int = (credentials.asKnown().getOrNull()?.validity() ?: 0)

                class Credentials
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val authProviderX509CertUrl: JsonField<String>,
                    private val authUri: JsonField<String>,
                    private val clientEmail: JsonField<String>,
                    private val clientId: JsonField<String>,
                    private val clientX509CertUrl: JsonField<String>,
                    private val privateKey: JsonField<String>,
                    private val privateKeyId: JsonField<String>,
                    private val projectId: JsonField<String>,
                    private val tokenUri: JsonField<String>,
                    private val type: JsonField<String>,
                    private val universeDomain: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("auth_provider_x509_cert_url")
                        @ExcludeMissing
                        authProviderX509CertUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("auth_uri")
                        @ExcludeMissing
                        authUri: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("client_email")
                        @ExcludeMissing
                        clientEmail: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("client_id")
                        @ExcludeMissing
                        clientId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("client_x509_cert_url")
                        @ExcludeMissing
                        clientX509CertUrl: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("private_key")
                        @ExcludeMissing
                        privateKey: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("private_key_id")
                        @ExcludeMissing
                        privateKeyId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("project_id")
                        @ExcludeMissing
                        projectId: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("token_uri")
                        @ExcludeMissing
                        tokenUri: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("type")
                        @ExcludeMissing
                        type: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("universe_domain")
                        @ExcludeMissing
                        universeDomain: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        authProviderX509CertUrl,
                        authUri,
                        clientEmail,
                        clientId,
                        clientX509CertUrl,
                        privateKey,
                        privateKeyId,
                        projectId,
                        tokenUri,
                        type,
                        universeDomain,
                        mutableMapOf(),
                    )

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun authProviderX509CertUrl(): Optional<String> =
                        authProviderX509CertUrl.getOptional("auth_provider_x509_cert_url")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun authUri(): Optional<String> = authUri.getOptional("auth_uri")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun clientEmail(): Optional<String> = clientEmail.getOptional("client_email")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun clientId(): Optional<String> = clientId.getOptional("client_id")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun clientX509CertUrl(): Optional<String> =
                        clientX509CertUrl.getOptional("client_x509_cert_url")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun privateKey(): Optional<String> = privateKey.getOptional("private_key")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun privateKeyId(): Optional<String> =
                        privateKeyId.getOptional("private_key_id")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun projectId(): Optional<String> = projectId.getOptional("project_id")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun tokenUri(): Optional<String> = tokenUri.getOptional("token_uri")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun type(): Optional<String> = type.getOptional("type")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun universeDomain(): Optional<String> =
                        universeDomain.getOptional("universe_domain")

                    /**
                     * Returns the raw JSON value of [authProviderX509CertUrl].
                     *
                     * Unlike [authProviderX509CertUrl], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("auth_provider_x509_cert_url")
                    @ExcludeMissing
                    fun _authProviderX509CertUrl(): JsonField<String> = authProviderX509CertUrl

                    /**
                     * Returns the raw JSON value of [authUri].
                     *
                     * Unlike [authUri], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("auth_uri")
                    @ExcludeMissing
                    fun _authUri(): JsonField<String> = authUri

                    /**
                     * Returns the raw JSON value of [clientEmail].
                     *
                     * Unlike [clientEmail], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("client_email")
                    @ExcludeMissing
                    fun _clientEmail(): JsonField<String> = clientEmail

                    /**
                     * Returns the raw JSON value of [clientId].
                     *
                     * Unlike [clientId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("client_id")
                    @ExcludeMissing
                    fun _clientId(): JsonField<String> = clientId

                    /**
                     * Returns the raw JSON value of [clientX509CertUrl].
                     *
                     * Unlike [clientX509CertUrl], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("client_x509_cert_url")
                    @ExcludeMissing
                    fun _clientX509CertUrl(): JsonField<String> = clientX509CertUrl

                    /**
                     * Returns the raw JSON value of [privateKey].
                     *
                     * Unlike [privateKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("private_key")
                    @ExcludeMissing
                    fun _privateKey(): JsonField<String> = privateKey

                    /**
                     * Returns the raw JSON value of [privateKeyId].
                     *
                     * Unlike [privateKeyId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("private_key_id")
                    @ExcludeMissing
                    fun _privateKeyId(): JsonField<String> = privateKeyId

                    /**
                     * Returns the raw JSON value of [projectId].
                     *
                     * Unlike [projectId], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("project_id")
                    @ExcludeMissing
                    fun _projectId(): JsonField<String> = projectId

                    /**
                     * Returns the raw JSON value of [tokenUri].
                     *
                     * Unlike [tokenUri], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("token_uri")
                    @ExcludeMissing
                    fun _tokenUri(): JsonField<String> = tokenUri

                    /**
                     * Returns the raw JSON value of [type].
                     *
                     * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                    /**
                     * Returns the raw JSON value of [universeDomain].
                     *
                     * Unlike [universeDomain], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("universe_domain")
                    @ExcludeMissing
                    fun _universeDomain(): JsonField<String> = universeDomain

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
                         * Returns a mutable builder for constructing an instance of [Credentials].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Credentials]. */
                    class Builder internal constructor() {

                        private var authProviderX509CertUrl: JsonField<String> = JsonMissing.of()
                        private var authUri: JsonField<String> = JsonMissing.of()
                        private var clientEmail: JsonField<String> = JsonMissing.of()
                        private var clientId: JsonField<String> = JsonMissing.of()
                        private var clientX509CertUrl: JsonField<String> = JsonMissing.of()
                        private var privateKey: JsonField<String> = JsonMissing.of()
                        private var privateKeyId: JsonField<String> = JsonMissing.of()
                        private var projectId: JsonField<String> = JsonMissing.of()
                        private var tokenUri: JsonField<String> = JsonMissing.of()
                        private var type: JsonField<String> = JsonMissing.of()
                        private var universeDomain: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(credentials: Credentials) = apply {
                            authProviderX509CertUrl = credentials.authProviderX509CertUrl
                            authUri = credentials.authUri
                            clientEmail = credentials.clientEmail
                            clientId = credentials.clientId
                            clientX509CertUrl = credentials.clientX509CertUrl
                            privateKey = credentials.privateKey
                            privateKeyId = credentials.privateKeyId
                            projectId = credentials.projectId
                            tokenUri = credentials.tokenUri
                            type = credentials.type
                            universeDomain = credentials.universeDomain
                            additionalProperties = credentials.additionalProperties.toMutableMap()
                        }

                        fun authProviderX509CertUrl(authProviderX509CertUrl: String) =
                            authProviderX509CertUrl(JsonField.of(authProviderX509CertUrl))

                        /**
                         * Sets [Builder.authProviderX509CertUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.authProviderX509CertUrl] with a
                         * well-typed [String] value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun authProviderX509CertUrl(authProviderX509CertUrl: JsonField<String>) =
                            apply {
                                this.authProviderX509CertUrl = authProviderX509CertUrl
                            }

                        fun authUri(authUri: String) = authUri(JsonField.of(authUri))

                        /**
                         * Sets [Builder.authUri] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.authUri] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun authUri(authUri: JsonField<String>) = apply { this.authUri = authUri }

                        fun clientEmail(clientEmail: String) =
                            clientEmail(JsonField.of(clientEmail))

                        /**
                         * Sets [Builder.clientEmail] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.clientEmail] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun clientEmail(clientEmail: JsonField<String>) = apply {
                            this.clientEmail = clientEmail
                        }

                        fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                        /**
                         * Sets [Builder.clientId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.clientId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun clientId(clientId: JsonField<String>) = apply {
                            this.clientId = clientId
                        }

                        fun clientX509CertUrl(clientX509CertUrl: String) =
                            clientX509CertUrl(JsonField.of(clientX509CertUrl))

                        /**
                         * Sets [Builder.clientX509CertUrl] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.clientX509CertUrl] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun clientX509CertUrl(clientX509CertUrl: JsonField<String>) = apply {
                            this.clientX509CertUrl = clientX509CertUrl
                        }

                        fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

                        /**
                         * Sets [Builder.privateKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.privateKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun privateKey(privateKey: JsonField<String>) = apply {
                            this.privateKey = privateKey
                        }

                        fun privateKeyId(privateKeyId: String) =
                            privateKeyId(JsonField.of(privateKeyId))

                        /**
                         * Sets [Builder.privateKeyId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.privateKeyId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun privateKeyId(privateKeyId: JsonField<String>) = apply {
                            this.privateKeyId = privateKeyId
                        }

                        fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                        /**
                         * Sets [Builder.projectId] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.projectId] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun projectId(projectId: JsonField<String>) = apply {
                            this.projectId = projectId
                        }

                        fun tokenUri(tokenUri: String) = tokenUri(JsonField.of(tokenUri))

                        /**
                         * Sets [Builder.tokenUri] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tokenUri] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tokenUri(tokenUri: JsonField<String>) = apply {
                            this.tokenUri = tokenUri
                        }

                        fun type(type: String) = type(JsonField.of(type))

                        /**
                         * Sets [Builder.type] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.type] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun type(type: JsonField<String>) = apply { this.type = type }

                        fun universeDomain(universeDomain: String) =
                            universeDomain(JsonField.of(universeDomain))

                        /**
                         * Sets [Builder.universeDomain] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.universeDomain] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun universeDomain(universeDomain: JsonField<String>) = apply {
                            this.universeDomain = universeDomain
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
                         * Returns an immutable instance of [Credentials].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Credentials =
                            Credentials(
                                authProviderX509CertUrl,
                                authUri,
                                clientEmail,
                                clientId,
                                clientX509CertUrl,
                                privateKey,
                                privateKeyId,
                                projectId,
                                tokenUri,
                                type,
                                universeDomain,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Credentials = apply {
                        if (validated) {
                            return@apply
                        }

                        authProviderX509CertUrl()
                        authUri()
                        clientEmail()
                        clientId()
                        clientX509CertUrl()
                        privateKey()
                        privateKeyId()
                        projectId()
                        tokenUri()
                        type()
                        universeDomain()
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
                        (if (authProviderX509CertUrl.asKnown().isPresent) 1 else 0) +
                            (if (authUri.asKnown().isPresent) 1 else 0) +
                            (if (clientEmail.asKnown().isPresent) 1 else 0) +
                            (if (clientId.asKnown().isPresent) 1 else 0) +
                            (if (clientX509CertUrl.asKnown().isPresent) 1 else 0) +
                            (if (privateKey.asKnown().isPresent) 1 else 0) +
                            (if (privateKeyId.asKnown().isPresent) 1 else 0) +
                            (if (projectId.asKnown().isPresent) 1 else 0) +
                            (if (tokenUri.asKnown().isPresent) 1 else 0) +
                            (if (type.asKnown().isPresent) 1 else 0) +
                            (if (universeDomain.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Credentials &&
                            authProviderX509CertUrl == other.authProviderX509CertUrl &&
                            authUri == other.authUri &&
                            clientEmail == other.clientEmail &&
                            clientId == other.clientId &&
                            clientX509CertUrl == other.clientX509CertUrl &&
                            privateKey == other.privateKey &&
                            privateKeyId == other.privateKeyId &&
                            projectId == other.projectId &&
                            tokenUri == other.tokenUri &&
                            type == other.type &&
                            universeDomain == other.universeDomain &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            authProviderX509CertUrl,
                            authUri,
                            clientEmail,
                            clientId,
                            clientX509CertUrl,
                            privateKey,
                            privateKeyId,
                            projectId,
                            tokenUri,
                            type,
                            universeDomain,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Credentials{authProviderX509CertUrl=$authProviderX509CertUrl, authUri=$authUri, clientEmail=$clientEmail, clientId=$clientId, clientX509CertUrl=$clientX509CertUrl, privateKey=$privateKey, privateKeyId=$privateKeyId, projectId=$projectId, tokenUri=$tokenUri, type=$type, universeDomain=$universeDomain, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GoogleAuthOptions &&
                        credentials == other.credentials &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(credentials, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GoogleAuthOptions{credentials=$credentials, additionalProperties=$additionalProperties}"
            }

            /** Custom headers for Vertex AI requests */
            class Headers
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

                    /** Returns a mutable builder for constructing an instance of [Headers]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Headers]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(headers: Headers) = apply {
                        additionalProperties = headers.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Headers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Headers = Headers(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Headers = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Headers && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Headers{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GoogleVertexProviderOptions &&
                    googleAuthOptions == other.googleAuthOptions &&
                    headers == other.headers &&
                    location == other.location &&
                    project == other.project &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(googleAuthOptions, headers, location, project, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GoogleVertexProviderOptions{googleAuthOptions=$googleAuthOptions, headers=$headers, location=$location, project=$project, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            modelName == other.modelName &&
            apiKey == other.apiKey &&
            baseUrl == other.baseUrl &&
            headers == other.headers &&
            provider == other.provider &&
            providerOptions == other.providerOptions &&
            skipApiKeyFallback == other.skipApiKeyFallback &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            modelName,
            apiKey,
            baseUrl,
            headers,
            provider,
            providerOptions,
            skipApiKeyFallback,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelConfig{modelName=$modelName, apiKey=$apiKey, baseUrl=$baseUrl, headers=$headers, provider=$provider, providerOptions=$providerOptions, skipApiKeyFallback=$skipApiKeyFallback, additionalProperties=$additionalProperties}"
}
