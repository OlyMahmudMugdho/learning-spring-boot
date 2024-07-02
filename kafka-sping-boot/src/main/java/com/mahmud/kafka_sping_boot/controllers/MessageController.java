package com.mahmud.kafka_sping_boot.controllers;

import com.mahmud.kafka_sping_boot.services.Listener;
import com.mahmud.kafka_sping_boot.services.Producer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private Producer kafkaProducer;
    @Autowired
    private Listener listener;

    @GetMapping("/publish")
    public String sendMessageToKafka(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return "Message published successfully";
    }
}
