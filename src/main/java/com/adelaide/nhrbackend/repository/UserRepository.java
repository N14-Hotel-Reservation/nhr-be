package com.adelaide.nhrbackend.repository;

import com.adelaide.nhrbackend.entity.User;
import com.adelaide.nhrbackend.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String username);

    Optional<User> findByGender(Gender gender);

}
