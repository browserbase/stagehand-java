package com.stagehand.api.errors

class StagehandIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : StagehandException(message, cause)
