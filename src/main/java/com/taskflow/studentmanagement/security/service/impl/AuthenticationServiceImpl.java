package com.taskflow.studentmanagement.security.service.impl;

import com.taskflow.studentmanagement.dto.response.UserResponse;
import com.taskflow.studentmanagement.entities.User;
import com.taskflow.studentmanagement.exception.ConflictException;
import com.taskflow.studentmanagement.mapper.UserMapper;
import com.taskflow.studentmanagement.repository.UserRepository;
import com.taskflow.studentmanagement.security.service.JwtService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.taskflow.studentmanagement.dto.request.SignInRequest;
import com.taskflow.studentmanagement.dto.request.SignUpRequest;
import com.taskflow.studentmanagement.security.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper mapper;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    @Transactional
    public UserResponse signUp(SignUpRequest request) {

        if (repository.exitsByEmail(request.getEmail())) {
            throw new ConflictException("Email already registered: " + request.getEmail());
        }

        User user = User.builder()
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .username(request.getUsername())
                .role(null)
                .build();

        return mapper.toResponse(user);
    }

    @Override
    public UserResponse signIn(SignInRequest request) {
        return null;
    }

    @Override
    public UserResponse verifyEmail(String token) {
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<UserResponse> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public UserResponse me() {
        return null;
    }

    private User findByOrThrow(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with id: " + id));
    }
}