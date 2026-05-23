package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.io.request.InstructorRequest;
import com.taskflow.studentmanagement.io.response.InstructorResponse;

public interface InstructorService extends BaseService<InstructorRequest, InstructorResponse, Integer> {

    InstructorResponse update(Integer id, InstructorRequest request);
}
