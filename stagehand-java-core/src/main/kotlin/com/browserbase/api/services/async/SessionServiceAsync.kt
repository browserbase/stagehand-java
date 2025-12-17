// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.models.sessions.SessionActParams
import com.browserbase.api.models.sessions.SessionActResponse
import com.browserbase.api.models.sessions.SessionEndParams
import com.browserbase.api.models.sessions.SessionEndResponse
import com.browserbase.api.models.sessions.SessionExecuteAgentParams
import com.browserbase.api.models.sessions.SessionExecuteAgentResponse
import com.browserbase.api.models.sessions.SessionExtractParams
import com.browserbase.api.models.sessions.SessionExtractResponse
import com.browserbase.api.models.sessions.SessionNavigateParams
import com.browserbase.api.models.sessions.SessionNavigateResponse
import com.browserbase.api.models.sessions.SessionObserveParams
import com.browserbase.api.models.sessions.SessionObserveResponse
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
     * Executes a browser action using natural language instructions or a predefined Action object.
     */
    fun act(id: JsonValue): CompletableFuture<SessionActResponse> = act(id, SessionActParams.none())

    /** @see act */
    fun act(
        id: JsonValue,
        params: SessionActParams = SessionActParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse> =
        act(params.toBuilder().id(id).build(), requestOptions)

    /** @see act */
    fun act(
        id: JsonValue,
        params: SessionActParams = SessionActParams.none(),
    ): CompletableFuture<SessionActResponse> = act(id, params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse>

    /** @see act */
    fun act(params: SessionActParams): CompletableFuture<SessionActResponse> =
        act(params, RequestOptions.none())

    /** @see act */
    fun act(id: JsonValue, requestOptions: RequestOptions): CompletableFuture<SessionActResponse> =
        act(id, SessionActParams.none(), requestOptions)

    /** Terminates the browser session and releases all associated resources. */
    fun end(id: JsonValue): CompletableFuture<SessionEndResponse> = end(id, SessionEndParams.none())

    /** @see end */
    fun end(
        id: JsonValue,
        params: SessionEndParams = SessionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse> =
        end(params.toBuilder().id(id).build(), requestOptions)

    /** @see end */
    fun end(
        id: JsonValue,
        params: SessionEndParams = SessionEndParams.none(),
    ): CompletableFuture<SessionEndResponse> = end(id, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse>

    /** @see end */
    fun end(params: SessionEndParams): CompletableFuture<SessionEndResponse> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(id: JsonValue, requestOptions: RequestOptions): CompletableFuture<SessionEndResponse> =
        end(id, SessionEndParams.none(), requestOptions)

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    fun executeAgent(id: JsonValue): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(id, SessionExecuteAgentParams.none())

    /** @see executeAgent */
    fun executeAgent(
        id: JsonValue,
        params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(params.toBuilder().id(id).build(), requestOptions)

    /** @see executeAgent */
    fun executeAgent(
        id: JsonValue,
        params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
    ): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(id, params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteAgentResponse>

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams
    ): CompletableFuture<SessionExecuteAgentResponse> = executeAgent(params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        id: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(id, SessionExecuteAgentParams.none(), requestOptions)

    /** Extracts structured data from the current page using AI-powered analysis. */
    fun extract(id: JsonValue): CompletableFuture<SessionExtractResponse> =
        extract(id, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        id: JsonValue,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExtractResponse> =
        extract(params.toBuilder().id(id).build(), requestOptions)

    /** @see extract */
    fun extract(
        id: JsonValue,
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
        id: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExtractResponse> =
        extract(id, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL. */
    fun navigate(id: JsonValue): CompletableFuture<SessionNavigateResponse> =
        navigate(id, SessionNavigateParams.none())

    /** @see navigate */
    fun navigate(
        id: JsonValue,
        params: SessionNavigateParams = SessionNavigateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionNavigateResponse> =
        navigate(params.toBuilder().id(id).build(), requestOptions)

    /** @see navigate */
    fun navigate(
        id: JsonValue,
        params: SessionNavigateParams = SessionNavigateParams.none(),
    ): CompletableFuture<SessionNavigateResponse> = navigate(id, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionNavigateResponse>

    /** @see navigate */
    fun navigate(params: SessionNavigateParams): CompletableFuture<SessionNavigateResponse> =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        id: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionNavigateResponse> =
        navigate(id, SessionNavigateParams.none(), requestOptions)

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    fun observe(id: JsonValue): CompletableFuture<SessionObserveResponse> =
        observe(id, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        id: JsonValue,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionObserveResponse> =
        observe(params.toBuilder().id(id).build(), requestOptions)

    /** @see observe */
    fun observe(
        id: JsonValue,
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
        id: JsonValue,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionObserveResponse> =
        observe(id, SessionObserveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /sessions/{id}/act`, but is otherwise the same as
         * [SessionServiceAsync.act].
         */
        fun act(id: JsonValue): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(id, SessionActParams.none())

        /** @see act */
        fun act(
            id: JsonValue,
            params: SessionActParams = SessionActParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params.toBuilder().id(id).build(), requestOptions)

        /** @see act */
        fun act(
            id: JsonValue,
            params: SessionActParams = SessionActParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(id, params, RequestOptions.none())

        /** @see act */
        fun act(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>>

        /** @see act */
        fun act(params: SessionActParams): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params, RequestOptions.none())

        /** @see act */
        fun act(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(id, SessionActParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/end`, but is otherwise the same as
         * [SessionServiceAsync.end].
         */
        fun end(id: JsonValue): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(id, SessionEndParams.none())

        /** @see end */
        fun end(
            id: JsonValue,
            params: SessionEndParams = SessionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(params.toBuilder().id(id).build(), requestOptions)

        /** @see end */
        fun end(
            id: JsonValue,
            params: SessionEndParams = SessionEndParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(id, params, RequestOptions.none())

        /** @see end */
        fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>>

        /** @see end */
        fun end(params: SessionEndParams): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(params, RequestOptions.none())

        /** @see end */
        fun end(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(id, SessionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/agentExecute`, but is otherwise the
         * same as [SessionServiceAsync.executeAgent].
         */
        fun executeAgent(
            id: JsonValue
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(id, SessionExecuteAgentParams.none())

        /** @see executeAgent */
        fun executeAgent(
            id: JsonValue,
            params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(params.toBuilder().id(id).build(), requestOptions)

        /** @see executeAgent */
        fun executeAgent(
            id: JsonValue,
            params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(id, params, RequestOptions.none())

        /** @see executeAgent */
        fun executeAgent(
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>>

        /** @see executeAgent */
        fun executeAgent(
            params: SessionExecuteAgentParams
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(params, RequestOptions.none())

        /** @see executeAgent */
        fun executeAgent(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(id, SessionExecuteAgentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/extract`, but is otherwise the same
         * as [SessionServiceAsync.extract].
         */
        fun extract(id: JsonValue): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(id, SessionExtractParams.none())

        /** @see extract */
        fun extract(
            id: JsonValue,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(params.toBuilder().id(id).build(), requestOptions)

        /** @see extract */
        fun extract(
            id: JsonValue,
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
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/navigate`, but is otherwise the same
         * as [SessionServiceAsync.navigate].
         */
        fun navigate(id: JsonValue): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(id, SessionNavigateParams.none())

        /** @see navigate */
        fun navigate(
            id: JsonValue,
            params: SessionNavigateParams = SessionNavigateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(params.toBuilder().id(id).build(), requestOptions)

        /** @see navigate */
        fun navigate(
            id: JsonValue,
            params: SessionNavigateParams = SessionNavigateParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(id, params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>>

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> =
            navigate(id, SessionNavigateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/observe`, but is otherwise the same
         * as [SessionServiceAsync.observe].
         */
        fun observe(id: JsonValue): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(id, SessionObserveParams.none())

        /** @see observe */
        fun observe(
            id: JsonValue,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(params.toBuilder().id(id).build(), requestOptions)

        /** @see observe */
        fun observe(
            id: JsonValue,
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
            id: JsonValue,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> =
            observe(id, SessionObserveParams.none(), requestOptions)

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
