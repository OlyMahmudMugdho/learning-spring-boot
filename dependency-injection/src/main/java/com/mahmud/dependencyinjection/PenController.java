package com.mahmud.dependencyinjection;

import org.springframework.stereotype.Controller;

@Controller
public class PenController {
    Pen pen;

    PenController(Pen pen) {
        this.pen = pen;
    }

    public String write(){
        return this.pen.write();
    }
}
