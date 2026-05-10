package com.taskflow.studentmanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StudentAddressRequest {

    @NotNull
    private Long studentId;

    @NotBlank(message = "House number is required")
    private String houseNumber;

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "Sangkat is required")
    private String sangkat;

    @NotBlank(message = "khan is required")
    private String khan;

    @NotBlank(message = "Province is required")
    private String province;

}
