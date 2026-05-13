package com.taskflow.studentmanagement.controller;

import com.taskflow.studentmanagement.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

}

