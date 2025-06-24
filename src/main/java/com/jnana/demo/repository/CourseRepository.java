package com.jnana.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.Course;
import com.jnana.demo.model.Tutor;

public interface CourseRepository extends JpaRepository<Course, Long>{
	List<Course> findByTutor(Tutor attribute);
}
