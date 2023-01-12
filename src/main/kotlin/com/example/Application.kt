package com.example

import io.ktor.server.application.*
import com.example.plugins.*
import org.koin.core.module.Module

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeaders()
    configureStatusPages()

}
