package com.taskflow.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "student_code", nullable = false, length = 30)
    private String code;

    @Column(name = "kh_first_name", nullable = false, length = 30)
    private String khFirstName;

    @Column(name = "kh_last_name", nullable = false, length = 30)
    private String khLastName;

    @Column(name = "en_first_name", nullable = false, length = 30)
    private String enFirstName;

    @Column(name = "en_last_name", nullable = false, length = 30)
    private String enLastName;

    @Column(name = "date_of_birth", nullable = false, length = 10)
    private String dob;

    @Column(name = "email", nullable = false, length = 10)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 10)
    private String phone;

    @Column(name = "gender", nullable = false, length = 7)
    private String gender;

    private boolean active = true;

    private boolean isDeleted = false;

    @CreationTimestamp
    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false, name = "updated_at")
    private LocalDateTime updatedAt;
}