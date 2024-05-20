package com.nithin.springbootpractice.modelmapper;

import lombok.Data;

@Data 
public class User {
	
	private String name;
	private String email;
	private String phoneNumber;
	private Address address;
}
