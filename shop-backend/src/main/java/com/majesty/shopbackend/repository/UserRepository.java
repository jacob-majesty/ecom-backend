package com.majesty.shopbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.majesty.shopbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}