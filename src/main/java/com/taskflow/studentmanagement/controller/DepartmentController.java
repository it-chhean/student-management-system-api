package com.taskflow.studentmanagement.controller;

import com.taskflow.studentmanagement.domain.Department;
import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import com.taskflow.studentmanagement.io.request.DepartmentRequest;
import com.taskflow.studentmanagement.io.response.DepartmentResponse;
import com.taskflow.studentmanagement.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/departments")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentResponse> save(@Valid @RequestBody DepartmentRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.save(request));
    }

//    @PostMapping("/batch")
//    public ResponseEntity<List<DepartmentResponse>> saveAll(
//            @RequestBody List<DepartmentRequest> requests
//    ) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(departmentService.saveAll(requests));
//    }

    @GetMapping("/{id}")
    public ResponseEntity<DepartmentResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(departmentService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id )));
    }

    @GetMapping
    public ResponseEntity<Page<DepartmentResponse>> findAll(Pageable pageable) {
        return ResponseEntity.ok(departmentService.findAll(pageable));
    }

//    @GetMapping("/active")
//    public ResponseEntity<Page<DepartmentResponse>> findAllActive(Pageable pageable) {
//        return ResponseEntity.ok(departmentService.findAllActive(pageable));
//    }

//    @GetMapping("/{id}/activate")
//    public ResponseEntity<DepartmentResponse> activate(@PathVariable Long id) {
//        return ResponseEntity.ok(departmentService.activate(id));
//    }
//
//    @GetMapping("/{id}/deactivate")
//    public ResponseEntity<DepartmentResponse> deactivate(@PathVariable Long id) {
//        return ResponseEntity.ok(departmentService.deactivate(id));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
//        departmentService.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/count")
//    public ResponseEntity<Long> count() {
//        return ResponseEntity.ok(departmentService.count());
//    }
//
//    @GetMapping("/{id}/exits")
//    public ResponseEntity<Boolean> existsById(@PathVariable Long id) {
//        return ResponseEntity.ok(departmentService.existsById(id));
//    }

}
