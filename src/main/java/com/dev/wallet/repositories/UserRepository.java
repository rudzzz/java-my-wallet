package com.dev.wallet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.wallet.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	boolean existsByEmail(String email);
}
