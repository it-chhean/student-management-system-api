package com.taskflow.studentmanagement.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Grade {

   private Long id;

   private BigDecimal score;

   private String grade;

   private LocalDateTime dateRecorded;

}
