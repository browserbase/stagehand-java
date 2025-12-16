// File generated from our OpenAPI spec by Stainless.

package com.browserbase.api.errors

import com.browserbase.api.core.JsonValue
import com.browserbase.api.core.http.Headers

abstract class BrowserbaseServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BrowserbaseException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
