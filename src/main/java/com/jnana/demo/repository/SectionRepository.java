package com.jnana.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jnana.demo.model.Course;
import com.jnana.demo.model.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {
	List<Section> findByCourse(Course course);
	List<Section> findByCourseIn(List<Course> courses);
}
