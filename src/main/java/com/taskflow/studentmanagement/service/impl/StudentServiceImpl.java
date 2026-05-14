package com.taskflow.studentmanagement.service.impl;

import java.util.List;

import com.taskflow.studentmanagement.status.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    @Override
    public StudentResponse create(CreateStudentRequest request) {

        log.info("Creating student with code: {}", request.getCode());

        Student student = studentMapper.toEntity(request);

        if (student.getAddress() != null) {
            student.getAddress().setStudent(student);
            log.info("Student address mapped successfully");
        }

        Student savedStudent = studentRepository.save(student);

        log.info("Student created successfully with id: {}", savedStudent.getId());

        return studentMapper.toResponse(savedStudent);
    }

    @Override
    public StudentResponse getById(Long id) {

        log.info("Fetching student by id: {}", id);

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Student not found with id: {}", id);
                    return new ResourceNotFoundException("Student not found");
                });

        log.info("Student fetched successfully with id: {}", id);

        return studentMapper.toResponse(student);
    }

    @Override
    public List<StudentResponse> getAll() {

        log.info("Fetching all students");

        List<StudentResponse> students = studentRepository.findByDeletedFalse()
                .stream()
                .map(studentMapper::toResponse)
                .toList();

        log.info("Total students fetched: {}", students.size());

        return students;
    }

    @Override
    public Page<StudentResponse> getStudents(String code, Status status, int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        Page<Student> students = studentRepository.searchStudents(code, status,pageable);

        return students.map(studentMapper::toResponse);
    }

    @Override
    public Page<StudentResponse> getAll(Pageable pageable) {

        log.info("Fetching students with pagination");

        Page<StudentResponse> students = studentRepository.findAll(pageable)
                .map(studentMapper::toResponse);

        log.info("Page fetched successfully. Total elements: {}", students.getTotalElements());

        return students;
    }

    @Override
    public StudentResponse update(Long id, UpdateStudentRequest request) {

        log.info("Updating student with id: {}", id);

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Student not found with id: {}", id);
                    return new ResourceNotFoundException("Student not found");
                });

        studentMapper.updateFromRequest(request, student);

        Student updatedStudent = studentRepository.save(student);

        log.info("Student updated successfully with id: {}", id);

        return studentMapper.toResponse(updatedStudent);
    }

    @Override
    public void delete(Long id) {

        log.info("Deleting student with id: {}", id);

        Student student = studentRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Student not found with id: {}", id);
                    return new ResourceNotFoundException("Student not found");
                });

        student.setDeleted(true);

        studentRepository.save(student);

        log.info("Student deleted successfully with id: {}", id);
    }
}