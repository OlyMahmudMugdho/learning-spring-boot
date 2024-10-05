package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Order(1)
public class BlackPrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println("Printing " + text + " with Black Printer");
    }
}
