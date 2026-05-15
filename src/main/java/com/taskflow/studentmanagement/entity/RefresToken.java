package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class RefresToken {
    
    Long id;

    String token;

    LocalDateTime expiryAt;
}
