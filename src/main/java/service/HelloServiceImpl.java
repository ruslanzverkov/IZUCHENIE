package service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello";
    }

    public String answerHello(@RequestParam("name") String userName) {
        return "hello " + userName;
    }
}
