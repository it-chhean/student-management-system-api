package com.taskflow.studentmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/students")
public class AuthController {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return "WE ARE A SPRINGBOOT LOVER!";
    }

}
