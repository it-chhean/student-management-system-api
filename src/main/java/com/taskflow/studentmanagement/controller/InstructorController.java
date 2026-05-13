package com.taskflow.studentmanagement.controller;

import com.taskflow.studentmanagement.dto.request.InstructorRequest;
import com.taskflow.studentmanagement.dto.response.InstructorResponse;
import com.taskflow.studentmanagement.service.InstructorService;
import com.taskflow.studentmanagement.status.Status;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResponseErrorHandler;

@RestController
@RequestMapping(path = "/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping
    public ResponseEntity<InstructorResponse> create(@Valid @RequestBody InstructorRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(instructorService.create(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<InstructorResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(instructorService.getById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InstructorResponse> update(@PathVariable Long id,
                                                  @RequestBody InstructorRequest request
    ) {
        return ResponseEntity.ok(instructorService.update(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        instructorService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<Page<InstructorResponse>> getByStatus(
            @RequestParam Status status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "createdAt") String sortBy,
            @RequestParam(defaultValue = "desc") String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);
        return ResponseEntity.ok(instructorService.getByStatus(status, pageable));
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countByStatus(
            @RequestParam Status status) {
        return ResponseEntity.ok(instructorService.countByStatus(status));
    }
}

