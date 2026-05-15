package com.taskflow.studentmanagement.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tbl_student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    Long id;

    @Column(name = "student_code", unique = true , nullable = false, updatable = false)
    String code;

    @Column(name = "kh_first_name", nullable = false)
    String khFirstName;

    @Column(name = "kh_last_name", nullable = false)
    String khLastName;

    @Column(name = "en_first_name", nullable = false)
    String enFirstName;

    @Column(name = "en_last_name", nullable = false)
    String enLastName;

    @Column(name = "date_of_birth", nullable = false, length = 10)
    String dob;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "phone_number", nullable = false)
    String phone;

    @Column(name = "gender", nullable = false, length = 7)
    String gender;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    StudentAddress address;

    Boolean deleted = false;

}
