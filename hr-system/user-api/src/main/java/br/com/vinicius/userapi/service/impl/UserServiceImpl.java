package br.com.vinicius.userapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vinicius.userapi.domain.User;
import br.com.vinicius.userapi.repository.UserRepository;
import br.com.vinicius.userapi.service.UserService;
import br.com.vinicius.userapi.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private final UserRepository userRepository;
	
	@Override
	public User findById(Long id) {		
		return userRepository.findById(id).orElseThrow(() -> 
			new ObjectNotFoundException(String.format("Object the id %s not found", id)));
	}

	@Override
	public List<User> findAll() {		
		return userRepository.findAll();
	}

}
