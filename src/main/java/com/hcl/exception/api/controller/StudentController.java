package com.hcl.exception.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.exception.api.customize.exception.StudentServiceException;
import com.hcl.exception.api.model.Student;
import com.hcl.exception.api.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("/createStudent")
	public String createStudent(@RequestBody Student student) throws StudentServiceException {
		String msg = studentService.saveStudent(student);
		return msg;
	}


}
