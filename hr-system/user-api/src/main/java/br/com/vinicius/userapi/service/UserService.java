package br.com.vinicius.userapi.service;

import java.util.List;

import br.com.vinicius.userapi.domain.User;

public interface UserService {
	User findById(Long id);
	List<User> findAll();
}
