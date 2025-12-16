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
import kotlin.jvm.optionals.getOrNull

class SessionActResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<List<Action>>,
    private val message: JsonField<String>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(actions, message, success, mutableMapOf())

    /**
     * Actions that were executed
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * Result message
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): String = message.getRequired("message")

    /**
     * Whether the action succeeded
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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
         * Returns a mutable builder for constructing an instance of [SessionActResponse].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .message()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionActResponse]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<Action>>? = null
        private var message: JsonField<String>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionActResponse: SessionActResponse) = apply {
            actions = sessionActResponse.actions.map { it.toMutableList() }
            message = sessionActResponse.message
            success = sessionActResponse.success
            additionalProperties = sessionActResponse.additionalProperties.toMutableMap()
        }

        /** Actions that were executed */
        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        /** Result message */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Whether the action succeeded */
        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [SessionActResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .message()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionActResponse =
            SessionActResponse(
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("message", message),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionActResponse = apply {
        if (validated) {
            return@apply
        }

        actions().forEach { it.validate() }
        message()
        success()
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
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (if (success.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionActResponse &&
            actions == other.actions &&
            message == other.message &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(actions, message, success, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionActResponse{actions=$actions, message=$message, success=$success, additionalProperties=$additionalProperties}"
}
