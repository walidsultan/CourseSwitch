package com.mum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Course;
import com.mum.domain.PreferredCourse;
import com.mum.domain.RegisteredCourse;
import com.mum.repository.CourseRepository;
import com.mum.repository.PreferedCourseRepository;
import com.mum.repository.RegisteredCourseRepository;
import com.mum.repository.StudentRepository;
import com.mum.service.RegisteredCourseService;

@Service
@Transactional
public class RegisteredCourseServiceImpl implements RegisteredCourseService{

	@Autowired
	RegisteredCourseRepository registeredCourseRepository;

	@Autowired
	PreferedCourseRepository preferedCourseRepository;
	

	@Autowired
	CourseRepository courseRepository ;
	
	@Override
	public List<RegisteredCourse> getRegisteredCoursesByStudentId(Long studentId) {
		return registeredCourseRepository.getRegisteredCoursesByStudentId(studentId);
	}

	@Override
	public RegisteredCourse getRegisteredCourseById(long registeredCourseId) {
		return registeredCourseRepository.findOne(registeredCourseId);
	}

	@Override
	public List<PreferredCourse> getPreferredCoursesByRegisterCourseId(long registeredCourseId) {
		return preferedCourseRepository.getPreferredCoursesByRegisterCourseId(registeredCourseId);
	}

	@Override
	public String addPreferredCourse(long registeredCourseId,long preferredCourseId) {
		
		RegisteredCourse regCourse= registeredCourseRepository.findOne(registeredCourseId);
		Course prefCourse= courseRepository.findOne(preferredCourseId);
		
		//Add preferred Course
		PreferredCourse preferredCourse= new PreferredCourse();
		preferredCourse.setPriority(1);
		preferredCourse.setPreferredCourse(prefCourse);
		preferredCourse.setRegisteredCourse(regCourse);
		preferedCourseRepository.save(preferredCourse);
		
		//Check for matching courses
		List<PreferredCourse> courses= preferedCourseRepository.findMatch(registeredCourseId,preferredCourseId);
	
		if(courses.size()>0){
			return "match";
		}else
		{
			return "success";
		}
	}
	
}
