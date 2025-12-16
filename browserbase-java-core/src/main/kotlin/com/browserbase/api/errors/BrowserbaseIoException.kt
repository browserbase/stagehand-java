package com.browserbase.api.errors

class BrowserbaseIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    BrowserbaseException(message, cause)
