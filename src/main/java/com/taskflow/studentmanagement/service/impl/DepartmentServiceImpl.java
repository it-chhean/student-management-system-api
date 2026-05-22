package com.taskflow.studentmanagement.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;
import com.taskflow.studentmanagement.mapper.DepartmentMapper;
import com.taskflow.studentmanagement.repository.DepartmentRepository;
import com.taskflow.studentmanagement.service.DepartmentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl 
        extends BaseServiceImpl<
        Department,
        DepartmentRequest,
        DepartmentResponse,
        Long,
        DepartmentRepository,
        DepartmentMapper>
    implements DepartmentService {

   public DepartmentServiceImpl(DepartmentRepository repository, DepartmentMapper mapper) {
       super(repository, mapper);
   }

   public DepartmentResponse findByName(String name) {
       return repository.findByNameIgnoreCase(name)
           .orElseThrow(() -> new ResourceNotFoundException("Department not found"));
   }
}
