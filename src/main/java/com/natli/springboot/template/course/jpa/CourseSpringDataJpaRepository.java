package com.natli.springboot.template.course.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natli.springboot.template.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
