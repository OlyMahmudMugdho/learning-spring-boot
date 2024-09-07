package com.mahmud.spring_core.config;

import com.mahmud.spring_core.printer.Printer;
import com.mahmud.spring_core.printer.impl.BluePrinter;
import com.mahmud.spring_core.printer.impl.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public Printer bluePrinter() {
        return new BluePrinter();
    }

    @Bean
    public Printer redPrinter() {
        return new RedPrinter();
    }

}
