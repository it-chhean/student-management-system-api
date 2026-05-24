package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.config.BaseMapperConfig;
import com.taskflow.studentmanagement.entities.Department;
import com.taskflow.studentmanagement.dto.request.DepartmentRequest;
import com.taskflow.studentmanagement.dto.response.DepartmentResponse;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface DepartmentMapper extends BaseMapper<Department, DepartmentRequest, DepartmentResponse> { }
