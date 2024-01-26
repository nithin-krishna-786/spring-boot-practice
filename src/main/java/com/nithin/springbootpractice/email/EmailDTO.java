package com.nithin.springbootpractice.email;


import lombok.Data;

@Data
public class EmailDTO {
	
	private String toEmail;
	private String body;
	private String subject;

}
