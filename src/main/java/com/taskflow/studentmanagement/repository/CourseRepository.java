package com.taskflow.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskflow.studentmanagement.entities.Course;

public interface CourseRepository  extends JpaRepository<Course, Long>{
      
} 