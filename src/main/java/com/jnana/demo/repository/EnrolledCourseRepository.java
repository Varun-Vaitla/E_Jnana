package com.jnana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.EnrolledCourse;
import com.jnana.demo.model.EnrolledSection;

public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourse,Long> {
	EnrolledCourse findByEnrolledSections(EnrolledSection section);
}
