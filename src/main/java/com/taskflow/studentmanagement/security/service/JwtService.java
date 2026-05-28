package com.taskflow.studentmanagement.security.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
      String extractUsername(String token);
      String generateToken(UserDetails userDetails);
      boolean isTokenvalid(String token, UserDetails userDetails);
}
