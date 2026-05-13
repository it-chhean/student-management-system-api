package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.Student;
import com.taskflow.studentmanagement.status.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByDeletedFalse();

    long countByStatusAndDeletedFalse(Status status);

    long countByGender(String gender);
}