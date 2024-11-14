package com.example.springkotlin.kafka

import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class KafkaService (
    private val kafkaTemplate: KafkaTemplate<String, String>,
    @Value("\${kafka.topic.name}") private val topicName: String
){
    fun sendMessage(message: String) {
        kafkaTemplate.send(topicName, message)
    }
}