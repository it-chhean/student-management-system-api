package com.taskflow.studentmanagement.io;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseResponseDTO {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
