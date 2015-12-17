package com.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.mum.domain.RegisteredCourse;

public interface RegisteredCourseRepository extends CrudRepository<RegisteredCourse, Long> {

	@Query("select r from RegisteredCourse r where r.student.id = ?1")
	List<RegisteredCourse> getRegisteredCoursesByStudentId(Long studentId);

}
