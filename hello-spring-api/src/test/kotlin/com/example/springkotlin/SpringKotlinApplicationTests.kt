package com.example.springkotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cache.CacheManager
import org.springframework.data.redis.cache.RedisCacheManager

@SpringBootTest
class SpringKotlinApplicationTests {

    @Autowired
    private lateinit var cacheManager: CacheManager

    @Test
    fun contextLoads() {
    }

    //Redis Cache 를 사용하는지 확인
    @Test
    fun cacheManagerText(){
        println("cacheManager Name : ${cacheManager.javaClass.name}")
        assertThat(cacheManager).isInstanceOf(RedisCacheManager::class.java)
    }

}
