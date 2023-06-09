package com.course_management_app.course_app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course_management_app.course_app.dao.CourseDao;
import com.course_management_app.course_app.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long id) {
		
		Optional<Course> courseOptionalObject = courseDao.findById(id);
		if(courseOptionalObject.isPresent()) {
			return courseOptionalObject.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Course addCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long CourseID) {
		
		Course course = courseDao.findById(CourseID).get();
		courseDao.delete(course);	
	}

}
