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

class SessionActResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(data, success, mutableMapOf())

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Indicates whether the request was successful
     *
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun success(): Boolean = success.getRequired("success")

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
         * .data()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionActResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var success: JsonField<Boolean>? = null
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

        /** Indicates whether the request was successful */
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (data.asKnown().getOrNull()?.validity() ?: 0) + (if (success.asKnown().isPresent) 1 else 0)

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

            /** Action object returned by observe and used by act */
            class Action
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val description: JsonField<String>,
                private val selector: JsonField<String>,
                private val arguments: JsonField<List<String>>,
                private val backendNodeId: JsonField<Double>,
                private val method: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("selector")
                    @ExcludeMissing
                    selector: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("arguments")
                    @ExcludeMissing
                    arguments: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("backendNodeId")
                    @ExcludeMissing
                    backendNodeId: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<String> = JsonMissing.of(),
                ) : this(description, selector, arguments, backendNodeId, method, mutableMapOf())

                /**
                 * Human-readable description of the action
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun description(): String = description.getRequired("description")

                /**
                 * CSS selector or XPath for the element
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun selector(): String = selector.getRequired("selector")

                /**
                 * Arguments to pass to the method
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

                /**
                 * Backend node ID for the element
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun backendNodeId(): Optional<Double> = backendNodeId.getOptional("backendNodeId")

                /**
                 * The method to execute (click, fill, etc.)
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun method(): Optional<String> = method.getOptional("method")

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [selector].
                 *
                 * Unlike [selector], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("selector")
                @ExcludeMissing
                fun _selector(): JsonField<String> = selector

                /**
                 * Returns the raw JSON value of [arguments].
                 *
                 * Unlike [arguments], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("arguments")
                @ExcludeMissing
                fun _arguments(): JsonField<List<String>> = arguments

                /**
                 * Returns the raw JSON value of [backendNodeId].
                 *
                 * Unlike [backendNodeId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("backendNodeId")
                @ExcludeMissing
                fun _backendNodeId(): JsonField<Double> = backendNodeId

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var backendNodeId: JsonField<Double> = JsonMissing.of()
                    private var method: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(action: Action) = apply {
                        description = action.description
                        selector = action.selector
                        arguments = action.arguments.map { it.toMutableList() }
                        backendNodeId = action.backendNodeId
                        method = action.method
                        additionalProperties = action.additionalProperties.toMutableMap()
                    }

                    /** Human-readable description of the action */
                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** CSS selector or XPath for the element */
                    fun selector(selector: String) = selector(JsonField.of(selector))

                    /**
                     * Sets [Builder.selector] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.selector] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun selector(selector: JsonField<String>) = apply { this.selector = selector }

                    /** Arguments to pass to the method */
                    fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                    /**
                     * Sets [Builder.arguments] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.arguments] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    /** Backend node ID for the element */
                    fun backendNodeId(backendNodeId: Double) =
                        backendNodeId(JsonField.of(backendNodeId))

                    /**
                     * Sets [Builder.backendNodeId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.backendNodeId] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun backendNodeId(backendNodeId: JsonField<Double>) = apply {
                        this.backendNodeId = backendNodeId
                    }

                    /** The method to execute (click, fill, etc.) */
                    fun method(method: String) = method(JsonField.of(method))

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun method(method: JsonField<String>) = apply { this.method = method }

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
                            backendNodeId,
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
                    backendNodeId()
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (description.asKnown().isPresent) 1 else 0) +
                        (if (selector.asKnown().isPresent) 1 else 0) +
                        (arguments.asKnown().getOrNull()?.size ?: 0) +
                        (if (backendNodeId.asKnown().isPresent) 1 else 0) +
                        (if (method.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        description == other.description &&
                        selector == other.selector &&
                        arguments == other.arguments &&
                        backendNodeId == other.backendNodeId &&
                        method == other.method &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        description,
                        selector,
                        arguments,
                        backendNodeId,
                        method,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Action{description=$description, selector=$selector, arguments=$arguments, backendNodeId=$backendNodeId, method=$method, additionalProperties=$additionalProperties}"
            }

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
