package com.taskflow.studentmanagement.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SubjectResponse {

    private Long id;

    private String name;

    private String code;

    private String description;
}
