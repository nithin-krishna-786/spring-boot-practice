package com.nithin.springbootpractice.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nithin.springbootpractice.entity.User;
import com.nithin.springbootpractice.service.UserService;


@RestController("/api")
public class HelloWorldController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello, " + name + "!";
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id) {
		Optional<User> user = userService.getUser(id);
		if(user.isEmpty())
			return ResponseEntity.ok(user.get());
		else
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		User result = userService.createUser(user);
		if(result != null)
			return new ResponseEntity<>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
	
}

