package com.taskflow.studentmanagement.io.response;

import com.taskflow.studentmanagement.io.BaseResponseDTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentResponse extends BaseResponseDTO {

    private String name;
    private String code;

}
