package com.mum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.domain.Course;
import com.mum.service.AdminService;


@Controller
@RequestMapping()
public class StudentController {
	
	@Autowired
	AdminService adminService;
	
//	@ModelAttribute("course")
//	public List<Course> getcourse() {
//		return Arrays.asList(Course);
//	}
	
//	@RequestMapping(value = { "/", "" }, method = RequestMethod.GET)
//	public String index(Model model) {
//
//		model.addAttribute("course", adminService.getCourseById());
//
//		return "course";
//	}

	@RequestMapping(value = { "/add" }, method = RequestMethod.GET)
	public String addForm(@ModelAttribute("newCourse") Course newCourse, Model model) {
		return "courseAdd";
	}
	
	

}
