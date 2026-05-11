package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.taskflow.studentmanagement.dto.request.StudentAddressRequest;
import com.taskflow.studentmanagement.dto.response.StudentAddressResponse;
import com.taskflow.studentmanagement.entity.StudentAddress;

@Mapper(componentModel = "spring") 
public interface StudentAddressMapper {

    StudentAddressResponse toResponse(StudentAddress studentAddress);

    @Mapping(target = "studentId", source = "student.id")
    StudentAddress toEntity(StudentAddressRequest request);
    
}
