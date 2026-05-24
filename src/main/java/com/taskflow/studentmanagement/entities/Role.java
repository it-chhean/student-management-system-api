package com.taskflow.studentmanagement.entities;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Role {

    private Integer id;

    private String name;

    private String description;

    private boolean isActive;
}
