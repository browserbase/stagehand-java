// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.stagehand.api.core.ClientOptions
import com.stagehand.api.core.RequestOptions
import com.stagehand.api.core.http.HttpResponseFor
import com.stagehand.api.models.sessions.Action
import com.stagehand.api.models.sessions.SessionActParams
import com.stagehand.api.models.sessions.SessionActResponse
import com.stagehand.api.models.sessions.SessionEndParams
import com.stagehand.api.models.sessions.SessionEndResponse
import com.stagehand.api.models.sessions.SessionExecuteAgentParams
import com.stagehand.api.models.sessions.SessionExecuteAgentResponse
import com.stagehand.api.models.sessions.SessionExtractParams
import com.stagehand.api.models.sessions.SessionExtractResponse
import com.stagehand.api.models.sessions.SessionNavigateParams
import com.stagehand.api.models.sessions.SessionNavigateResponse
import com.stagehand.api.models.sessions.SessionObserveParams
import com.stagehand.api.models.sessions.SessionStartParams
import com.stagehand.api.models.sessions.SessionStartResponse
import java.util.Optional
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
     * Performs a browser action based on natural language instruction or a specific action object
     * returned by observe().
     */
    fun act(sessionId: String, params: SessionActParams): SessionActResponse =
        act(sessionId, params, RequestOptions.none())

    /** @see act */
    fun act(
        sessionId: String,
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse = act(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see act */
    fun act(params: SessionActParams): SessionActResponse = act(params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse

    /** Closes the browser and cleans up all resources associated with the session. */
    fun end(sessionId: String): SessionEndResponse = end(sessionId, SessionEndParams.none())

    /** @see end */
    fun end(
        sessionId: String,
        params: SessionEndParams = SessionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse = end(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see end */
    fun end(
        sessionId: String,
        params: SessionEndParams = SessionEndParams.none(),
    ): SessionEndResponse = end(sessionId, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse

    /** @see end */
    fun end(params: SessionEndParams): SessionEndResponse = end(params, RequestOptions.none())

    /** @see end */
    fun end(sessionId: String, requestOptions: RequestOptions): SessionEndResponse =
        end(sessionId, SessionEndParams.none(), requestOptions)

    /** Runs an autonomous agent that can perform multiple actions to complete a complex task. */
    fun executeAgent(
        sessionId: String,
        params: SessionExecuteAgentParams,
    ): SessionExecuteAgentResponse = executeAgent(sessionId, params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        sessionId: String,
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteAgentResponse =
        executeAgent(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see executeAgent */
    fun executeAgent(params: SessionExecuteAgentParams): SessionExecuteAgentResponse =
        executeAgent(params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteAgentResponse

    /**
     * Extracts data from the current page using natural language instructions and optional JSON
     * schema for structured output.
     */
    fun extract(sessionId: String): SessionExtractResponse =
        extract(sessionId, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        sessionId: String,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExtractResponse =
        extract(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see extract */
    fun extract(
        sessionId: String,
        params: SessionExtractParams = SessionExtractParams.none(),
    ): SessionExtractResponse = extract(sessionId, params, RequestOptions.none())

    /** @see extract */
    fun extract(
        params: SessionExtractParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExtractResponse

    /** @see extract */
    fun extract(params: SessionExtractParams): SessionExtractResponse =
        extract(params, RequestOptions.none())

    /** @see extract */
    fun extract(sessionId: String, requestOptions: RequestOptions): SessionExtractResponse =
        extract(sessionId, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL and waits for page load. */
    fun navigate(
        sessionId: String,
        params: SessionNavigateParams,
    ): Optional<SessionNavigateResponse> = navigate(sessionId, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        sessionId: String,
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<SessionNavigateResponse> =
        navigate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see navigate */
    fun navigate(params: SessionNavigateParams): Optional<SessionNavigateResponse> =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Optional<SessionNavigateResponse>

    /**
     * Returns a list of candidate actions that can be performed on the page, optionally filtered by
     * natural language instruction.
     */
    fun observe(sessionId: String): List<Action> = observe(sessionId, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        sessionId: String,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Action> = observe(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see observe */
    fun observe(
        sessionId: String,
        params: SessionObserveParams = SessionObserveParams.none(),
    ): List<Action> = observe(sessionId, params, RequestOptions.none())

    /** @see observe */
    fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Action>

    /** @see observe */
    fun observe(params: SessionObserveParams): List<Action> = observe(params, RequestOptions.none())

    /** @see observe */
    fun observe(sessionId: String, requestOptions: RequestOptions): List<Action> =
        observe(sessionId, SessionObserveParams.none(), requestOptions)

    /**
     * Initializes a new Stagehand session with a browser instance. Returns a session ID that must
     * be used for all subsequent requests.
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
         * Returns a raw HTTP response for `post /sessions/{sessionId}/act`, but is otherwise the
         * same as [SessionService.act].
         */
        @MustBeClosed
        fun act(sessionId: String, params: SessionActParams): HttpResponseFor<SessionActResponse> =
            act(sessionId, params, RequestOptions.none())

        /** @see act */
        @MustBeClosed
        fun act(
            sessionId: String,
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionActResponse> =
            act(params.toBuilder().sessionId(sessionId).build(), requestOptions)

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
         * Returns a raw HTTP response for `post /sessions/{sessionId}/end`, but is otherwise the
         * same as [SessionService.end].
         */
        @MustBeClosed
        fun end(sessionId: String): HttpResponseFor<SessionEndResponse> =
            end(sessionId, SessionEndParams.none())

        /** @see end */
        @MustBeClosed
        fun end(
            sessionId: String,
            params: SessionEndParams = SessionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionEndResponse> =
            end(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see end */
        @MustBeClosed
        fun end(
            sessionId: String,
            params: SessionEndParams = SessionEndParams.none(),
        ): HttpResponseFor<SessionEndResponse> = end(sessionId, params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionEndResponse>

        /** @see end */
        @MustBeClosed
        fun end(params: SessionEndParams): HttpResponseFor<SessionEndResponse> =
            end(params, RequestOptions.none())

        /** @see end */
        @MustBeClosed
        fun end(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionEndResponse> =
            end(sessionId, SessionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/agentExecute`, but is
         * otherwise the same as [SessionService.executeAgent].
         */
        @MustBeClosed
        fun executeAgent(
            sessionId: String,
            params: SessionExecuteAgentParams,
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(sessionId, params, RequestOptions.none())

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            sessionId: String,
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            params: SessionExecuteAgentParams
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(params, RequestOptions.none())

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteAgentResponse>

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/extract`, but is otherwise
         * the same as [SessionService.extract].
         */
        @MustBeClosed
        fun extract(sessionId: String): HttpResponseFor<SessionExtractResponse> =
            extract(sessionId, SessionExtractParams.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            sessionId: String,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExtractResponse> =
            extract(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see extract */
        @MustBeClosed
        fun extract(
            sessionId: String,
            params: SessionExtractParams = SessionExtractParams.none(),
        ): HttpResponseFor<SessionExtractResponse> =
            extract(sessionId, params, RequestOptions.none())

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
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExtractResponse> =
            extract(sessionId, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/navigate`, but is otherwise
         * the same as [SessionService.navigate].
         */
        @MustBeClosed
        fun navigate(
            sessionId: String,
            params: SessionNavigateParams,
        ): HttpResponseFor<Optional<SessionNavigateResponse>> =
            navigate(sessionId, params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            sessionId: String,
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<SessionNavigateResponse>> =
            navigate(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            params: SessionNavigateParams
        ): HttpResponseFor<Optional<SessionNavigateResponse>> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Optional<SessionNavigateResponse>>

        /**
         * Returns a raw HTTP response for `post /sessions/{sessionId}/observe`, but is otherwise
         * the same as [SessionService.observe].
         */
        @MustBeClosed
        fun observe(sessionId: String): HttpResponseFor<List<Action>> =
            observe(sessionId, SessionObserveParams.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            sessionId: String,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Action>> =
            observe(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see observe */
        @MustBeClosed
        fun observe(
            sessionId: String,
            params: SessionObserveParams = SessionObserveParams.none(),
        ): HttpResponseFor<List<Action>> = observe(sessionId, params, RequestOptions.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Action>>

        /** @see observe */
        @MustBeClosed
        fun observe(params: SessionObserveParams): HttpResponseFor<List<Action>> =
            observe(params, RequestOptions.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Action>> =
            observe(sessionId, SessionObserveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/start`, but is otherwise the same as
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
