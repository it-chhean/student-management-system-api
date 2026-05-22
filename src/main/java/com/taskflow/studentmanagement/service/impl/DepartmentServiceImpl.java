package com.taskflow.studentmanagement.service.impl;

import org.springframework.stereotype.Service;

import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;
import com.taskflow.studentmanagement.mapper.DepartmentMapper;
import com.taskflow.studentmanagement.repository.DepartmentRepository;
import com.taskflow.studentmanagement.service.DepartmentService;


@Service
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

   @Override
   public DepartmentResponse findByName(String name) {
       return repository.findByNameIgnoreCase(name)
           .map(mapper::toResponse)
           .orElseThrow(() -> new ResourceNotFoundException("Department not found"));
   }

}
