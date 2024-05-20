package com.nithin.springbootpractice.modelmapper;

import lombok.Data;

@Data
public class AddressDTO {
	private String street;
	private String city;
	private String state;
	private CountryDTO country;
	private String zipCode;
}
