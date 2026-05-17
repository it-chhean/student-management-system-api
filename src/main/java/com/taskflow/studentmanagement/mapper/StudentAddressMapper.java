package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.taskflow.studentmanagement.domain.StudentAddress;
import com.taskflow.studentmanagement.io.request.StudentAddressRequest;
import com.taskflow.studentmanagement.io.response.StudentAddressResponse;

@Mapper(componentModel = "spring")
public interface StudentAddressMapper {

    StudentAddressResponse toResponse(StudentAddress studentAddress);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "student", ignore = true)
    StudentAddress toEntity(StudentAddressRequest request);
}
