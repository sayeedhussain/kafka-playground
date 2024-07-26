package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic", groupId = "consumer-grp-1")
    public void consume(String message) {
        System.out.print("Message: " + message + "\n");
    }
}
