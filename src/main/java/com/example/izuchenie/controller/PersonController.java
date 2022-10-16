package com.example.izuchenie.controller;

import com.example.izuchenie.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public String getPersonInf0(@RequestParam("number") Integer number) {
        return personService.getPerson(number);
    }
}
