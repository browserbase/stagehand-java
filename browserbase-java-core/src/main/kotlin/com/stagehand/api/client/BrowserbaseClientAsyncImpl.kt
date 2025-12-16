// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.client

import com.stagehand.api.core.ClientOptions
import com.stagehand.api.core.getPackageVersion
import com.stagehand.api.services.async.SessionServiceAsync
import com.stagehand.api.services.async.SessionServiceAsyncImpl
import java.util.function.Consumer

class BrowserbaseClientAsyncImpl(private val clientOptions: ClientOptions) :
    BrowserbaseClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: BrowserbaseClient by lazy { BrowserbaseClientImpl(clientOptions) }

    private val withRawResponse: BrowserbaseClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val sessions: SessionServiceAsync by lazy {
        SessionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): BrowserbaseClient = sync

    override fun withRawResponse(): BrowserbaseClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrowserbaseClientAsync =
        BrowserbaseClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun sessions(): SessionServiceAsync = sessions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BrowserbaseClientAsync.WithRawResponse {

        private val sessions: SessionServiceAsync.WithRawResponse by lazy {
            SessionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrowserbaseClientAsync.WithRawResponse =
            BrowserbaseClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun sessions(): SessionServiceAsync.WithRawResponse = sessions
    }
}
