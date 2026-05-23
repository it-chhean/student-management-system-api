package com.taskflow.studentmanagement.domain;

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
@Table(name = "tbl_instructors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "instructor_code")
    private String code;

    @Column(name = "kh_name", length = 50, nullable = false)
    private String khName;

    @Column(name = "en_name", length = 50, nullable = false)
    private String enName;

    @Column(name = "specialization", length = 50, nullable = false)
    private String specialization;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone", length = 20, nullable = false)
    private String phone;

}
