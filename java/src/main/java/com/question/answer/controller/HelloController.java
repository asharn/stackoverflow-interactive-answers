package com.question.answer.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/",produces = "multipart/alternative" )
    public byte[] index() {
        return "Greetings from Spring Boot!".getBytes();
    }

}
