package com.taskflow.studentmanagement.mapper;


import com.taskflow.studentmanagement.config.BaseMapperConfig;
import com.taskflow.studentmanagement.domain.Instructor;
import com.taskflow.studentmanagement.io.request.InstructorRequest;
import com.taskflow.studentmanagement.io.response.InstructorResponse;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface InstructorMapper extends BaseMapper<Instructor, InstructorRequest, InstructorResponse> {
}
