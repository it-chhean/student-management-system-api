package com.taskflow.studentmanagement.common.dto;

import java.time.LocalDateTime;

public abstract class BaseResponseDto {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
