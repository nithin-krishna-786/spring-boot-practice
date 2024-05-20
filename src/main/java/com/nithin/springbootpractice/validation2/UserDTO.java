package com.nithin.springbootpractice.validation2;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

	@NotEmpty(message = "Name shudn't be empty")
	private String name;

	@Past(message = "Birth Date should be in the past")
	private LocalDate birthDate;

	@Pattern(regexp = "^$|^\\d{10}$", message = "Phone number should be empty or consist of exactly 10 digits")
	private String phoneNumber;

	public UserDTO(Integer id, String name, LocalDate birthDate, String phoneNumber) {
		this.name = name;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
	}

}
