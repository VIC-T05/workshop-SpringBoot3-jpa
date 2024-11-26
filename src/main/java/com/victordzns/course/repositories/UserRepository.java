package com.victordzns.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victordzns.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
