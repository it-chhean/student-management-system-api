package com.taskflow.studentmanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentRequest {

        @NotBlank(message = "Department name is required")
        @Size(min = 5, max = 50)
        private String name;

        @NotBlank(message = "Department code is required")
        @Size(min = 3, max = 10)
        private String code;
}
