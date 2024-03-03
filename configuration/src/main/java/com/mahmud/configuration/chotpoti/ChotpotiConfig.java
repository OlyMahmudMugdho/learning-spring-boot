package com.mahmud.configuration.chotpoti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "chotpoti")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChotpotiConfig {
    private String flavour;
    private String sauce;
    private String spice;
}
