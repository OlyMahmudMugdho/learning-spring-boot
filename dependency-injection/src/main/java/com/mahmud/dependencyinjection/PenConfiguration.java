package com.mahmud.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PenConfiguration {
    @Bean
    public Pen write(){
        return new RedPen();
    }
}
