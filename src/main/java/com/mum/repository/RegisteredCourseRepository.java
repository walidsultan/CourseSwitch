package com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import com.mum.domain.RegisteredCourse;

public interface RegisteredCourseRepository extends CrudRepository<RegisteredCourse, Long> {

}
