package com.edge51.notesite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/helloA")
    public String handle() {
        return "hello spring boot";
    }
}
