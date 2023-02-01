package com.github.kr328.clash.common

import android.app.Application
import com.github.kr328.clash.common.ws.WsServerContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

object Global : CoroutineScope by CoroutineScope(Dispatchers.IO) {
    val application: Application
        get() = application_

    private lateinit var application_: Application

    fun init(application: Application) {
        this.application_ = application
        WsServerContext.init(application)
    }

    fun destroy() {
        cancel()
        WsServerContext.stopServer()
    }
}