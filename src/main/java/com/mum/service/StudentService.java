package com.mum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mum.domain.Student;

public interface StudentService {

	public Student getStudentById(Long id);

	public void saveStudent(Student student);

	public List<Student> getAllStudents();

	public boolean isCorrectUsernameAndPassword(String username, String password);
}
