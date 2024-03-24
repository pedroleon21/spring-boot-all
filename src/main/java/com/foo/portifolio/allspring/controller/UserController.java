package com.foo.portifolio.allspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foo.portifolio.allspring.model.dto.auth.UserDto;
import com.foo.portifolio.allspring.model.entity.auth.User;
import com.foo.portifolio.allspring.service.BaseService;

@RestController
@RequestMapping("user")
public class UserController extends BaseController<User, UserDto, Integer> {

	public UserController(BaseService<User, UserDto, Integer> service) {
		super(service);
	}

}
