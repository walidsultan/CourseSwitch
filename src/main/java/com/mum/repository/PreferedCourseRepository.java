package com.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.PreferredCourse;

@Repository
public interface PreferedCourseRepository extends CrudRepository<PreferredCourse	, Long> {

	@Query("select p from PreferredCourse p where p.registeredCourse.id = ?1")
	List<PreferredCourse> getPreferredCoursesByRegisterCourseId(long registeredCourseId);

	@Query("select p from PreferredCourse p where p.registeredCourse.id = ?2 and p.preferredCourse.id = ?1")
	List<PreferredCourse> findMatch(long registeredCourseId, long preferredCourseId);

}
