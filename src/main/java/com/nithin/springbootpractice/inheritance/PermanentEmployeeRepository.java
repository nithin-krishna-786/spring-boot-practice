package com.nithin.springbootpractice.inheritance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PermanentEmployeeRepository extends JpaRepository<PermanentEmployee, Long> {
	
}
