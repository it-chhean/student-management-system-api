package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.dto.request.CreateStudentRequest;
import com.taskflow.studentmanagement.dto.request.UpdateStudentRequest;
import com.taskflow.studentmanagement.dto.response.StudentResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

    StudentResponse create(CreateStudentRequest request);

    StudentResponse getById(Long id);

    List<StudentResponse> getAll();

    Page<StudentResponse> getAll(Pageable pageable);

    StudentResponse update(Long id, UpdateStudentRequest request);

    void delete(Long id);
}
