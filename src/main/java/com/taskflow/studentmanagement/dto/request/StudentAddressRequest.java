package com.taskflow.studentmanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAddressRequest {

    private String street;

    @NotBlank(message = "City is required")
    private String city;

    private String district;

    @NotBlank(message = "Country is required")
    private String country;
}
