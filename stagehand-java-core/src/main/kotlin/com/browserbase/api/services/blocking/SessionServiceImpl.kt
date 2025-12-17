// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.blocking

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.handlers.errorBodyHandler
import com.browserbase.api.core.handlers.errorHandler
import com.browserbase.api.core.handlers.jsonHandler
import com.browserbase.api.core.http.HttpMethod
import com.browserbase.api.core.http.HttpRequest
import com.browserbase.api.core.http.HttpResponse
import com.browserbase.api.core.http.HttpResponse.Handler
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.core.http.json
import com.browserbase.api.core.http.parseable
import com.browserbase.api.core.prepare
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
import java.util.function.Consumer

class SessionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionService {

    private val withRawResponse: SessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SessionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService =
        SessionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun act(params: SessionActParams, requestOptions: RequestOptions): SessionActResponse =
        // post /sessions/{id}/act
        withRawResponse().act(params, requestOptions).parse()

    override fun end(params: SessionEndParams, requestOptions: RequestOptions): SessionEndResponse =
        // post /sessions/{id}/end
        withRawResponse().end(params, requestOptions).parse()

    override fun executeAgent(
        params: SessionExecuteAgentParams,
        requestOptions: RequestOptions,
    ): SessionExecuteAgentResponse =
        // post /sessions/{id}/agentExecute
        withRawResponse().executeAgent(params, requestOptions).parse()

    override fun extract(
        params: SessionExtractParams,
        requestOptions: RequestOptions,
    ): SessionExtractResponse =
        // post /sessions/{id}/extract
        withRawResponse().extract(params, requestOptions).parse()

    override fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions,
    ): SessionNavigateResponse =
        // post /sessions/{id}/navigate
        withRawResponse().navigate(params, requestOptions).parse()

    override fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions,
    ): SessionObserveResponse =
        // post /sessions/{id}/observe
        withRawResponse().observe(params, requestOptions).parse()

    override fun start(
        params: SessionStartParams,
        requestOptions: RequestOptions,
    ): SessionStartResponse =
        // post /sessions/start
        withRawResponse().start(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionService.WithRawResponse =
            SessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val actHandler: Handler<SessionActResponse> =
            jsonHandler<SessionActResponse>(clientOptions.jsonMapper)

        override fun act(
            params: SessionActParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionActResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "act")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { actHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val endHandler: Handler<SessionEndResponse> =
            jsonHandler<SessionEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionEndResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "end")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { endHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val executeAgentHandler: Handler<SessionExecuteAgentResponse> =
            jsonHandler<SessionExecuteAgentResponse>(clientOptions.jsonMapper)

        override fun executeAgent(
            params: SessionExecuteAgentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExecuteAgentResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "agentExecute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { executeAgentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val extractHandler: Handler<SessionExtractResponse> =
            jsonHandler<SessionExtractResponse>(clientOptions.jsonMapper)

        override fun extract(
            params: SessionExtractParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionExtractResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "extract")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { extractHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val navigateHandler: Handler<SessionNavigateResponse> =
            jsonHandler<SessionNavigateResponse>(clientOptions.jsonMapper)

        override fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionNavigateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "navigate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { navigateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val observeHandler: Handler<SessionObserveResponse> =
            jsonHandler<SessionObserveResponse>(clientOptions.jsonMapper)

        override fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionObserveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", params._pathParam(0), "observe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { observeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startHandler: Handler<SessionStartResponse> =
            jsonHandler<SessionStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: SessionStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionStartResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("sessions", "start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { startHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
