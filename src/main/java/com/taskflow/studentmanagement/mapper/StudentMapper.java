package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.dto.request.CreateStudentRequest;
import com.taskflow.studentmanagement.dto.request.UpdateStudentRequest;
import com.taskflow.studentmanagement.dto.response.StudentAddressResponse;
import com.taskflow.studentmanagement.entity.StudentAddress;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.taskflow.studentmanagement.dto.response.StudentResponse;
import com.taskflow.studentmanagement.entity.Student;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface StudentMapper {

    @Mapping(source = "studentId", target = "student.id")
    StudentAddressResponse toAddressResponse(StudentAddress address);

    @Mapping(source = "address", target = "address")
    StudentResponse toResponse(Student student);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "address", ignore = true)
    Student toEntity(CreateStudentRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "address", ignore = true)
    void updateFromRequest(UpdateStudentRequest request, @MappingTarget Student student);
}
