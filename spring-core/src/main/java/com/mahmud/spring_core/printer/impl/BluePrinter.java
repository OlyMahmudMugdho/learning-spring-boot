package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BluePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("printing " + text + " with blue color");
    }
}
