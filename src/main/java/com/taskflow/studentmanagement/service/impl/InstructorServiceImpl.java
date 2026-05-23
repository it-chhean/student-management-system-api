package com.taskflow.studentmanagement.service.impl;

import com.taskflow.studentmanagement.domain.Instructor;
import com.taskflow.studentmanagement.io.request.InstructorRequest;
import com.taskflow.studentmanagement.io.response.InstructorResponse;
import com.taskflow.studentmanagement.mapper.InstructorMapper;
import com.taskflow.studentmanagement.repository.InstructorRepository;
import com.taskflow.studentmanagement.service.InstructorService;
import org.springframework.stereotype.Service;

@Service
public class InstructorServiceImpl extends BaseServiceImpl<Instructor, InstructorRequest, InstructorResponse, Long,
        InstructorRepository, InstructorMapper> implements InstructorService {

    public InstructorServiceImpl(InstructorRepository repository, InstructorMapper mapper) {
       super(repository, mapper);
    }

}