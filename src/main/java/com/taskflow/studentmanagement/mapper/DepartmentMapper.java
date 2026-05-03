package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.dto.request.DepartmentRequest;
import com.taskflow.studentmanagement.dto.response.DepartmentResponse;
import com.taskflow.studentmanagement.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentResponse toResponse(Department department);

    @Mapping(target = "id", ignore = true)
    Department toEntity(DepartmentRequest request);

    @Mapping(target = "id", ignore = true)
    void updateFromRequest(DepartmentRequest request, @MappingTarget Department department);
}
