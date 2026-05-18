package com.taskflow.studentmanagement.io.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.taskflow.studentmanagement.status.SemesterStatus;
import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {

    private Long id;

    private String name;

    private String description;

    private String schedule;

    private String room;

    private SemesterStatus semester;

    private String academicYear;

    private int creditHouse;

    private int maxCapacity;

    private LocalDateTime startAt;

    private LocalDateTime endAt;

}
