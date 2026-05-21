package com.taskflow.studentmanagement.io;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public abstract class BaseResponseDTO {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean active;

}
