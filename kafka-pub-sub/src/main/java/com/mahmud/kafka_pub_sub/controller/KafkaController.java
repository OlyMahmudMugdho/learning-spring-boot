package com.mahmud.kafka_pub_sub.controller;

import com.mahmud.kafka_pub_sub.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class KafkaController {
    @Autowired
    public KafkaService kafkaService;

    @GetMapping("/produce")
    public String produceMsg() {
        this.kafkaService.sendMessage("hello world from kafka");
        return "message sent";
    }

    @GetMapping("/consume")
    public String consumeMsg() {
        return this.kafkaService.getData();
    }
}
