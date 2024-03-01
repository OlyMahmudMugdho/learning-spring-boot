package com.mahmud.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class BlackPen implements Pen{
    @Override
    public String write() {
        return "writing black text";
    }
}
