package com.krishn.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import com.krishn.demo.dao.CourseDao;
import com.krishn.demo.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

//	List<Course> list;

	public CourseServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Course(145, "Java", "learn basics of java"));
//		list.add(new Course(158, "Spring", "learn Spring Framework"));

	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
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
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

}
