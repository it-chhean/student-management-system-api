package com.taskflow.ecommerce.dto.response;

import java.time.LocalDateTime;
import java.util.List;

public record CategoryResponse(
        Integer id,
        String  slug,
        String name,
        String description,
        List<String> tags,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}
