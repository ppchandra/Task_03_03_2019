package com.hcl.exception.api.service;

import com.hcl.exception.api.customize.exception.StudentServiceException;
import com.hcl.exception.api.model.Student;

public interface StudentService {

	String saveStudent(Student student)throws StudentServiceException;

}
