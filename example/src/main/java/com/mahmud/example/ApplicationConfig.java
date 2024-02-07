package com.mahmud.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean("myBean")
    public HelloBean helloBean(){
        return new HelloBean();
    }
}
