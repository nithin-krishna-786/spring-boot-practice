package com.nithin.springbootpractice.external_api;

import lombok.Data;

@Data
public class User {

	private Long id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;

}
