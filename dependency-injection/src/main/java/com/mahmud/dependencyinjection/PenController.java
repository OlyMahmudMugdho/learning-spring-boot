package com.mahmud.dependencyinjection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PenController {
    Pen pen;

    public PenController(Pen pen) {
        this.pen = pen;
    }

    @GetMapping("/write")
    public String write(){
        return this.pen.write();
    }
}
