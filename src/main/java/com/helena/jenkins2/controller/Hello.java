package com.helena.jenkins2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    public String message() {
        return "Hello world!";
    }
}
