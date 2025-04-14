package com.nithin.springbootpractice.qloron;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//employee("Ram",Dev);
//employee("Sam",Dev);
//employee("Sagar",QA);
//employee("Nikhil",LEAD);
//employee("Anusha",Dev);
//employee("Kiran",QA);
//employee("Samir",LEAD);
//Dev = {Ram, Sam,Anusha}
 
public class MainClass {
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Ram", "Dev") ;
		Employee e2 = new Employee("Sam", "Dev") ;
		Employee e3 = new Employee("Sagar","QA") ;
		Employee e4 = new Employee("Nikhil","LEAD") ;
		Employee e5 = new Employee("Anusha","Dev") ;
		Employee e6 = new Employee("Kiran","QA") ;
		Employee e7 = new Employee("Samir","LEAD") ;
		
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
		
		Map<String, List<String>> designationMap = employees.stream()
	                .collect(Collectors.groupingBy(Employee::getDesignation,
	                          Collectors.mapping(Employee::getName, Collectors.toList())));
		
		
		System.out.println(designationMap);
	}

}
