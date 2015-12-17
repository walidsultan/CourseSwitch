package com.mum.controller;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mum.domain.Course;
import com.mum.domain.PreferredCourse;
import com.mum.domain.Student;
import com.mum.service.CourseService;
import com.mum.service.RegisteredCourseService;

@Controller
@RequestMapping("/RegisteredCourses")
public class RegisteredCoursesController {
	
	@Autowired
	RegisteredCourseService registeredCourseService;
	
	@Autowired 
	CourseService courseService;
	
	@ModelAttribute("allCourses")
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
	public String index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Student student= (Student) auth.getPrincipal();
		
		model.addAttribute("courses", registeredCourseService.getRegisteredCoursesByStudentId(student.getId()));

		return "registeredCourses";
	}

	@RequestMapping(value = { "/preferredCourses/{registeredCourseId}" }, method = RequestMethod.GET)
	public String preferredCourses(Model model,@PathVariable("registeredCourseId") long registeredCourseId) {
		

		model.addAttribute("registeredCourse", registeredCourseService.getRegisteredCourseById(registeredCourseId));

		model.addAttribute("preferredCourses", registeredCourseService.getPreferredCoursesByRegisterCourseId(registeredCourseId));
		
		return "preferredCourses";
	}
	

	@RequestMapping(value = { "/preferredCourses/Add" }, method = RequestMethod.GET)
	public @ResponseBody String preferredCourses(Model model,Long preferredCourseId, Long registeredCourseId) {
		String result = registeredCourseService.addPreferredCourse(registeredCourseId, preferredCourseId);
		
		return result;
	}

}
