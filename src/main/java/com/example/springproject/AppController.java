package com.example.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hello, i am home!";
    }

    @GetMapping("/world")
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/age")
    public String sayAge(@RequestParam(value = "age", defaultValue = "5") Integer age) {
        return String.format("Congratulations, you are  %d years old! ", age);
    }


}
