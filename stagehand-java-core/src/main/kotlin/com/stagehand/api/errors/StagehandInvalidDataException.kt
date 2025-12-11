package com.stagehand.api.errors

class StagehandInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : StagehandException(message, cause)
