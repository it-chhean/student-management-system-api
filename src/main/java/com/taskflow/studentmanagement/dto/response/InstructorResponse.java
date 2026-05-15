package com.taskflow.studentmanagement.dto.response;

import com.taskflow.studentmanagement.status.Status;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InstructorResponse {

    Long id;
    String code;
    String khName;
    String enName;
    String specialization;
    String email;
    String phone;
    Status status;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
