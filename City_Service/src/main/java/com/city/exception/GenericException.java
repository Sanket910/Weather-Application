package com.city.exception;

public class GenericException extends RuntimeException {
	
	private String message;

	public GenericException(String message) {
		this.message = message;
	}

	public GenericException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
