package br.com.vinicius.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vinicius.userapi.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
