package com.stagehand.api.errors

class BrowserbaseInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    BrowserbaseException(message, cause)
