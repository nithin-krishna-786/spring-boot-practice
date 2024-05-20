package com.nithin.springbootpractice.validation2;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	
	
	private String name;
	
	private LocalDate birthDate;
	
	private String phoneNumber;
	
	public User(String name, LocalDate birthDate,String phoneNumber) {
		this.name = name;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}
	
	public User()
	{
		
	}
}


