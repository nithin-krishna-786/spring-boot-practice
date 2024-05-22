package com.nithin.springbootpractice.validation2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class PhonenumberAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5669041605844980475L;
	
	public PhonenumberAlreadyExistsException(String message)
	{
		super(message);
	}

}
