package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;

public class BlackPrinter implements Printer {
    @Override
    public void print(String text) {
        System.out.println("Printing " + text + " with Black Printer");
    }
}
