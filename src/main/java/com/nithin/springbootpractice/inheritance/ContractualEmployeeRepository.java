package com.nithin.springbootpractice.inheritance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractualEmployeeRepository extends JpaRepository<ContractualEmployee, Long> {
	
}
