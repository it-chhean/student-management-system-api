package com.taskflow.studentmanagement.security.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.taskflow.studentmanagement.auth.dto.request.SignInRequest;
import com.taskflow.studentmanagement.auth.dto.request.SignUpRequest;
import com.taskflow.studentmanagement.auth.dto.response.JwtAuthenticationResponse;
import com.taskflow.studentmanagement.repository.UserRepository;
import com.taskflow.studentmanagement.security.service.AuthenticationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

      private final UserRepository repository;
      private final PasswordEncoder passwordEncoder;

      @Override
      public JwtAuthenticationResponse signUp(SignUpRequest request) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'signUp'");
      }

      @Override
      public JwtAuthenticationResponse signIn(SignInRequest request) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'signIn'");
      }
      
}