package com.te.lms.exception;

public class EmployeeCanNotBeApprovedException extends RuntimeException {

	private static final long serialVersionUID=1l;

	public EmployeeCanNotBeApprovedException(String message) {
    	  super(message);
      }
}
