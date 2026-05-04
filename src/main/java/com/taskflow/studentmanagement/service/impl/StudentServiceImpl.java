package com.taskflow.studentmanagement.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.taskflow.studentmanagement.dto.request.CreateStudentRequest;
import com.taskflow.studentmanagement.dto.request.UpdateStudentRequest;
import com.taskflow.studentmanagement.dto.response.StudentResponse;
import com.taskflow.studentmanagement.entity.Student;
import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import com.taskflow.studentmanagement.mapper.StudentMapper;
import com.taskflow.studentmanagement.repository.StudentRepository;
import com.taskflow.studentmanagement.service.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentResponse create(CreateStudentRequest request) {
        Student student = studentMapper.toEntity(request);
        return studentMapper.toResponse(studentRepository.save(student));
    }

    @Override
    public StudentResponse getById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        return studentMapper.toResponse(student);
    }

    @Override
    public List<StudentResponse> getAll() {
        return studentRepository.findByDeletedFalse()
                .stream()
                .map(studentMapper::toResponse)
                .toList();
    }

    @Override
    public Page<StudentResponse> getAll(Pageable pageable) {
        return studentRepository.findAll(pageable)
                .map(studentMapper::toResponse);
    }

    @Override
    public StudentResponse update(Long id, UpdateStudentRequest request) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        studentMapper.updateFromRequest(request, student);

        return studentMapper.toResponse(studentRepository.save(student));
    }

    @Override
    public void delete(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        student.setDeleted(true);

        studentRepository.save(student);
    }
}
