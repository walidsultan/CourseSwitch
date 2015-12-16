package com.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.Course;

@Repository
public interface CourseRepository  extends CrudRepository <Course,Long>  {

}
