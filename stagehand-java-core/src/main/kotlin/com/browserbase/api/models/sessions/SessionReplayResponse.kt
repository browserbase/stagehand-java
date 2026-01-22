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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("pages") @ExcludeMissing pages: JsonField<List<Page>> = JsonMissing.of()
        ) : this(pages, mutableMapOf())

        /**
         * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pages(): Optional<List<Page>> = pages.getOptional("pages")

        /**
         * Returns the raw JSON value of [pages].
         *
         * Unlike [pages], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pages") @ExcludeMissing fun _pages(): JsonField<List<Page>> = pages

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var pages: JsonField<MutableList<Page>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                pages = data.pages.map { it.toMutableList() }
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
             */
            fun build(): Data =
                Data(
                    (pages ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            pages().ifPresent { it.forEach { it.validate() } }
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
            (pages.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Page
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val actions: JsonField<List<Action>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("actions")
                @ExcludeMissing
                actions: JsonField<List<Action>> = JsonMissing.of()
            ) : this(actions, mutableMapOf())

            /**
             * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun actions(): Optional<List<Action>> = actions.getOptional("actions")

            /**
             * Returns the raw JSON value of [actions].
             *
             * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("actions")
            @ExcludeMissing
            fun _actions(): JsonField<List<Action>> = actions

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

                /** Returns a mutable builder for constructing an instance of [Page]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Page]. */
            class Builder internal constructor() {

                private var actions: JsonField<MutableList<Action>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(page: Page) = apply {
                    actions = page.actions.map { it.toMutableList() }
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
                 */
                fun build(): Page =
                    Page(
                        (actions ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Page = apply {
                if (validated) {
                    return@apply
                }

                actions().ifPresent { it.forEach { it.validate() } }
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
                (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Action
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val method: JsonField<String>,
                private val tokenUsage: JsonField<TokenUsage>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tokenUsage")
                    @ExcludeMissing
                    tokenUsage: JsonField<TokenUsage> = JsonMissing.of(),
                ) : this(method, tokenUsage, mutableMapOf())

                /**
                 * @throws StagehandInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun method(): Optional<String> = method.getOptional("method")

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

                    /** Returns a mutable builder for constructing an instance of [Action]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Action]. */
                class Builder internal constructor() {

                    private var method: JsonField<String> = JsonMissing.of()
                    private var tokenUsage: JsonField<TokenUsage> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(action: Action) = apply {
                        method = action.method
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
                     */
                    fun build(): Action =
                        Action(method, tokenUsage, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): Action = apply {
                    if (validated) {
                        return@apply
                    }

                    method()
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
                        (tokenUsage.asKnown().getOrNull()?.validity() ?: 0)

                class TokenUsage
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val cachedInputTokens: JsonField<Double>,
                    private val inputTokens: JsonField<Double>,
                    private val outputTokens: JsonField<Double>,
                    private val reasoningTokens: JsonField<Double>,
                    private val timeMs: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("cachedInputTokens")
                        @ExcludeMissing
                        cachedInputTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("inputTokens")
                        @ExcludeMissing
                        inputTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("outputTokens")
                        @ExcludeMissing
                        outputTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("reasoningTokens")
                        @ExcludeMissing
                        reasoningTokens: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("timeMs")
                        @ExcludeMissing
                        timeMs: JsonField<Double> = JsonMissing.of(),
                    ) : this(
                        cachedInputTokens,
                        inputTokens,
                        outputTokens,
                        reasoningTokens,
                        timeMs,
                        mutableMapOf(),
                    )

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun cachedInputTokens(): Optional<Double> =
                        cachedInputTokens.getOptional("cachedInputTokens")

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
                    fun reasoningTokens(): Optional<Double> =
                        reasoningTokens.getOptional("reasoningTokens")

                    /**
                     * @throws StagehandInvalidDataException if the JSON field has an unexpected
                     *   type (e.g. if the server responded with an unexpected value).
                     */
                    fun timeMs(): Optional<Double> = timeMs.getOptional("timeMs")

                    /**
                     * Returns the raw JSON value of [cachedInputTokens].
                     *
                     * Unlike [cachedInputTokens], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("cachedInputTokens")
                    @ExcludeMissing
                    fun _cachedInputTokens(): JsonField<Double> = cachedInputTokens

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
                     * Returns the raw JSON value of [reasoningTokens].
                     *
                     * Unlike [reasoningTokens], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("reasoningTokens")
                    @ExcludeMissing
                    fun _reasoningTokens(): JsonField<Double> = reasoningTokens

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

                        private var cachedInputTokens: JsonField<Double> = JsonMissing.of()
                        private var inputTokens: JsonField<Double> = JsonMissing.of()
                        private var outputTokens: JsonField<Double> = JsonMissing.of()
                        private var reasoningTokens: JsonField<Double> = JsonMissing.of()
                        private var timeMs: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(tokenUsage: TokenUsage) = apply {
                            cachedInputTokens = tokenUsage.cachedInputTokens
                            inputTokens = tokenUsage.inputTokens
                            outputTokens = tokenUsage.outputTokens
                            reasoningTokens = tokenUsage.reasoningTokens
                            timeMs = tokenUsage.timeMs
                            additionalProperties = tokenUsage.additionalProperties.toMutableMap()
                        }

                        fun cachedInputTokens(cachedInputTokens: Double) =
                            cachedInputTokens(JsonField.of(cachedInputTokens))

                        /**
                         * Sets [Builder.cachedInputTokens] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cachedInputTokens] with a well-typed
                         * [Double] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun cachedInputTokens(cachedInputTokens: JsonField<Double>) = apply {
                            this.cachedInputTokens = cachedInputTokens
                        }

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

                        fun reasoningTokens(reasoningTokens: Double) =
                            reasoningTokens(JsonField.of(reasoningTokens))

                        /**
                         * Sets [Builder.reasoningTokens] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.reasoningTokens] with a well-typed
                         * [Double] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun reasoningTokens(reasoningTokens: JsonField<Double>) = apply {
                            this.reasoningTokens = reasoningTokens
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
                                cachedInputTokens,
                                inputTokens,
                                outputTokens,
                                reasoningTokens,
                                timeMs,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TokenUsage = apply {
                        if (validated) {
                            return@apply
                        }

                        cachedInputTokens()
                        inputTokens()
                        outputTokens()
                        reasoningTokens()
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
                        (if (cachedInputTokens.asKnown().isPresent) 1 else 0) +
                            (if (inputTokens.asKnown().isPresent) 1 else 0) +
                            (if (outputTokens.asKnown().isPresent) 1 else 0) +
                            (if (reasoningTokens.asKnown().isPresent) 1 else 0) +
                            (if (timeMs.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TokenUsage &&
                            cachedInputTokens == other.cachedInputTokens &&
                            inputTokens == other.inputTokens &&
                            outputTokens == other.outputTokens &&
                            reasoningTokens == other.reasoningTokens &&
                            timeMs == other.timeMs &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            cachedInputTokens,
                            inputTokens,
                            outputTokens,
                            reasoningTokens,
                            timeMs,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TokenUsage{cachedInputTokens=$cachedInputTokens, inputTokens=$inputTokens, outputTokens=$outputTokens, reasoningTokens=$reasoningTokens, timeMs=$timeMs, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Action &&
                        method == other.method &&
                        tokenUsage == other.tokenUsage &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(method, tokenUsage, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Action{method=$method, tokenUsage=$tokenUsage, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Page &&
                    actions == other.actions &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(actions, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Page{actions=$actions, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                pages == other.pages &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(pages, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{pages=$pages, additionalProperties=$additionalProperties}"
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
