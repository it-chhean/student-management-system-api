package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapper;

import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;

@Mapper(componentModel = "spring")
public interface DepartmentMapper
        extends BaseMapper<Department, DepartmentRequest, DepartmentResponse> {
}
