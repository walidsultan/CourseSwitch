package com.mum.service;

import java.util.List;

import com.mum.domain.PreferredCourse;
import com.mum.domain.RegisteredCourse;

public interface RegisteredCourseService {

	List<RegisteredCourse> getRegisteredCoursesByStudentId(Long studentId);

	RegisteredCourse getRegisteredCourseById(long registeredCourseId);

	String addPreferredCourse(long registeredCourseId, long preferredCourseId);

	List<PreferredCourse> getPreferredCoursesByRegisterCourseId(long registeredCourseId);
	
}
