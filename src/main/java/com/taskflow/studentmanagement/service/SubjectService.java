package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.io.request.SubjectRequest;
import com.taskflow.studentmanagement.io.response.SubjectResponse;

public interface SubjectService {

   SubjectResponse create(SubjectRequest request);

   SubjectResponse getById(Long id);
}
