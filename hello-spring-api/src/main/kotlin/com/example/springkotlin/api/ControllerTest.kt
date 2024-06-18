package com.example.springkotlin.api

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import kotlin.math.log


@RestController
class ControllerTest {

    private val log: Logger = LoggerFactory.getLogger(javaClass)
    @GetMapping("test")
    fun healthCheck(): String = "hello spring kotlin"

    @GetMapping("test2")
    fun loggingCheck(): String {
        log.error("Logger Test {}", "test")
        return "logger test success"
    }
}