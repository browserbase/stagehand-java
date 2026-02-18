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

class SessionReplayResponse
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
         * Returns a mutable builder for constructing an instance of [SessionReplayResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * .success()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionReplayResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var success: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionReplayResponse: SessionReplayResponse) = apply {
            data = sessionReplayResponse.data
            success = sessionReplayResponse.success
            additionalProperties = sessionReplayResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SessionReplayResponse].
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
        fun build(): SessionReplayResponse =
            SessionReplayResponse(
                checkRequired("data", data),
                checkRequired("success", success),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionReplayResponse = apply {
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
        private val pages: JsonField<List<Page>>,
        private val clientLanguage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of(),
            @JsonProperty("clientLanguage")
            @ExcludeMissing
            clientLanguage: JsonField<String> = JsonMissing.of(),
        ) : this(pages, clientLanguage, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pages(): List<Page> = pages.getRequired("pages")

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clientLanguage(): Optional<String> = clientLanguage.getOptional("clientLanguage")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

        /**
         * Returns the raw JSON value of [clientLanguage].
         *
         * Unlike [clientLanguage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("clientLanguage")
        @ExcludeMissing
        fun _clientLanguage(): JsonField<String> = clientLanguage

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
             * .pages()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var clientLanguage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                pages = data.pages.map { it.toMutableList() }
                clientLanguage = data.clientLanguage
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun pages(pages: List<Page>) = pages(JsonField.of(pages))

            /**
             * Sets [Builder.pages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pages] with a well-typed `List<Page>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pages(pages: JsonField<List<Page>>) = apply {
                this.pages = pages.map { it.toMutableList() }
            }

            /**
             * Adds a single [Page] to [pages].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPage(page: Page) = apply {
                pages =
                    (pages ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pages", it).add(page)
                    }
            }

            fun clientLanguage(clientLanguage: String) =
                clientLanguage(JsonField.of(clientLanguage))

            /**
             * Sets [Builder.clientLanguage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientLanguage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientLanguage(clientLanguage: JsonField<String>) = apply {
                this.clientLanguage = clientLanguage
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .pages()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("pages", pages).map { it.toImmutable() },
                    clientLanguage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            pages().forEach { it.validate() }
            clientLanguage()
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (clientLanguage.asKnown().isPresent) 1 else 0)

        class Page
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actions: JsonField<List<Action>>,
            private val duration: JsonField<Double>,
            private val timestamp: JsonField<Double>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<Action>> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timestamp")
                @ExcludeMissing
                timestamp: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(actions, duration, timestamp, url, mutableMapOf())

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actions(): List<Action> = actions.getRequired("actions")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun duration(): Double = duration.getRequired("duration")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timestamp(): Double = timestamp.getRequired("timestamp")

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun url(): String = url.getRequired("url")

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<Action>> = actions

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

            /**
             * Returns the raw JSON value of [timestamp].
             *
             * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("timestamp")
            @ExcludeMissing
            fun _timestamp(): JsonField<Double> = timestamp

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * Returns a mutable builder for constructing an instance of [Page].
                 *
                 * The following fields are required:
                 * ```java
                 * .actions()
                 * .duration()
                 * .timestamp()
                 * .url()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Page]. */
            class Builder internal constructor() {

                private var actions: JsonField<MutableList<Action>>? = null
                private var duration: JsonField<Double>? = null
                private var timestamp: JsonField<Double>? = null
                private var url: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(page: Page) = apply {
                    actions = page.actions.map { it.toMutableList() }
                    duration = page.duration
                    timestamp = page.timestamp
                    url = page.url
                    additionalProperties = page.additionalProperties.toMutableMap()
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

                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

                fun timestamp(timestamp: Double) = timestamp(JsonField.of(timestamp))

                /**
                 * Sets [Builder.timestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timestamp] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun timestamp(timestamp: JsonField<Double>) = apply { this.timestamp = timestamp }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

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
                 * Returns an immutable instance of [Page].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .actions()
                 * .duration()
                 * .timestamp()
                 * .url()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Page =
                    Page(
                        checkRequired("actions", actions).map { it.toImmutable() },
                        checkRequired("duration", duration),
                        checkRequired("timestamp", timestamp),
                        checkRequired("url", url),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                actions().forEach { it.validate() }
                duration()
                timestamp()
                url()
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
                    (if (duration.asKnown().isPresent) 1 else 0) +
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Action
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val method: JsonField<String>,
                private val parameters: JsonField<Parameters>,
                private val result: JsonField<Result>,
                private val timestamp: JsonField<Double>,
                private val endTime: JsonField<Double>,
                private val tokenUsage: JsonField<TokenUsage>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("parameters")
                    @ExcludeMissing
                    parameters: JsonField<Parameters> = JsonMissing.of(),
                    @JsonProperty("result")
                    @ExcludeMissing
                    result: JsonField<Result> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("endTime")
                    @ExcludeMissing
                    endTime: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("tokenUsage")
                    @ExcludeMissing
                    tokenUsage: JsonField<TokenUsage> = JsonMissing.of(),
                ) : this(method, parameters, result, timestamp, endTime, tokenUsage, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun method(): String = method.getRequired("method")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun parameters(): Parameters = parameters.getRequired("parameters")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun result(): Result = result.getRequired("result")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): Double = timestamp.getRequired("timestamp")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endTime(): Optional<Double> = endTime.getOptional("endTime")

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun tokenUsage(): Optional<TokenUsage> = tokenUsage.getOptional("tokenUsage")

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

                /**
                 * Returns the raw JSON value of [parameters].
                 *
                 * Unlike [parameters], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("parameters")
                @ExcludeMissing
                fun _parameters(): JsonField<Parameters> = parameters

                /**
                 * Returns the raw JSON value of [result].
                 *
                 * Unlike [result], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<Double> = timestamp

                /**
                 * Returns the raw JSON value of [endTime].
                 *
                 * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<Double> = endTime

                /**
                 * Returns the raw JSON value of [tokenUsage].
                 *
                 * Unlike [tokenUsage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("tokenUsage")
                @ExcludeMissing
                fun _tokenUsage(): JsonField<TokenUsage> = tokenUsage

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
                     * .method()
                     * .parameters()
                     * .result()
                     * .timestamp()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Action]. */
                class Builder internal constructor() {

                    private var method: JsonField<String>? = null
                    private var parameters: JsonField<Parameters>? = null
                    private var result: JsonField<Result>? = null
                    private var timestamp: JsonField<Double>? = null
                    private var endTime: JsonField<Double> = JsonMissing.of()
                    private var tokenUsage: JsonField<TokenUsage> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(action: Action) = apply {
                        method = action.method
                        parameters = action.parameters
                        result = action.result
                        timestamp = action.timestamp
                        endTime = action.endTime
                        tokenUsage = action.tokenUsage
                        additionalProperties = action.additionalProperties.toMutableMap()
                    }

                    fun method(method: String) = method(JsonField.of(method))

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun method(method: JsonField<String>) = apply { this.method = method }

                    fun parameters(parameters: Parameters) = parameters(JsonField.of(parameters))

                    /**
                     * Sets [Builder.parameters] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.parameters] with a well-typed [Parameters]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun parameters(parameters: JsonField<Parameters>) = apply {
                        this.parameters = parameters
                    }

                    fun result(result: Result) = result(JsonField.of(result))

                    /**
                     * Sets [Builder.result] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result] with a well-typed [Result] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    fun timestamp(timestamp: Double) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<Double>) = apply {
                        this.timestamp = timestamp
                    }

                    fun endTime(endTime: Double) = endTime(JsonField.of(endTime))

                    /**
                     * Sets [Builder.endTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endTime] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endTime(endTime: JsonField<Double>) = apply { this.endTime = endTime }

                    fun tokenUsage(tokenUsage: TokenUsage) = tokenUsage(JsonField.of(tokenUsage))

                    /**
                     * Sets [Builder.tokenUsage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tokenUsage] with a well-typed [TokenUsage]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun tokenUsage(tokenUsage: JsonField<TokenUsage>) = apply {
                        this.tokenUsage = tokenUsage
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
                     * Returns an immutable instance of [Action].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .method()
                     * .parameters()
                     * .result()
                     * .timestamp()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Action =
                        Action(
                            checkRequired("method", method),
                            checkRequired("parameters", parameters),
                            checkRequired("result", result),
                            checkRequired("timestamp", timestamp),
                            endTime,
                            tokenUsage,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
                    parameters().validate()
                    result().validate()
                    timestamp()
                    endTime()
                    tokenUsage().ifPresent { it.validate() }
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
                    (if (method.asKnown().isPresent) 1 else 0) +
                        (parameters.asKnown().getOrNull()?.validity() ?: 0) +
                        (result.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (endTime.asKnown().isPresent) 1 else 0) +
                        (tokenUsage.asKnown().getOrNull()?.validity() ?: 0)

                class Parameters
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

                        /**
                         * Returns a mutable builder for constructing an instance of [Parameters].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Parameters]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(parameters: Parameters) = apply {
                            additionalProperties = parameters.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Parameters].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Parameters = Parameters(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Parameters = apply {
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

                        return other is Parameters &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Parameters{additionalProperties=$additionalProperties}"
                }

                class Result
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

                        /** Returns a mutable builder for constructing an instance of [Result]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Result]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(result: Result) = apply {
                            additionalProperties = result.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                         */
                        fun build(): Result = Result(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    fun validate(): Result = apply {
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

                        return other is Result && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Result{additionalProperties=$additionalProperties}"
                }

                class TokenUsage
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val cost: JsonField<Double>,
                    private val inputTokens: JsonField<Double>,
                    private val outputTokens: JsonField<Double>,
                    private val timeMs: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("cost")
                        @ExcludeMissing
                        cost: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("inputTokens")
                        @ExcludeMissing
                        inputTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("outputTokens")
                        @ExcludeMissing
                        outputTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("timeMs")
                        @ExcludeMissing
                        timeMs: JsonField<Double> = JsonMissing.of(),
                    ) : this(cost, inputTokens, outputTokens, timeMs, mutableMapOf())

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun cost(): Optional<Double> = cost.getOptional("cost")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun inputTokens(): Optional<Double> = inputTokens.getOptional("inputTokens")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun outputTokens(): Optional<Double> = outputTokens.getOptional("outputTokens")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun timeMs(): Optional<Double> = timeMs.getOptional("timeMs")

                    /**
                     * Returns the raw JSON value of [cost].
                     *
                     * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<Double> = cost

                    /**
                     * Returns the raw JSON value of [inputTokens].
                     *
                     * Unlike [inputTokens], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("inputTokens")
                    @ExcludeMissing
                    fun _inputTokens(): JsonField<Double> = inputTokens

                    /**
                     * Returns the raw JSON value of [outputTokens].
                     *
                     * Unlike [outputTokens], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("outputTokens")
                    @ExcludeMissing
                    fun _outputTokens(): JsonField<Double> = outputTokens

                    /**
                     * Returns the raw JSON value of [timeMs].
                     *
                     * Unlike [timeMs], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("timeMs")
                    @ExcludeMissing
                    fun _timeMs(): JsonField<Double> = timeMs

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
                         * Returns a mutable builder for constructing an instance of [TokenUsage].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TokenUsage]. */
                    class Builder internal constructor() {

                        private var cost: JsonField<Double> = JsonMissing.of()
                        private var inputTokens: JsonField<Double> = JsonMissing.of()
                        private var outputTokens: JsonField<Double> = JsonMissing.of()
                        private var timeMs: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tokenUsage: TokenUsage) = apply {
                            cost = tokenUsage.cost
                            inputTokens = tokenUsage.inputTokens
                            outputTokens = tokenUsage.outputTokens
                            timeMs = tokenUsage.timeMs
                            additionalProperties = tokenUsage.additionalProperties.toMutableMap()
                        }

                        fun cost(cost: Double) = cost(JsonField.of(cost))

                        /**
                         * Sets [Builder.cost] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cost] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun cost(cost: JsonField<Double>) = apply { this.cost = cost }

                        fun inputTokens(inputTokens: Double) =
                            inputTokens(JsonField.of(inputTokens))

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

                        fun timeMs(timeMs: Double) = timeMs(JsonField.of(timeMs))

                        /**
                         * Sets [Builder.timeMs] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.timeMs] with a well-typed [Double] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun timeMs(timeMs: JsonField<Double>) = apply { this.timeMs = timeMs }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [TokenUsage].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): TokenUsage =
                            TokenUsage(
                                cost,
                                inputTokens,
                                outputTokens,
                                timeMs,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TokenUsage = apply {
                        if (validated) {
                            return@apply
                        }

                        cost()
                        inputTokens()
                        outputTokens()
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
                        (if (cost.asKnown().isPresent) 1 else 0) +
                            (if (inputTokens.asKnown().isPresent) 1 else 0) +
                            (if (outputTokens.asKnown().isPresent) 1 else 0) +
                            (if (timeMs.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TokenUsage &&
                            cost == other.cost &&
                            inputTokens == other.inputTokens &&
                            outputTokens == other.outputTokens &&
                            timeMs == other.timeMs &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(cost, inputTokens, outputTokens, timeMs, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TokenUsage{cost=$cost, inputTokens=$inputTokens, outputTokens=$outputTokens, timeMs=$timeMs, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        method == other.method &&
                        parameters == other.parameters &&
                        result == other.result &&
                        timestamp == other.timestamp &&
                        endTime == other.endTime &&
                        tokenUsage == other.tokenUsage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        method,
                        parameters,
                        result,
                        timestamp,
                        endTime,
                        tokenUsage,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Action{method=$method, parameters=$parameters, result=$result, timestamp=$timestamp, endTime=$endTime, tokenUsage=$tokenUsage, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    actions == other.actions &&
                    duration == other.duration &&
                    timestamp == other.timestamp &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(actions, duration, timestamp, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Page{actions=$actions, duration=$duration, timestamp=$timestamp, url=$url, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                pages == other.pages &&
                clientLanguage == other.clientLanguage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(pages, clientLanguage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{pages=$pages, clientLanguage=$clientLanguage, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionReplayResponse &&
            data == other.data &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionReplayResponse{data=$data, success=$success, additionalProperties=$additionalProperties}"
}
