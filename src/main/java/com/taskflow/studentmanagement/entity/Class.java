package com.taskflow.studentmanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "clsses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Class {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private Long id;

    @Column(name = "class_name", nullable = false, length = 50)
    private String name;

    @Column(name = "acadamic_year", nullable = false)
    private String acadamicYear;

    @Column(name = "department", nullable = false)
    private Department department;

    @Column(name = "generation", nullable = false, length = 10)
    private Integer generation;
}
