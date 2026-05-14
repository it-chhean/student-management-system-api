package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.Student;
import com.taskflow.studentmanagement.status.Status;
import org.apache.catalina.LifecycleState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByDeletedFalse();

    long countByStatusAndDeletedFalse(Status status);

    long countByGender(String gender);

    List<Student> findByCodeContainingAndStatus(String name, Status status);

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