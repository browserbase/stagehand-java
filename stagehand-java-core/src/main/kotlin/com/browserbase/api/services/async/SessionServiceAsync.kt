// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.AsyncStreamResponse
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
     * Executes a browser action using natural language instructions or a predefined Action object.
     */
    fun act(id: String, params: SessionActParams): CompletableFuture<SessionActResponse> =
        act(id, params, RequestOptions.none())

    /** @see act */
    fun act(
        id: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse> =
        act(params.toBuilder().id(id).build(), requestOptions)

    /** @see act */
    fun act(params: SessionActParams): CompletableFuture<SessionActResponse> =
        act(params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse>

    /**
     * Executes a browser action using natural language instructions or a predefined Action object.
     */
    fun actStreaming(id: String, params: SessionActParams): AsyncStreamResponse<StreamEvent> =
        actStreaming(id, params, RequestOptions.none())

    /** @see actStreaming */
    fun actStreaming(
        id: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent> =
        actStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see actStreaming */
    fun actStreaming(params: SessionActParams): AsyncStreamResponse<StreamEvent> =
        actStreaming(params, RequestOptions.none())

    /** @see actStreaming */
    fun actStreaming(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent>

    /** Terminates the browser session and releases all associated resources. */
    fun end(id: String, params: SessionEndParams): CompletableFuture<SessionEndResponse> =
        end(id, params, RequestOptions.none())

    /** @see end */
    fun end(
        id: String,
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse> =
        end(params.toBuilder().id(id).build(), requestOptions)

    /** @see end */
    fun end(params: SessionEndParams): CompletableFuture<SessionEndResponse> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse>

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    fun execute(
        id: String,
        params: SessionExecuteParams,
    ): CompletableFuture<SessionExecuteResponse> = execute(id, params, RequestOptions.none())

    /** @see execute */
    fun execute(
        id: String,
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteResponse> =
        execute(params.toBuilder().id(id).build(), requestOptions)

    /** @see execute */
    fun execute(params: SessionExecuteParams): CompletableFuture<SessionExecuteResponse> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteResponse>

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    fun executeStreaming(
        id: String,
        params: SessionExecuteParams,
    ): AsyncStreamResponse<StreamEvent> = executeStreaming(id, params, RequestOptions.none())

    /** @see executeStreaming */
    fun executeStreaming(
        id: String,
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent> =
        executeStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see executeStreaming */
    fun executeStreaming(params: SessionExecuteParams): AsyncStreamResponse<StreamEvent> =
        executeStreaming(params, RequestOptions.none())

    /** @see executeStreaming */
    fun executeStreaming(
        params: SessionExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent>

    /** Extracts structured data from the current page using AI-powered analysis. */
    fun extract(id: String): CompletableFuture<SessionExtractResponse> =
        extract(id, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExtractResponse> =
        extract(params.toBuilder().id(id).build(), requestOptions)

    /** @see extract */
    fun extract(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): CompletableFuture<SessionExtractResponse> = extract(id, params, RequestOptions.none())

    /** @see extract */
    fun extract(
        params: SessionExtractParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExtractResponse>

    /** @see extract */
    fun extract(params: SessionExtractParams): CompletableFuture<SessionExtractResponse> =
        extract(params, RequestOptions.none())

    /** @see extract */
    fun extract(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExtractResponse> =
        extract(id, SessionExtractParams.none(), requestOptions)

    /** Extracts structured data from the current page using AI-powered analysis. */
    fun extractStreaming(id: String): AsyncStreamResponse<StreamEvent> =
        extractStreaming(id, SessionExtractParams.none())

    /** @see extractStreaming */
    fun extractStreaming(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent> =
        extractStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see extractStreaming */
    fun extractStreaming(
        id: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): AsyncStreamResponse<StreamEvent> = extractStreaming(id, params, RequestOptions.none())

    /** @see extractStreaming */
    fun extractStreaming(
        params: SessionExtractParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent>

    /** @see extractStreaming */
    fun extractStreaming(params: SessionExtractParams): AsyncStreamResponse<StreamEvent> =
        extractStreaming(params, RequestOptions.none())

    /** @see extractStreaming */
    fun extractStreaming(
        id: String,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        extractStreaming(id, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL. */
    fun navigate(
        id: String,
        params: SessionNavigateParams,
    ): CompletableFuture<SessionNavigateResponse> = navigate(id, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        id: String,
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionNavigateResponse> =
        navigate(params.toBuilder().id(id).build(), requestOptions)

    /** @see navigate */
    fun navigate(params: SessionNavigateParams): CompletableFuture<SessionNavigateResponse> =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionNavigateResponse>

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    fun observe(id: String): CompletableFuture<SessionObserveResponse> =
        observe(id, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionObserveResponse> =
        observe(params.toBuilder().id(id).build(), requestOptions)

    /** @see observe */
    fun observe(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): CompletableFuture<SessionObserveResponse> = observe(id, params, RequestOptions.none())

    /** @see observe */
    fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionObserveResponse>

    /** @see observe */
    fun observe(params: SessionObserveParams): CompletableFuture<SessionObserveResponse> =
        observe(params, RequestOptions.none())

    /** @see observe */
    fun observe(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionObserveResponse> =
        observe(id, SessionObserveParams.none(), requestOptions)

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    fun observeStreaming(id: String): AsyncStreamResponse<StreamEvent> =
        observeStreaming(id, SessionObserveParams.none())

    /** @see observeStreaming */
    fun observeStreaming(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent> =
        observeStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see observeStreaming */
    fun observeStreaming(
        id: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): AsyncStreamResponse<StreamEvent> = observeStreaming(id, params, RequestOptions.none())

    /** @see observeStreaming */
    fun observeStreaming(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<StreamEvent>

    /** @see observeStreaming */
    fun observeStreaming(params: SessionObserveParams): AsyncStreamResponse<StreamEvent> =
        observeStreaming(params, RequestOptions.none())

    /** @see observeStreaming */
    fun observeStreaming(
        id: String,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        observeStreaming(id, SessionObserveParams.none(), requestOptions)

    /**
     * Creates a new browser session with the specified configuration. Returns a session ID used for
     * all subsequent operations.
     */
    fun start(params: SessionStartParams): CompletableFuture<SessionStartResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: SessionStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionStartResponse>

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
         * Returns a raw HTTP response for `post /v1/sessions/{id}/act`, but is otherwise the same
         * as [SessionServiceAsync.act].
         */
        fun act(
            id: String,
            params: SessionActParams,
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(id, params, RequestOptions.none())

        /** @see act */
        fun act(
            id: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params.toBuilder().id(id).build(), requestOptions)

        /** @see act */
        fun act(params: SessionActParams): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params, RequestOptions.none())

        /** @see act */
        fun act(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/act`, but is otherwise the same
         * as [SessionServiceAsync.actStreaming].
         */
        @MustBeClosed
        fun actStreaming(
            id: String,
            params: SessionActParams,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            actStreaming(id, params, RequestOptions.none())

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(
            id: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            actStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(
            params: SessionActParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            actStreaming(params, RequestOptions.none())

        /** @see actStreaming */
        @MustBeClosed
        fun actStreaming(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/end`, but is otherwise the same
         * as [SessionServiceAsync.end].
         */
        fun end(
            id: String,
            params: SessionEndParams,
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(id, params, RequestOptions.none())

        /** @see end */
        fun end(
            id: String,
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(params.toBuilder().id(id).build(), requestOptions)

        /** @see end */
        fun end(params: SessionEndParams): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(params, RequestOptions.none())

        /** @see end */
        fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/agentExecute`, but is otherwise
         * the same as [SessionServiceAsync.execute].
         */
        fun execute(
            id: String,
            params: SessionExecuteParams,
        ): CompletableFuture<HttpResponseFor<SessionExecuteResponse>> =
            execute(id, params, RequestOptions.none())

        /** @see execute */
        fun execute(
            id: String,
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteResponse>> =
            execute(params.toBuilder().id(id).build(), requestOptions)

        /** @see execute */
        fun execute(
            params: SessionExecuteParams
        ): CompletableFuture<HttpResponseFor<SessionExecuteResponse>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/agentExecute`, but is otherwise
         * the same as [SessionServiceAsync.executeStreaming].
         */
        @MustBeClosed
        fun executeStreaming(
            id: String,
            params: SessionExecuteParams,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            executeStreaming(id, params, RequestOptions.none())

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            id: String,
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            executeStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            params: SessionExecuteParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            executeStreaming(params, RequestOptions.none())

        /** @see executeStreaming */
        @MustBeClosed
        fun executeStreaming(
            params: SessionExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/extract`, but is otherwise the
         * same as [SessionServiceAsync.extract].
         */
        fun extract(id: String): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(id, SessionExtractParams.none())

        /** @see extract */
        fun extract(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(params.toBuilder().id(id).build(), requestOptions)

        /** @see extract */
        fun extract(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(id, params, RequestOptions.none())

        /** @see extract */
        fun extract(
            params: SessionExtractParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>>

        /** @see extract */
        fun extract(
            params: SessionExtractParams
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(params, RequestOptions.none())

        /** @see extract */
        fun extract(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/extract`, but is otherwise the
         * same as [SessionServiceAsync.extractStreaming].
         */
        @MustBeClosed
        fun extractStreaming(
            id: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            extractStreaming(id, SessionExtractParams.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            extractStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            extractStreaming(id, params, RequestOptions.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            params: SessionExtractParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>>

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            params: SessionExtractParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            extractStreaming(params, RequestOptions.none())

        /** @see extractStreaming */
        @MustBeClosed
        fun extractStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            extractStreaming(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/navigate`, but is otherwise the
         * same as [SessionServiceAsync.navigate].
         */
        fun navigate(
            id: String,
            params: SessionNavigateParams,
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(id, params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            id: String,
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(params.toBuilder().id(id).build(), requestOptions)

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/observe`, but is otherwise the
         * same as [SessionServiceAsync.observe].
         */
        fun observe(id: String): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(id, SessionObserveParams.none())

        /** @see observe */
        fun observe(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(params.toBuilder().id(id).build(), requestOptions)

        /** @see observe */
        fun observe(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(id, params, RequestOptions.none())

        /** @see observe */
        fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>>

        /** @see observe */
        fun observe(
            params: SessionObserveParams
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(params, RequestOptions.none())

        /** @see observe */
        fun observe(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(id, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/{id}/observe`, but is otherwise the
         * same as [SessionServiceAsync.observeStreaming].
         */
        @MustBeClosed
        fun observeStreaming(
            id: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            observeStreaming(id, SessionObserveParams.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            observeStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            observeStreaming(id, params, RequestOptions.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>>

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            params: SessionObserveParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            observeStreaming(params, RequestOptions.none())

        /** @see observeStreaming */
        @MustBeClosed
        fun observeStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> =
            observeStreaming(id, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/sessions/start`, but is otherwise the same as
         * [SessionServiceAsync.start].
         */
        fun start(
            params: SessionStartParams
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            params: SessionStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>>
    }
}
