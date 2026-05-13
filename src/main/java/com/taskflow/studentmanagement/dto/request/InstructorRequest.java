package com.taskflow.studentmanagement.dto.request;

import com.taskflow.studentmanagement.status.Status;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InstructorRequest {

    @NotBlank(message = "Instructor Code is required")
    private String code;

    @NotBlank(message = "Instructor Khmer name is required")
    private String khName;

    @NotBlank(message = "Instructor English name is required")
    private String enName;

    private String specialization;

    private String email;

    private String phone;

    private Status status;

}
