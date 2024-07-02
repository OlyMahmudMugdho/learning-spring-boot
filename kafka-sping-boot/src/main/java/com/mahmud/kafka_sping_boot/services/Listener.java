package com.mahmud.kafka_sping_boot.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {
    @KafkaListener(id = "listen1", topics = "orders")
    public void listen(String in) {
        System.out.println(in);
    }
}
