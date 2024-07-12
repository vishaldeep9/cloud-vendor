package com.jsp.rest_demo.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CloudVendorException {
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpStatus;

}
