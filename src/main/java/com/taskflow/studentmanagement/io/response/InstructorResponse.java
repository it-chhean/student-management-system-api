package com.taskflow.studentmanagement.io.response;

import com.taskflow.studentmanagement.io.BaseResponseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstructorResponse extends BaseResponseDTO {

    private String code;
    private String khName;
    private String enName;
    private String specialization;
    private String email;
    private String phone;

}
