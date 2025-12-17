// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.Enum
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

class SessionActResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val success: JsonField<Success>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Success> = JsonMissing.of(),
    ) : this(data, success, mutableMapOf())

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Success = success.getRequired("success")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

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
         * .data()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionActResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var success: JsonField<Success>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionActResponse: SessionActResponse) = apply {
            data = sessionActResponse.data
            success = sessionActResponse.success
            additionalProperties = sessionActResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun success(success: Success) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Success] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Success>) = apply { this.success = success }

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
         * .data()
         * .success()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionActResponse =
            SessionActResponse(
                checkRequired("data", data),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionActResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        success().validate()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) +
            (success.asKnown().getOrNull()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val result: JsonField<Result>,
        private val actionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        ) : this(result, actionId, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Action ID for tracking
         *
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun actionId(): Optional<String> = actionId.getOptional("actionId")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [actionId].
         *
         * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var result: JsonField<Result>? = null
            private var actionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                result = data.result
                actionId = data.actionId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Action ID for tracking */
            fun actionId(actionId: String) = actionId(JsonField.of(actionId))

            /**
             * Sets [Builder.actionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(checkRequired("result", result), actionId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            result().validate()
            actionId()
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
            (result.asKnown().getOrNull()?.validity() ?: 0) +
                (if (actionId.asKnown().isPresent) 1 else 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actionDescription: JsonField<String>,
            private val actions: JsonField<List<Action>>,
            private val message: JsonField<String>,
            private val success: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actionDescription")
                @ExcludeMissing
                actionDescription: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<Action>> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("success")
                @ExcludeMissing
                success: JsonField<Boolean> = JsonMissing.of(),
            ) : this(actionDescription, actions, message, success, mutableMapOf())

            /**
             * Description of the action that was performed
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actionDescription(): String = actionDescription.getRequired("actionDescription")

            /**
             * List of actions that were executed
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actions(): List<Action> = actions.getRequired("actions")

            /**
             * Human-readable result message
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Whether the action completed successfully
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun success(): Boolean = success.getRequired("success")

            /**
             * Returns the raw JSON value of [actionDescription].
             *
             * Unlike [actionDescription], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("actionDescription")
            @ExcludeMissing
            fun _actionDescription(): JsonField<String> = actionDescription

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<Action>> = actions

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .actionDescription()
                 * .actions()
                 * .message()
                 * .success()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var actionDescription: JsonField<String>? = null
                private var actions: JsonField<MutableList<Action>>? = null
                private var message: JsonField<String>? = null
                private var success: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    actionDescription = result.actionDescription
                    actions = result.actions.map { it.toMutableList() }
                    message = result.message
                    success = result.success
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                /** Description of the action that was performed */
                fun actionDescription(actionDescription: String) =
                    actionDescription(JsonField.of(actionDescription))

                /**
                 * Sets [Builder.actionDescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actionDescription] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun actionDescription(actionDescription: JsonField<String>) = apply {
                    this.actionDescription = actionDescription
                }

                /** List of actions that were executed */
                fun actions(actions: List<Action>) = actions(JsonField.of(actions))

                /**
                 * Sets [Builder.actions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actions] with a well-typed `List<Action>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** Human-readable result message */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                /** Whether the action completed successfully */
                fun success(success: Boolean) = success(JsonField.of(success))

                /**
                 * Sets [Builder.success] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.success] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
                 * Returns an immutable instance of [Result].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .actionDescription()
                 * .actions()
                 * .message()
                 * .success()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("actionDescription", actionDescription),
                        checkRequired("actions", actions).map { it.toImmutable() },
                        checkRequired("message", message),
                        checkRequired("success", success),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                actionDescription()
                actions().forEach { it.validate() }
                message()
                success()
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
                (if (actionDescription.asKnown().isPresent) 1 else 0) +
                    (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (success.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    actionDescription == other.actionDescription &&
                    actions == other.actions &&
                    message == other.message &&
                    success == other.success &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(actionDescription, actions, message, success, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{actionDescription=$actionDescription, actions=$actions, message=$message, success=$success, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                result == other.result &&
                actionId == other.actionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(result, actionId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{result=$result, actionId=$actionId, additionalProperties=$additionalProperties}"
    }

    class Success @JsonCreator private constructor(private val value: JsonField<Boolean>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<Boolean> = value

        companion object {

            @JvmField val TRUE = of(true)

            @JvmStatic fun of(value: Boolean) = Success(JsonField.of(value))
        }

        /** An enum containing [Success]'s known values. */
        enum class Known {
            TRUE
        }

        /**
         * An enum containing [Success]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Success] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            /** An enum member indicating that [Success] was instantiated with an unknown value. */
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
                else -> throw StagehandInvalidDataException("Unknown Success: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * @throws StagehandInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asBoolean(): Boolean =
            _value().asBoolean().orElseThrow {
                StagehandInvalidDataException("Value is not a Boolean")
            }

        private var validated: Boolean = false

        fun validate(): Success = apply {
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

            return other is Success && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionActResponse &&
            data == other.data &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionActResponse{data=$data, success=$success, additionalProperties=$additionalProperties}"
}
