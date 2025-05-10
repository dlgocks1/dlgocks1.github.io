package org.example.compose_web

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform