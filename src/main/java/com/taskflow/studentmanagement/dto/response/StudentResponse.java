package com.taskflow.studentmanagement.dto.response;

import java.time.LocalDateTime;

import com.taskflow.studentmanagement.status.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {

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
    private StudentAddressResponse address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
