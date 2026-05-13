package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.dto.request.InstructorRequest;
import com.taskflow.studentmanagement.dto.response.InstructorResponse;
import com.taskflow.studentmanagement.status.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InstructorService {

    InstructorResponse create(InstructorRequest request);

    InstructorResponse getById(Long id);

    List<InstructorResponse> getAll();

    InstructorResponse update(Long id, InstructorRequest request);

    InstructorResponse delete(Long id);

    Page<InstructorResponse> getByStatus(Status status, Pageable pageable);

    long countByStatus(Status status);

}
