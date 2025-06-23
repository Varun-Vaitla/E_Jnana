package com.jnana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);
	Tutor findByEmail(String email);
}
