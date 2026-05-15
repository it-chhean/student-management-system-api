package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

import com.taskflow.studentmanagement.status.SemesterStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_courses")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    Long id;

    @Column(name = "course_name", nullable = false , length = 50)
    String name;

    String desciption;

    String schedule;

    String room;

    @Enumerated(EnumType.STRING)
    SemesterStatus semester;

    String academicYear;

    int creditHouse;

    int maxCapacity;

    LocalDateTime startAt;

    LocalDateTime endAt;
    
}
