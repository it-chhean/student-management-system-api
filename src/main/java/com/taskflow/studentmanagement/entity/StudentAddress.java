package com.taskflow.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students_address")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_address_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Column(name = "house_name", nullable = false, length = 50)
    private String houseNumber;

    @Column(name = "street", nullable = false, length = 50)
    private String street;

    @Column(name = "sangkat", nullable = false, length = 50)
    private String sangkat;

    @Column(name = "khan", nullable = false, length = 50)
    private String khan;

    @Column(name = "province", nullable = false, length = 50)
    private String province;
}
