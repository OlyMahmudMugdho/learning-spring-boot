package com.mahmud.springcorepractice.configs;

import com.mahmud.springcorepractice.greeter.Greeter;
import com.mahmud.springcorepractice.greeter.impl.MorningGreeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public Greeter morningGreeter() {
        return new MorningGreeter();
    }
}
