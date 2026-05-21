package com.taskflow.studentmanagement.repository;


import com.taskflow.studentmanagement.common.repository.BaseRepository;
import com.taskflow.studentmanagement.domain.Department;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends BaseRepository<Department, Long>, JpaSpecificationExecutor<Department> {

}
