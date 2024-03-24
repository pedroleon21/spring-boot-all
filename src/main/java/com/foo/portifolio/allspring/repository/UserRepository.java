package com.foo.portifolio.allspring.repository;

import org.springframework.stereotype.Repository;

import com.foo.portifolio.allspring.model.entity.auth.User;

@Repository
public interface UserRepository extends BaseRepository<User, Integer>{

}
