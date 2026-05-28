package com.taskflow.studentmanagement.security.service;

import com.taskflow.studentmanagement.auth.dto.request.SignInRequest;
import com.taskflow.studentmanagement.auth.dto.request.SignUpRequest;
import com.taskflow.studentmanagement.auth.dto.response.JwtAuthenticationResponse;

public interface AuthenticationService {
      JwtAuthenticationResponse signUp(SignUpRequest request);
      JwtAuthenticationResponse signIn(SignInRequest request);
} 