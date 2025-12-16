// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.ExcludeMissing
import com.browserbase.api.core.JsonField
import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.checkRequired
import com.browserbase.api.errors.BrowserbaseInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class SessionStartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val available: JsonField<Boolean>,
    private val sessionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("available") @ExcludeMissing available: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sessionId") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
    ) : this(available, sessionId, mutableMapOf())

    /**
     * Whether the session is ready to use
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun available(): Boolean = available.getRequired("available")

    /**
     * Unique identifier for the session
     *
     * @throws BrowserbaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("sessionId")

    /**
     * Returns the raw JSON value of [available].
     *
     * Unlike [available], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("available") @ExcludeMissing fun _available(): JsonField<Boolean> = available

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sessionId") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

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
         * Returns a mutable builder for constructing an instance of [SessionStartResponse].
         *
         * The following fields are required:
         * ```java
         * .available()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionStartResponse]. */
    class Builder internal constructor() {

        private var available: JsonField<Boolean>? = null
        private var sessionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionStartResponse: SessionStartResponse) = apply {
            available = sessionStartResponse.available
            sessionId = sessionStartResponse.sessionId
            additionalProperties = sessionStartResponse.additionalProperties.toMutableMap()
        }

        /** Whether the session is ready to use */
        fun available(available: Boolean) = available(JsonField.of(available))

        /**
         * Sets [Builder.available] to an arbitrary JSON value.
         *
         * You should usually call [Builder.available] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun available(available: JsonField<Boolean>) = apply { this.available = available }

        /** Unique identifier for the session */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

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
         * Returns an immutable instance of [SessionStartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .available()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionStartResponse =
            SessionStartResponse(
                checkRequired("available", available),
                checkRequired("sessionId", sessionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionStartResponse = apply {
        if (validated) {
            return@apply
        }

        available()
        sessionId()
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
        (if (available.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionStartResponse &&
            available == other.available &&
            sessionId == other.sessionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(available, sessionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionStartResponse{available=$available, sessionId=$sessionId, additionalProperties=$additionalProperties}"
}
