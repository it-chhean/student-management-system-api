package com.taskflow.studentmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/students")
public class AuthController {

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("SPRINGBOOT APPLICATIOIN IS WORKED!");
    }

}
