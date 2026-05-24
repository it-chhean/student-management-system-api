package com.taskflow.studentmanagement.mapper;


import com.taskflow.studentmanagement.config.BaseMapperConfig;
import com.taskflow.studentmanagement.entities.Instructor;
import com.taskflow.studentmanagement.dto.request.InstructorRequest;
import com.taskflow.studentmanagement.dto.response.InstructorResponse;
import org.mapstruct.Mapper;

@Mapper(config = BaseMapperConfig.class)
public interface InstructorMapper extends BaseMapper<Instructor, InstructorRequest, InstructorResponse> {
}
