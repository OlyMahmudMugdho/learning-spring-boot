package com.mahmud.reactiveapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "/api")
public class ReactiveController {
    @GetMapping("/hello")
    public Flux<String> hello() {
        return Flux.just("Hello", "World");
    }
}
