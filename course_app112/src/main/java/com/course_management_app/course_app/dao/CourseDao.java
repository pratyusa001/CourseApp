package com.course_management_app.course_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course_management_app.course_app.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
