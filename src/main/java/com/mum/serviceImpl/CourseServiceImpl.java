package com.mum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Course;
import com.mum.repository.CourseRepository;
import com.mum.service.CourseService;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepository;
	@Override
	public List<Course> getAllCourses() {
		return (List<Course>) courseRepository.findAll();
	}

}
