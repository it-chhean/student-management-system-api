package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.Student;
import com.taskflow.studentmanagement.status.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Page<Student> findAll(Specification<Student> specification, Pageable pageable);

    @Query("SELECT u FROM Student u WHERE u.status = :status")
    Page<Student> findByStatus(@Param("status") String status, Pageable pageable);

    Optional<Student> findByDeletedFalse();

    long countByStatusAndDeletedFalse(Status status);

    long countByGender(String gender);

    List<Student> findByCodeContainingAndStatus(String code, Status status);

    @Query("""
    SELECT s FROM Student s
    WHERE (:code IS NULL OR LOWER(s.code) LIKE LOWER(CONCAT('%', :code, '%')))
    AND (:status IS NULL OR s.status = :status)
    """)
    Page<Student> searchStudents(
            @Param("code") String code,
            @Param("status") Status status,
            Pageable pageable
    );}