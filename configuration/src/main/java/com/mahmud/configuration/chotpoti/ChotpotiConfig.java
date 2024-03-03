package com.mahmud.configuration.chotpoti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChotpotiConfig {
    private String flavour;
    private String sauce;
    private String spice;
}
