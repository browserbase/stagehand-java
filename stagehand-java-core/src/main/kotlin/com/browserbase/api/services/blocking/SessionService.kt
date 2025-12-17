// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

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
    fun act(id: JsonValue): SessionActResponse = act(id, SessionActParams.none())

    /** @see act */
    fun act(
        id: JsonValue,
        params: SessionActParams = SessionActParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse = act(params.toBuilder().id(id).build(), requestOptions)

    /** @see act */
    fun act(id: JsonValue, params: SessionActParams = SessionActParams.none()): SessionActResponse =
        act(id, params, RequestOptions.none())

    /** @see act */
    fun act(
        params: SessionActParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionActResponse

    /** @see act */
    fun act(params: SessionActParams): SessionActResponse = act(params, RequestOptions.none())

    /** @see act */
    fun act(id: JsonValue, requestOptions: RequestOptions): SessionActResponse =
        act(id, SessionActParams.none(), requestOptions)

    /** Terminates the browser session and releases all associated resources. */
    fun end(id: JsonValue): SessionEndResponse = end(id, SessionEndParams.none())

    /** @see end */
    fun end(
        id: JsonValue,
        params: SessionEndParams = SessionEndParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse = end(params.toBuilder().id(id).build(), requestOptions)

    /** @see end */
    fun end(id: JsonValue, params: SessionEndParams = SessionEndParams.none()): SessionEndResponse =
        end(id, params, RequestOptions.none())

    /** @see end */
    fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionEndResponse

    /** @see end */
    fun end(params: SessionEndParams): SessionEndResponse = end(params, RequestOptions.none())

    /** @see end */
    fun end(id: JsonValue, requestOptions: RequestOptions): SessionEndResponse =
        end(id, SessionEndParams.none(), requestOptions)

    /** Runs an autonomous AI agent that can perform complex multi-step browser tasks. */
    fun executeAgent(id: JsonValue): SessionExecuteAgentResponse =
        executeAgent(id, SessionExecuteAgentParams.none())

    /** @see executeAgent */
    fun executeAgent(
        id: JsonValue,
        params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteAgentResponse = executeAgent(params.toBuilder().id(id).build(), requestOptions)

    /** @see executeAgent */
    fun executeAgent(
        id: JsonValue,
        params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
    ): SessionExecuteAgentResponse = executeAgent(id, params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExecuteAgentResponse

    /** @see executeAgent */
    fun executeAgent(params: SessionExecuteAgentParams): SessionExecuteAgentResponse =
        executeAgent(params, RequestOptions.none())

    /** @see executeAgent */
    fun executeAgent(id: JsonValue, requestOptions: RequestOptions): SessionExecuteAgentResponse =
        executeAgent(id, SessionExecuteAgentParams.none(), requestOptions)

    /** Extracts structured data from the current page using AI-powered analysis. */
    fun extract(id: JsonValue): SessionExtractResponse = extract(id, SessionExtractParams.none())

    /** @see extract */
    fun extract(
        id: JsonValue,
        params: SessionExtractParams = SessionExtractParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionExtractResponse = extract(params.toBuilder().id(id).build(), requestOptions)

    /** @see extract */
    fun extract(
        id: JsonValue,
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
    fun extract(id: JsonValue, requestOptions: RequestOptions): SessionExtractResponse =
        extract(id, SessionExtractParams.none(), requestOptions)

    /** Navigates the browser to the specified URL. */
    fun navigate(id: JsonValue): SessionNavigateResponse =
        navigate(id, SessionNavigateParams.none())

    /** @see navigate */
    fun navigate(
        id: JsonValue,
        params: SessionNavigateParams = SessionNavigateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNavigateResponse = navigate(params.toBuilder().id(id).build(), requestOptions)

    /** @see navigate */
    fun navigate(
        id: JsonValue,
        params: SessionNavigateParams = SessionNavigateParams.none(),
    ): SessionNavigateResponse = navigate(id, params, RequestOptions.none())

    /** @see navigate */
    fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionNavigateResponse

    /** @see navigate */
    fun navigate(params: SessionNavigateParams): SessionNavigateResponse =
        navigate(params, RequestOptions.none())

    /** @see navigate */
    fun navigate(id: JsonValue, requestOptions: RequestOptions): SessionNavigateResponse =
        navigate(id, SessionNavigateParams.none(), requestOptions)

    /**
     * Identifies and returns available actions on the current page that match the given
     * instruction.
     */
    fun observe(id: JsonValue): SessionObserveResponse = observe(id, SessionObserveParams.none())

    /** @see observe */
    fun observe(
        id: JsonValue,
        params: SessionObserveParams = SessionObserveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionObserveResponse = observe(params.toBuilder().id(id).build(), requestOptions)

    /** @see observe */
    fun observe(
        id: JsonValue,
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
    fun observe(id: JsonValue, requestOptions: RequestOptions): SessionObserveResponse =
        observe(id, SessionObserveParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /sessions/{id}/act`, but is otherwise the same as
         * [SessionService.act].
         */
        @MustBeClosed
        fun act(id: JsonValue): HttpResponseFor<SessionActResponse> =
            act(id, SessionActParams.none())

        /** @see act */
        @MustBeClosed
        fun act(
            id: JsonValue,
            params: SessionActParams = SessionActParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionActResponse> =
            act(params.toBuilder().id(id).build(), requestOptions)

        /** @see act */
        @MustBeClosed
        fun act(
            id: JsonValue,
            params: SessionActParams = SessionActParams.none(),
        ): HttpResponseFor<SessionActResponse> = act(id, params, RequestOptions.none())

        /** @see act */
        @MustBeClosed
        fun act(
            params: SessionActParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionActResponse>

        /** @see act */
        @MustBeClosed
        fun act(params: SessionActParams): HttpResponseFor<SessionActResponse> =
            act(params, RequestOptions.none())

        /** @see act */
        @MustBeClosed
        fun act(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionActResponse> = act(id, SessionActParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/end`, but is otherwise the same as
         * [SessionService.end].
         */
        @MustBeClosed
        fun end(id: JsonValue): HttpResponseFor<SessionEndResponse> =
            end(id, SessionEndParams.none())

        /** @see end */
        @MustBeClosed
        fun end(
            id: JsonValue,
            params: SessionEndParams = SessionEndParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionEndResponse> =
            end(params.toBuilder().id(id).build(), requestOptions)

        /** @see end */
        @MustBeClosed
        fun end(
            id: JsonValue,
            params: SessionEndParams = SessionEndParams.none(),
        ): HttpResponseFor<SessionEndResponse> = end(id, params, RequestOptions.none())

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
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionEndResponse> = end(id, SessionEndParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/agentExecute`, but is otherwise the
         * same as [SessionService.executeAgent].
         */
        @MustBeClosed
        fun executeAgent(id: JsonValue): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(id, SessionExecuteAgentParams.none())

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            id: JsonValue,
            params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(params.toBuilder().id(id).build(), requestOptions)

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            id: JsonValue,
            params: SessionExecuteAgentParams = SessionExecuteAgentParams.none(),
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(id, params, RequestOptions.none())

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExecuteAgentResponse>

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            params: SessionExecuteAgentParams
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(params, RequestOptions.none())

        /** @see executeAgent */
        @MustBeClosed
        fun executeAgent(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExecuteAgentResponse> =
            executeAgent(id, SessionExecuteAgentParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/extract`, but is otherwise the same
         * as [SessionService.extract].
         */
        @MustBeClosed
        fun extract(id: JsonValue): HttpResponseFor<SessionExtractResponse> =
            extract(id, SessionExtractParams.none())

        /** @see extract */
        @MustBeClosed
        fun extract(
            id: JsonValue,
            params: SessionExtractParams = SessionExtractParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionExtractResponse> =
            extract(params.toBuilder().id(id).build(), requestOptions)

        /** @see extract */
        @MustBeClosed
        fun extract(
            id: JsonValue,
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
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExtractResponse> =
            extract(id, SessionExtractParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/navigate`, but is otherwise the same
         * as [SessionService.navigate].
         */
        @MustBeClosed
        fun navigate(id: JsonValue): HttpResponseFor<SessionNavigateResponse> =
            navigate(id, SessionNavigateParams.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            id: JsonValue,
            params: SessionNavigateParams = SessionNavigateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNavigateResponse> =
            navigate(params.toBuilder().id(id).build(), requestOptions)

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            id: JsonValue,
            params: SessionNavigateParams = SessionNavigateParams.none(),
        ): HttpResponseFor<SessionNavigateResponse> = navigate(id, params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionNavigateResponse>

        /** @see navigate */
        @MustBeClosed
        fun navigate(params: SessionNavigateParams): HttpResponseFor<SessionNavigateResponse> =
            navigate(params, RequestOptions.none())

        /** @see navigate */
        @MustBeClosed
        fun navigate(
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionNavigateResponse> =
            navigate(id, SessionNavigateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /sessions/{id}/observe`, but is otherwise the same
         * as [SessionService.observe].
         */
        @MustBeClosed
        fun observe(id: JsonValue): HttpResponseFor<SessionObserveResponse> =
            observe(id, SessionObserveParams.none())

        /** @see observe */
        @MustBeClosed
        fun observe(
            id: JsonValue,
            params: SessionObserveParams = SessionObserveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionObserveResponse> =
            observe(params.toBuilder().id(id).build(), requestOptions)

        /** @see observe */
        @MustBeClosed
        fun observe(
            id: JsonValue,
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
            id: JsonValue,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionObserveResponse> =
            observe(id, SessionObserveParams.none(), requestOptions)

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
