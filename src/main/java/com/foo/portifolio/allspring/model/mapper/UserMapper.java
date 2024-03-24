package com.foo.portifolio.allspring.model.mapper;

import org.springframework.stereotype.Service;

import com.foo.portifolio.allspring.model.dto.auth.UserDto;
import com.foo.portifolio.allspring.model.entity.auth.User;

@Service
public class UserMapper implements BaseMapper<User, UserDto> {

	@Override
	public User toEntity(UserDto dto) {
		User user = new User();
		user.setPassword(dto.getPassword());
		user.setUsername(dto.getUsername());
		return user;
	}

	@Override
	public UserDto toDto(User entity) {
		UserDto  user = new UserDto();
		user.setId(entity.getId());
		user.setUsername(entity.getUsername());
		return user;
	}

	@Override
	public void update(User entity, UserDto dto) {
		entity.setUsername(dto.getUsername());
		entity.setPassword(dto.getPassword());
	}

}
