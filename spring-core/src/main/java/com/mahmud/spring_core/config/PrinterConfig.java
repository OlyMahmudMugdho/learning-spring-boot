package com.mahmud.spring_core.config;

import com.mahmud.spring_core.printer.Printer;
import com.mahmud.spring_core.printer.impl.BlackPrinter;
import com.mahmud.spring_core.printer.impl.BluePrinter;
import com.mahmud.spring_core.printer.impl.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrinterConfig {
    @Bean
    public Printer bluePrinter() {
        System.out.println("Blue Printer Created");
        return new BluePrinter();
    }

    @Bean
    public Printer redPrinter() {
        System.out.println("Red Printer Created");
        return new RedPrinter();
    }

    @Bean(name = "defaultPrinter")
    @Primary
    public Printer blackPrinter() {
        System.out.println("Black Printer Created");
        return new BlackPrinter();
    }

}
