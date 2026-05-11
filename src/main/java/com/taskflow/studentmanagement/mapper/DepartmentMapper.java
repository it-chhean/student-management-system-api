package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.taskflow.studentmanagement.dto.request.DepartmentRequest;
import com.taskflow.studentmanagement.dto.response.DepartmentResponse;
import com.taskflow.studentmanagement.entity.Department;

@Mapper(componentModel = "sprring")
public interface DepartmentMapper {

    DepartmentResponse toResponse(Department department);

    @Mapping(target = "id", ignore = true)
    Department toEntity(DepartmentRequest request);

    void updateFromRequest(DepartmentRequest request, @MappingTarget Department department);
}
