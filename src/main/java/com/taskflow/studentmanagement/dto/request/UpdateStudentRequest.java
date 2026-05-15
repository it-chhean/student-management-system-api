package com.taskflow.studentmanagement.dto.request;

import com.taskflow.studentmanagement.entity.StudentAddress;

import com.taskflow.studentmanagement.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStudentRequest {

    private Long id;

    private String khFirstName;

    private String khLastName;

    private String enFirstName;

    private String enLastName;

    private String dob;

    private String email;

    private String phone;

    private String gender;

    private Status status;

    private StudentAddress address;
}
