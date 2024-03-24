package com.foo.portifolio.allspring.service;

import org.springframework.stereotype.Service;

import com.foo.portifolio.allspring.model.dto.auth.UserDto;
import com.foo.portifolio.allspring.model.entity.auth.User;
import com.foo.portifolio.allspring.model.mapper.BaseMapper;
import com.foo.portifolio.allspring.model.mapper.UserMapper;
import com.foo.portifolio.allspring.repository.BaseRepository;

@Service
public class UserService extends BaseService<User, UserDto, Integer> {

	public UserService(BaseMapper<User, UserDto> mapper,BaseRepository<User, Integer> repository) {
		super(mapper, repository);
	}

}
