// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.checkKnown
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.toImmutable
import com.browserbase.api.errors.BrowserbaseInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Action
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val arguments: JsonField<List<String>>,
    private val description: JsonField<String>,
    private val method: JsonField<String>,
    private val selector: JsonField<String>,
    private val backendNodeId: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("arguments")
        @ExcludeMissing
        arguments: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selector") @ExcludeMissing selector: JsonField<String> = JsonMissing.of(),
        @JsonProperty("backendNodeId")
        @ExcludeMissing
        backendNodeId: JsonField<Long> = JsonMissing.of(),
    ) : this(arguments, description, method, selector, backendNodeId, mutableMapOf())

    /**
     * Arguments for the method
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun arguments(): List<String> = arguments.getRequired("arguments")

    /**
     * Human-readable description of the action
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Method to execute (e.g., "click", "fill")
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): String = method.getRequired("method")

    /**
     * CSS or XPath selector for the element
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun selector(): String = selector.getRequired("selector")

    /**
     * CDP backend node ID
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backendNodeId(): Optional<Long> = backendNodeId.getOptional("backendNodeId")

    /**
     * Returns the raw JSON value of [arguments].
     *
     * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arguments") @ExcludeMissing fun _arguments(): JsonField<List<String>> = arguments

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

    /**
     * Returns the raw JSON value of [selector].
     *
     * Unlike [selector], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

    /**
     * Returns the raw JSON value of [backendNodeId].
     *
     * Unlike [backendNodeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("backendNodeId")
    @ExcludeMissing
    fun _backendNodeId(): JsonField<Long> = backendNodeId

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
         * .arguments()
         * .description()
         * .method()
         * .selector()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Action]. */
    class Builder internal constructor() {

        private var arguments: JsonField<MutableList<String>>? = null
        private var description: JsonField<String>? = null
        private var method: JsonField<String>? = null
        private var selector: JsonField<String>? = null
        private var backendNodeId: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(action: Action) = apply {
            arguments = action.arguments.map { it.toMutableList() }
            description = action.description
            method = action.method
            selector = action.selector
            backendNodeId = action.backendNodeId
            additionalProperties = action.additionalProperties.toMutableMap()
        }

        /** Arguments for the method */
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

        /** Method to execute (e.g., "click", "fill") */
        fun method(method: String) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun method(method: JsonField<String>) = apply { this.method = method }

        /** CSS or XPath selector for the element */
        fun selector(selector: String) = selector(JsonField.of(selector))

        /**
         * Sets [Builder.selector] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selector] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun selector(selector: JsonField<String>) = apply { this.selector = selector }

        /** CDP backend node ID */
        fun backendNodeId(backendNodeId: Long) = backendNodeId(JsonField.of(backendNodeId))

        /**
         * Sets [Builder.backendNodeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backendNodeId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun backendNodeId(backendNodeId: JsonField<Long>) = apply {
            this.backendNodeId = backendNodeId
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
         * Returns an immutable instance of [Action].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .arguments()
         * .description()
         * .method()
         * .selector()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Action =
            Action(
                checkRequired("arguments", arguments).map { it.toImmutable() },
                checkRequired("description", description),
                checkRequired("method", method),
                checkRequired("selector", selector),
                backendNodeId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Action = apply {
        if (validated) {
            return@apply
        }

        arguments()
        description()
        method()
        selector()
        backendNodeId()
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
        (arguments.asKnown().getOrNull()?.size ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (method.asKnown().isPresent) 1 else 0) +
            (if (selector.asKnown().isPresent) 1 else 0) +
            (if (backendNodeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Action &&
            arguments == other.arguments &&
            description == other.description &&
            method == other.method &&
            selector == other.selector &&
            backendNodeId == other.backendNodeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(arguments, description, method, selector, backendNodeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Action{arguments=$arguments, description=$description, method=$method, selector=$selector, backendNodeId=$backendNodeId, additionalProperties=$additionalProperties}"
}
