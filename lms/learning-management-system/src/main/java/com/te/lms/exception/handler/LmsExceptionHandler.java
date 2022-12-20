package com.te.lms.exception.handler;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.google.common.collect.Maps;
import com.te.lms.exception.EmployeeCanNotBeApprovedException;
import com.te.lms.exception.RegistrationFailedException;
import com.te.lms.exception.UnableToDeleteBatchException;
import com.te.lms.exception.UnableToDeleteMentorException;
import com.te.lms.exception.UnableToUpdateBatchException;
import com.te.lms.exception.UnableToUpdateMentorException;

@RestControllerAdvice
public class LmsExceptionHandler {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(RegistrationFailedException.class)
	public Map<String, String> handler(RegistrationFailedException ex) {
		Map<String, String> map = Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmployeeCanNotBeApprovedException.class)
	public Map<String, String> handler(EmployeeCanNotBeApprovedException ex) {
		Map<String, String> map=Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UnableToUpdateMentorException.class)
	public Map<String, String> handler(UnableToUpdateMentorException ex) {
		Map<String, String> map=Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UnableToUpdateBatchException.class)
	public Map<String, String> handler(UnableToUpdateBatchException ex) {
		Map<String, String> map=Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UnableToDeleteMentorException.class)
	public Map<String, String> handler(UnableToDeleteMentorException ex) {
		Map<String, String> map=Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(UnableToDeleteBatchException.class)
	public Map<String, String> handler(UnableToDeleteBatchException ex) {
		Map<String, String> map=Maps.newHashMap();
		map.put("message", ex.getMessage());
		return map;
	}
}
