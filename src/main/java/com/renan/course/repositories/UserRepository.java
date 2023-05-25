package com.renan.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renan.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
