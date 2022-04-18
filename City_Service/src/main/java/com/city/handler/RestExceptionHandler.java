package com.city.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.city.exception.ErrorDetails;
import com.city.exception.GenericException;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * This method is used to handle GenericExceptions.
	 * 
	 * @param ex
	 * @return {@link ResponseEntity}
	 */
	@ExceptionHandler(GenericException.class)
	protected ResponseEntity<Object> handleGenericException(GenericException ex) {

		Date date = new Date();
		ErrorDetails errorDetails = new ErrorDetails(date.toString(), ex.getMessage(), "BAD_REQUEST", "400");
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}

}
