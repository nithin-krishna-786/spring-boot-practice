package com.nithin.springbootpractice.validation3;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String name;
	
	private LocalDate birthDate;
	
	@Column(unique = true)
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


