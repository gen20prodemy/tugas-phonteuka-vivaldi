package com.kafka.demoKafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer1 {
    @KafkaListener(topics = "tes-topic", groupId = "group1")
    public void listenGroup1(String message) {
        System.out.println("Service 1 (Group 1) Received message: " + message);
    }
}
