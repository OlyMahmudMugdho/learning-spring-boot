package com.mahmud.spring_core.config;

import com.mahmud.spring_core.printer.Printer;
import com.mahmud.spring_core.printer.impl.BlackPrinter;
import com.mahmud.spring_core.printer.impl.BluePrinter;
import com.mahmud.spring_core.printer.impl.RedPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    @Bean(name = "defaultPrinter")
    @Primary
    public Printer blackPrinter() {
        return new BlackPrinter();
    }

}
