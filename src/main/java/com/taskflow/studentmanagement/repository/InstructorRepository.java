package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.Instructor;
import com.taskflow.studentmanagement.status.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    Page<Instructor> findByStatusAndDeletedFalse(Status status, Pageable pageable);

    long countByStatusAndDeletedFalse(Status status);
}