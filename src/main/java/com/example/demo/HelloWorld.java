package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HelloWorld {
    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/q")
    public String getNumber(@RequestParam(name = "q", required = false, defaultValue = "0") String q) {
        return "Вы ввели номер:  " + q;
    }


}