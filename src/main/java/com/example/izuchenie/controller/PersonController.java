package com.example.izuchenie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class PersonController {
    @GetMapping("/person")
    public String getPersonInf0(@RequestParam("number") Integer number) {
        return "";
    }
}
