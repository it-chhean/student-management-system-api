package com.taskflow.studentmanagement.service;

import java.util.List;

import com.taskflow.studentmanagement.dto.request.DepartmentRequest;
import com.taskflow.studentmanagement.dto.response.DepartmentResponse;

public interface DepartmentService {

    /**
     * Creates a new department based on the provided request.
     *
     * @param request the department creation request containing department details
     * @return the response containing the created department information
     * @throws IllegalArgumentException if the request is null or contains invalid data
     */
    DepartmentResponse create(DepartmentRequest request);

    DepartmentResponse getById(Integer id);

    List<DepartmentResponse> getAll();

    DepartmentResponse update(Integer id, DepartmentRequest request);

    void delete(Integer id);

}
