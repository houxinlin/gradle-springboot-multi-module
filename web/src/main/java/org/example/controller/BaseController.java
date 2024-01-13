package org.example.controller;

import org.example.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class BaseController {
    @GetMapping("hello")
    public String helloWorld(@RequestParam("name") String name) {
        return "hello" + name;
    }
}
