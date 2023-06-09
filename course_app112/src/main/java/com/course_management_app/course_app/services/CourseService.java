package com.course_management_app.course_app.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.course_management_app.course_app.entities.Course;


public interface CourseService {
	
	public List<Course> getCourses();
	
	Course getCourse(long id);
	
	Course addCourse(Course course);
	
	Course updateCourse(Course course);
	
	void deleteCourse(long CourseId);
	

}
