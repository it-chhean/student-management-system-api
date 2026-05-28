package com.taskflow.studentmanagement.security.service.impl;

import com.taskflow.studentmanagement.security.config.JwtConfig;
import com.taskflow.studentmanagement.security.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Slf4j
@Component
@RequiredArgsConstructor
public class JwtServiceImpl extends JwtConfig implements JwtService {

    @Override
    public SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(getBase64Secret().getBytes());
    }

    @Override
    public String generateToken(String subject) {
        return generateToken(new HashMap<>(), subject);
    }

    @Override
    public String generateToken(Map<String, Object> claims, String subject) {
        return builderToken(claims, subject, getExpiration());
    }

    @Override
    public String extractEmail(String token) {
        return extractClaims(token, Claims::getSubject);
    }

    @Override
    public boolean isTokenExpiration(String token) {
        return extractExpiration(token).before(new Date());
    }

    @Override
    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String useremail = extractEmail(token);
        return (userDetails.getUsername().equals(useremail) && !isTokenExpiration(token));
    }

    private Date extractExpiration(String token) {
        return extractClaims(token, Claims::getExpiration);
    }

    private <T> T extractClaims(String token, Function<Claims, T> resolveeClaims) {
       final Claims claims = extractAllClaims(token);
       return resolveeClaims.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts
                .parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private String builderToken(Map<String, Object> claims, String subject, long expiration) {
        return Jwts
                .builder()
                .claims(claims)
                .subject(subject)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(getSigningKey())
                .compact();
    }
}
