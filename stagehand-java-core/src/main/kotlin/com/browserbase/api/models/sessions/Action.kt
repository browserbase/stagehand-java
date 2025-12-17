// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.checkKnown
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.toImmutable
import com.browserbase.api.errors.StagehandInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Action object returned by observe and used by act */
class Action
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val description: JsonField<String>,
    private val selector: JsonField<String>,
    private val arguments: JsonField<List<String>>,
    private val method: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selector") @ExcludeMissing selector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arguments")
        @ExcludeMissing
        arguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
    ) : this(description, selector, arguments, method, mutableMapOf())

    /**
     * Human-readable description of the action
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * CSS selector or XPath for the element
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun selector(): String = selector.getRequired("selector")

    /**
     * Arguments to pass to the method
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

    /**
     * The method to execute (click, fill, etc.)
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun method(): Optional<String> = method.getOptional("method")

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [selector].
     *
     * Unlike [selector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arguments") @ExcludeMissing fun _arguments(): JsonField<List<String>> = arguments

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

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
         * Returns a mutable builder for constructing an instance of [Action].
         *
         * The following fields are required:
         * ```java
         * .description()
         * .selector()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Action]. */
    class Builder internal constructor() {

        private var description: JsonField<String>? = null
        private var selector: JsonField<String>? = null
        private var arguments: JsonField<MutableList<String>>? = null
        private var method: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(action: Action) = apply {
            description = action.description
            selector = action.selector
            arguments = action.arguments.map { it.toMutableList() }
            method = action.method
            additionalProperties = action.additionalProperties.toMutableMap()
        }

        /** Human-readable description of the action */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** CSS selector or XPath for the element */
        fun selector(selector: String) = selector(JsonField.of(selector))

        /**
         * Sets [Builder.selector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selector] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun selector(selector: JsonField<String>) = apply { this.selector = selector }

        /** Arguments to pass to the method */
        fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

        /**
         * Sets [Builder.arguments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arguments] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arguments(arguments: JsonField<List<String>>) = apply {
            this.arguments = arguments.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [arguments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArgument(argument: String) = apply {
            arguments =
                (arguments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("arguments", it).add(argument)
                }
        }

        /** The method to execute (click, fill, etc.) */
        fun method(method: String) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<String>) = apply { this.method = method }

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
         * Returns an immutable instance of [Action].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .description()
         * .selector()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Action =
            Action(
                checkRequired("description", description),
                checkRequired("selector", selector),
                (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                method,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Action = apply {
        if (validated) {
            return@apply
        }

        description()
        selector()
        arguments()
        method()
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
        (if (description.asKnown().isPresent) 1 else 0) +
            (if (selector.asKnown().isPresent) 1 else 0) +
            (arguments.asKnown().getOrNull()?.size ?: 0) +
            (if (method.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Action &&
            description == other.description &&
            selector == other.selector &&
            arguments == other.arguments &&
            method == other.method &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(description, selector, arguments, method, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Action{description=$description, selector=$selector, arguments=$arguments, method=$method, additionalProperties=$additionalProperties}"
}
