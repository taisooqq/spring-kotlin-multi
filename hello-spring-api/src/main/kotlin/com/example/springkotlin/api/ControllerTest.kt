package com.example.springkotlin.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ControllerTest {

    @GetMapping("test")
    fun healthCheck(): String = "hello spring kotlin"
}