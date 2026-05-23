package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.domain.Instructor;
import com.taskflow.studentmanagement.io.request.InstructorRequest;
import com.taskflow.studentmanagement.io.response.InstructorResponse;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface InstructorMapper {

    InstructorResponse toResponse(Instructor instructor);

    @Mapping(target = "id", ignore = true)
    Instructor toEntity(InstructorRequest request);

    @Mapping(target = "id", ignore = true)
    void updateFromRequest(InstructorRequest request, @MappingTarget Instructor instructor);

}
