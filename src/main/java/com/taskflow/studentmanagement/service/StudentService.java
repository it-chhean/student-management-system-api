package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.dto.request.CreateStudentRequest;
import com.taskflow.studentmanagement.dto.request.UpdateStudentRequest;
import com.taskflow.studentmanagement.dto.response.StudentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    StudentResponse create(CreateStudentRequest request);

    StudentResponse getById(Long id);

    Page<StudentResponse> getStudentWithFilter(String status, Pageable pageable);

    StudentResponse update(Long id, UpdateStudentRequest request);

    void delete(Long id);

}
