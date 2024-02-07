package com.mahmud.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public HelloBean helloBean(){
        return new HelloBean();
    }
}
