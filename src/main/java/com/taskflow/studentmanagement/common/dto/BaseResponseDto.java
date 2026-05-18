package com.taskflow.studentmanagement.common.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class BaseResponseDto {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean active;

}