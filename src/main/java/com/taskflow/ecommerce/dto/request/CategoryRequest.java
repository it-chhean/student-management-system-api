package com.taskflow.ecommerce.dto.request;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record CategoryRequest(

        @NotBlank(message = "Slug is required")
        String slug,

        @NotBlank(message = "Category Name is required")
        @Size(max = 100)
        String name,

        @Size(max = 200)
        String description,

        @NotEmpty(message = "At least one tag is required")
        List< 
        @NotBlank(message = "Tag must not be blank")
        @Size(max = 50, message = "Each tag must not exceed 50 char")
        String > tags

) {}
