package com.mum.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RegisteredCourse implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@ManyToOne
	private Student student;

	@ManyToOne
	private Course registeredCourse;
	
	
	public Course getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(Course registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	


	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
