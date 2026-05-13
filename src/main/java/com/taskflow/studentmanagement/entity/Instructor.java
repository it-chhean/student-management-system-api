package com.taskflow.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_instructors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Instructor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
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

    @Column(name = "status")
    private boolean deleted = false;

}
