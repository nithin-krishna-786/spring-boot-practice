package com.nithin.springbootpractice.jsonignore;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class NotificationDTO {

	private Integer id;
	private String header;
	private String message;
	
	@JsonIgnore
	private String otp;
}
