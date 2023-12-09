package com.example.userregistrationapp.repository;

import com.example.userregistrationapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByEmailOrPhoneNumber(String email, String phoneNumber);

    boolean existsByEmail(String email);
}
