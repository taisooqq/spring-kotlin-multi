package com.example.springkotlin.api

import com.example.springkotlin.redis.MemberRepositoryRedis
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/redis")
class MemberRedisController (
    val memberRepositoryRedis: MemberRepositoryRedis
){

}