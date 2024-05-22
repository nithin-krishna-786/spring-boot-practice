package com.nithin.springbootpractice.validation3;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniquePhoneNumberValidator implements ConstraintValidator<UniquePhoneNumber, String> {
	
	@Autowired
	private UserRepository userRepository;
	
    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext constraintValidatorContext) {
    	Boolean exists = userRepository.existsByPhoneNumber(phoneNumber);
    	if(exists)
    		return false;
    	else
    		return true;
    }

	@Override
	public void initialize(UniquePhoneNumber constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}
}
