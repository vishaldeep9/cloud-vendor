package com.jsp.rest_demo.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {


	
	public static ResponseEntity<Object> responseBuilder(
			// 3rd one is --	//response that we are getting back from database
			String message,HttpStatus httpStatus,Object responseObject){
		 
	//	key is string and this key will show in output like..... key: object
		Map<String, Object> response=new HashMap<>();
		response.put("message", message);
		response.put("httpStatus", httpStatus);
		response.put("data", responseObject);
		
				return new ResponseEntity<Object>(response,httpStatus);
		
		
	
	}
}
