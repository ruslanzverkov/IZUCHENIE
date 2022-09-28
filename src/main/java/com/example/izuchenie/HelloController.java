package com.example.izuchenie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping
    public String hello() {
        return "Hello";
    }

    @GetMapping(path="/Hello")
    public String answerHello(@RequestParam("name")String userName) {
        return "Hello";
    }
}
