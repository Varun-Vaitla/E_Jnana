package com.jnana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.EnrolledCourse;

public interface EnrolledCourseRepository extends JpaRepository<EnrolledCourse,Long> {

}
