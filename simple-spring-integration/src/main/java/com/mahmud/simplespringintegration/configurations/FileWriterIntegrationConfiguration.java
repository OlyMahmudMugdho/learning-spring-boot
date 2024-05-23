package com.mahmud.simplespringintegration.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.core.GenericTransformer;

@Configuration
public class FileWriterIntegrationConfiguration {

    @Bean
    @Transformer(inputChannel = "textInChannel",
                 outputChannel = "fileWriterChannel"
    )
    public GenericTransformer<String, String> upperCaseTransformer() {
        return text -> text.toUpperCase();
    }
}
