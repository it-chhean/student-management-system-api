package com.taskflow.studentmanagement.domain;

import com.taskflow.studentmanagement.common.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tbl_departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department extends BaseEntity {

    @Column(name = "department_name", nullable = false, length = 50)
    private String name;

    @Column(name = "department_code", nullable = false, length = 20)
    private String code;

}
