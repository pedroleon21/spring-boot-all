package com.foo.portifolio.allspring.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler({Exception.class,RuntimeException.class})
	public ResponseEntity<ErrorClass> unkonwError(Exception e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ErrorClass(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase()));
	}

}
