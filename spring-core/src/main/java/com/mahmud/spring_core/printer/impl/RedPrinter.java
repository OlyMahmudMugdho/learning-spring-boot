package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;

public class RedPrinter implements Printer {
    public void print(String text) {
        System.out.println("printing " + text + " using red printer");
    }
}
