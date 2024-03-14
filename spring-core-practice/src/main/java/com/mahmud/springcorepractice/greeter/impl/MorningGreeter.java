package com.mahmud.springcorepractice.greeter.impl;

import com.mahmud.springcorepractice.greeter.Greeter;

public class MorningGreeter implements Greeter {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
