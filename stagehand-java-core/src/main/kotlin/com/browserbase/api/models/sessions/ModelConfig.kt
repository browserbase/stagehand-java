// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.BaseDeserializer
import com.browserbase.api.core.BaseSerializer
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.allMaxBy
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.getOrThrow
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

/**
 * Model name string with provider prefix (e.g., 'openai/gpt-5-nano', 'anthropic/claude-4.5-opus')
 */
@JsonDeserialize(using = ModelConfig.Deserializer::class)
@JsonSerialize(using = ModelConfig.Serializer::class)
class ModelConfig
private constructor(
    private val name: String? = null,
    private val modelConfigObject: ModelConfigObject? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Model name string with provider prefix (e.g., 'openai/gpt-5-nano',
     * 'anthropic/claude-4.5-opus')
     */
    fun name(): Optional<String> = Optional.ofNullable(name)

    fun modelConfigObject(): Optional<ModelConfigObject> = Optional.ofNullable(modelConfigObject)

    fun isName(): Boolean = name != null

    fun isModelConfigObject(): Boolean = modelConfigObject != null

    /**
     * Model name string with provider prefix (e.g., 'openai/gpt-5-nano',
     * 'anthropic/claude-4.5-opus')
     */
    fun asName(): String = name.getOrThrow("name")

    fun asModelConfigObject(): ModelConfigObject = modelConfigObject.getOrThrow("modelConfigObject")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            name != null -> visitor.visitName(name)
            modelConfigObject != null -> visitor.visitModelConfigObject(modelConfigObject)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitName(name: String) {}

                override fun visitModelConfigObject(modelConfigObject: ModelConfigObject) {
                    modelConfigObject.validate()
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
                override fun visitName(name: String) = 1

                override fun visitModelConfigObject(modelConfigObject: ModelConfigObject) =
                    modelConfigObject.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            name == other.name &&
            modelConfigObject == other.modelConfigObject
    }

    override fun hashCode(): Int = Objects.hash(name, modelConfigObject)

    override fun toString(): String =
        when {
            name != null -> "ModelConfig{name=$name}"
            modelConfigObject != null -> "ModelConfig{modelConfigObject=$modelConfigObject}"
            _json != null -> "ModelConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ModelConfig")
        }

    companion object {

        /**
         * Model name string with provider prefix (e.g., 'openai/gpt-5-nano',
         * 'anthropic/claude-4.5-opus')
         */
        @JvmStatic fun ofName(name: String) = ModelConfig(name = name)

        @JvmStatic
        fun ofModelConfigObject(modelConfigObject: ModelConfigObject) =
            ModelConfig(modelConfigObject = modelConfigObject)
    }

    /**
     * An interface that defines how to map each variant of [ModelConfig] to a value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Model name string with provider prefix (e.g., 'openai/gpt-5-nano',
         * 'anthropic/claude-4.5-opus')
         */
        fun visitName(name: String): T

        fun visitModelConfigObject(modelConfigObject: ModelConfigObject): T

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
                        tryDeserialize(node, jacksonTypeRef<ModelConfigObject>())?.let {
                            ModelConfig(modelConfigObject = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            ModelConfig(name = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from array).
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
                value.name != null -> generator.writeObject(value.name)
                value.modelConfigObject != null -> generator.writeObject(value.modelConfigObject)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ModelConfig")
            }
        }
    }

    class ModelConfigObject
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val modelName: JsonField<String>,
        private val apiKey: JsonField<String>,
        private val baseUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("modelName")
            @ExcludeMissing
            modelName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        ) : this(modelName, apiKey, baseUrl, mutableMapOf())

        /**
         * Model name string without prefix (e.g., 'gpt-5-nano', 'claude-4.5-opus')
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
             * Returns a mutable builder for constructing an instance of [ModelConfigObject].
             *
             * The following fields are required:
             * ```java
             * .modelName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ModelConfigObject]. */
        class Builder internal constructor() {

            private var modelName: JsonField<String>? = null
            private var apiKey: JsonField<String> = JsonMissing.of()
            private var baseUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(modelConfigObject: ModelConfigObject) = apply {
                modelName = modelConfigObject.modelName
                apiKey = modelConfigObject.apiKey
                baseUrl = modelConfigObject.baseUrl
                additionalProperties = modelConfigObject.additionalProperties.toMutableMap()
            }

            /** Model name string without prefix (e.g., 'gpt-5-nano', 'claude-4.5-opus') */
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
             * Returns an immutable instance of [ModelConfigObject].
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
            fun build(): ModelConfigObject =
                ModelConfigObject(
                    checkRequired("modelName", modelName),
                    apiKey,
                    baseUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ModelConfigObject = apply {
            if (validated) {
                return@apply
            }

            modelName()
            apiKey()
            baseUrl()
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
                (if (baseUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ModelConfigObject &&
                modelName == other.modelName &&
                apiKey == other.apiKey &&
                baseUrl == other.baseUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(modelName, apiKey, baseUrl, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ModelConfigObject{modelName=$modelName, apiKey=$apiKey, baseUrl=$baseUrl, additionalProperties=$additionalProperties}"
    }
}
