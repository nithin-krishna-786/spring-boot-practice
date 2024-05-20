package com.nithin.springbootpractice.modelmapper;

import lombok.Data;

@Data
public class Address {
	private String street;
	private String city;
	private String state;
	private Country country;
	private String zipCode;
}
