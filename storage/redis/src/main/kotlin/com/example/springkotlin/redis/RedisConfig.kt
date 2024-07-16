package com.example.springkotlin.redis

import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories

@Configuration
@EnableRedisRepositories(basePackages = ["com.example.springkotlin.redis"])
class RedisConfig {
}