package com.taskflow.studentmanagement.service;

import com.taskflow.studentmanagement.io.request.StudentAddressRequest;
import com.taskflow.studentmanagement.io.response.StudentAddressResponse;

public interface StudentAddressService {

    StudentAddressResponse findByStudentId(Long studentId);
    StudentAddressResponse update(Long studentId, StudentAddressRequest request);
}