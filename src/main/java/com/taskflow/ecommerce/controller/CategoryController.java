package com.taskflow.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/categories")
public class CategoryController {

    @GetMapping
    public String getMessage() {
        return "Spring Boot is work";
    }

}
