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
import com.mum.domain.Block;
import com.mum.domain.Course;
import com.mum.domain.Student;
import com.mum.repository.BlockRepository;
import com.mum.repository.CourseRepository;
import com.mum.repository.StudentRepository;
import com.mum.service.AdminService;


@Service
@Transactional
public class AdminSubSystemImpl implements AdminService {

	@Autowired
	BlockRepository blockRepository;
	CourseRepository courseRepository;
	StudentRepository studetnRepository;
	
	
	@Override
	public Course getCourseById(Long id) {
		
		return courseRepository.findOne(id);
	}

	@Override
	public boolean isCorrectUsernameAndPassword(String username, String password) {
		final Student student = studetnRepository.getStudentByUsername(username);
		if (student == null) {
			return false;
		} else {
			if (student.getPassword().equals(password)) {
				// set authorization
				List<GrantedAuthority> authority = new ArrayList<GrantedAuthority>();

				Authentication authentication = new UsernamePasswordAuthenticationToken(student,
						student.getPassword(), authority);

				SecurityContextHolder.getContext().setAuthentication(authentication);
				return true;
			}
			return false;

		}
	}

	@Override
	public void saveBlock(Block blockname){
		blockRepository.save(blockname);
		
	}

	@Override
	public void saveCourse(Course coursename) {
		courseRepository.save(coursename);
		
	}

	@Override
	public List<Course> getAllCourseByName(Course coursename) {
		// TODO Auto-generated method stub
		return null;
	}

}
