package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

import com.taskflow.studentmanagement.status.SemesterStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Course {

    private Long id;

    private String name;

    private String desciption;

    private String schedule;

    private String room;

    @Enumerated(EnumType.STRING)
    private SemesterStatus semester;

    private String academicYear;

    private int creditHouse;

    private int maxCapacity;

    private LocalDateTime startAt;

    private LocalDateTime endAt;
    
}
