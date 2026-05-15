package com.taskflow.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_instructors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Instructor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    Long id;

    @Column(name = "instructor_code")
    String code;

    @Column(name = "kh_name", length = 50, nullable = false)
    String khName;

    @Column(name = "en_name", length = 50, nullable = false)
    String enName;

    @Column(name = "specialization", length = 50, nullable = false)
    String specialization;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "phone", length = 20, nullable = false)
    String phone;

    @Column(name = "status")
    boolean deleted = false;

}
