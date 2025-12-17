// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.models.sessions.SessionStartParams
import com.browserbase.api.models.sessions.SessionStartResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync

    /**
     * Creates a new browser session with the specified configuration. Returns a session ID used for
     * all subsequent operations.
     */
    fun start(): CompletableFuture<SessionStartResponse> = start(SessionStartParams.none())

    /** @see start */
    fun start(
        params: SessionStartParams = SessionStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionStartResponse>

    /** @see start */
    fun start(
        params: SessionStartParams = SessionStartParams.none()
    ): CompletableFuture<SessionStartResponse> = start(params, RequestOptions.none())

    /** @see start */
    fun start(requestOptions: RequestOptions): CompletableFuture<SessionStartResponse> =
        start(SessionStartParams.none(), requestOptions)

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sessions/start`, but is otherwise the same as
         * [SessionServiceAsync.start].
         */
        fun start(): CompletableFuture<HttpResponseFor<SessionStartResponse>> =
            start(SessionStartParams.none())

        /** @see start */
        fun start(
            params: SessionStartParams = SessionStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>>

        /** @see start */
        fun start(
            params: SessionStartParams = SessionStartParams.none()
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>> =
            start(SessionStartParams.none(), requestOptions)
    }
}
