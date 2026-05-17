package com.taskflow.studentmanagement.mapper;

import org.mapstruct.*;

import com.taskflow.studentmanagement.domain.Student;
import com.taskflow.studentmanagement.io.request.CreateStudentRequest;
import com.taskflow.studentmanagement.io.request.UpdateStudentRequest;
import com.taskflow.studentmanagement.io.response.StudentResponse;

@Mapper(componentModel = "spring", uses = {StudentAddressMapper.class})
public interface StudentMapper {

    @Mapping(target = "address", source = "address")
    StudentResponse toResponse(Student student);

    @Mapping(target = "id", ignore = true)
    Student toEntity(CreateStudentRequest request);

    @Mapping(target = "id", ignore = true)
    void updateFromRequest(UpdateStudentRequest request, @MappingTarget Student student);
}
