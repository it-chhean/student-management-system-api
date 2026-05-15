package com.taskflow.studentmanagement.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Grade {

   Long id;

   BigDecimal score;

   String grade;

   LocalDateTime dateRecorded;

}
