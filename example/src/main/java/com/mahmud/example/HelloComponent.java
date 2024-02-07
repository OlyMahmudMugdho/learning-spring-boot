package com.mahmud.example;

import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
    public String sayHelloComponent() {
        return "This is a hello component";
    }
}
