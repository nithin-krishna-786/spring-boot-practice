package com.nithin.springbootpractice.fetchtype.lazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee e1 = new Employee();
		e1.setName("Employee 1");
		employeeRepository.save(e1);
		
		Project p1 = new Project();
		p1.setName("Project 1");
		p1.setEmployee(e1);
		projectRepository.save(p1);
		
		Project p2 = new Project();
		p2.setName("Project 2");
		p2.setEmployee(e1);
		projectRepository.save(p2);
		
		Project p3 = new Project();
		p3.setName("Project 3");
		p3.setEmployee(e1);
		projectRepository.save(p3);
		
		System.out.println(e1);
		
		List<Project> projects  = projectRepository.findProjectsByEmployeeId(e1.getId());
		System.out.println(projects.size());
		System.out.println(e1);
	}
	


}
