package com.expample.springkotlin.redis

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("member")
data class Member(
    @Id
    val id: String? = null,
    val name: String? = null,
    val email: String? = null,
    val age: Int? = null
)