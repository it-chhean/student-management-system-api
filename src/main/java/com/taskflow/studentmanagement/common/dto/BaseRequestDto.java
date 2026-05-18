package com.taskflow.studentmanagement.common.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class BaseRequestDto {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean active;

}
