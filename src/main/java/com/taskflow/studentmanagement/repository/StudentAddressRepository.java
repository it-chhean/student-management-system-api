package com.taskflow.studentmanagement.repository;

import com.taskflow.studentmanagement.entity.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentAddressRepository extends JpaRepository<StudentAddress, Long> {
}
