package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.domain.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}