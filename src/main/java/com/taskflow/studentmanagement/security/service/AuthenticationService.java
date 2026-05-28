package com.taskflow.studentmanagement.security.service;

import com.taskflow.studentmanagement.dto.request.SignInRequest;
import com.taskflow.studentmanagement.dto.request.SignUpRequest;
import com.taskflow.studentmanagement.dto.response.UserResponse;

public interface AuthenticationService {

    UserResponse signUp(SignUpRequest request);

    UserResponse signIn(SignInRequest request);

    UserResponse verifyEmail(String token);
}