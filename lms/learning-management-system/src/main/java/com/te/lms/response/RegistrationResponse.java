package com.te.lms.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationResponse<T> {
	private String message;
	private LocalDateTime timeStamp = LocalDateTime.now();
	private T data;
	
	public RegistrationResponse(String message, T data) {
		super();
		this.message = message;
		this.data=data;
	}
	
	
}
