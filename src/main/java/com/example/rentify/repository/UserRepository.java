package com.example.rentify.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rentify.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

