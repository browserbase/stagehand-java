package com.browserbase.api.errors

open class BrowserbaseException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
