package com.hcl.exception.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hcl.exception.api.customize.exception.StudentServiceException;
import com.hcl.exception.api.model.StudentError;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler
	public ResponseEntity<StudentError> mapException(StudentServiceException ose) {
		StudentError error = new StudentError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ose.getMessage());
		return new ResponseEntity<StudentError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
