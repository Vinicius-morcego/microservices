package br.com.vinicius.userapi.service.exception;

public class ObjectNotFoundException extends RuntimeException{

	public ObjectNotFoundException(String message) {
		super(message);
	}
}
