package com.nithin.springbootpractice.modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner {
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Nithin");
		user.setEmail("nithin@hotmail.com");
		user.setPhoneNumber("7893913827");

		
		Country country = new Country();
		country.setCountry("INDIA");
		country.setContinent("ASIA");
		
		Address address = new Address();
		address.setStreet("123 Street");
		address.setCity("Hyd");
		address.setState("TG");
		address.setCountry(country);
		address.setZipCode("500032");
		
		user.setAddress(address);
		
		UserDTO userDTO = modelMapper.map(user, UserDTO.class);
		System.out.println(userDTO);
	}

}
