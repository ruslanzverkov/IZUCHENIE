package com.example.izuchenie;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceIml implements HelloService {
    public String hello() {
        return "Hello";
    }


    public String answerHello(String userName) {
        return "Hello " + userName;
    }
}
