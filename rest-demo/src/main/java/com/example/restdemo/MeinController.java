package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MeinController {

    @GetMapping("/api/test")
    public TestResult test(){
        TestResult testResult = new TestResult("Hello World");
        return testResult;
    }


    @GetMapping("/api/rand")
    public TestResult randomMsg(){
        List<String> randMsg = List.of("Hi","Hey","Hallo");

        return new TestResult(randMsg.get((int)(Math.random()*3)));

        }
}
