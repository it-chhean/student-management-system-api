package com.taskflow.studentmanagement.io.request;

import com.taskflow.studentmanagement.io.BaseRequestDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InstructorRequest extends BaseRequestDTO {

    @NotBlank(message = "Instructor Khmer name is required")
    String khName;

    @NotBlank(message = "Instructor English name is required")
    String enName;

    String specialization;

    String email;

    String phone;

}
