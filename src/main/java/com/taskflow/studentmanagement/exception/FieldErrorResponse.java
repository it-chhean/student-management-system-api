package com.taskflow.studentmanagement.exception;

public record FieldErrorResponse(
        String field,
        String reason
) {}
