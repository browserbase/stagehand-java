// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.models.sessions.SessionStartParams
import com.browserbase.api.models.sessions.SessionStartResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService

    /**
     * Creates a new browser session with the specified configuration. Returns a session ID used for
     * all subsequent operations.
     */
    fun start(): SessionStartResponse = start(SessionStartParams.none())

    /** @see start */
    fun start(
        params: SessionStartParams = SessionStartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionStartResponse

    /** @see start */
    fun start(params: SessionStartParams = SessionStartParams.none()): SessionStartResponse =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(requestOptions: RequestOptions): SessionStartResponse =
        start(SessionStartParams.none(), requestOptions)

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /sessions/start`, but is otherwise the same as
         * [SessionService.start].
         */
        @MustBeClosed
        fun start(): HttpResponseFor<SessionStartResponse> = start(SessionStartParams.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: SessionStartParams = SessionStartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionStartResponse>

        /** @see start */
        @MustBeClosed
        fun start(
            params: SessionStartParams = SessionStartParams.none()
        ): HttpResponseFor<SessionStartResponse> = start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(requestOptions: RequestOptions): HttpResponseFor<SessionStartResponse> =
            start(SessionStartParams.none(), requestOptions)
    }
}
