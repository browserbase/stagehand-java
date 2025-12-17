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

class SessionExecuteResponse
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
         * Returns a mutable builder for constructing an instance of [SessionExecuteResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionExecuteResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var success: JsonField<Success>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionExecuteResponse: SessionExecuteResponse) = apply {
            data = sessionExecuteResponse.data
            success = sessionExecuteResponse.success
            additionalProperties = sessionExecuteResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SessionExecuteResponse].
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
        fun build(): SessionExecuteResponse =
            SessionExecuteResponse(
                checkRequired("data", data),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionExecuteResponse = apply {
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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of()
        ) : this(result, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                result = data.result
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
                Data(checkRequired("result", result), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            result().validate()
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
        @JvmSynthetic internal fun validity(): Int = (result.asKnown().getOrNull()?.validity() ?: 0)

        class Result
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actions: JsonField<List<Action>>,
            private val completed: JsonField<Boolean>,
            private val message: JsonField<String>,
            private val success: JsonField<Boolean>,
            private val metadata: JsonField<Metadata>,
            private val usage: JsonField<Usage>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<Action>> = JsonMissing.of(),
                @JsonProperty("completed")
                @ExcludeMissing
                completed: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
                @JsonProperty("success")
                @ExcludeMissing
                success: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
            ) : this(actions, completed, message, success, metadata, usage, mutableMapOf())

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actions(): List<Action> = actions.getRequired("actions")

            /**
             * Whether the agent finished its task
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun completed(): Boolean = completed.getRequired("completed")

            /**
             * Summary of what the agent accomplished
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Whether the agent completed successfully
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun success(): Boolean = success.getRequired("success")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun usage(): Optional<Usage> = usage.getOptional("usage")

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<Action>> = actions

            /**
             * Returns the raw JSON value of [completed].
             *
             * Unlike [completed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("completed")
            @ExcludeMissing
            fun _completed(): JsonField<Boolean> = completed

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

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
                 * .actions()
                 * .completed()
                 * .message()
                 * .success()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var actions: JsonField<MutableList<Action>>? = null
                private var completed: JsonField<Boolean>? = null
                private var message: JsonField<String>? = null
                private var success: JsonField<Boolean>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var usage: JsonField<Usage> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    actions = result.actions.map { it.toMutableList() }
                    completed = result.completed
                    message = result.message
                    success = result.success
                    metadata = result.metadata
                    usage = result.usage
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

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

                /** Whether the agent finished its task */
                fun completed(completed: Boolean) = completed(JsonField.of(completed))

                /**
                 * Sets [Builder.completed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.completed] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun completed(completed: JsonField<Boolean>) = apply { this.completed = completed }

                /** Summary of what the agent accomplished */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

                /** Whether the agent completed successfully */
                fun success(success: Boolean) = success(JsonField.of(success))

                /**
                 * Sets [Builder.success] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.success] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun success(success: JsonField<Boolean>) = apply { this.success = success }

                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun usage(usage: Usage) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed [Usage] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
                 * .actions()
                 * .completed()
                 * .message()
                 * .success()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Result =
                    Result(
                        checkRequired("actions", actions).map { it.toImmutable() },
                        checkRequired("completed", completed),
                        checkRequired("message", message),
                        checkRequired("success", success),
                        metadata,
                        usage,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                actions().forEach { it.validate() }
                completed()
                message()
                success()
                metadata().ifPresent { it.validate() }
                usage().ifPresent { it.validate() }
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
                (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (completed.asKnown().isPresent) 1 else 0) +
                    (if (message.asKnown().isPresent) 1 else 0) +
                    (if (success.asKnown().isPresent) 1 else 0) +
                    (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (usage.asKnown().getOrNull()?.validity() ?: 0)

            class Action
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val type: JsonField<String>,
                private val action: JsonField<String>,
                private val instruction: JsonField<String>,
                private val pageText: JsonField<String>,
                private val pageUrl: JsonField<String>,
                private val reasoning: JsonField<String>,
                private val taskCompleted: JsonField<Boolean>,
                private val timeMs: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("instruction")
                    @ExcludeMissing
                    instruction: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("pageText")
                    @ExcludeMissing
                    pageText: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("pageUrl")
                    @ExcludeMissing
                    pageUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("reasoning")
                    @ExcludeMissing
                    reasoning: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("taskCompleted")
                    @ExcludeMissing
                    taskCompleted: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("timeMs")
                    @ExcludeMissing
                    timeMs: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    type,
                    action,
                    instruction,
                    pageText,
                    pageUrl,
                    reasoning,
                    taskCompleted,
                    timeMs,
                    mutableMapOf(),
                )

                /**
                 * Type of action taken
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun action(): Optional<String> = action.getOptional("action")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun instruction(): Optional<String> = instruction.getOptional("instruction")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageText(): Optional<String> = pageText.getOptional("pageText")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pageUrl(): Optional<String> = pageUrl.getOptional("pageUrl")

                /**
                 * Agent's reasoning for taking this action
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun reasoning(): Optional<String> = reasoning.getOptional("reasoning")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun taskCompleted(): Optional<Boolean> = taskCompleted.getOptional("taskCompleted")

                /**
                 * Time taken for this action in ms
                 *
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun timeMs(): Optional<Double> = timeMs.getOptional("timeMs")

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

                /**
                 * Returns the raw JSON value of [instruction].
                 *
                 * Unlike [instruction], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instruction")
                @ExcludeMissing
                fun _instruction(): JsonField<String> = instruction

                /**
                 * Returns the raw JSON value of [pageText].
                 *
                 * Unlike [pageText], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pageText")
                @ExcludeMissing
                fun _pageText(): JsonField<String> = pageText

                /**
                 * Returns the raw JSON value of [pageUrl].
                 *
                 * Unlike [pageUrl], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pageUrl") @ExcludeMissing fun _pageUrl(): JsonField<String> = pageUrl

                /**
                 * Returns the raw JSON value of [reasoning].
                 *
                 * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("reasoning")
                @ExcludeMissing
                fun _reasoning(): JsonField<String> = reasoning

                /**
                 * Returns the raw JSON value of [taskCompleted].
                 *
                 * Unlike [taskCompleted], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("taskCompleted")
                @ExcludeMissing
                fun _taskCompleted(): JsonField<Boolean> = taskCompleted

                /**
                 * Returns the raw JSON value of [timeMs].
                 *
                 * Unlike [timeMs], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timeMs") @ExcludeMissing fun _timeMs(): JsonField<Double> = timeMs

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
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Action]. */
                class Builder internal constructor() {

                    private var type: JsonField<String>? = null
                    private var action: JsonField<String> = JsonMissing.of()
                    private var instruction: JsonField<String> = JsonMissing.of()
                    private var pageText: JsonField<String> = JsonMissing.of()
                    private var pageUrl: JsonField<String> = JsonMissing.of()
                    private var reasoning: JsonField<String> = JsonMissing.of()
                    private var taskCompleted: JsonField<Boolean> = JsonMissing.of()
                    private var timeMs: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(action: Action) = apply {
                        type = action.type
                        this.action = action.action
                        instruction = action.instruction
                        pageText = action.pageText
                        pageUrl = action.pageUrl
                        reasoning = action.reasoning
                        taskCompleted = action.taskCompleted
                        timeMs = action.timeMs
                        additionalProperties = action.additionalProperties.toMutableMap()
                    }

                    /** Type of action taken */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun action(action: String) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<String>) = apply { this.action = action }

                    fun instruction(instruction: String) = instruction(JsonField.of(instruction))

                    /**
                     * Sets [Builder.instruction] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instruction] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun instruction(instruction: JsonField<String>) = apply {
                        this.instruction = instruction
                    }

                    fun pageText(pageText: String) = pageText(JsonField.of(pageText))

                    /**
                     * Sets [Builder.pageText] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageText] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageText(pageText: JsonField<String>) = apply { this.pageText = pageText }

                    fun pageUrl(pageUrl: String) = pageUrl(JsonField.of(pageUrl))

                    /**
                     * Sets [Builder.pageUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pageUrl] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pageUrl(pageUrl: JsonField<String>) = apply { this.pageUrl = pageUrl }

                    /** Agent's reasoning for taking this action */
                    fun reasoning(reasoning: String) = reasoning(JsonField.of(reasoning))

                    /**
                     * Sets [Builder.reasoning] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reasoning] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun reasoning(reasoning: JsonField<String>) = apply {
                        this.reasoning = reasoning
                    }

                    fun taskCompleted(taskCompleted: Boolean) =
                        taskCompleted(JsonField.of(taskCompleted))

                    /**
                     * Sets [Builder.taskCompleted] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taskCompleted] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun taskCompleted(taskCompleted: JsonField<Boolean>) = apply {
                        this.taskCompleted = taskCompleted
                    }

                    /** Time taken for this action in ms */
                    fun timeMs(timeMs: Double) = timeMs(JsonField.of(timeMs))

                    /**
                     * Sets [Builder.timeMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeMs] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeMs(timeMs: JsonField<Double>) = apply { this.timeMs = timeMs }

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
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Action =
                        Action(
                            checkRequired("type", type),
                            action,
                            instruction,
                            pageText,
                            pageUrl,
                            reasoning,
                            taskCompleted,
                            timeMs,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    type()
                    action()
                    instruction()
                    pageText()
                    pageUrl()
                    reasoning()
                    taskCompleted()
                    timeMs()
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
                    (if (type.asKnown().isPresent) 1 else 0) +
                        (if (action.asKnown().isPresent) 1 else 0) +
                        (if (instruction.asKnown().isPresent) 1 else 0) +
                        (if (pageText.asKnown().isPresent) 1 else 0) +
                        (if (pageUrl.asKnown().isPresent) 1 else 0) +
                        (if (reasoning.asKnown().isPresent) 1 else 0) +
                        (if (taskCompleted.asKnown().isPresent) 1 else 0) +
                        (if (timeMs.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        type == other.type &&
                        action == other.action &&
                        instruction == other.instruction &&
                        pageText == other.pageText &&
                        pageUrl == other.pageUrl &&
                        reasoning == other.reasoning &&
                        taskCompleted == other.taskCompleted &&
                        timeMs == other.timeMs &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        type,
                        action,
                        instruction,
                        pageText,
                        pageUrl,
                        reasoning,
                        taskCompleted,
                        timeMs,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Action{type=$type, action=$action, instruction=$instruction, pageText=$pageText, pageUrl=$pageUrl, reasoning=$reasoning, taskCompleted=$taskCompleted, timeMs=$timeMs, additionalProperties=$additionalProperties}"
            }

            class Metadata
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

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(metadata: Metadata) = apply {
                        additionalProperties = metadata.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Metadata = apply {
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

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            class Usage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val inferenceTimeMs: JsonField<Double>,
                private val inputTokens: JsonField<Double>,
                private val outputTokens: JsonField<Double>,
                private val cachedInputTokens: JsonField<Double>,
                private val reasoningTokens: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("inference_time_ms")
                    @ExcludeMissing
                    inferenceTimeMs: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("input_tokens")
                    @ExcludeMissing
                    inputTokens: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("output_tokens")
                    @ExcludeMissing
                    outputTokens: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("cached_input_tokens")
                    @ExcludeMissing
                    cachedInputTokens: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("reasoning_tokens")
                    @ExcludeMissing
                    reasoningTokens: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    inferenceTimeMs,
                    inputTokens,
                    outputTokens,
                    cachedInputTokens,
                    reasoningTokens,
                    mutableMapOf(),
                )

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun inferenceTimeMs(): Double = inferenceTimeMs.getRequired("inference_time_ms")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun inputTokens(): Double = inputTokens.getRequired("input_tokens")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun outputTokens(): Double = outputTokens.getRequired("output_tokens")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cachedInputTokens(): Optional<Double> =
                    cachedInputTokens.getOptional("cached_input_tokens")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun reasoningTokens(): Optional<Double> =
                    reasoningTokens.getOptional("reasoning_tokens")

                /**
                 * Returns the raw JSON value of [inferenceTimeMs].
                 *
                 * Unlike [inferenceTimeMs], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("inference_time_ms")
                @ExcludeMissing
                fun _inferenceTimeMs(): JsonField<Double> = inferenceTimeMs

                /**
                 * Returns the raw JSON value of [inputTokens].
                 *
                 * Unlike [inputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("input_tokens")
                @ExcludeMissing
                fun _inputTokens(): JsonField<Double> = inputTokens

                /**
                 * Returns the raw JSON value of [outputTokens].
                 *
                 * Unlike [outputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("output_tokens")
                @ExcludeMissing
                fun _outputTokens(): JsonField<Double> = outputTokens

                /**
                 * Returns the raw JSON value of [cachedInputTokens].
                 *
                 * Unlike [cachedInputTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cached_input_tokens")
                @ExcludeMissing
                fun _cachedInputTokens(): JsonField<Double> = cachedInputTokens

                /**
                 * Returns the raw JSON value of [reasoningTokens].
                 *
                 * Unlike [reasoningTokens], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reasoning_tokens")
                @ExcludeMissing
                fun _reasoningTokens(): JsonField<Double> = reasoningTokens

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
                     * Returns a mutable builder for constructing an instance of [Usage].
                     *
                     * The following fields are required:
                     * ```java
                     * .inferenceTimeMs()
                     * .inputTokens()
                     * .outputTokens()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Usage]. */
                class Builder internal constructor() {

                    private var inferenceTimeMs: JsonField<Double>? = null
                    private var inputTokens: JsonField<Double>? = null
                    private var outputTokens: JsonField<Double>? = null
                    private var cachedInputTokens: JsonField<Double> = JsonMissing.of()
                    private var reasoningTokens: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(usage: Usage) = apply {
                        inferenceTimeMs = usage.inferenceTimeMs
                        inputTokens = usage.inputTokens
                        outputTokens = usage.outputTokens
                        cachedInputTokens = usage.cachedInputTokens
                        reasoningTokens = usage.reasoningTokens
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun inferenceTimeMs(inferenceTimeMs: Double) =
                        inferenceTimeMs(JsonField.of(inferenceTimeMs))

                    /**
                     * Sets [Builder.inferenceTimeMs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inferenceTimeMs] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inferenceTimeMs(inferenceTimeMs: JsonField<Double>) = apply {
                        this.inferenceTimeMs = inferenceTimeMs
                    }

                    fun inputTokens(inputTokens: Double) = inputTokens(JsonField.of(inputTokens))

                    /**
                     * Sets [Builder.inputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inputTokens] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun inputTokens(inputTokens: JsonField<Double>) = apply {
                        this.inputTokens = inputTokens
                    }

                    fun outputTokens(outputTokens: Double) =
                        outputTokens(JsonField.of(outputTokens))

                    /**
                     * Sets [Builder.outputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.outputTokens] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun outputTokens(outputTokens: JsonField<Double>) = apply {
                        this.outputTokens = outputTokens
                    }

                    fun cachedInputTokens(cachedInputTokens: Double) =
                        cachedInputTokens(JsonField.of(cachedInputTokens))

                    /**
                     * Sets [Builder.cachedInputTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cachedInputTokens] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cachedInputTokens(cachedInputTokens: JsonField<Double>) = apply {
                        this.cachedInputTokens = cachedInputTokens
                    }

                    fun reasoningTokens(reasoningTokens: Double) =
                        reasoningTokens(JsonField.of(reasoningTokens))

                    /**
                     * Sets [Builder.reasoningTokens] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reasoningTokens] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun reasoningTokens(reasoningTokens: JsonField<Double>) = apply {
                        this.reasoningTokens = reasoningTokens
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
                     * Returns an immutable instance of [Usage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .inferenceTimeMs()
                     * .inputTokens()
                     * .outputTokens()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Usage =
                        Usage(
                            checkRequired("inferenceTimeMs", inferenceTimeMs),
                            checkRequired("inputTokens", inputTokens),
                            checkRequired("outputTokens", outputTokens),
                            cachedInputTokens,
                            reasoningTokens,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (validated) {
                        return@apply
                    }

                    inferenceTimeMs()
                    inputTokens()
                    outputTokens()
                    cachedInputTokens()
                    reasoningTokens()
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
                    (if (inferenceTimeMs.asKnown().isPresent) 1 else 0) +
                        (if (inputTokens.asKnown().isPresent) 1 else 0) +
                        (if (outputTokens.asKnown().isPresent) 1 else 0) +
                        (if (cachedInputTokens.asKnown().isPresent) 1 else 0) +
                        (if (reasoningTokens.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Usage &&
                        inferenceTimeMs == other.inferenceTimeMs &&
                        inputTokens == other.inputTokens &&
                        outputTokens == other.outputTokens &&
                        cachedInputTokens == other.cachedInputTokens &&
                        reasoningTokens == other.reasoningTokens &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        inferenceTimeMs,
                        inputTokens,
                        outputTokens,
                        cachedInputTokens,
                        reasoningTokens,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{inferenceTimeMs=$inferenceTimeMs, inputTokens=$inputTokens, outputTokens=$outputTokens, cachedInputTokens=$cachedInputTokens, reasoningTokens=$reasoningTokens, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result &&
                    actions == other.actions &&
                    completed == other.completed &&
                    message == other.message &&
                    success == other.success &&
                    metadata == other.metadata &&
                    usage == other.usage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    actions,
                    completed,
                    message,
                    success,
                    metadata,
                    usage,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Result{actions=$actions, completed=$completed, message=$message, success=$success, metadata=$metadata, usage=$usage, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                result == other.result &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{result=$result, additionalProperties=$additionalProperties}"
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

        return other is SessionExecuteResponse &&
            data == other.data &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionExecuteResponse{data=$data, success=$success, additionalProperties=$additionalProperties}"
}
