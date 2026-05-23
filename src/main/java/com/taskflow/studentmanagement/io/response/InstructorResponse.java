package com.taskflow.studentmanagement.io.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InstructorResponse {

    Long id;
    String code;
    String khName;
    String enName;
    String specialization;
    String email;
    String phone;

}
