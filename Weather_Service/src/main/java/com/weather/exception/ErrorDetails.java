package com.weather.exception;

public class ErrorDetails {

	private String timestamp;
	private String message;
	private String status;
	private String statusCode;
	
	public ErrorDetails() {
		super();
	}

	public ErrorDetails(String timestamp, String message, String status, String statusCode) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	

}
