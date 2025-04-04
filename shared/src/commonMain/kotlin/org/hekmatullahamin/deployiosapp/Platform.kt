package org.hekmatullahamin.deployiosapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform