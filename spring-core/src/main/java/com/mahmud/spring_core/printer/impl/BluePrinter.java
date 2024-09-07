package com.mahmud.spring_core.printer.impl;

import com.mahmud.spring_core.printer.Printer;

public class BluePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("printing " + text + " with blue color");
    }
}
