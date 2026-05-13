package com.taskflow.studentmanagement.dto.request;

import com.taskflow.studentmanagement.status.Status;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRequest {

    private String code;

    private String khFirstName;

    private String khLastName;

    private String enFirstName;

    private String enLastName;

    private String dob;

    private String email;

    private String phone;

    private String gender;

    private Status status;

    private StudentAddressRequest address;

}
