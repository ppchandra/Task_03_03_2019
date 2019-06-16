package com.hcl.exception.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentError {
	private int errorCode;
	private String message;
//setter and getter
}
