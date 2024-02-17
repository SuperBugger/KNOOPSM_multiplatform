package com.doroshenko.knoopsm_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform