package com.codewithchavdar.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithchavdar.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
