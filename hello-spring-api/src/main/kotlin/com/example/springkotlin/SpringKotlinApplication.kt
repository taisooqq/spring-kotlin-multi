package com.example.springkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ConfigurationPropertiesScan
class SpringKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinApplication>(*args)
}
