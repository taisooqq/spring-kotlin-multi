package com.example.springkotlin.api

import com.example.springkotlin.redis.Member
import com.example.springkotlin.redis.MemberRepositoryRedis
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/redis")
class MemberRedisController (
    val memberRepositoryRedis: MemberRepositoryRedis
){
    @PostMapping("/member")
    fun postMember(@RequestBody member: Member): ResponseEntity<Any>{
        memberRepositoryRedis.save(member)
        return ResponseEntity.ok("test")
    }
}