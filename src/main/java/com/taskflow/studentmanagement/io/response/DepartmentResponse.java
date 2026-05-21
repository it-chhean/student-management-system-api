package com.taskflow.studentmanagement.io.response;

import com.taskflow.studentmanagement.common.dto.BaseResponseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentResponse extends BaseResponseDto {
    private String name;
    private String code;
}
