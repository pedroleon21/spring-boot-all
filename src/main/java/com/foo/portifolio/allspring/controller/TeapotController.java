package com.foo.portifolio.allspring.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teapot")
public class TeapotController {
	@GetMapping
	public ResponseEntity<Dto> imNotATeapot() {
		return new ResponseEntity<Dto>(new Dto("I'm not a teapot!"),HttpStatusCode.valueOf(418));
	}

	public class Dto {
		public Dto(String message) {
			super();
			this.message = message;
		}

		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public LocalDateTime getNow() {
			return LocalDateTime.now();
		}

	}
}