package com.hcl.exception.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.exception.api.customize.exception.StudentServiceException;
import com.hcl.exception.api.model.Student;
import com.hcl.exception.api.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String saveStudent(Student student) throws StudentServiceException {
		try {
			Student student1 = studentRepository.save(student);
			return "student registered successfully " + student1.getStudentId();
		} catch (Exception e) {
			throw new StudentServiceException(student.getStudentName());
		}
	}

}
