package com.taskflow.studentmanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRequest {

    @NotBlank
    private String khFirstName;

    @NotBlank
    private String khLastName;

    @NotBlank
    private String enFirstName;

    @NotBlank
    private String enLastName;

    @NotBlank
    private String dob;

    @NotBlank
    private String email;

    @NotBlank
    private String phone;

    @NotBlank
    private String gender;

}
