// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.BaseDeserializer
import com.browserbase.api.core.BaseSerializer
import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.allMaxBy
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

/** Default extraction result */
@JsonDeserialize(using = SessionExtractResponse.Deserializer::class)
@JsonSerialize(using = SessionExtractResponse.Serializer::class)
class SessionExtractResponse
private constructor(
    private val extraction: Extraction? = null,
    private val custom: Custom? = null,
    private val _json: JsonValue? = null,
) {

    /** Default extraction result */
    fun extraction(): Optional<Extraction> = Optional.ofNullable(extraction)

    /** Structured data matching provided schema */
    fun custom(): Optional<Custom> = Optional.ofNullable(custom)

    fun isExtraction(): Boolean = extraction != null

    fun isCustom(): Boolean = custom != null

    /** Default extraction result */
    fun asExtraction(): Extraction = extraction.getOrThrow("extraction")

    /** Structured data matching provided schema */
    fun asCustom(): Custom = custom.getOrThrow("custom")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            extraction != null -> visitor.visitExtraction(extraction)
            custom != null -> visitor.visitCustom(custom)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): SessionExtractResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitExtraction(extraction: Extraction) {
                    extraction.validate()
                }

                override fun visitCustom(custom: Custom) {
                    custom.validate()
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
                override fun visitExtraction(extraction: Extraction) = extraction.validity()

                override fun visitCustom(custom: Custom) = custom.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionExtractResponse &&
            extraction == other.extraction &&
            custom == other.custom
    }

    override fun hashCode(): Int = Objects.hash(extraction, custom)

    override fun toString(): String =
        when {
            extraction != null -> "SessionExtractResponse{extraction=$extraction}"
            custom != null -> "SessionExtractResponse{custom=$custom}"
            _json != null -> "SessionExtractResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SessionExtractResponse")
        }

    companion object {

        /** Default extraction result */
        @JvmStatic
        fun ofExtraction(extraction: Extraction) = SessionExtractResponse(extraction = extraction)

        /** Structured data matching provided schema */
        @JvmStatic fun ofCustom(custom: Custom) = SessionExtractResponse(custom = custom)
    }

    /**
     * An interface that defines how to map each variant of [SessionExtractResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Default extraction result */
        fun visitExtraction(extraction: Extraction): T

        /** Structured data matching provided schema */
        fun visitCustom(custom: Custom): T

        /**
         * Maps an unknown variant of [SessionExtractResponse] to a value of type [T].
         *
         * An instance of [SessionExtractResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws StagehandInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw StagehandInvalidDataException("Unknown SessionExtractResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<SessionExtractResponse>(SessionExtractResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SessionExtractResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Extraction>())?.let {
                            SessionExtractResponse(extraction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Custom>())?.let {
                            SessionExtractResponse(custom = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> SessionExtractResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<SessionExtractResponse>(SessionExtractResponse::class) {

        override fun serialize(
            value: SessionExtractResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.extraction != null -> generator.writeObject(value.extraction)
                value.custom != null -> generator.writeObject(value.custom)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SessionExtractResponse")
            }
        }
    }

    /** Default extraction result */
    class Extraction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val extraction: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("extraction")
            @ExcludeMissing
            extraction: JsonField<String> = JsonMissing.of()
        ) : this(extraction, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extraction(): Optional<String> = extraction.getOptional("extraction")

        /**
         * Returns the raw JSON value of [extraction].
         *
         * Unlike [extraction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extraction")
        @ExcludeMissing
        fun _extraction(): JsonField<String> = extraction

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

            /** Returns a mutable builder for constructing an instance of [Extraction]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Extraction]. */
        class Builder internal constructor() {

            private var extraction: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extraction: Extraction) = apply {
                this.extraction = extraction.extraction
                additionalProperties = extraction.additionalProperties.toMutableMap()
            }

            fun extraction(extraction: String) = extraction(JsonField.of(extraction))

            /**
             * Sets [Builder.extraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extraction] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extraction(extraction: JsonField<String>) = apply { this.extraction = extraction }

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
             * Returns an immutable instance of [Extraction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Extraction = Extraction(extraction, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Extraction = apply {
            if (validated) {
                return@apply
            }

            extraction()
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
        @JvmSynthetic internal fun validity(): Int = (if (extraction.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Extraction &&
                extraction == other.extraction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(extraction, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Extraction{extraction=$extraction, additionalProperties=$additionalProperties}"
    }

    /** Structured data matching provided schema */
    class Custom
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

            /** Returns a mutable builder for constructing an instance of [Custom]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Custom]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(custom: Custom) = apply {
                additionalProperties = custom.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Custom].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Custom = Custom(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Custom = apply {
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

            return other is Custom && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Custom{additionalProperties=$additionalProperties}"
    }
}
