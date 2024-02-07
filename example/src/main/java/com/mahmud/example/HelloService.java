package com.mahmud.example;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHelloService() {
        return "saying hello from a service";
    }
}
