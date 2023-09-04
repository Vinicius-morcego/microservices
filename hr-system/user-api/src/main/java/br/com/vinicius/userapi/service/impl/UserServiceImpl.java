package br.com.vinicius.userapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vinicius.userapi.domain.User;
import br.com.vinicius.userapi.repository.UserRepository;
import br.com.vinicius.userapi.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private final UserRepository userRepository;
	
	@Override
	public User findById(Long id) {		
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public List<User> findAll() {		
		return userRepository.findAll();
	}

}
