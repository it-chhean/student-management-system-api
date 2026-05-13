package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
