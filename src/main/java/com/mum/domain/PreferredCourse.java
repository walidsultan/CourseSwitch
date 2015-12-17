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
public class PreferredCourse implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	public RegisteredCourse getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(RegisteredCourse registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	private int priority;
	@ManyToOne
	private Course preferredCourse;
	
	@ManyToOne
	private RegisteredCourse registeredCourse;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Course getPreferredCourse() {
		return preferredCourse;
	}

	public void setPreferredCourse(Course preferredCourse) {
		this.preferredCourse = preferredCourse;
	}

}
