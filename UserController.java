package com.nithin.springbootpractice.validation2;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Autowired
	private UserRepository userRepository;

	// MULTI-FIELD VALIDATION

	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody @Valid UserDTO userDTO, BindingResult bindingResult) {
		
		
		//THIS CODE PROVIDES ERROR MESSAGES AT INDIVIDUAL ATTRIBUTE LEVEL	
		Boolean errorExists = false;
		Map<String, String> errors = new HashMap<>();
		if (bindingResult.hasErrors()) {
			errorExists = true;
			bindingResult.getFieldErrors().forEach(error -> {
				errors.put(error.getField(), error.getDefaultMessage());
			});
//			return ResponseEntity.badRequest().body(errors);
		}
		
		//CHECK IF PHONENUMBER IS UNIQUE
		 Boolean phoneNumberExists = userRepository.existsByPhoneNumber(userDTO.getPhoneNumber());
		 if(phoneNumberExists)
		 {	 
			 errorExists = true;
			 errors.put("phoneNumber","Phone number already exists !!");
		 }	 
		 if(errorExists)
			 return ResponseEntity.badRequest().body(errors);
	
		User user = new User();
		user.setName(userDTO.getName());
		user.setBirthDate(userDTO.getBirthDate());
		user.setPhoneNumber(userDTO.getPhoneNumber());

		user = userRepository.save(user);

		return ResponseEntity.status(HttpStatus.CREATED).body(user);

	}

}
//Display the error messages in your ReactJS form
/*
 *
 *<input
  type="text"
  name="phoneNumber"
  value={user.phoneNumber}
  onChange={handleChange}
/>
{errors.phoneNumber && <div className="error">{errors.phoneNumber}</div>}

<input
  type="text"
  name="name"
  value={user.name}
  onChange={handleChange}
/>
{errors.name && <div className="error">{errors.name}</div>}

<input
  type="date"
  name="birthdate"
  value={user.birthdate}
  onChange={handleChange}
/>
{errors.birthdate && <div className="error">{errors.birthdate}</div>}
 * 
 */ 
