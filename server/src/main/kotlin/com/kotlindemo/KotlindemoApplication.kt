package com.kotlindemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
    runApplication<KotlindemoApplication>(*args)

    data class Message(val id: String?, val text: String)

    @RestController
    class MessageResource {

        @GetMapping
        fun index(): List<Message> = listOf(
                Message("1", "Hello!"),
                Message("2", "Bonjour!"),
                Message("3", "Privet!"),
        )
    }
}