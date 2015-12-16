package com.mum.service;

import java.util.List;
import com.mum.domain.Block;
import com.mum.domain.Course;
//import com.mum.domain.Student;


public interface AdminService {
	
	public Course getCourseById(Long id);	
	public boolean isCorrectUsernameAndPassword(String username, String password);
	public void saveBlock(Block blockname);
	public void saveCourse(Course coursename);
	public List<Course> getAllCourseByName(Course coursename);

}
