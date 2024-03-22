package com.nithin.springbootpractice.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("John Connor", "TCS");
		Student s2 = new Student("Sarah Connor", "HCL");
		
		studentRepository.save(s1);
		studentRepository.save(s2);
		
	}

}
