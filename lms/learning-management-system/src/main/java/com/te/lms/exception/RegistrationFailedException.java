package com.te.lms.exception;

public class RegistrationFailedException extends RuntimeException {

	private static final long serialVersionUID=1l;
	
	public RegistrationFailedException(String message) {
		super(message);
	}
}
