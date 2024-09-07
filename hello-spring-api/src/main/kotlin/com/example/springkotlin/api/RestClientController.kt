package com.example.springkotlin.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestClient

@RestController
class RestClientController(
    val restClient: RestClient
) {

    @GetMapping("/test1")
    fun restClientTest(): ResponseEntity<String>{
        val restClient1 = restClient
        return ResponseEntity.ok("test")
    }
}