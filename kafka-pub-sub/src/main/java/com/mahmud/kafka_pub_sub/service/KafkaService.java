package com.mahmud.kafka_pub_sub.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component
public class KafkaService {
    public static final String TOPIC = "events";
    public static String data;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        String key = UUID.randomUUID().toString();
        kafkaTemplate.send(TOPIC, key ,message);
    }

    @KafkaListener(topics = TOPIC, groupId = "mock-up-kafka-consumer-client")
    public void listen(String message) {
        String msg = message;
        data = msg;
    }

    public String getData() {
        return data;
    }
}
