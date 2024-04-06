package com.foo.portifolio.allspring.exceptionHandler;

import java.time.Instant;
import java.time.LocalDateTime;

public class ErrorClass {

	public ErrorClass() {
		super();
	}

	public ErrorClass(String error) {
		super();
		this.error = error;
	}

	private String error;
	private int status = 500;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	public Instant getTimestamp() {
		return Instant.now();
	}
	public int getStatus() {
		return status;
	}
}
