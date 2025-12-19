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

class SessionObserveResponse
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
         * Returns a mutable builder for constructing an instance of [SessionObserveResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionObserveResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionObserveResponse: SessionObserveResponse) = apply {
            data = sessionObserveResponse.data
            success = sessionObserveResponse.success
            additionalProperties = sessionObserveResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SessionObserveResponse].
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
        fun build(): SessionObserveResponse =
            SessionObserveResponse(
                checkRequired("data", data),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionObserveResponse = apply {
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
        private val result: JsonField<List<Result>>,
        private val actionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<List<Result>> = JsonMissing.of(),
            @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        ) : this(result, actionId, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): List<Result> = result.getRequired("result")

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
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<List<Result>> = result

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

            private var result: JsonField<MutableList<Result>>? = null
            private var actionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                result = data.result.map { it.toMutableList() }
                actionId = data.actionId
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun result(result: List<Result>) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed `List<Result>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<List<Result>>) = apply {
                this.result = result.map { it.toMutableList() }
            }

            /**
             * Adds a single [Result] to [Builder.result].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResult(result: Result) = apply {
                this.result =
                    (this.result ?: JsonField.of(mutableListOf())).also {
                        checkKnown("result", it).add(result)
                    }
            }

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
                Data(
                    checkRequired("result", result).map { it.toImmutable() },
                    actionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            result().forEach { it.validate() }
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
            (result.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (actionId.asKnown().isPresent) 1 else 0)

        /** Action object returned by observe and used by act */
        class Result
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
                @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
            ) : this(description, selector, arguments, backendNodeId, method, mutableMapOf())

            /**
             * Human-readable description of the action
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun description(): String = description.getRequired("description")

            /**
             * CSS selector or XPath for the element
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun selector(): String = selector.getRequired("selector")

            /**
             * Arguments to pass to the method
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun arguments(): Optional<List<String>> = arguments.getOptional("arguments")

            /**
             * Backend node ID for the element
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun backendNodeId(): Optional<Double> = backendNodeId.getOptional("backendNodeId")

            /**
             * The method to execute (click, fill, etc.)
             *
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun method(): Optional<String> = method.getOptional("method")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
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
            @JsonProperty("selector") @ExcludeMissing fun _selector(): JsonField<String> = selector

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
             * Unlike [backendNodeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("backendNodeId")
            @ExcludeMissing
            fun _backendNodeId(): JsonField<Double> = backendNodeId

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
                 * Returns a mutable builder for constructing an instance of [Result].
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * .selector()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Result]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var selector: JsonField<String>? = null
                private var arguments: JsonField<MutableList<String>>? = null
                private var backendNodeId: JsonField<Double> = JsonMissing.of()
                private var method: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(result: Result) = apply {
                    description = result.description
                    selector = result.selector
                    arguments = result.arguments.map { it.toMutableList() }
                    backendNodeId = result.backendNodeId
                    method = result.method
                    additionalProperties = result.additionalProperties.toMutableMap()
                }

                /** Human-readable description of the action */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun selector(selector: JsonField<String>) = apply { this.selector = selector }

                /** Arguments to pass to the method */
                fun arguments(arguments: List<String>) = arguments(JsonField.of(arguments))

                /**
                 * Sets [Builder.arguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.arguments] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.backendNodeId] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Result].
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
                fun build(): Result =
                    Result(
                        checkRequired("description", description),
                        checkRequired("selector", selector),
                        (arguments ?: JsonMissing.of()).map { it.toImmutable() },
                        backendNodeId,
                        method,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Result = apply {
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

                return other is Result &&
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
                "Result{description=$description, selector=$selector, arguments=$arguments, backendNodeId=$backendNodeId, method=$method, additionalProperties=$additionalProperties}"
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

        return other is SessionObserveResponse &&
            data == other.data &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionObserveResponse{data=$data, success=$success, additionalProperties=$additionalProperties}"
}
