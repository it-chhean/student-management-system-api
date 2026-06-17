package com.taskflow.studentmanagement.security.service;

import com.taskflow.studentmanagement.dto.request.SignInRequest;
import com.taskflow.studentmanagement.dto.request.SignUpRequest;
import com.taskflow.studentmanagement.dto.response.UserResponse;
import com.taskflow.studentmanagement.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AuthenticationService {

    UserResponse signUp(SignUpRequest request);

    UserResponse signIn(SignInRequest request);

    UserResponse verifyEmail(String token);

    User getUser(Long id);

    void delete(Long id);

    Page<UserResponse> findAll(Pageable pageable);

    UserResponse me();

}