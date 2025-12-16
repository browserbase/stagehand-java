// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.client

import com.browserbase.api.core.ClientOptions
import com.browserbase.api.core.getPackageVersion
import com.browserbase.api.services.blocking.SessionService
import com.browserbase.api.services.blocking.SessionServiceImpl
import java.util.function.Consumer

class BrowserbaseClientImpl(private val clientOptions: ClientOptions) : BrowserbaseClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: BrowserbaseClientAsync by lazy { BrowserbaseClientAsyncImpl(clientOptions) }

    private val withRawResponse: BrowserbaseClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionService by lazy { SessionServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): BrowserbaseClientAsync = async

    override fun withRawResponse(): BrowserbaseClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowserbaseClient =
        BrowserbaseClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionService = sessions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowserbaseClient.WithRawResponse {

        private val sessions: SessionService.WithRawResponse by lazy {
            SessionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowserbaseClient.WithRawResponse =
            BrowserbaseClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionService.WithRawResponse = sessions
    }
}
