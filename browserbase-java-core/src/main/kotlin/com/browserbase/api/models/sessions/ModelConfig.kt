// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.Enum
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.errors.BrowserbaseInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ModelConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKey: JsonField<String>,
    private val baseUrl: JsonField<String>,
    private val model: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("apiKey") @ExcludeMissing apiKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("baseURL") @ExcludeMissing baseUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
    ) : this(apiKey, baseUrl, model, provider, mutableMapOf())

    /**
     * API key for the model provider
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKey(): Optional<String> = apiKey.getOptional("apiKey")

    /**
     * Custom base URL for API
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baseUrl(): Optional<String> = baseUrl.getOptional("baseURL")

    /**
     * Model name
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<String> = model.getOptional("model")

    /**
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provider(): Optional<Provider> = provider.getOptional("provider")

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
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<String> = model

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

        /** Returns a mutable builder for constructing an instance of [ModelConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModelConfig]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String> = JsonMissing.of()
        private var baseUrl: JsonField<String> = JsonMissing.of()
        private var model: JsonField<String> = JsonMissing.of()
        private var provider: JsonField<Provider> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modelConfig: ModelConfig) = apply {
            apiKey = modelConfig.apiKey
            baseUrl = modelConfig.baseUrl
            model = modelConfig.model
            provider = modelConfig.provider
            additionalProperties = modelConfig.additionalProperties.toMutableMap()
        }

        /** API key for the model provider */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * Sets [Builder.apiKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /** Custom base URL for API */
        fun baseUrl(baseUrl: String) = baseUrl(JsonField.of(baseUrl))

        /**
         * Sets [Builder.baseUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun baseUrl(baseUrl: JsonField<String>) = apply { this.baseUrl = baseUrl }

        /** Model name */
        fun model(model: String) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<String>) = apply { this.model = model }

        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [ModelConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ModelConfig =
            ModelConfig(apiKey, baseUrl, model, provider, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ModelConfig = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        baseUrl()
        model()
        provider().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (apiKey.asKnown().isPresent) 1 else 0) +
            (if (baseUrl.asKnown().isPresent) 1 else 0) +
            (if (model.asKnown().isPresent) 1 else 0) +
            (provider.asKnown().getOrNull()?.validity() ?: 0)

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPENAI,
            ANTHROPIC,
            GOOGLE,
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
                OPENAI -> Known.OPENAI
                ANTHROPIC -> Known.ANTHROPIC
                GOOGLE -> Known.GOOGLE
                else -> throw BrowserbaseInvalidDataException("Unknown Provider: $value")
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModelConfig &&
            apiKey == other.apiKey &&
            baseUrl == other.baseUrl &&
            model == other.model &&
            provider == other.provider &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(apiKey, baseUrl, model, provider, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModelConfig{apiKey=$apiKey, baseUrl=$baseUrl, model=$model, provider=$provider, additionalProperties=$additionalProperties}"
}
