package com.taskflow.studentmanagement.dto.response;

import com.taskflow.studentmanagement.status.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InstructorResponse {

    private Long id;

    private String code;

    private String khName;

    private String enName;

    private String specialization;

    private String email;

    private String phone;

    private Status status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
