// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.checkKnown
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

class SessionExecuteAgentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val message: JsonField<String>,
    private val steps: JsonField<List<JsonValue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("steps") @ExcludeMissing steps: JsonField<List<JsonValue>> = JsonMissing.of(),
    ) : this(message, steps, mutableMapOf())

    /**
     * Final message from the agent
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Steps taken by the agent
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun steps(): Optional<List<JsonValue>> = steps.getOptional("steps")

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps") @ExcludeMissing fun _steps(): JsonField<List<JsonValue>> = steps

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
         * Returns a mutable builder for constructing an instance of [SessionExecuteAgentResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionExecuteAgentResponse]. */
    class Builder internal constructor() {

        private var message: JsonField<String> = JsonMissing.of()
        private var steps: JsonField<MutableList<JsonValue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionExecuteAgentResponse: SessionExecuteAgentResponse) = apply {
            message = sessionExecuteAgentResponse.message
            steps = sessionExecuteAgentResponse.steps.map { it.toMutableList() }
            additionalProperties = sessionExecuteAgentResponse.additionalProperties.toMutableMap()
        }

        /** Final message from the agent */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** Steps taken by the agent */
        fun steps(steps: List<JsonValue>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed `List<JsonValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun steps(steps: JsonField<List<JsonValue>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [JsonValue] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: JsonValue) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
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
         * Returns an immutable instance of [SessionExecuteAgentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionExecuteAgentResponse =
            SessionExecuteAgentResponse(
                message,
                (steps ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionExecuteAgentResponse = apply {
        if (validated) {
            return@apply
        }

        message()
        steps()
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
        (if (message.asKnown().isPresent) 1 else 0) + (steps.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionExecuteAgentResponse &&
            message == other.message &&
            steps == other.steps &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(message, steps, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionExecuteAgentResponse{message=$message, steps=$steps, additionalProperties=$additionalProperties}"
}
