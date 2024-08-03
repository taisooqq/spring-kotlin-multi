package com.example.springkotlin.api

import com.example.springkotlin.storage.db.core.ExampleEntity
import com.example.springkotlin.storage.db.core.ExampleRepository
import org.springframework.data.domain.Example
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception

@RestController
@RequestMapping("/jpa")
class JpaController (
    val exampleRepository: ExampleRepository
){
    @PostMapping("example")
    fun example(): ResponseEntity<Any> {
        var exampleEntity: ExampleEntity? = exampleRepository.findTopByOrderByIdDesc()

        return ResponseEntity.ok("jpa success")
    }
}