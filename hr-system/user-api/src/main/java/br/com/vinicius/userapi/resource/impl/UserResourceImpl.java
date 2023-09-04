package br.com.vinicius.userapi.resource.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.userapi.domain.User;
import br.com.vinicius.userapi.resource.UserResource;
import br.com.vinicius.userapi.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource{

	@Autowired
	private final UserServiceImpl userService;
	
	@Override
	public ResponseEntity<User> findById(Long id) {		
		return ResponseEntity.ok().body(userService.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {		
		return ResponseEntity.ok().body(userService.findAll());
	}

}
