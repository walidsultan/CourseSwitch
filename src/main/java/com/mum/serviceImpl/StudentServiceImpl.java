package com.mum.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.domain.Student;
import com.mum.repository.StudentRepository;
import com.mum.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public boolean isCorrectUsernameAndPassword(String username, String password) {
		final Student student = studentRepository.getStudentByUsername(username);
		if (student == null) {
			return false;
		} else {
			if (student.getPassword().equals(password)) {
				
				Authentication authentication = new UsernamePasswordAuthenticationToken(student,
						student.getPassword(), null);

				SecurityContextHolder.getContext().setAuthentication(authentication);
				return true;
			}
			return false;

		}
	}
}
