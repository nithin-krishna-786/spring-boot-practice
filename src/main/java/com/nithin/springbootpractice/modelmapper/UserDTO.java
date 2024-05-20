package com.nithin.springbootpractice.modelmapper;

import lombok.Data;

@Data 
public class UserDTO {
	private String name;
	private String email;
	private String phoneNumber;
	private AddressDTO address;
}
