package com.junichi.jblog.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junichi.jblog.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
}
