package com.mum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mum.domain.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

	
	@Query("select s from Student s where s.username = ?1")
	Student getStudentByUsername(String username);
	
    @Query("select s from Student s where s.id = ?1")
	List<Student> findStudentById(Long id);
    
}
