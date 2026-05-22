package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.config.BaseMapperConfig;
import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface DepartmentMapper extends BaseMapper<Department, DepartmentResponse, DepartmentRequest> {
}
