package com.vproject.ecommerce

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform