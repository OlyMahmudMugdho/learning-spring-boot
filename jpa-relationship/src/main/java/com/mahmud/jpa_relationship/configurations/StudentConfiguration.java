package com.mahmud.jpa_relationship.configurations;

import com.mahmud.jpa_relationship.models.mappers.StudentMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
    @Bean
    public StudentMapper studentMapper() {
        return new StudentMapper();
    }
}
