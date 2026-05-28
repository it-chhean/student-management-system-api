package com.taskflow.studentmanagement.security.service;

import org.jspecify.annotations.NullMarked;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taskflow.studentmanagement.entities.User;
import com.taskflow.studentmanagement.exception.UserNotFoundException;
import com.taskflow.studentmanagement.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppUserDetailsService implements UserDetailsService  {

      private final UserRepository repository;

      @Override
      @Transactional(readOnly = true)
      @NullMarked
      public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            
            User user = repository.findByEmail(email)
                  .orElseThrow(() -> new UserNotFoundException("User not found: " + email));

            return org.springframework.security.core.userdetails.User.builder()
                        .username(user.getEmail())
                        .password(user.getPassword())
                        .authorities(user.getAuthorities())
                        .build();     
      }

     
}