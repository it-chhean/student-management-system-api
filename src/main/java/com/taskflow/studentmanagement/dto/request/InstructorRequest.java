package com.taskflow.studentmanagement.dto.request;

import com.taskflow.studentmanagement.status.Status;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InstructorRequest {

    @NotBlank(message = "Instructor Code is required")
    String code;

    @NotBlank(message = "Instructor Khmer name is required")
    String khName;

    @NotBlank(message = "Instructor English name is required")
    String enName;

    String specialization;

    String email;

    String phone;

    Status status;

}
