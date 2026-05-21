package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapper;

import com.taskflow.studentmanagement.common.mapper.BaseMapper;
import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;

@Mapper(componentModel = "spring")
import org.mapstruct.InheritConfiguration;

public interface DepartmentMapper extends BaseMapper<Department, DepartmentRequest, DepartmentResponse> {

    @InheritConfiguration(name = "toEntity")
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Department toEntity(DepartmentRequest request);

}
