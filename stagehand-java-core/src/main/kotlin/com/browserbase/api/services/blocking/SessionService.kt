// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.core.http.StreamResponse
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionActResponse
import com.browserbase.api.models.sessions.SessionEndParams
import com.browserbase.api.models.sessions.SessionEndResponse
import com.browserbase.api.models.sessions.SessionExecuteParams
import com.browserbase.api.models.sessions.SessionExecuteResponse
import com.browserbase.api.models.sessions.SessionExtractParams
import com.browserbase.api.models.sessions.SessionExtractResponse
import com.browserbase.api.models.sessions.SessionNavigateParams
import com.browserbase.api.models.sessions.SessionNavigateResponse
import com.browserbase.api.models.sessions.SessionObserveParams
import com.browserbase.api.models.sessions.SessionObserveResponse
import com.browserbase.api.models.sessions.SessionStartParams
import com.browserbase.api.models.sessions.SessionStartResponse
import com.browserbase.api.models.sessions.StreamEvent
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
     * Executes a browser action using natural language instructions or a predefined Action object.
     */
    fun act(id: String, params: SessionActParams): SessionActResponse =
        act(id, params, RequestOptions.none())

    /** @see act */
    fun act(
        id: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse = act(params.toBuilder().id(id).build(), requestOptions)

    /** @see act */
    fun act(params: SessionActParams): SessionActResponse = act(params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse

    /**
     * Executes a browser action using natural language instructions or a predefined Action object.
     */
    @MustBeClosed
    fun actStreaming(id: String, params: SessionActParams): StreamResponse<StreamEvent> =
        actStreaming(id, params, RequestOptions.none())

    /** @see actStreaming */
    @MustBeClosed
    fun actStreaming(
        id: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent> = actStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see actStreaming */
    @MustBeClosed
    fun actStreaming(params: SessionActParams): StreamResponse<StreamEvent> =
        actStreaming(params, RequestOptions.none())

    /** @see actStreaming */
    @MustBeClosed
    fun actStreaming(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent>

    /** Terminates the browser session and releases all associated resources. */
    fun end(id: String, params: SessionEndParams): SessionEndResponse =
        end(id, params, RequestOptions.none())

    /** @see end */
    fun end(
        id: String,
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse = end(params.toBuilder().id(id).build(), requestOptions)

    /** @see end */
    fun end(params: SessionEndParams): SessionEndResponse = end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    fun execute(id: String, params: SessionExecuteParams): SessionExecuteResponse =
        execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        id: String,
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteResponse = execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(params: SessionExecuteParams): SessionExecuteResponse =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteResponse

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    @MustBeClosed
    fun executeStreaming(id: String, params: SessionExecuteParams): StreamResponse<StreamEvent> =
        executeStreaming(id, params, RequestOptions.none())

    /** @see executeStreaming */
    @MustBeClosed
    fun executeStreaming(
        id: String,
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent> =
        executeStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see executeStreaming */
    @MustBeClosed
    fun executeStreaming(params: SessionExecuteParams): StreamResponse<StreamEvent> =
        executeStreaming(params, RequestOptions.none())

    /** @see executeStreaming */
    @MustBeClosed
    fun executeStreaming(
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent>

    /** Extracts structured data from the current page using AI-powered analysis. */
    fun extract(id: String): SessionExtractResponse = extract(id, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExtractResponse = extract(params.toBuilder().id(id).build(), requestOptions)

    /** @see extract */
    fun extract(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): SessionExtractResponse = extract(id, params, RequestOptions.none())

    /** @see extract */
    fun extract(
        params: SessionExtractParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExtractResponse

    /** @see extract */
    fun extract(params: SessionExtractParams): SessionExtractResponse =
        extract(params, RequestOptions.none())

    /** @see extract */
    fun extract(id: String, requestOptions: RequestOptions): SessionExtractResponse =
        extract(id, SessionExtractParams.none(), requestOptions)

    /** Extracts structured data from the current page using AI-powered analysis. */
    @MustBeClosed
    fun extractStreaming(id: String): StreamResponse<StreamEvent> =
        extractStreaming(id, SessionExtractParams.none())

    /** @see extractStreaming */
    @MustBeClosed
    fun extractStreaming(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent> =
        extractStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see extractStreaming */
    @MustBeClosed
    fun extractStreaming(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): StreamResponse<StreamEvent> = extractStreaming(id, params, RequestOptions.none())

    /** @see extractStreaming */
    @MustBeClosed
    fun extractStreaming(
        params: SessionExtractParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent>

    /** @see extractStreaming */
    @MustBeClosed
    fun extractStreaming(params: SessionExtractParams): StreamResponse<StreamEvent> =
        extractStreaming(params, RequestOptions.none())

    /** @see extractStreaming */
    @MustBeClosed
    fun extractStreaming(id: String, requestOptions: RequestOptions): StreamResponse<StreamEvent> =
        extractStreaming(id, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL. */
    fun navigate(id: String, params: SessionNavigateParams): SessionNavigateResponse =
        navigate(id, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        id: String,
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNavigateResponse = navigate(params.toBuilder().id(id).build(), requestOptions)

    /** @see navigate */
    fun navigate(params: SessionNavigateParams): SessionNavigateResponse =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNavigateResponse

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    fun observe(id: String): SessionObserveResponse = observe(id, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionObserveResponse = observe(params.toBuilder().id(id).build(), requestOptions)

    /** @see observe */
    fun observe(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): SessionObserveResponse = observe(id, params, RequestOptions.none())

    /** @see observe */
    fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionObserveResponse

    /** @see observe */
    fun observe(params: SessionObserveParams): SessionObserveResponse =
        observe(params, RequestOptions.none())

    /** @see observe */
    fun observe(id: String, requestOptions: RequestOptions): SessionObserveResponse =
        observe(id, SessionObserveParams.none(), requestOptions)

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    @MustBeClosed
    fun observeStreaming(id: String): StreamResponse<StreamEvent> =
        observeStreaming(id, SessionObserveParams.none())

    /** @see observeStreaming */
    @MustBeClosed
    fun observeStreaming(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent> =
        observeStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see observeStreaming */
    @MustBeClosed
    fun observeStreaming(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): StreamResponse<StreamEvent> = observeStreaming(id, params, RequestOptions.none())

    /** @see observeStreaming */
    @MustBeClosed
    fun observeStreaming(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<StreamEvent>

    /** @see observeStreaming */
    @MustBeClosed
    fun observeStreaming(params: SessionObserveParams): StreamResponse<StreamEvent> =
        observeStreaming(params, RequestOptions.none())

    /** @see observeStreaming */
    @MustBeClosed
    fun observeStreaming(id: String, requestOptions: RequestOptions): StreamResponse<StreamEvent> =
        observeStreaming(id, SessionObserveParams.none(), requestOptions)

    /**
     * Creates a new browser session with the specified configuration. Returns a session ID used for
     * all subsequent operations.
     */
    fun start(params: SessionStartParams): SessionStartResponse =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: SessionStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionStartResponse

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/act`, but is otherwise the same
         * as [SessionService.act].
         */
        @MustBeClosed
        fun act(id: String, params: SessionActParams): HttpResponseFor<SessionActResponse> =
            act(id, params, RequestOptions.none())

        /** @see act */
        @MustBeClosed
        fun act(
            id: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionActResponse> =
            act(params.toBuilder().id(id).build(), requestOptions)

        /** @see act */
        @MustBeClosed
        fun act(params: SessionActParams): HttpResponseFor<SessionActResponse> =
            act(params, RequestOptions.none())

        /** @see act */
        @MustBeClosed
        fun act(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionActResponse>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/act`, but is otherwise the same
         * as [SessionService.actStreaming].
         */
        @MustBeClosed
        fun actStreaming(
            id: String,
            params: SessionActParams,
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            actStreaming(id, params, RequestOptions.none())

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(
            id: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            actStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(params: SessionActParams): HttpResponseFor<StreamResponse<StreamEvent>> =
            actStreaming(params, RequestOptions.none())

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/end`, but is otherwise the same
         * as [SessionService.end].
         */
        @MustBeClosed
        fun end(id: String, params: SessionEndParams): HttpResponseFor<SessionEndResponse> =
            end(id, params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            id: String,
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionEndResponse> =
            end(params.toBuilder().id(id).build(), requestOptions)

        /** @see end */
        @MustBeClosed
        fun end(params: SessionEndParams): HttpResponseFor<SessionEndResponse> =
            end(params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionEndResponse>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/agentExecute`, but is otherwise
         * the same as [SessionService.execute].
         */
        @MustBeClosed
        fun execute(
            id: String,
            params: SessionExecuteParams,
        ): HttpResponseFor<SessionExecuteResponse> = execute(id, params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            id: String,
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteResponse> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        @MustBeClosed
        fun execute(params: SessionExecuteParams): HttpResponseFor<SessionExecuteResponse> =
            execute(params, RequestOptions.none())

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteResponse>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/agentExecute`, but is otherwise
         * the same as [SessionService.executeStreaming].
         */
        @MustBeClosed
        fun executeStreaming(
            id: String,
            params: SessionExecuteParams,
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            executeStreaming(id, params, RequestOptions.none())

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            id: String,
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            executeStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            params: SessionExecuteParams
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            executeStreaming(params, RequestOptions.none())

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/extract`, but is otherwise the
         * same as [SessionService.extract].
         */
        @MustBeClosed
        fun extract(id: String): HttpResponseFor<SessionExtractResponse> =
            extract(id, SessionExtractParams.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExtractResponse> =
            extract(params.toBuilder().id(id).build(), requestOptions)

        /** @see extract */
        @MustBeClosed
        fun extract(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): HttpResponseFor<SessionExtractResponse> = extract(id, params, RequestOptions.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            params: SessionExtractParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExtractResponse>

        /** @see extract */
        @MustBeClosed
        fun extract(params: SessionExtractParams): HttpResponseFor<SessionExtractResponse> =
            extract(params, RequestOptions.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExtractResponse> =
            extract(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/extract`, but is otherwise the
         * same as [SessionService.extractStreaming].
         */
        @MustBeClosed
        fun extractStreaming(id: String): HttpResponseFor<StreamResponse<StreamEvent>> =
            extractStreaming(id, SessionExtractParams.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            extractStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            extractStreaming(id, params, RequestOptions.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            params: SessionExtractParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>>

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            params: SessionExtractParams
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            extractStreaming(params, RequestOptions.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            extractStreaming(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/navigate`, but is otherwise the
         * same as [SessionService.navigate].
         */
        @MustBeClosed
        fun navigate(
            id: String,
            params: SessionNavigateParams,
        ): HttpResponseFor<SessionNavigateResponse> = navigate(id, params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            id: String,
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNavigateResponse> =
            navigate(params.toBuilder().id(id).build(), requestOptions)

        /** @see navigate */
        @MustBeClosed
        fun navigate(params: SessionNavigateParams): HttpResponseFor<SessionNavigateResponse> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNavigateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/observe`, but is otherwise the
         * same as [SessionService.observe].
         */
        @MustBeClosed
        fun observe(id: String): HttpResponseFor<SessionObserveResponse> =
            observe(id, SessionObserveParams.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionObserveResponse> =
            observe(params.toBuilder().id(id).build(), requestOptions)

        /** @see observe */
        @MustBeClosed
        fun observe(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): HttpResponseFor<SessionObserveResponse> = observe(id, params, RequestOptions.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionObserveResponse>

        /** @see observe */
        @MustBeClosed
        fun observe(params: SessionObserveParams): HttpResponseFor<SessionObserveResponse> =
            observe(params, RequestOptions.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionObserveResponse> =
            observe(id, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/observe`, but is otherwise the
         * same as [SessionService.observeStreaming].
         */
        @MustBeClosed
        fun observeStreaming(id: String): HttpResponseFor<StreamResponse<StreamEvent>> =
            observeStreaming(id, SessionObserveParams.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            observeStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            observeStreaming(id, params, RequestOptions.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<StreamEvent>>

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            params: SessionObserveParams
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            observeStreaming(params, RequestOptions.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<StreamEvent>> =
            observeStreaming(id, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/start`, but is otherwise the same as
         * [SessionService.start].
         */
        @MustBeClosed
        fun start(params: SessionStartParams): HttpResponseFor<SessionStartResponse> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: SessionStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionStartResponse>
    }
}
