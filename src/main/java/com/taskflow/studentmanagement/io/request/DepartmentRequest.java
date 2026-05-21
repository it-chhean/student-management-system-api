package com.taskflow.studentmanagement.io.request;

import com.taskflow.studentmanagement.io.BaseRequestDTO;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
public class DepartmentRequest extends BaseRequestDTO {

    @NotBlank(message = "Department name is required")
    private String name;

    @NotBlank(message = "Department name is required")
    private String code;

}
