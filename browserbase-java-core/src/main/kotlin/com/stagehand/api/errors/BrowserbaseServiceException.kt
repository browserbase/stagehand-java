// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.errors

import com.stagehand.api.core.JsonValue
import com.stagehand.api.core.http.Headers

abstract class BrowserbaseServiceException
protected constructor(message: String, cause: Throwable? = null) :
    BrowserbaseException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
