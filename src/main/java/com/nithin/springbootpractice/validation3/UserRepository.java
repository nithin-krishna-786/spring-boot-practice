package com.nithin.springbootpractice.validation3;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	Boolean existsByPhoneNumber(String phoneNumber);
	

}
