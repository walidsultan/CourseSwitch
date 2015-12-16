package com.mum.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RegisteredCourse  implements Serializable{
	

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	@OneToMany
	private List<PreferredCourse> preferredcourse;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PreferredCourse> getPreferedcourse() {
		return preferredcourse;
	}
	public void setPreferedcourse(List<PreferredCourse> preferedcourse) {
		this.preferredcourse = preferedcourse;
	}
    
}
