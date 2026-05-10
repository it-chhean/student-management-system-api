package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

public class RefresToken {
    
    private Long id;

    private User userId;

    private String token;

    private LocalDateTime expiryAt;
}
