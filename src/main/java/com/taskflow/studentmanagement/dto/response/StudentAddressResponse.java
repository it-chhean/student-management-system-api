package com.taskflow.studentmanagement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAddressResponse {

    private Long id;
    private String street;
    private String city;
    private String district;
    private String country;

}