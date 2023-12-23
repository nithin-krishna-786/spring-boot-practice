package com.nithin.springbootpractice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithin.springbootpractice.entity.User;
import com.nithin.springbootpractice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	public Optional<User> getUser(Integer id)
	{
		return userRepository.findById(id);
	}
	
	

}
