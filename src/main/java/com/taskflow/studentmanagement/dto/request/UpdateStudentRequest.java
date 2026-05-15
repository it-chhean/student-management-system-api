package com.taskflow.studentmanagement.dto.request;

import com.taskflow.studentmanagement.entity.StudentAddress;

import com.taskflow.studentmanagement.status.Status;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateStudentRequest {

    Long id;

    String khFirstName;

    String khLastName;

    String enFirstName;

    String enLastName;

    String dob;

    String email;

    String phone;

    String gender;

    Status status;

    StudentAddress address;
}
