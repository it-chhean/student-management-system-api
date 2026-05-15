package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

import com.taskflow.studentmanagement.status.EnrollmentStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Enrollment {

    Long id;

    Student studentId;

    Course courseId;

    LocalDateTime enrollmentDate;

    @Enumerated(EnumType.STRING)
    EnrollmentStatus status;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;
}
