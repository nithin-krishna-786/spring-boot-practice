package com.nithin.springbootpractice.exceptions;


public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -677684149710549073L;

	public UserNotFoundException(String msg)
	{
		super(msg);
	}
}
