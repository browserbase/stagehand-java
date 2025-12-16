@file:JvmName("JsonHandler")

package com.browserbase.api.core.handlers

import com.browserbase.api.core.http.HttpResponse
import com.browserbase.api.core.http.HttpResponse.Handler
import com.browserbase.api.errors.BrowserbaseInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw BrowserbaseInvalidDataException("Error reading response", e)
            }
    }
