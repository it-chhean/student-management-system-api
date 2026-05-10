package com.taskflow.studentmanagement.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "student_address_id")
    private StudentAddress address;

    private boolean isDeleted = false;

    @CreationTimestamp
    @Column(nullable = false, name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false, name = "updated_at")
    private LocalDateTime updatedAt;

}
