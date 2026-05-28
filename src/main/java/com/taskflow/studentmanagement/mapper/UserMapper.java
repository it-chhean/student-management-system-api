package com.taskflow.studentmanagement.mapper;

import com.taskflow.studentmanagement.dto.request.UserRequest;
import com.taskflow.studentmanagement.dto.response.UserResponse;
import com.taskflow.studentmanagement.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "password", ignore = true)
    User toEntity(UserRequest request);
}
