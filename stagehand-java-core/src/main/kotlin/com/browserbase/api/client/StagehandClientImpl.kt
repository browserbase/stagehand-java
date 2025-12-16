// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.client

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.getPackageVersion
import com.browserbase.api.services.blocking.SessionService
import com.browserbase.api.services.blocking.SessionServiceImpl
import java.util.function.Consumer

class StagehandClientImpl(private val clientOptions: ClientOptions) : StagehandClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: StagehandClientAsync by lazy { StagehandClientAsyncImpl(clientOptions) }

    private val withRawResponse: StagehandClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): StagehandClientAsync = async

    override fun withRawResponse(): StagehandClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StagehandClient =
        StagehandClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionService = sessions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StagehandClient.WithRawResponse {

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StagehandClient.WithRawResponse =
            StagehandClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionService.WithRawResponse = sessions
    }
}
