package com.example.springkotlin.api

import com.example.springkotlin.storage.db.core.ExampleEntity
import com.example.springkotlin.storage.db.core.ExampleRepository
import org.springframework.data.domain.Example
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/jpa")
class JpaController (
    val exampleRepository: ExampleRepository
){
    @PostMapping("example")
    fun example(): ResponseEntity<Any> {
        var exampleEntity = ExampleEntity(id = 1, exampleColumn = "test")
        exampleRepository.save(exampleEntity)
        return ResponseEntity.ok("jpa success")

    }
}