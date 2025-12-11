// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.models.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.stagehand.api.core.ExcludeMissing
import com.stagehand.api.core.JsonField
import com.stagehand.api.core.JsonMissing
import com.stagehand.api.core.JsonValue
import com.stagehand.api.errors.StagehandInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Navigation response (may be null) */
class SessionNavigateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ok: JsonField<Boolean>,
    private val status: JsonField<Long>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ok") @ExcludeMissing ok: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(ok, status, url, mutableMapOf())

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ok(): Optional<Boolean> = ok.getOptional("ok")

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Long> = status.getOptional("status")

    /**
     * @throws StagehandInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [ok].
     *
     * Unlike [ok], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ok") @ExcludeMissing fun _ok(): JsonField<Boolean> = ok

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Long> = status

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

        /** Returns a mutable builder for constructing an instance of [SessionNavigateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionNavigateResponse]. */
    class Builder internal constructor() {

        private var ok: JsonField<Boolean> = JsonMissing.of()
        private var status: JsonField<Long> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionNavigateResponse: SessionNavigateResponse) = apply {
            ok = sessionNavigateResponse.ok
            status = sessionNavigateResponse.status
            url = sessionNavigateResponse.url
            additionalProperties = sessionNavigateResponse.additionalProperties.toMutableMap()
        }

        fun ok(ok: Boolean) = ok(JsonField.of(ok))

        /**
         * Sets [Builder.ok] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ok] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ok(ok: JsonField<Boolean>) = apply { this.ok = ok }

        fun status(status: Long) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Long>) = apply { this.status = status }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [SessionNavigateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionNavigateResponse =
            SessionNavigateResponse(ok, status, url, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): SessionNavigateResponse = apply {
        if (validated) {
            return@apply
        }

        ok()
        status()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (ok.asKnown().isPresent) 1 else 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionNavigateResponse &&
            ok == other.ok &&
            status == other.status &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(ok, status, url, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionNavigateResponse{ok=$ok, status=$status, url=$url, additionalProperties=$additionalProperties}"
}
