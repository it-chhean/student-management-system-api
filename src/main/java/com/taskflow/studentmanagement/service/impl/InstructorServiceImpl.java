package com.taskflow.studentmanagement.service.impl;

import com.taskflow.studentmanagement.dto.request.InstructorRequest;
import com.taskflow.studentmanagement.dto.response.InstructorResponse;
import com.taskflow.studentmanagement.entity.Instructor;
import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import com.taskflow.studentmanagement.mapper.InstructorMapper;
import com.taskflow.studentmanagement.repository.InstructorRepository;
import com.taskflow.studentmanagement.service.InstructorService;
import com.taskflow.studentmanagement.status.Status;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class InstructorServiceImpl implements InstructorService {

    private final InstructorRepository instructorRepository;
    private final InstructorMapper instructorMapper;

    @Override
    public InstructorResponse create(InstructorRequest request) {

        log.info("Creating instructor");

        Instructor instructor = instructorMapper.toEntity(request);

        Instructor savedInstructor = instructorRepository.save(instructor);

        log.info("Instructor created successfully with id: {}", savedInstructor.getId());

        return instructorMapper.toResponse(savedInstructor);
    }

    @Override
    public InstructorResponse getById(Long id) {

        log.info("Fetching instructor by id: {}", id);

        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Instructor not found with id: {}", id);
                    return new ResourceNotFoundException("Instructor not found with id: " + id);
                });

        log.info("Instructor fetched successfully with id: {}", id);

        return instructorMapper.toResponse(instructor);
    }

    @Override
    public List<InstructorResponse> getAll() {

        log.info("Fetching all instructors");

        List<InstructorResponse> instructors = instructorRepository.findAll().stream()
                .map(instructorMapper::toResponse)
                .toList();

        log.info("Total instructors fetched: {}", instructors.size());

        return instructors;
    }

    @Override
    public InstructorResponse update(Long id, InstructorRequest request) {

        log.info("Updating instructor with id: {}", id);

        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Instructor not found with id: {}", id);
                    return new ResourceNotFoundException("Instructor not found with id: " + id);
                });

        instructorMapper.updateFromRequest(request, instructor);

        Instructor updatedInstructor = instructorRepository.save(instructor);

        log.info("Instructor updated successfully with id: {}", id);

        return instructorMapper.toResponse(updatedInstructor);
    }

    @Override
    public InstructorResponse delete(Long id) {

        log.info("Deleting instructor with id: {}", id);

        Instructor instructor = instructorRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Instructor not found with id: {}", id);
                    return new ResourceNotFoundException("Instructor not found with id: " + id);
                });

        instructor.setDeleted(true);

        Instructor deletedInstructor = instructorRepository.save(instructor);

        log.info("Instructor deleted successfully with id: {}", id);

        return instructorMapper.toResponse(deletedInstructor);
    }

    @Override
    public Page<InstructorResponse> getByStatus(Status status, Pageable pageable) {

        log.info("Fetching instructors by status: {}", status);

        Page<InstructorResponse> instructors = instructorRepository
                .findByStatusAndDeletedFalse(status, pageable)
                .map(instructorMapper::toResponse);

        log.info("Fetched {} instructors with status: {}",
                instructors.getTotalElements(), status);

        return instructors;
    }

    @Override
    public long countByStatus(Status status) {

        log.info("Counting instructors by status: {}", status);

        long count = instructorRepository.countByStatusAndDeletedFalse(status);

        log.info("Total instructors with status {} : {}", status, count);

        return count;
    }
}