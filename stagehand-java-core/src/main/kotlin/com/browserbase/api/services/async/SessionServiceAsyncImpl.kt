// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.RequestOptions
import com.browserbase.api.core.checkRequired
import com.browserbase.api.core.handlers.errorBodyHandler
import com.browserbase.api.core.handlers.errorHandler
import com.browserbase.api.core.handlers.jsonHandler
import com.browserbase.api.core.handlers.mapJson
import com.browserbase.api.core.handlers.sseHandler
import com.browserbase.api.core.http.AsyncStreamResponse
import com.browserbase.api.core.http.HttpMethod
import com.browserbase.api.core.http.HttpRequest
import com.browserbase.api.core.http.HttpResponse
import com.browserbase.api.core.http.HttpResponse.Handler
import com.browserbase.api.core.http.HttpResponseFor
import com.browserbase.api.core.http.StreamResponse
import com.browserbase.api.core.http.json
import com.browserbase.api.core.http.map
import com.browserbase.api.core.http.parseable
import com.browserbase.api.core.http.toAsync
import com.browserbase.api.core.prepareAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SessionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionServiceAsync {

    private val withRawResponse: SessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync =
        SessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun act(
        params: SessionActParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionActResponse> =
        // post /v1/sessions/{id}/act
        withRawResponse().act(params, requestOptions).thenApply { it.parse() }

    override fun actStreaming(
        params: SessionActParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        // post /v1/sessions/{id}/act
        withRawResponse()
            .actStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun end(
        params: SessionEndParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionEndResponse> =
        // post /v1/sessions/{id}/end
        withRawResponse().end(params, requestOptions).thenApply { it.parse() }

    override fun execute(
        params: SessionExecuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExecuteResponse> =
        // post /v1/sessions/{id}/agentExecute
        withRawResponse().execute(params, requestOptions).thenApply { it.parse() }

    override fun executeStreaming(
        params: SessionExecuteParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        // post /v1/sessions/{id}/agentExecute
        withRawResponse()
            .executeStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun extract(
        params: SessionExtractParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionExtractResponse> =
        // post /v1/sessions/{id}/extract
        withRawResponse().extract(params, requestOptions).thenApply { it.parse() }

    override fun extractStreaming(
        params: SessionExtractParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        // post /v1/sessions/{id}/extract
        withRawResponse()
            .extractStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun navigate(
        params: SessionNavigateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionNavigateResponse> =
        // post /v1/sessions/{id}/navigate
        withRawResponse().navigate(params, requestOptions).thenApply { it.parse() }

    override fun observe(
        params: SessionObserveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionObserveResponse> =
        // post /v1/sessions/{id}/observe
        withRawResponse().observe(params, requestOptions).thenApply { it.parse() }

    override fun observeStreaming(
        params: SessionObserveParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<StreamEvent> =
        // post /v1/sessions/{id}/observe
        withRawResponse()
            .observeStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun start(
        params: SessionStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionStartResponse> =
        // post /v1/sessions/start
        withRawResponse().start(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse =
            SessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val actHandler: Handler<SessionActResponse> =
            jsonHandler<SessionActResponse>(clientOptions.jsonMapper)

        override fun act(
            params: SessionActParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionActResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "act")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { actHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val actStreamingHandler: Handler<StreamResponse<StreamEvent>> =
            sseHandler(clientOptions.jsonMapper).mapJson<StreamEvent>()

        override fun actStreaming(
            params: SessionActParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "act")
                    .body(
                        json(
                            clientOptions.jsonMapper,
                            params
                                ._body()
                                .toBuilder()
                                .putAdditionalProperty("streamResponse", JsonValue.from(true))
                                .build(),
                        )
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .let { actStreamingHandler.handle(it) }
                            .let { streamResponse ->
                                if (requestOptions.responseValidation!!) {
                                    streamResponse.map { it.validate() }
                                } else {
                                    streamResponse
                                }
                            }
                    }
                }
        }

        private val endHandler: Handler<SessionEndResponse> =
            jsonHandler<SessionEndResponse>(clientOptions.jsonMapper)

        override fun end(
            params: SessionEndParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionEndResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "end")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { endHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val executeHandler: Handler<SessionExecuteResponse> =
            jsonHandler<SessionExecuteResponse>(clientOptions.jsonMapper)

        override fun execute(
            params: SessionExecuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExecuteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "agentExecute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { executeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val executeStreamingHandler: Handler<StreamResponse<StreamEvent>> =
            sseHandler(clientOptions.jsonMapper).mapJson<StreamEvent>()

        override fun executeStreaming(
            params: SessionExecuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "agentExecute")
                    .body(
                        json(
                            clientOptions.jsonMapper,
                            params
                                ._body()
                                .toBuilder()
                                .putAdditionalProperty("streamResponse", JsonValue.from(true))
                                .build(),
                        )
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .let { executeStreamingHandler.handle(it) }
                            .let { streamResponse ->
                                if (requestOptions.responseValidation!!) {
                                    streamResponse.map { it.validate() }
                                } else {
                                    streamResponse
                                }
                            }
                    }
                }
        }

        private val extractHandler: Handler<SessionExtractResponse> =
            jsonHandler<SessionExtractResponse>(clientOptions.jsonMapper)

        override fun extract(
            params: SessionExtractParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionExtractResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "extract")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { extractHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val extractStreamingHandler: Handler<StreamResponse<StreamEvent>> =
            sseHandler(clientOptions.jsonMapper).mapJson<StreamEvent>()

        override fun extractStreaming(
            params: SessionExtractParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "extract")
                    .body(
                        json(
                            clientOptions.jsonMapper,
                            params
                                ._body()
                                .toBuilder()
                                .putAdditionalProperty("streamResponse", JsonValue.from(true))
                                .build(),
                        )
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .let { extractStreamingHandler.handle(it) }
                            .let { streamResponse ->
                                if (requestOptions.responseValidation!!) {
                                    streamResponse.map { it.validate() }
                                } else {
                                    streamResponse
                                }
                            }
                    }
                }
        }

        private val navigateHandler: Handler<SessionNavigateResponse> =
            jsonHandler<SessionNavigateResponse>(clientOptions.jsonMapper)

        override fun navigate(
            params: SessionNavigateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionNavigateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "navigate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { navigateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val observeHandler: Handler<SessionObserveResponse> =
            jsonHandler<SessionObserveResponse>(clientOptions.jsonMapper)

        override fun observe(
            params: SessionObserveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionObserveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "observe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { observeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val observeStreamingHandler: Handler<StreamResponse<StreamEvent>> =
            sseHandler(clientOptions.jsonMapper).mapJson<StreamEvent>()

        override fun observeStreaming(
            params: SessionObserveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<StreamEvent>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", params._pathParam(0), "observe")
                    .body(
                        json(
                            clientOptions.jsonMapper,
                            params
                                ._body()
                                .toBuilder()
                                .putAdditionalProperty("streamResponse", JsonValue.from(true))
                                .build(),
                        )
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .let { observeStreamingHandler.handle(it) }
                            .let { streamResponse ->
                                if (requestOptions.responseValidation!!) {
                                    streamResponse.map { it.validate() }
                                } else {
                                    streamResponse
                                }
                            }
                    }
                }
        }

        private val startHandler: Handler<SessionStartResponse> =
            jsonHandler<SessionStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: SessionStartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionStartResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "sessions", "start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
