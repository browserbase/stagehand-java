// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.services.async

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
import com.browserbase.api.core.prepareAsync
import com.browserbase.api.models.sessions.SessionStartParams
import com.browserbase.api.models.sessions.SessionStartResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SessionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SessionServiceAsync {

    private val withRawResponse: SessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SessionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync =
        SessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun start(
        params: SessionStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionStartResponse> =
        // post /sessions/start
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
                    .addPathSegments("sessions", "start")
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
