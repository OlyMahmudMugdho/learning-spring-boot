package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class RedPrinter implements Printer {
    public void print(String text) {
        System.out.println("printing " + text + " using red printer");
    }
}
