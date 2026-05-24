package com.taskflow.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskflow.studentmanagement.entities.StudentAddress;

public interface StudentAddressRepository extends JpaRepository<StudentAddress, Long> {
}
