@file:JvmName("JsonHandler")

package com.stagehand.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.stagehand.api.core.http.HttpResponse
import com.stagehand.api.core.http.HttpResponse.Handler
import com.stagehand.api.errors.StagehandInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw StagehandInvalidDataException("Error reading response", e)
            }
    }
