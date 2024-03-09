package com.nithin.springbootpractice.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfilesController {

	@Value("${spring.profile.message}")
	private String message;
	
	@GetMapping("/message")
	public ResponseEntity<String> getMessage()
	{
		return ResponseEntity.ok(message);
	}

}
