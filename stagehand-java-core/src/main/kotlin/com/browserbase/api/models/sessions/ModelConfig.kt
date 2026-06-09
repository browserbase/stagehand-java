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

@JsonDeserialize(using = ModelConfig.Deserializer::class)
@JsonSerialize(using = ModelConfig.Serializer::class)
class ModelConfig
private constructor(
    private val vertexModelConfigObject: VertexModelConfigObject? = null,
    private val azureEntraModelConfigObject: AzureEntraModelConfigObject? = null,
    private val azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject? = null,
    private val genericModelConfigObject: GenericModelConfigObject? = null,
    private val _json: JsonValue? = null,
) {

    fun vertexModelConfigObject(): Optional<VertexModelConfigObject> =
        Optional.ofNullable(vertexModelConfigObject)

    fun azureEntraModelConfigObject(): Optional<AzureEntraModelConfigObject> =
        Optional.ofNullable(azureEntraModelConfigObject)

    fun azureApiKeyModelConfigObject(): Optional<AzureApiKeyModelConfigObject> =
        Optional.ofNullable(azureApiKeyModelConfigObject)

    fun genericModelConfigObject(): Optional<GenericModelConfigObject> =
        Optional.ofNullable(genericModelConfigObject)

    fun isVertexModelConfigObject(): Boolean = vertexModelConfigObject != null

    fun isAzureEntraModelConfigObject(): Boolean = azureEntraModelConfigObject != null

    fun isAzureApiKeyModelConfigObject(): Boolean = azureApiKeyModelConfigObject != null

    fun isGenericModelConfigObject(): Boolean = genericModelConfigObject != null

    fun asVertexModelConfigObject(): VertexModelConfigObject =
        vertexModelConfigObject.getOrThrow("vertexModelConfigObject")

    fun asAzureEntraModelConfigObject(): AzureEntraModelConfigObject =
        azureEntraModelConfigObject.getOrThrow("azureEntraModelConfigObject")

    fun asAzureApiKeyModelConfigObject(): AzureApiKeyModelConfigObject =
        azureApiKeyModelConfigObject.getOrThrow("azureApiKeyModelConfigObject")

    fun asGenericModelConfigObject(): GenericModelConfigObject =
        genericModelConfigObject.getOrThrow("genericModelConfigObject")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.browserbase.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = modelConfig.accept(new ModelConfig.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitVertexModelConfigObject(VertexModelConfigObject vertexModelConfigObject) {
     *         return Optional.of(vertexModelConfigObject.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws StagehandInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            vertexModelConfigObject != null ->
                visitor.visitVertexModelConfigObject(vertexModelConfigObject)
            azureEntraModelConfigObject != null ->
                visitor.visitAzureEntraModelConfigObject(azureEntraModelConfigObject)
            azureApiKeyModelConfigObject != null ->
                visitor.visitAzureApiKeyModelConfigObject(azureApiKeyModelConfigObject)
            genericModelConfigObject != null ->
                visitor.visitGenericModelConfigObject(genericModelConfigObject)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws StagehandInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitVertexModelConfigObject(
                    vertexModelConfigObject: VertexModelConfigObject
                ) {
                    vertexModelConfigObject.validate()
                }

                override fun visitAzureEntraModelConfigObject(
                    azureEntraModelConfigObject: AzureEntraModelConfigObject
                ) {
                    azureEntraModelConfigObject.validate()
                }

                override fun visitAzureApiKeyModelConfigObject(
                    azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject
                ) {
                    azureApiKeyModelConfigObject.validate()
                }

                override fun visitGenericModelConfigObject(
                    genericModelConfigObject: GenericModelConfigObject
                ) {
                    genericModelConfigObject.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitVertexModelConfigObject(
                    vertexModelConfigObject: VertexModelConfigObject
                ) = vertexModelConfigObject.validity()

                override fun visitAzureEntraModelConfigObject(
                    azureEntraModelConfigObject: AzureEntraModelConfigObject
                ) = azureEntraModelConfigObject.validity()

                override fun visitAzureApiKeyModelConfigObject(
                    azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject
                ) = azureApiKeyModelConfigObject.validity()

                override fun visitGenericModelConfigObject(
                    genericModelConfigObject: GenericModelConfigObject
                ) = genericModelConfigObject.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            vertexModelConfigObject == other.vertexModelConfigObject &&
            azureEntraModelConfigObject == other.azureEntraModelConfigObject &&
            azureApiKeyModelConfigObject == other.azureApiKeyModelConfigObject &&
            genericModelConfigObject == other.genericModelConfigObject
    }

    override fun hashCode(): Int =
        Objects.hash(
            vertexModelConfigObject,
            azureEntraModelConfigObject,
            azureApiKeyModelConfigObject,
            genericModelConfigObject,
        )

    override fun toString(): String =
        when {
            vertexModelConfigObject != null ->
                "ModelConfig{vertexModelConfigObject=$vertexModelConfigObject}"
            azureEntraModelConfigObject != null ->
                "ModelConfig{azureEntraModelConfigObject=$azureEntraModelConfigObject}"
            azureApiKeyModelConfigObject != null ->
                "ModelConfig{azureApiKeyModelConfigObject=$azureApiKeyModelConfigObject}"
            genericModelConfigObject != null ->
                "ModelConfig{genericModelConfigObject=$genericModelConfigObject}"
            _json != null -> "ModelConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ModelConfig")
        }

    companion object {

        @JvmStatic
        fun ofVertexModelConfigObject(vertexModelConfigObject: VertexModelConfigObject) =
            ModelConfig(vertexModelConfigObject = vertexModelConfigObject)

        @JvmStatic
        fun ofAzureEntraModelConfigObject(
            azureEntraModelConfigObject: AzureEntraModelConfigObject
        ) = ModelConfig(azureEntraModelConfigObject = azureEntraModelConfigObject)

        @JvmStatic
        fun ofAzureApiKeyModelConfigObject(
            azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject
        ) = ModelConfig(azureApiKeyModelConfigObject = azureApiKeyModelConfigObject)

        @JvmStatic
        fun ofGenericModelConfigObject(genericModelConfigObject: GenericModelConfigObject) =
            ModelConfig(genericModelConfigObject = genericModelConfigObject)
    }

    /**
     * An interface that defines how to map each variant of [ModelConfig] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitVertexModelConfigObject(vertexModelConfigObject: VertexModelConfigObject): T

        fun visitAzureEntraModelConfigObject(
            azureEntraModelConfigObject: AzureEntraModelConfigObject
        ): T

        fun visitAzureApiKeyModelConfigObject(
            azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject
        ): T

        fun visitGenericModelConfigObject(genericModelConfigObject: GenericModelConfigObject): T

        /**
         * Maps an unknown variant of [ModelConfig] to a value of type [T].
         *
         * An instance of [ModelConfig] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws StagehandInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw StagehandInvalidDataException("Unknown ModelConfig: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ModelConfig>(ModelConfig::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ModelConfig {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<VertexModelConfigObject>())?.let {
                            ModelConfig(vertexModelConfigObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AzureEntraModelConfigObject>())?.let {
                            ModelConfig(azureEntraModelConfigObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<AzureApiKeyModelConfigObject>())?.let {
                            ModelConfig(azureApiKeyModelConfigObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<GenericModelConfigObject>())?.let {
                            ModelConfig(genericModelConfigObject = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ModelConfig(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ModelConfig>(ModelConfig::class) {

        override fun serialize(
            value: ModelConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.vertexModelConfigObject != null ->
                    generator.writeObject(value.vertexModelConfigObject)
                value.azureEntraModelConfigObject != null ->
                    generator.writeObject(value.azureEntraModelConfigObject)
                value.azureApiKeyModelConfigObject != null ->
                    generator.writeObject(value.azureApiKeyModelConfigObject)
                value.genericModelConfigObject != null ->
                    generator.writeObject(value.genericModelConfigObject)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ModelConfig")
            }
        }
    }

    class VertexModelConfigObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val auth: JsonField<Auth>,
        private val modelName: JsonField<String>,
        private val provider: JsonValue,
        private val providerOptions: JsonField<ProviderOptions>,
        private val apiKey: JsonField<String>,
        private val baseUrl: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
            @JsonProperty("providerOptions")
            @ExcludeMissing
            providerOptions: JsonField<ProviderOptions> = JsonMissing.of(),
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        ) : this(
            auth,
            modelName,
            provider,
            providerOptions,
            apiKey,
            baseUrl,
            headers,
            mutableMapOf(),
        )

        /**
         * Vertex provider authentication configuration
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun auth(): Auth = auth.getRequired("auth")

        /**
         * Model name string with provider prefix (e.g., 'openai/gpt-5-nano')
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("modelName")

        /**
         * Vertex AI model provider
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("vertex")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

        /**
         * Vertex provider-specific model configuration
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun providerOptions(): ProviderOptions = providerOptions.getRequired("providerOptions")

        /**
         * API key for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

        /**
         * Base URL for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

        /**
         * Custom headers sent with every request to the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Returns the raw JSON value of [auth].
         *
         * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [providerOptions].
         *
         * Unlike [providerOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("providerOptions")
        @ExcludeMissing
        fun _providerOptions(): JsonField<ProviderOptions> = providerOptions

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
             * Returns a mutable builder for constructing an instance of [VertexModelConfigObject].
             *
             * The following fields are required:
             * ```java
             * .auth()
             * .modelName()
             * .providerOptions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VertexModelConfigObject]. */
        class Builder internal constructor() {

            private var auth: JsonField<Auth>? = null
            private var modelName: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("vertex")
            private var providerOptions: JsonField<ProviderOptions>? = null
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vertexModelConfigObject: VertexModelConfigObject) = apply {
                auth = vertexModelConfigObject.auth
                modelName = vertexModelConfigObject.modelName
                provider = vertexModelConfigObject.provider
                providerOptions = vertexModelConfigObject.providerOptions
                apiKey = vertexModelConfigObject.apiKey
                baseUrl = vertexModelConfigObject.baseUrl
                headers = vertexModelConfigObject.headers
                additionalProperties = vertexModelConfigObject.additionalProperties.toMutableMap()
            }

            /** Vertex provider authentication configuration */
            fun auth(auth: Auth) = auth(JsonField.of(auth))

            /**
             * Sets [Builder.auth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun auth(auth: JsonField<Auth>) = apply { this.auth = auth }

            /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("vertex")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonValue) = apply { this.provider = provider }

            /** Vertex provider-specific model configuration */
            fun providerOptions(providerOptions: ProviderOptions) =
                providerOptions(JsonField.of(providerOptions))

            /**
             * Sets [Builder.providerOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerOptions] with a well-typed [ProviderOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerOptions(providerOptions: JsonField<ProviderOptions>) = apply {
                this.providerOptions = providerOptions
            }

            /** API key for the model provider */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Base URL for the model provider */
            fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** Custom headers sent with every request to the model provider */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
             * Returns an immutable instance of [VertexModelConfigObject].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .auth()
             * .modelName()
             * .providerOptions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VertexModelConfigObject =
                VertexModelConfigObject(
                    checkRequired("auth", auth),
                    checkRequired("modelName", modelName),
                    provider,
                    checkRequired("providerOptions", providerOptions),
                    apiKey,
                    baseUrl,
                    headers,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): VertexModelConfigObject = apply {
            if (validated) {
                return@apply
            }

            auth().validate()
            modelName()
            _provider().let {
                if (it != JsonValue.from("vertex")) {
                    throw StagehandInvalidDataException("'provider' is invalid, received $it")
                }
            }
            providerOptions().validate()
            apiKey()
            baseUrl()
            headers().ifPresent { it.validate() }
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
            (auth.asKnown().getOrNull()?.validity() ?: 0) +
                (if (modelName.asKnown().isPresent) 1 else 0) +
                provider.let { if (it == JsonValue.from("vertex")) 1 else 0 } +
                (providerOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0)

        /** Vertex provider authentication configuration */
        class Auth
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val credentials: JsonField<Credentials>,
            private val type: JsonValue,
            private val projectId: JsonField<String>,
            private val scopes: JsonField<Scopes>,
            private val universeDomain: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credentials")
                @ExcludeMissing
                credentials: JsonField<Credentials> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("projectId")
                @ExcludeMissing
                projectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("scopes")
                @ExcludeMissing
                scopes: JsonField<Scopes> = JsonMissing.of(),
                @JsonProperty("universeDomain")
                @ExcludeMissing
                universeDomain: JsonField<String> = JsonMissing.of(),
            ) : this(credentials, type, projectId, scopes, universeDomain, mutableMapOf())

            /**
             * Google Cloud service account credentials
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun credentials(): Credentials = credentials.getRequired("credentials")

            /**
             * Use inline Google Cloud service account credentials for provider authentication
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("googleServiceAccount")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Google Cloud project ID used by google-auth-library
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun projectId(): Optional<String> = projectId.getOptional("projectId")

            /**
             * Google auth scopes for the desired API request
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scopes(): Optional<Scopes> = scopes.getOptional("scopes")

            /**
             * Google Cloud universe domain
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun universeDomain(): Optional<String> = universeDomain.getOptional("universeDomain")

            /**
             * Returns the raw JSON value of [credentials].
             *
             * Unlike [credentials], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credentials")
            @ExcludeMissing
            fun _credentials(): JsonField<Credentials> = credentials

            /**
             * Returns the raw JSON value of [projectId].
             *
             * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("projectId")
            @ExcludeMissing
            fun _projectId(): JsonField<String> = projectId

            /**
             * Returns the raw JSON value of [scopes].
             *
             * Unlike [scopes], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("scopes") @ExcludeMissing fun _scopes(): JsonField<Scopes> = scopes

            /**
             * Returns the raw JSON value of [universeDomain].
             *
             * Unlike [universeDomain], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("universeDomain")
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
                 * Returns a mutable builder for constructing an instance of [Auth].
                 *
                 * The following fields are required:
                 * ```java
                 * .credentials()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Auth]. */
            class Builder internal constructor() {

                private var credentials: JsonField<Credentials>? = null
                private var type: JsonValue = JsonValue.from("googleServiceAccount")
                private var projectId: JsonField<String> = JsonMissing.of()
                private var scopes: JsonField<Scopes> = JsonMissing.of()
                private var universeDomain: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(auth: Auth) = apply {
                    credentials = auth.credentials
                    type = auth.type
                    projectId = auth.projectId
                    scopes = auth.scopes
                    universeDomain = auth.universeDomain
                    additionalProperties = auth.additionalProperties.toMutableMap()
                }

                /** Google Cloud service account credentials */
                fun credentials(credentials: Credentials) = credentials(JsonField.of(credentials))

                /**
                 * Sets [Builder.credentials] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.credentials] with a well-typed [Credentials]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun credentials(credentials: JsonField<Credentials>) = apply {
                    this.credentials = credentials
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("googleServiceAccount")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                /** Google Cloud project ID used by google-auth-library */
                fun projectId(projectId: String) = projectId(JsonField.of(projectId))

                /**
                 * Sets [Builder.projectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun projectId(projectId: JsonField<String>) = apply { this.projectId = projectId }

                /** Google auth scopes for the desired API request */
                fun scopes(scopes: Scopes) = scopes(JsonField.of(scopes))

                /**
                 * Sets [Builder.scopes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scopes] with a well-typed [Scopes] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun scopes(scopes: JsonField<Scopes>) = apply { this.scopes = scopes }

                /** Alias for calling [scopes] with `Scopes.ofString(string)`. */
                fun scopes(string: String) = scopes(Scopes.ofString(string))

                /** Alias for calling [scopes] with `Scopes.ofStrings(strings)`. */
                fun scopesOfStrings(strings: List<String>) = scopes(Scopes.ofStrings(strings))

                /** Google Cloud universe domain */
                fun universeDomain(universeDomain: String) =
                    universeDomain(JsonField.of(universeDomain))

                /**
                 * Sets [Builder.universeDomain] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.universeDomain] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun universeDomain(universeDomain: JsonField<String>) = apply {
                    this.universeDomain = universeDomain
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
                 * Returns an immutable instance of [Auth].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .credentials()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Auth =
                    Auth(
                        checkRequired("credentials", credentials),
                        type,
                        projectId,
                        scopes,
                        universeDomain,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Auth = apply {
                if (validated) {
                    return@apply
                }

                credentials().validate()
                _type().let {
                    if (it != JsonValue.from("googleServiceAccount")) {
                        throw StagehandInvalidDataException("'type' is invalid, received $it")
                    }
                }
                projectId()
                scopes().ifPresent { it.validate() }
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
                (credentials.asKnown().getOrNull()?.validity() ?: 0) +
                    type.let { if (it == JsonValue.from("googleServiceAccount")) 1 else 0 } +
                    (if (projectId.asKnown().isPresent) 1 else 0) +
                    (scopes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (universeDomain.asKnown().isPresent) 1 else 0)

            /** Google Cloud service account credentials */
            class Credentials
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val clientEmail: JsonField<String>,
                private val privateKey: JsonField<String>,
                private val authProviderX509CertUrl: JsonField<String>,
                private val authUri: JsonField<String>,
                private val clientId: JsonField<String>,
                private val clientX509CertUrl: JsonField<String>,
                private val privateKeyId: JsonField<String>,
                private val projectId: JsonField<String>,
                private val tokenUri: JsonField<String>,
                private val type: JsonField<Type>,
                private val universeDomain: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("client_email")
                    @ExcludeMissing
                    clientEmail: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("private_key")
                    @ExcludeMissing
                    privateKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("auth_provider_x509_cert_url")
                    @ExcludeMissing
                    authProviderX509CertUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("auth_uri")
                    @ExcludeMissing
                    authUri: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("client_id")
                    @ExcludeMissing
                    clientId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("client_x509_cert_url")
                    @ExcludeMissing
                    clientX509CertUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("private_key_id")
                    @ExcludeMissing
                    privateKeyId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("project_id")
                    @ExcludeMissing
                    projectId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("token_uri")
                    @ExcludeMissing
                    tokenUri: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                    @JsonProperty("universe_domain")
                    @ExcludeMissing
                    universeDomain: JsonField<String> = JsonMissing.of(),
                ) : this(
                    clientEmail,
                    privateKey,
                    authProviderX509CertUrl,
                    authUri,
                    clientId,
                    clientX509CertUrl,
                    privateKeyId,
                    projectId,
                    tokenUri,
                    type,
                    universeDomain,
                    mutableMapOf(),
                )

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun clientEmail(): String = clientEmail.getRequired("client_email")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun privateKey(): String = privateKey.getRequired("private_key")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun authProviderX509CertUrl(): Optional<String> =
                    authProviderX509CertUrl.getOptional("auth_provider_x509_cert_url")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun authUri(): Optional<String> = authUri.getOptional("auth_uri")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun clientId(): Optional<String> = clientId.getOptional("client_id")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun clientX509CertUrl(): Optional<String> =
                    clientX509CertUrl.getOptional("client_x509_cert_url")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun privateKeyId(): Optional<String> = privateKeyId.getOptional("private_key_id")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun projectId(): Optional<String> = projectId.getOptional("project_id")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tokenUri(): Optional<String> = tokenUri.getOptional("token_uri")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<Type> = type.getOptional("type")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun universeDomain(): Optional<String> =
                    universeDomain.getOptional("universe_domain")

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
                 * Returns the raw JSON value of [privateKey].
                 *
                 * Unlike [privateKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("private_key")
                @ExcludeMissing
                fun _privateKey(): JsonField<String> = privateKey

                /**
                 * Returns the raw JSON value of [authProviderX509CertUrl].
                 *
                 * Unlike [authProviderX509CertUrl], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("auth_provider_x509_cert_url")
                @ExcludeMissing
                fun _authProviderX509CertUrl(): JsonField<String> = authProviderX509CertUrl

                /**
                 * Returns the raw JSON value of [authUri].
                 *
                 * Unlike [authUri], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("auth_uri")
                @ExcludeMissing
                fun _authUri(): JsonField<String> = authUri

                /**
                 * Returns the raw JSON value of [clientId].
                 *
                 * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("client_id")
                @ExcludeMissing
                fun _clientId(): JsonField<String> = clientId

                /**
                 * Returns the raw JSON value of [clientX509CertUrl].
                 *
                 * Unlike [clientX509CertUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("client_x509_cert_url")
                @ExcludeMissing
                fun _clientX509CertUrl(): JsonField<String> = clientX509CertUrl

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
                 * Unlike [projectId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("project_id")
                @ExcludeMissing
                fun _projectId(): JsonField<String> = projectId

                /**
                 * Returns the raw JSON value of [tokenUri].
                 *
                 * Unlike [tokenUri], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                     *
                     * The following fields are required:
                     * ```java
                     * .clientEmail()
                     * .privateKey()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Credentials]. */
                class Builder internal constructor() {

                    private var clientEmail: JsonField<String>? = null
                    private var privateKey: JsonField<String>? = null
                    private var authProviderX509CertUrl: JsonField<String> = JsonMissing.of()
                    private var authUri: JsonField<String> = JsonMissing.of()
                    private var clientId: JsonField<String> = JsonMissing.of()
                    private var clientX509CertUrl: JsonField<String> = JsonMissing.of()
                    private var privateKeyId: JsonField<String> = JsonMissing.of()
                    private var projectId: JsonField<String> = JsonMissing.of()
                    private var tokenUri: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var universeDomain: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(credentials: Credentials) = apply {
                        clientEmail = credentials.clientEmail
                        privateKey = credentials.privateKey
                        authProviderX509CertUrl = credentials.authProviderX509CertUrl
                        authUri = credentials.authUri
                        clientId = credentials.clientId
                        clientX509CertUrl = credentials.clientX509CertUrl
                        privateKeyId = credentials.privateKeyId
                        projectId = credentials.projectId
                        tokenUri = credentials.tokenUri
                        type = credentials.type
                        universeDomain = credentials.universeDomain
                        additionalProperties = credentials.additionalProperties.toMutableMap()
                    }

                    fun clientEmail(clientEmail: String) = clientEmail(JsonField.of(clientEmail))

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

                    fun privateKey(privateKey: String) = privateKey(JsonField.of(privateKey))

                    /**
                     * Sets [Builder.privateKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.privateKey] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun privateKey(privateKey: JsonField<String>) = apply {
                        this.privateKey = privateKey
                    }

                    fun authProviderX509CertUrl(authProviderX509CertUrl: String) =
                        authProviderX509CertUrl(JsonField.of(authProviderX509CertUrl))

                    /**
                     * Sets [Builder.authProviderX509CertUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.authProviderX509CertUrl] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun authProviderX509CertUrl(authProviderX509CertUrl: JsonField<String>) =
                        apply {
                            this.authProviderX509CertUrl = authProviderX509CertUrl
                        }

                    fun authUri(authUri: String) = authUri(JsonField.of(authUri))

                    /**
                     * Sets [Builder.authUri] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.authUri] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun authUri(authUri: JsonField<String>) = apply { this.authUri = authUri }

                    fun clientId(clientId: String) = clientId(JsonField.of(clientId))

                    /**
                     * Sets [Builder.clientId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clientId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

                    fun clientX509CertUrl(clientX509CertUrl: String) =
                        clientX509CertUrl(JsonField.of(clientX509CertUrl))

                    /**
                     * Sets [Builder.clientX509CertUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clientX509CertUrl] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun clientX509CertUrl(clientX509CertUrl: JsonField<String>) = apply {
                        this.clientX509CertUrl = clientX509CertUrl
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
                     * You should usually call [Builder.projectId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun projectId(projectId: JsonField<String>) = apply {
                        this.projectId = projectId
                    }

                    fun tokenUri(tokenUri: String) = tokenUri(JsonField.of(tokenUri))

                    /**
                     * Sets [Builder.tokenUri] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tokenUri] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun tokenUri(tokenUri: JsonField<String>) = apply { this.tokenUri = tokenUri }

                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [Type] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun universeDomain(universeDomain: String) =
                        universeDomain(JsonField.of(universeDomain))

                    /**
                     * Sets [Builder.universeDomain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.universeDomain] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun universeDomain(universeDomain: JsonField<String>) = apply {
                        this.universeDomain = universeDomain
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
                     * Returns an immutable instance of [Credentials].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .clientEmail()
                     * .privateKey()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Credentials =
                        Credentials(
                            checkRequired("clientEmail", clientEmail),
                            checkRequired("privateKey", privateKey),
                            authProviderX509CertUrl,
                            authUri,
                            clientId,
                            clientX509CertUrl,
                            privateKeyId,
                            projectId,
                            tokenUri,
                            type,
                            universeDomain,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Credentials = apply {
                    if (validated) {
                        return@apply
                    }

                    clientEmail()
                    privateKey()
                    authProviderX509CertUrl()
                    authUri()
                    clientId()
                    clientX509CertUrl()
                    privateKeyId()
                    projectId()
                    tokenUri()
                    type().ifPresent { it.validate() }
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
                    (if (clientEmail.asKnown().isPresent) 1 else 0) +
                        (if (privateKey.asKnown().isPresent) 1 else 0) +
                        (if (authProviderX509CertUrl.asKnown().isPresent) 1 else 0) +
                        (if (authUri.asKnown().isPresent) 1 else 0) +
                        (if (clientId.asKnown().isPresent) 1 else 0) +
                        (if (clientX509CertUrl.asKnown().isPresent) 1 else 0) +
                        (if (privateKeyId.asKnown().isPresent) 1 else 0) +
                        (if (projectId.asKnown().isPresent) 1 else 0) +
                        (if (tokenUri.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (universeDomain.asKnown().isPresent) 1 else 0)

                class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

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

                        @JvmField val SERVICE_ACCOUNT = of("service_account")

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    /** An enum containing [Type]'s known values. */
                    enum class Known {
                        SERVICE_ACCOUNT
                    }

                    /**
                     * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Type] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SERVICE_ACCOUNT,
                        /**
                         * An enum member indicating that [Type] was instantiated with an unknown
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
                            SERVICE_ACCOUNT -> Value.SERVICE_ACCOUNT
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
                            SERVICE_ACCOUNT -> Known.SERVICE_ACCOUNT
                            else -> throw StagehandInvalidDataException("Unknown Type: $value")
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StagehandInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Credentials &&
                        clientEmail == other.clientEmail &&
                        privateKey == other.privateKey &&
                        authProviderX509CertUrl == other.authProviderX509CertUrl &&
                        authUri == other.authUri &&
                        clientId == other.clientId &&
                        clientX509CertUrl == other.clientX509CertUrl &&
                        privateKeyId == other.privateKeyId &&
                        projectId == other.projectId &&
                        tokenUri == other.tokenUri &&
                        type == other.type &&
                        universeDomain == other.universeDomain &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        clientEmail,
                        privateKey,
                        authProviderX509CertUrl,
                        authUri,
                        clientId,
                        clientX509CertUrl,
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
                    "Credentials{clientEmail=$clientEmail, privateKey=$privateKey, authProviderX509CertUrl=$authProviderX509CertUrl, authUri=$authUri, clientId=$clientId, clientX509CertUrl=$clientX509CertUrl, privateKeyId=$privateKeyId, projectId=$projectId, tokenUri=$tokenUri, type=$type, universeDomain=$universeDomain, additionalProperties=$additionalProperties}"
            }

            /** Google auth scopes for the desired API request */
            @JsonDeserialize(using = Scopes.Deserializer::class)
            @JsonSerialize(using = Scopes.Serializer::class)
            class Scopes
            private constructor(
                private val string: String? = null,
                private val strings: List<String>? = null,
                private val _json: JsonValue? = null,
            ) {

                fun string(): Optional<String> = Optional.ofNullable(string)

                fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

                fun isString(): Boolean = string != null

                fun isStrings(): Boolean = strings != null

                fun asString(): String = string.getOrThrow("string")

                fun asStrings(): List<String> = strings.getOrThrow("strings")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                /**
                 * Maps this instance's current variant to a value of type [T] using the given
                 * [visitor].
                 *
                 * Note that this method is _not_ forwards compatible with new variants from the
                 * API, unless [visitor] overrides [Visitor.unknown]. To handle variants not known
                 * to this version of the SDK gracefully, consider overriding [Visitor.unknown]:
                 * ```java
                 * import com.browserbase.api.core.JsonValue;
                 * import java.util.Optional;
                 *
                 * Optional<String> result = scopes.accept(new Scopes.Visitor<Optional<String>>() {
                 *     @Override
                 *     public Optional<String> visitString(String string) {
                 *         return Optional.of(string.toString());
                 *     }
                 *
                 *     // ...
                 *
                 *     @Override
                 *     public Optional<String> unknown(JsonValue json) {
                 *         // Or inspect the `json`.
                 *         return Optional.empty();
                 *     }
                 * });
                 * ```
                 *
                 * @throws StagehandInvalidDataException if [Visitor.unknown] is not overridden in
                 *   [visitor] and the current variant is unknown.
                 */
                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        strings != null -> visitor.visitStrings(strings)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Scopes = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

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
                            override fun visitString(string: String) = 1

                            override fun visitStrings(strings: List<String>) = strings.size

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Scopes && string == other.string && strings == other.strings
                }

                override fun hashCode(): Int = Objects.hash(string, strings)

                override fun toString(): String =
                    when {
                        string != null -> "Scopes{string=$string}"
                        strings != null -> "Scopes{strings=$strings}"
                        _json != null -> "Scopes{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Scopes")
                    }

                companion object {

                    @JvmStatic fun ofString(string: String) = Scopes(string = string)

                    @JvmStatic
                    fun ofStrings(strings: List<String>) = Scopes(strings = strings.toImmutable())
                }

                /**
                 * An interface that defines how to map each variant of [Scopes] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    fun visitString(string: String): T

                    fun visitStrings(strings: List<String>): T

                    /**
                     * Maps an unknown variant of [Scopes] to a value of type [T].
                     *
                     * An instance of [Scopes] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws StagehandInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw StagehandInvalidDataException("Unknown Scopes: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Scopes>(Scopes::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Scopes {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Scopes(string = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                        Scopes(strings = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Scopes(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Scopes>(Scopes::class) {

                    override fun serialize(
                        value: Scopes,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.strings != null -> generator.writeObject(value.strings)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Scopes")
                        }
                    }
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Auth &&
                    credentials == other.credentials &&
                    type == other.type &&
                    projectId == other.projectId &&
                    scopes == other.scopes &&
                    universeDomain == other.universeDomain &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    credentials,
                    type,
                    projectId,
                    scopes,
                    universeDomain,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Auth{credentials=$credentials, type=$type, projectId=$projectId, scopes=$scopes, universeDomain=$universeDomain, additionalProperties=$additionalProperties}"
        }

        /** Vertex provider-specific model configuration */
        class ProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val vertex: JsonField<Vertex>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("vertex") @ExcludeMissing vertex: JsonField<Vertex> = JsonMissing.of()
            ) : this(vertex, mutableMapOf())

            /**
             * Vertex AI provider-specific settings
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun vertex(): Vertex = vertex.getRequired("vertex")

            /**
             * Returns the raw JSON value of [vertex].
             *
             * Unlike [vertex], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vertex") @ExcludeMissing fun _vertex(): JsonField<Vertex> = vertex

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
                 * Returns a mutable builder for constructing an instance of [ProviderOptions].
                 *
                 * The following fields are required:
                 * ```java
                 * .vertex()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderOptions]. */
            class Builder internal constructor() {

                private var vertex: JsonField<Vertex>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerOptions: ProviderOptions) = apply {
                    vertex = providerOptions.vertex
                    additionalProperties = providerOptions.additionalProperties.toMutableMap()
                }

                /** Vertex AI provider-specific settings */
                fun vertex(vertex: Vertex) = vertex(JsonField.of(vertex))

                /**
                 * Sets [Builder.vertex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vertex] with a well-typed [Vertex] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vertex(vertex: JsonField<Vertex>) = apply { this.vertex = vertex }

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
                 * Returns an immutable instance of [ProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .vertex()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProviderOptions =
                    ProviderOptions(
                        checkRequired("vertex", vertex),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                vertex().validate()
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
            internal fun validity(): Int = (vertex.asKnown().getOrNull()?.validity() ?: 0)

            /** Vertex AI provider-specific settings */
            class Vertex
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val location: JsonField<String>,
                private val project: JsonField<String>,
                private val baseUrl: JsonField<String>,
                private val headers: JsonField<Headers>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("location")
                    @ExcludeMissing
                    location: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("project")
                    @ExcludeMissing
                    project: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("baseURL")
                    @ExcludeMissing
                    baseUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("headers")
                    @ExcludeMissing
                    headers: JsonField<Headers> = JsonMissing.of(),
                ) : this(location, project, baseUrl, headers, mutableMapOf())

                /**
                 * Google Cloud location for Vertex AI models
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun location(): String = location.getRequired("location")

                /**
                 * Google Cloud project ID for Vertex AI models
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun project(): String = project.getRequired("project")

                /**
                 * Base URL for the Vertex AI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

                /**
                 * Custom headers sent with every request to the Vertex AI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun headers(): Optional<Headers> = headers.getOptional("headers")

                /**
                 * Returns the raw JSON value of [location].
                 *
                 * Unlike [location], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("location")
                @ExcludeMissing
                fun _location(): JsonField<String> = location

                /**
                 * Returns the raw JSON value of [project].
                 *
                 * Unlike [project], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("project") @ExcludeMissing fun _project(): JsonField<String> = project

                /**
                 * Returns the raw JSON value of [baseUrl].
                 *
                 * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("baseURL") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

                /**
                 * Returns the raw JSON value of [headers].
                 *
                 * Unlike [headers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("headers")
                @ExcludeMissing
                fun _headers(): JsonField<Headers> = headers

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
                     * Returns a mutable builder for constructing an instance of [Vertex].
                     *
                     * The following fields are required:
                     * ```java
                     * .location()
                     * .project()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Vertex]. */
                class Builder internal constructor() {

                    private var location: JsonField<String>? = null
                    private var project: JsonField<String>? = null
                    private var baseUrl: JsonField<String> = JsonMissing.of()
                    private var headers: JsonField<Headers> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(vertex: Vertex) = apply {
                        location = vertex.location
                        project = vertex.project
                        baseUrl = vertex.baseUrl
                        headers = vertex.headers
                        additionalProperties = vertex.additionalProperties.toMutableMap()
                    }

                    /** Google Cloud location for Vertex AI models */
                    fun location(location: String) = location(JsonField.of(location))

                    /**
                     * Sets [Builder.location] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.location] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun location(location: JsonField<String>) = apply { this.location = location }

                    /** Google Cloud project ID for Vertex AI models */
                    fun project(project: String) = project(JsonField.of(project))

                    /**
                     * Sets [Builder.project] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.project] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun project(project: JsonField<String>) = apply { this.project = project }

                    /** Base URL for the Vertex AI provider */
                    fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

                    /**
                     * Sets [Builder.baseUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.baseUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

                    /** Custom headers sent with every request to the Vertex AI provider */
                    fun headers(headers: Headers) = headers(JsonField.of(headers))

                    /**
                     * Sets [Builder.headers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.headers] with a well-typed [Headers] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
                     * Returns an immutable instance of [Vertex].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .location()
                     * .project()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Vertex =
                        Vertex(
                            checkRequired("location", location),
                            checkRequired("project", project),
                            baseUrl,
                            headers,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Vertex = apply {
                    if (validated) {
                        return@apply
                    }

                    location()
                    project()
                    baseUrl()
                    headers().ifPresent { it.validate() }
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
                    (if (location.asKnown().isPresent) 1 else 0) +
                        (if (project.asKnown().isPresent) 1 else 0) +
                        (if (baseUrl.asKnown().isPresent) 1 else 0) +
                        (headers.asKnown().getOrNull()?.validity() ?: 0)

                /** Custom headers sent with every request to the Vertex AI provider */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(headers: Headers) = apply {
                            additionalProperties = headers.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Headers].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Headers = Headers(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StagehandInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                        return other is Headers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Headers{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Vertex &&
                        location == other.location &&
                        project == other.project &&
                        baseUrl == other.baseUrl &&
                        headers == other.headers &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(location, project, baseUrl, headers, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Vertex{location=$location, project=$project, baseUrl=$baseUrl, headers=$headers, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProviderOptions &&
                    vertex == other.vertex &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(vertex, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProviderOptions{vertex=$vertex, additionalProperties=$additionalProperties}"
        }

        /** Custom headers sent with every request to the model provider */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VertexModelConfigObject &&
                auth == other.auth &&
                modelName == other.modelName &&
                provider == other.provider &&
                providerOptions == other.providerOptions &&
                apiKey == other.apiKey &&
                baseUrl == other.baseUrl &&
                headers == other.headers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                auth,
                modelName,
                provider,
                providerOptions,
                apiKey,
                baseUrl,
                headers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VertexModelConfigObject{auth=$auth, modelName=$modelName, provider=$provider, providerOptions=$providerOptions, apiKey=$apiKey, baseUrl=$baseUrl, headers=$headers, additionalProperties=$additionalProperties}"
    }

    class AzureEntraModelConfigObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val auth: JsonField<Auth>,
        private val modelName: JsonField<String>,
        private val provider: JsonValue,
        private val providerOptions: JsonField<ProviderOptions>,
        private val baseUrl: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auth") @ExcludeMissing auth: JsonField<Auth> = JsonMissing.of(),
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
            @JsonProperty("providerOptions")
            @ExcludeMissing
            providerOptions: JsonField<ProviderOptions> = JsonMissing.of(),
            @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        ) : this(auth, modelName, provider, providerOptions, baseUrl, headers, mutableMapOf())

        /**
         * Azure provider authentication configuration
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun auth(): Auth = auth.getRequired("auth")

        /**
         * Model name string with provider prefix (e.g., 'openai/gpt-5-nano')
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("modelName")

        /**
         * Azure OpenAI model provider
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("azure")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

        /**
         * Azure provider-specific model configuration
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun providerOptions(): ProviderOptions = providerOptions.getRequired("providerOptions")

        /**
         * Base URL for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

        /**
         * Custom headers sent with every request to the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Returns the raw JSON value of [auth].
         *
         * Unlike [auth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auth") @ExcludeMissing fun _auth(): JsonField<Auth> = auth

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [providerOptions].
         *
         * Unlike [providerOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("providerOptions")
        @ExcludeMissing
        fun _providerOptions(): JsonField<ProviderOptions> = providerOptions

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
             * [AzureEntraModelConfigObject].
             *
             * The following fields are required:
             * ```java
             * .auth()
             * .modelName()
             * .providerOptions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AzureEntraModelConfigObject]. */
        class Builder internal constructor() {

            private var auth: JsonField<Auth>? = null
            private var modelName: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("azure")
            private var providerOptions: JsonField<ProviderOptions>? = null
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(azureEntraModelConfigObject: AzureEntraModelConfigObject) = apply {
                auth = azureEntraModelConfigObject.auth
                modelName = azureEntraModelConfigObject.modelName
                provider = azureEntraModelConfigObject.provider
                providerOptions = azureEntraModelConfigObject.providerOptions
                baseUrl = azureEntraModelConfigObject.baseUrl
                headers = azureEntraModelConfigObject.headers
                additionalProperties =
                    azureEntraModelConfigObject.additionalProperties.toMutableMap()
            }

            /** Azure provider authentication configuration */
            fun auth(auth: Auth) = auth(JsonField.of(auth))

            /**
             * Sets [Builder.auth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auth] with a well-typed [Auth] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun auth(auth: JsonField<Auth>) = apply { this.auth = auth }

            /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("azure")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonValue) = apply { this.provider = provider }

            /** Azure provider-specific model configuration */
            fun providerOptions(providerOptions: ProviderOptions) =
                providerOptions(JsonField.of(providerOptions))

            /**
             * Sets [Builder.providerOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerOptions] with a well-typed [ProviderOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerOptions(providerOptions: JsonField<ProviderOptions>) = apply {
                this.providerOptions = providerOptions
            }

            /** Base URL for the model provider */
            fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** Custom headers sent with every request to the model provider */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
             * Returns an immutable instance of [AzureEntraModelConfigObject].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .auth()
             * .modelName()
             * .providerOptions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AzureEntraModelConfigObject =
                AzureEntraModelConfigObject(
                    checkRequired("auth", auth),
                    checkRequired("modelName", modelName),
                    provider,
                    checkRequired("providerOptions", providerOptions),
                    baseUrl,
                    headers,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AzureEntraModelConfigObject = apply {
            if (validated) {
                return@apply
            }

            auth().validate()
            modelName()
            _provider().let {
                if (it != JsonValue.from("azure")) {
                    throw StagehandInvalidDataException("'provider' is invalid, received $it")
                }
            }
            providerOptions().validate()
            baseUrl()
            headers().ifPresent { it.validate() }
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
            (auth.asKnown().getOrNull()?.validity() ?: 0) +
                (if (modelName.asKnown().isPresent) 1 else 0) +
                provider.let { if (it == JsonValue.from("azure")) 1 else 0 } +
                (providerOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0)

        /** Azure provider authentication configuration */
        class Auth
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val token: JsonField<String>,
            private val type: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
            ) : this(token, type, mutableMapOf())

            /**
             * Microsoft Entra ID bearer token for Azure OpenAI
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun token(): String = token.getRequired("token")

            /**
             * Use a Microsoft Entra ID bearer token for authentication
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("azureEntraId")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * Returns the raw JSON value of [token].
             *
             * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
                 * Returns a mutable builder for constructing an instance of [Auth].
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Auth]. */
            class Builder internal constructor() {

                private var token: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("azureEntraId")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(auth: Auth) = apply {
                    token = auth.token
                    type = auth.type
                    additionalProperties = auth.additionalProperties.toMutableMap()
                }

                /** Microsoft Entra ID bearer token for Azure OpenAI */
                fun token(token: String) = token(JsonField.of(token))

                /**
                 * Sets [Builder.token] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.token] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun token(token: JsonField<String>) = apply { this.token = token }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("azureEntraId")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

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
                 * Returns an immutable instance of [Auth].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .token()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Auth =
                    Auth(checkRequired("token", token), type, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Auth = apply {
                if (validated) {
                    return@apply
                }

                token()
                _type().let {
                    if (it != JsonValue.from("azureEntraId")) {
                        throw StagehandInvalidDataException("'type' is invalid, received $it")
                    }
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
                (if (token.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("azureEntraId")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Auth &&
                    token == other.token &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(token, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Auth{token=$token, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Azure provider-specific model configuration */
        class ProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val azure: JsonField<Azure>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("azure") @ExcludeMissing azure: JsonField<Azure> = JsonMissing.of()
            ) : this(azure, mutableMapOf())

            /**
             * Azure OpenAI provider-specific settings
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun azure(): Azure = azure.getRequired("azure")

            /**
             * Returns the raw JSON value of [azure].
             *
             * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("azure") @ExcludeMissing fun _azure(): JsonField<Azure> = azure

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
                 * Returns a mutable builder for constructing an instance of [ProviderOptions].
                 *
                 * The following fields are required:
                 * ```java
                 * .azure()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderOptions]. */
            class Builder internal constructor() {

                private var azure: JsonField<Azure>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerOptions: ProviderOptions) = apply {
                    azure = providerOptions.azure
                    additionalProperties = providerOptions.additionalProperties.toMutableMap()
                }

                /** Azure OpenAI provider-specific settings */
                fun azure(azure: Azure) = azure(JsonField.of(azure))

                /**
                 * Sets [Builder.azure] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azure] with a well-typed [Azure] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun azure(azure: JsonField<Azure>) = apply { this.azure = azure }

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
                 * Returns an immutable instance of [ProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .azure()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProviderOptions =
                    ProviderOptions(
                        checkRequired("azure", azure),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                azure().validate()
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
            internal fun validity(): Int = (azure.asKnown().getOrNull()?.validity() ?: 0)

            /** Azure OpenAI provider-specific settings */
            class Azure
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiVersion: JsonField<String>,
                private val baseUrl: JsonField<String>,
                private val headers: JsonField<Headers>,
                private val resourceName: JsonField<String>,
                private val useDeploymentBasedUrls: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("apiVersion")
                    @ExcludeMissing
                    apiVersion: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("baseURL")
                    @ExcludeMissing
                    baseUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("headers")
                    @ExcludeMissing
                    headers: JsonField<Headers> = JsonMissing.of(),
                    @JsonProperty("resourceName")
                    @ExcludeMissing
                    resourceName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("useDeploymentBasedUrls")
                    @ExcludeMissing
                    useDeploymentBasedUrls: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    apiVersion,
                    baseUrl,
                    headers,
                    resourceName,
                    useDeploymentBasedUrls,
                    mutableMapOf(),
                )

                /**
                 * Azure OpenAI API version
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun apiVersion(): Optional<String> = apiVersion.getOptional("apiVersion")

                /**
                 * Base URL for the Azure OpenAI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

                /**
                 * Custom headers sent with every request to the Azure OpenAI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun headers(): Optional<Headers> = headers.getOptional("headers")

                /**
                 * Azure OpenAI resource name
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun resourceName(): Optional<String> = resourceName.getOptional("resourceName")

                /**
                 * Whether to use deployment-based Azure OpenAI URLs
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun useDeploymentBasedUrls(): Optional<Boolean> =
                    useDeploymentBasedUrls.getOptional("useDeploymentBasedUrls")

                /**
                 * Returns the raw JSON value of [apiVersion].
                 *
                 * Unlike [apiVersion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("apiVersion")
                @ExcludeMissing
                fun _apiVersion(): JsonField<String> = apiVersion

                /**
                 * Returns the raw JSON value of [baseUrl].
                 *
                 * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("baseURL") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

                /**
                 * Returns the raw JSON value of [headers].
                 *
                 * Unlike [headers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("headers")
                @ExcludeMissing
                fun _headers(): JsonField<Headers> = headers

                /**
                 * Returns the raw JSON value of [resourceName].
                 *
                 * Unlike [resourceName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("resourceName")
                @ExcludeMissing
                fun _resourceName(): JsonField<String> = resourceName

                /**
                 * Returns the raw JSON value of [useDeploymentBasedUrls].
                 *
                 * Unlike [useDeploymentBasedUrls], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("useDeploymentBasedUrls")
                @ExcludeMissing
                fun _useDeploymentBasedUrls(): JsonField<Boolean> = useDeploymentBasedUrls

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

                    /** Returns a mutable builder for constructing an instance of [Azure]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Azure]. */
                class Builder internal constructor() {

                    private var apiVersion: JsonField<String> = JsonMissing.of()
                    private var baseUrl: JsonField<String> = JsonMissing.of()
                    private var headers: JsonField<Headers> = JsonMissing.of()
                    private var resourceName: JsonField<String> = JsonMissing.of()
                    private var useDeploymentBasedUrls: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azure: Azure) = apply {
                        apiVersion = azure.apiVersion
                        baseUrl = azure.baseUrl
                        headers = azure.headers
                        resourceName = azure.resourceName
                        useDeploymentBasedUrls = azure.useDeploymentBasedUrls
                        additionalProperties = azure.additionalProperties.toMutableMap()
                    }

                    /** Azure OpenAI API version */
                    fun apiVersion(apiVersion: String) = apiVersion(JsonField.of(apiVersion))

                    /**
                     * Sets [Builder.apiVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiVersion] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiVersion(apiVersion: JsonField<String>) = apply {
                        this.apiVersion = apiVersion
                    }

                    /** Base URL for the Azure OpenAI provider */
                    fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

                    /**
                     * Sets [Builder.baseUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.baseUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

                    /** Custom headers sent with every request to the Azure OpenAI provider */
                    fun headers(headers: Headers) = headers(JsonField.of(headers))

                    /**
                     * Sets [Builder.headers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.headers] with a well-typed [Headers] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

                    /** Azure OpenAI resource name */
                    fun resourceName(resourceName: String) =
                        resourceName(JsonField.of(resourceName))

                    /**
                     * Sets [Builder.resourceName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.resourceName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun resourceName(resourceName: JsonField<String>) = apply {
                        this.resourceName = resourceName
                    }

                    /** Whether to use deployment-based Azure OpenAI URLs */
                    fun useDeploymentBasedUrls(useDeploymentBasedUrls: Boolean) =
                        useDeploymentBasedUrls(JsonField.of(useDeploymentBasedUrls))

                    /**
                     * Sets [Builder.useDeploymentBasedUrls] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.useDeploymentBasedUrls] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun useDeploymentBasedUrls(useDeploymentBasedUrls: JsonField<Boolean>) = apply {
                        this.useDeploymentBasedUrls = useDeploymentBasedUrls
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
                     * Returns an immutable instance of [Azure].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Azure =
                        Azure(
                            apiVersion,
                            baseUrl,
                            headers,
                            resourceName,
                            useDeploymentBasedUrls,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Azure = apply {
                    if (validated) {
                        return@apply
                    }

                    apiVersion()
                    baseUrl()
                    headers().ifPresent { it.validate() }
                    resourceName()
                    useDeploymentBasedUrls()
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
                    (if (apiVersion.asKnown().isPresent) 1 else 0) +
                        (if (baseUrl.asKnown().isPresent) 1 else 0) +
                        (headers.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (resourceName.asKnown().isPresent) 1 else 0) +
                        (if (useDeploymentBasedUrls.asKnown().isPresent) 1 else 0)

                /** Custom headers sent with every request to the Azure OpenAI provider */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(headers: Headers) = apply {
                            additionalProperties = headers.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Headers].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Headers = Headers(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StagehandInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                        return other is Headers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Headers{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Azure &&
                        apiVersion == other.apiVersion &&
                        baseUrl == other.baseUrl &&
                        headers == other.headers &&
                        resourceName == other.resourceName &&
                        useDeploymentBasedUrls == other.useDeploymentBasedUrls &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        apiVersion,
                        baseUrl,
                        headers,
                        resourceName,
                        useDeploymentBasedUrls,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Azure{apiVersion=$apiVersion, baseUrl=$baseUrl, headers=$headers, resourceName=$resourceName, useDeploymentBasedUrls=$useDeploymentBasedUrls, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProviderOptions &&
                    azure == other.azure &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(azure, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProviderOptions{azure=$azure, additionalProperties=$additionalProperties}"
        }

        /** Custom headers sent with every request to the model provider */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AzureEntraModelConfigObject &&
                auth == other.auth &&
                modelName == other.modelName &&
                provider == other.provider &&
                providerOptions == other.providerOptions &&
                baseUrl == other.baseUrl &&
                headers == other.headers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                auth,
                modelName,
                provider,
                providerOptions,
                baseUrl,
                headers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AzureEntraModelConfigObject{auth=$auth, modelName=$modelName, provider=$provider, providerOptions=$providerOptions, baseUrl=$baseUrl, headers=$headers, additionalProperties=$additionalProperties}"
    }

    class AzureApiKeyModelConfigObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val provider: JsonValue,
        private val providerOptions: JsonField<ProviderOptions>,
        private val apiKey: JsonField<String>,
        private val baseUrl: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonValue = JsonMissing.of(),
            @JsonProperty("providerOptions")
            @ExcludeMissing
            providerOptions: JsonField<ProviderOptions> = JsonMissing.of(),
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
        ) : this(modelName, provider, providerOptions, apiKey, baseUrl, headers, mutableMapOf())

        /**
         * Model name string with provider prefix (e.g., 'openai/gpt-5-nano')
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modelName(): String = modelName.getRequired("modelName")

        /**
         * Azure OpenAI model provider
         *
         * Expected to always return the following:
         * ```java
         * JsonValue.from("azure")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonValue = provider

        /**
         * Azure provider-specific model configuration
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun providerOptions(): ProviderOptions = providerOptions.getRequired("providerOptions")

        /**
         * API key for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

        /**
         * Base URL for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

        /**
         * Custom headers sent with every request to the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * Returns the raw JSON value of [modelName].
         *
         * Unlike [modelName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modelName") @ExcludeMissing fun _modelName(): JsonField<String> = modelName

        /**
         * Returns the raw JSON value of [providerOptions].
         *
         * Unlike [providerOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("providerOptions")
        @ExcludeMissing
        fun _providerOptions(): JsonField<ProviderOptions> = providerOptions

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
             * [AzureApiKeyModelConfigObject].
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * .providerOptions()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AzureApiKeyModelConfigObject]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var provider: JsonValue = JsonValue.from("azure")
            private var providerOptions: JsonField<ProviderOptions>? = null
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(azureApiKeyModelConfigObject: AzureApiKeyModelConfigObject) = apply {
                modelName = azureApiKeyModelConfigObject.modelName
                provider = azureApiKeyModelConfigObject.provider
                providerOptions = azureApiKeyModelConfigObject.providerOptions
                apiKey = azureApiKeyModelConfigObject.apiKey
                baseUrl = azureApiKeyModelConfigObject.baseUrl
                headers = azureApiKeyModelConfigObject.headers
                additionalProperties =
                    azureApiKeyModelConfigObject.additionalProperties.toMutableMap()
            }

            /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("azure")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonValue) = apply { this.provider = provider }

            /** Azure provider-specific model configuration */
            fun providerOptions(providerOptions: ProviderOptions) =
                providerOptions(JsonField.of(providerOptions))

            /**
             * Sets [Builder.providerOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerOptions] with a well-typed [ProviderOptions]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun providerOptions(providerOptions: JsonField<ProviderOptions>) = apply {
                this.providerOptions = providerOptions
            }

            /** API key for the model provider */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Base URL for the model provider */
            fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** Custom headers sent with every request to the model provider */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

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
             * Returns an immutable instance of [AzureApiKeyModelConfigObject].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * .providerOptions()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AzureApiKeyModelConfigObject =
                AzureApiKeyModelConfigObject(
                    checkRequired("modelName", modelName),
                    provider,
                    checkRequired("providerOptions", providerOptions),
                    apiKey,
                    baseUrl,
                    headers,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AzureApiKeyModelConfigObject = apply {
            if (validated) {
                return@apply
            }

            modelName()
            _provider().let {
                if (it != JsonValue.from("azure")) {
                    throw StagehandInvalidDataException("'provider' is invalid, received $it")
                }
            }
            providerOptions().validate()
            apiKey()
            baseUrl()
            headers().ifPresent { it.validate() }
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
                provider.let { if (it == JsonValue.from("azure")) 1 else 0 } +
                (providerOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0)

        /** Azure provider-specific model configuration */
        class ProviderOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val azure: JsonField<Azure>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("azure") @ExcludeMissing azure: JsonField<Azure> = JsonMissing.of()
            ) : this(azure, mutableMapOf())

            /**
             * Azure OpenAI provider-specific settings
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun azure(): Azure = azure.getRequired("azure")

            /**
             * Returns the raw JSON value of [azure].
             *
             * Unlike [azure], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("azure") @ExcludeMissing fun _azure(): JsonField<Azure> = azure

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
                 * Returns a mutable builder for constructing an instance of [ProviderOptions].
                 *
                 * The following fields are required:
                 * ```java
                 * .azure()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProviderOptions]. */
            class Builder internal constructor() {

                private var azure: JsonField<Azure>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(providerOptions: ProviderOptions) = apply {
                    azure = providerOptions.azure
                    additionalProperties = providerOptions.additionalProperties.toMutableMap()
                }

                /** Azure OpenAI provider-specific settings */
                fun azure(azure: Azure) = azure(JsonField.of(azure))

                /**
                 * Sets [Builder.azure] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azure] with a well-typed [Azure] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun azure(azure: JsonField<Azure>) = apply { this.azure = azure }

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
                 * Returns an immutable instance of [ProviderOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .azure()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ProviderOptions =
                    ProviderOptions(
                        checkRequired("azure", azure),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ProviderOptions = apply {
                if (validated) {
                    return@apply
                }

                azure().validate()
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
            internal fun validity(): Int = (azure.asKnown().getOrNull()?.validity() ?: 0)

            /** Azure OpenAI provider-specific settings */
            class Azure
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiVersion: JsonField<String>,
                private val baseUrl: JsonField<String>,
                private val headers: JsonField<Headers>,
                private val resourceName: JsonField<String>,
                private val useDeploymentBasedUrls: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("apiVersion")
                    @ExcludeMissing
                    apiVersion: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("baseURL")
                    @ExcludeMissing
                    baseUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("headers")
                    @ExcludeMissing
                    headers: JsonField<Headers> = JsonMissing.of(),
                    @JsonProperty("resourceName")
                    @ExcludeMissing
                    resourceName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("useDeploymentBasedUrls")
                    @ExcludeMissing
                    useDeploymentBasedUrls: JsonField<Boolean> = JsonMissing.of(),
                ) : this(
                    apiVersion,
                    baseUrl,
                    headers,
                    resourceName,
                    useDeploymentBasedUrls,
                    mutableMapOf(),
                )

                /**
                 * Azure OpenAI API version
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun apiVersion(): Optional<String> = apiVersion.getOptional("apiVersion")

                /**
                 * Base URL for the Azure OpenAI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

                /**
                 * Custom headers sent with every request to the Azure OpenAI provider
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun headers(): Optional<Headers> = headers.getOptional("headers")

                /**
                 * Azure OpenAI resource name
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun resourceName(): Optional<String> = resourceName.getOptional("resourceName")

                /**
                 * Whether to use deployment-based Azure OpenAI URLs
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun useDeploymentBasedUrls(): Optional<Boolean> =
                    useDeploymentBasedUrls.getOptional("useDeploymentBasedUrls")

                /**
                 * Returns the raw JSON value of [apiVersion].
                 *
                 * Unlike [apiVersion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("apiVersion")
                @ExcludeMissing
                fun _apiVersion(): JsonField<String> = apiVersion

                /**
                 * Returns the raw JSON value of [baseUrl].
                 *
                 * Unlike [baseUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("baseURL") @ExcludeMissing fun _baseUrl(): JsonField<String> = baseUrl

                /**
                 * Returns the raw JSON value of [headers].
                 *
                 * Unlike [headers], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("headers")
                @ExcludeMissing
                fun _headers(): JsonField<Headers> = headers

                /**
                 * Returns the raw JSON value of [resourceName].
                 *
                 * Unlike [resourceName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("resourceName")
                @ExcludeMissing
                fun _resourceName(): JsonField<String> = resourceName

                /**
                 * Returns the raw JSON value of [useDeploymentBasedUrls].
                 *
                 * Unlike [useDeploymentBasedUrls], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("useDeploymentBasedUrls")
                @ExcludeMissing
                fun _useDeploymentBasedUrls(): JsonField<Boolean> = useDeploymentBasedUrls

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

                    /** Returns a mutable builder for constructing an instance of [Azure]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Azure]. */
                class Builder internal constructor() {

                    private var apiVersion: JsonField<String> = JsonMissing.of()
                    private var baseUrl: JsonField<String> = JsonMissing.of()
                    private var headers: JsonField<Headers> = JsonMissing.of()
                    private var resourceName: JsonField<String> = JsonMissing.of()
                    private var useDeploymentBasedUrls: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(azure: Azure) = apply {
                        apiVersion = azure.apiVersion
                        baseUrl = azure.baseUrl
                        headers = azure.headers
                        resourceName = azure.resourceName
                        useDeploymentBasedUrls = azure.useDeploymentBasedUrls
                        additionalProperties = azure.additionalProperties.toMutableMap()
                    }

                    /** Azure OpenAI API version */
                    fun apiVersion(apiVersion: String) = apiVersion(JsonField.of(apiVersion))

                    /**
                     * Sets [Builder.apiVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiVersion] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiVersion(apiVersion: JsonField<String>) = apply {
                        this.apiVersion = apiVersion
                    }

                    /** Base URL for the Azure OpenAI provider */
                    fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

                    /**
                     * Sets [Builder.baseUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.baseUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

                    /** Custom headers sent with every request to the Azure OpenAI provider */
                    fun headers(headers: Headers) = headers(JsonField.of(headers))

                    /**
                     * Sets [Builder.headers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.headers] with a well-typed [Headers] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

                    /** Azure OpenAI resource name */
                    fun resourceName(resourceName: String) =
                        resourceName(JsonField.of(resourceName))

                    /**
                     * Sets [Builder.resourceName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.resourceName] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun resourceName(resourceName: JsonField<String>) = apply {
                        this.resourceName = resourceName
                    }

                    /** Whether to use deployment-based Azure OpenAI URLs */
                    fun useDeploymentBasedUrls(useDeploymentBasedUrls: Boolean) =
                        useDeploymentBasedUrls(JsonField.of(useDeploymentBasedUrls))

                    /**
                     * Sets [Builder.useDeploymentBasedUrls] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.useDeploymentBasedUrls] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun useDeploymentBasedUrls(useDeploymentBasedUrls: JsonField<Boolean>) = apply {
                        this.useDeploymentBasedUrls = useDeploymentBasedUrls
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
                     * Returns an immutable instance of [Azure].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Azure =
                        Azure(
                            apiVersion,
                            baseUrl,
                            headers,
                            resourceName,
                            useDeploymentBasedUrls,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws StagehandInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Azure = apply {
                    if (validated) {
                        return@apply
                    }

                    apiVersion()
                    baseUrl()
                    headers().ifPresent { it.validate() }
                    resourceName()
                    useDeploymentBasedUrls()
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
                    (if (apiVersion.asKnown().isPresent) 1 else 0) +
                        (if (baseUrl.asKnown().isPresent) 1 else 0) +
                        (headers.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (resourceName.asKnown().isPresent) 1 else 0) +
                        (if (useDeploymentBasedUrls.asKnown().isPresent) 1 else 0)

                /** Custom headers sent with every request to the Azure OpenAI provider */
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(headers: Headers) = apply {
                            additionalProperties = headers.additionalProperties.toMutableMap()
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
                         * Returns an immutable instance of [Headers].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Headers = Headers(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws StagehandInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
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

                        return other is Headers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Headers{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Azure &&
                        apiVersion == other.apiVersion &&
                        baseUrl == other.baseUrl &&
                        headers == other.headers &&
                        resourceName == other.resourceName &&
                        useDeploymentBasedUrls == other.useDeploymentBasedUrls &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        apiVersion,
                        baseUrl,
                        headers,
                        resourceName,
                        useDeploymentBasedUrls,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Azure{apiVersion=$apiVersion, baseUrl=$baseUrl, headers=$headers, resourceName=$resourceName, useDeploymentBasedUrls=$useDeploymentBasedUrls, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProviderOptions &&
                    azure == other.azure &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(azure, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProviderOptions{azure=$azure, additionalProperties=$additionalProperties}"
        }

        /** Custom headers sent with every request to the model provider */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AzureApiKeyModelConfigObject &&
                modelName == other.modelName &&
                provider == other.provider &&
                providerOptions == other.providerOptions &&
                apiKey == other.apiKey &&
                baseUrl == other.baseUrl &&
                headers == other.headers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                modelName,
                provider,
                providerOptions,
                apiKey,
                baseUrl,
                headers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AzureApiKeyModelConfigObject{modelName=$modelName, provider=$provider, providerOptions=$providerOptions, apiKey=$apiKey, baseUrl=$baseUrl, headers=$headers, additionalProperties=$additionalProperties}"
    }

    class GenericModelConfigObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val baseUrl: JsonField<String>,
        private val headers: JsonField<Headers>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("headers") @ExcludeMissing headers: JsonField<Headers> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(modelName, apiKey, baseUrl, headers, provider, mutableMapOf())

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
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

        /**
         * Base URL for the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

        /**
         * Custom headers sent with every request to the model provider
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun headers(): Optional<Headers> = headers.getOptional("headers")

        /**
         * AI provider for the model (or provide a baseURL endpoint instead)
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

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
             * Returns a mutable builder for constructing an instance of [GenericModelConfigObject].
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GenericModelConfigObject]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var headers: JsonField<Headers> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(genericModelConfigObject: GenericModelConfigObject) = apply {
                modelName = genericModelConfigObject.modelName
                apiKey = genericModelConfigObject.apiKey
                baseUrl = genericModelConfigObject.baseUrl
                headers = genericModelConfigObject.headers
                provider = genericModelConfigObject.provider
                additionalProperties = genericModelConfigObject.additionalProperties.toMutableMap()
            }

            /** Model name string with provider prefix (e.g., 'openai/gpt-5-nano') */
            fun modelName(modelName: String) = modelName(JsonField.of(modelName))

            /**
             * Sets [Builder.modelName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modelName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modelName(modelName: JsonField<String>) = apply { this.modelName = modelName }

            /** API key for the model provider */
            fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

            /** Base URL for the model provider */
            fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

            /**
             * Sets [Builder.baseUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

            /** Custom headers sent with every request to the model provider */
            fun headers(headers: Headers) = headers(JsonField.of(headers))

            /**
             * Sets [Builder.headers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.headers] with a well-typed [Headers] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

            /** AI provider for the model (or provide a baseURL endpoint instead) */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [GenericModelConfigObject].
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
            fun build(): GenericModelConfigObject =
                GenericModelConfigObject(
                    checkRequired("modelName", modelName),
                    apiKey,
                    baseUrl,
                    headers,
                    provider,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws StagehandInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): GenericModelConfigObject = apply {
            if (validated) {
                return@apply
            }

            modelName()
            apiKey()
            baseUrl()
            headers().ifPresent { it.validate() }
            provider().ifPresent { it.validate() }
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
                (if (apiKey.asKnown().isPresent) 1 else 0) +
                (if (baseUrl.asKnown().isPresent) 1 else 0) +
                (headers.asKnown().getOrNull()?.validity() ?: 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0)

        /** Custom headers sent with every request to the model provider */
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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
                BEDROCK,
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
                    BEDROCK -> Value.BEDROCK
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
                    BEDROCK -> Known.BEDROCK
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws StagehandInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

            return other is GenericModelConfigObject &&
                modelName == other.modelName &&
                apiKey == other.apiKey &&
                baseUrl == other.baseUrl &&
                headers == other.headers &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(modelName, apiKey, baseUrl, headers, provider, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GenericModelConfigObject{modelName=$modelName, apiKey=$apiKey, baseUrl=$baseUrl, headers=$headers, provider=$provider, additionalProperties=$additionalProperties}"
    }
}
