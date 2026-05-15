package com.taskflow.studentmanagement.dto.request;

import java.nio.file.attribute.AclEntryFlag;

import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DepartmentRequest {

    @NotBlank(message = "Department name is required")
    String name;

    @NotBlank(message = "Department name is required")
    String code;

}
