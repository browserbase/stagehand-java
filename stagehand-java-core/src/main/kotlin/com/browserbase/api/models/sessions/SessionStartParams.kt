// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.models.sessions

import com.browserbase.api.core.JsonMissing
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.Params
import com.browserbase.api.core.http.Headers
import com.browserbase.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates a new browser session with the specified configuration. Returns a session ID used for all
 * subsequent operations.
 */
class SessionStartParams
private constructor(
    private val xLanguage: JsonValue?,
    private val xSdkVersion: JsonValue?,
    private val xSentAt: JsonValue?,
    private val xStreamResponse: JsonValue?,
    private val body: JsonValue,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun xLanguage(): Optional<JsonValue> = Optional.ofNullable(xLanguage)

    fun xSdkVersion(): Optional<JsonValue> = Optional.ofNullable(xSdkVersion)

    fun xSentAt(): Optional<JsonValue> = Optional.ofNullable(xSentAt)

    fun xStreamResponse(): Optional<JsonValue> = Optional.ofNullable(xStreamResponse)

    fun body(): JsonValue = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionStartParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionStartParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionStartParams]. */
    class Builder internal constructor() {

        private var xLanguage: JsonValue? = null
        private var xSdkVersion: JsonValue? = null
        private var xSentAt: JsonValue? = null
        private var xStreamResponse: JsonValue? = null
        private var body: JsonValue = JsonMissing.of()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionStartParams: SessionStartParams) = apply {
            xLanguage = sessionStartParams.xLanguage
            xSdkVersion = sessionStartParams.xSdkVersion
            xSentAt = sessionStartParams.xSentAt
            xStreamResponse = sessionStartParams.xStreamResponse
            body = sessionStartParams.body
            additionalHeaders = sessionStartParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionStartParams.additionalQueryParams.toBuilder()
        }

        fun xLanguage(xLanguage: JsonValue?) = apply { this.xLanguage = xLanguage }

        /** Alias for calling [Builder.xLanguage] with `xLanguage.orElse(null)`. */
        fun xLanguage(xLanguage: Optional<JsonValue>) = xLanguage(xLanguage.getOrNull())

        fun xSdkVersion(xSdkVersion: JsonValue?) = apply { this.xSdkVersion = xSdkVersion }

        /** Alias for calling [Builder.xSdkVersion] with `xSdkVersion.orElse(null)`. */
        fun xSdkVersion(xSdkVersion: Optional<JsonValue>) = xSdkVersion(xSdkVersion.getOrNull())

        fun xSentAt(xSentAt: JsonValue?) = apply { this.xSentAt = xSentAt }

        /** Alias for calling [Builder.xSentAt] with `xSentAt.orElse(null)`. */
        fun xSentAt(xSentAt: Optional<JsonValue>) = xSentAt(xSentAt.getOrNull())

        fun xStreamResponse(xStreamResponse: JsonValue?) = apply {
            this.xStreamResponse = xStreamResponse
        }

        /** Alias for calling [Builder.xStreamResponse] with `xStreamResponse.orElse(null)`. */
        fun xStreamResponse(xStreamResponse: Optional<JsonValue>) =
            xStreamResponse(xStreamResponse.getOrNull())

        fun body(body: JsonValue) = apply { this.body = body }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SessionStartParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionStartParams =
            SessionStartParams(
                xLanguage,
                xSdkVersion,
                xSentAt,
                xStreamResponse,
                body,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): JsonValue = body

    override fun _headers(): Headers = Headers.builder().apply { putAll(additionalHeaders) }.build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionStartParams &&
            xLanguage == other.xLanguage &&
            xSdkVersion == other.xSdkVersion &&
            xSentAt == other.xSentAt &&
            xStreamResponse == other.xStreamResponse &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            xLanguage,
            xSdkVersion,
            xSentAt,
            xStreamResponse,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionStartParams{xLanguage=$xLanguage, xSdkVersion=$xSdkVersion, xSentAt=$xSentAt, xStreamResponse=$xStreamResponse, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
