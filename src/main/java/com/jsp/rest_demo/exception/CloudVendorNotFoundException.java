package com.jsp.rest_demo.exception;

//why extends RunTimeException --> so that it is recognize it is Exception Handler class
public class CloudVendorNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CloudVendorNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CloudVendorNotFoundException(String message) {
		super(message);
		
	}

}
