package com.taskflow.studentmanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
