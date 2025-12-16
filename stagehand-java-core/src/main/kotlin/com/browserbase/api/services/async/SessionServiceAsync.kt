// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.models.sessions.Action
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
import com.browserbase.api.models.sessions.SessionStartParams
import com.browserbase.api.models.sessions.SessionStartResponse
import java.util.Optional
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
     * Performs a browser action based on natural language instruction or a specific action object
     * returned by observe().
     */
    fun act(sessionId: String, params: SessionActParams): CompletableFuture<SessionActResponse> =
        act(sessionId, params, RequestOptions.none())

    /** @see act */
    fun act(
        sessionId: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse> =
        act(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see act */
    fun act(params: SessionActParams): CompletableFuture<SessionActResponse> =
        act(params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionActResponse>

    /** Closes the browser and cleans up all resources associated with the session. */
    fun end(sessionId: String): CompletableFuture<SessionEndResponse> =
        end(sessionId, SessionEndParams.none())

    /** @see end */
    fun end(
        sessionId: String,
        params: SessionEndParams = SessionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse> =
        end(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see end */
    fun end(
        sessionId: String,
        params: SessionEndParams = SessionEndParams.none(),
    ): CompletableFuture<SessionEndResponse> = end(sessionId, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionEndResponse>

    /** @see end */
    fun end(params: SessionEndParams): CompletableFuture<SessionEndResponse> =
        end(params, RequestOptions.none())

    /** @see end */
    fun end(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionEndResponse> =
        end(sessionId, SessionEndParams.none(), requestOptions)

    /** Runs an autonomous agent that can perform multiple actions to complete a complex task. */
    fun executeAgent(
        sessionId: String,
        params: SessionExecuteAgentParams,
    ): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(sessionId, params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        sessionId: String,
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteAgentResponse> =
        executeAgent(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams
    ): CompletableFuture<SessionExecuteAgentResponse> = executeAgent(params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExecuteAgentResponse>

    /**
     * Extracts data from the current page using natural language instructions and optional JSON
     * schema for structured output.
     */
    fun extract(sessionId: String): CompletableFuture<SessionExtractResponse> =
        extract(sessionId, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        sessionId: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionExtractResponse> =
        extract(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see extract */
    fun extract(
        sessionId: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): CompletableFuture<SessionExtractResponse> = extract(sessionId, params, RequestOptions.none())

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
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExtractResponse> =
        extract(sessionId, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL and waits for page load. */
    fun navigate(
        sessionId: String,
        params: SessionNavigateParams,
    ): CompletableFuture<Optional<SessionNavigateResponse>> =
        navigate(sessionId, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        sessionId: String,
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<SessionNavigateResponse>> =
        navigate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams
    ): CompletableFuture<Optional<SessionNavigateResponse>> =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Optional<SessionNavigateResponse>>

    /**
     * Returns a list of candidate actions that can be performed on the page, optionally filtered by
     * natural language instruction.
     */
    fun observe(sessionId: String): CompletableFuture<List<Action>> =
        observe(sessionId, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        sessionId: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Action>> =
        observe(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see observe */
    fun observe(
        sessionId: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): CompletableFuture<List<Action>> = observe(sessionId, params, RequestOptions.none())

    /** @see observe */
    fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Action>>

    /** @see observe */
    fun observe(params: SessionObserveParams): CompletableFuture<List<Action>> =
        observe(params, RequestOptions.none())

    /** @see observe */
    fun observe(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Action>> =
        observe(sessionId, SessionObserveParams.none(), requestOptions)

    /**
     * Initializes a new Stagehand session with a browser instance. Returns a session ID that must
     * be used for all subsequent requests.
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
         * Returns a raw HTTP response for `post /sessions/{sessionId}/act`, but is otherwise the
         * same as [SessionServiceAsync.act].
         */
        fun act(
            sessionId: String,
            params: SessionActParams,
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(sessionId, params, RequestOptions.none())

        /** @see act */
        fun act(
            sessionId: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see act */
        fun act(params: SessionActParams): CompletableFuture<HttpResponseFor<SessionActResponse>> =
            act(params, RequestOptions.none())

        /** @see act */
        fun act(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionActResponse>>

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/end`, but is otherwise the
         * same as [SessionServiceAsync.end].
         */
        fun end(sessionId: String): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(sessionId, SessionEndParams.none())

        /** @see end */
        fun end(
            sessionId: String,
            params: SessionEndParams = SessionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see end */
        fun end(
            sessionId: String,
            params: SessionEndParams = SessionEndParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(sessionId, params, RequestOptions.none())

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
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> =
            end(sessionId, SessionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/agentExecute`, but is
         * otherwise the same as [SessionServiceAsync.executeAgent].
         */
        fun executeAgent(
            sessionId: String,
            params: SessionExecuteAgentParams,
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(sessionId, params, RequestOptions.none())

        /** @see executeAgent */
        fun executeAgent(
            sessionId: String,
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see executeAgent */
        fun executeAgent(
            params: SessionExecuteAgentParams
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>> =
            executeAgent(params, RequestOptions.none())

        /** @see executeAgent */
        fun executeAgent(
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExecuteAgentResponse>>

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/extract`, but is otherwise
         * the same as [SessionServiceAsync.extract].
         */
        fun extract(sessionId: String): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(sessionId, SessionExtractParams.none())

        /** @see extract */
        fun extract(
            sessionId: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see extract */
        fun extract(
            sessionId: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(sessionId, params, RequestOptions.none())

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
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> =
            extract(sessionId, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/navigate`, but is otherwise
         * the same as [SessionServiceAsync.navigate].
         */
        fun navigate(
            sessionId: String,
            params: SessionNavigateParams,
        ): CompletableFuture<HttpResponseFor<Optional<SessionNavigateResponse>>> =
            navigate(sessionId, params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            sessionId: String,
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<SessionNavigateResponse>>> =
            navigate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams
        ): CompletableFuture<HttpResponseFor<Optional<SessionNavigateResponse>>> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Optional<SessionNavigateResponse>>>

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/observe`, but is otherwise
         * the same as [SessionServiceAsync.observe].
         */
        fun observe(sessionId: String): CompletableFuture<HttpResponseFor<List<Action>>> =
            observe(sessionId, SessionObserveParams.none())

        /** @see observe */
        fun observe(
            sessionId: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Action>>> =
            observe(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see observe */
        fun observe(
            sessionId: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Action>>> =
            observe(sessionId, params, RequestOptions.none())

        /** @see observe */
        fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Action>>>

        /** @see observe */
        fun observe(
            params: SessionObserveParams
        ): CompletableFuture<HttpResponseFor<List<Action>>> = observe(params, RequestOptions.none())

        /** @see observe */
        fun observe(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Action>>> =
            observe(sessionId, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/start`, but is otherwise the same as
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
