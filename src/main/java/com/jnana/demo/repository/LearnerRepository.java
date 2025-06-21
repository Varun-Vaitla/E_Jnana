package com.jnana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.Learner;

public interface LearnerRepository extends JpaRepository<Learner, Long>  {
	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);
}
