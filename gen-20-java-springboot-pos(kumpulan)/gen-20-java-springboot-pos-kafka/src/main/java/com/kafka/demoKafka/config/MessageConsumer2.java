package com.kafka.demoKafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer2 {
    @KafkaListener(topics = "tes-topic", groupId = "group2")
    public void listenGroup2(String message) {
        //System.out.println("Service 2 (Group 2) Received message: " + message);

        // Melakukan filtering data
        if (message.contains("Mobil")) {
            // Lakukan sesuatu dengan pesan yang difilter
            System.out.println("Service 2 (Group 2) Filtered message (Mobil): " + message);
        } else {
            // Tidak melakukan apa-apa jika pesan tidak memenuhi kondisi tertentu
        }
    }
}
