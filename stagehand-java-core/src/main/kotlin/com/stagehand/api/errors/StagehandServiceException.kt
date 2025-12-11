// File generated from our OpenAPI spec by Stainless.

package com.stagehand.api.errors

import com.stagehand.api.core.JsonValue
import com.stagehand.api.core.http.Headers

abstract class StagehandServiceException
protected constructor(message: String, cause: Throwable? = null) :
    StagehandException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
