package com.nithin.springbootpractice.validation2;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

	// SINGLE FIELD VALIDATION

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody @Valid UserDTO userDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			StringBuilder errorMessage = new StringBuilder();
			errorMessage.append("Total Errors:").append(bindingResult.getErrorCount()).append(" ");

			for (FieldError error : bindingResult.getFieldErrors()) {
				errorMessage.append("\n").append("Field:").append(error.getField()).append(" Error:")
						.append(error.getDefaultMessage()).append(" ");
			}

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage.toString());
		}

		User user = new User();
		user.setName(userDTO.getName());
		user.setBirthDate(userDTO.getBirthDate());
		user.setPhoneNumber(userDTO.getPhoneNumber());

		System.out.println(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User created");

	}

	// MULTI-FIELD VALIDATION

}
