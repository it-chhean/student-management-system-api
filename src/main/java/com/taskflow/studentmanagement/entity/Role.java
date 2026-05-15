package com.taskflow.studentmanagement.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {

    Integer id;

    String name;

    String description;

    boolean isActive;
}
