package com.nithin.springbootpractice.inheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final PermanentEmployeeRepository permanentEmployeeRepository;
    private final ContractualEmployeeRepository contractualEmployeeRepository;

    public CommandLineRunnerDemo(EmployeeRepository employeeRepository, PermanentEmployeeRepository permanentEmployeeRepository, ContractualEmployeeRepository contractualEmployeeRepository) {
        this.employeeRepository = employeeRepository;
        this.permanentEmployeeRepository = permanentEmployeeRepository;
        this.contractualEmployeeRepository = contractualEmployeeRepository;
    }

    @Override
    public void run(String... args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        permanentEmployee.setName("John Doe");
        permanentEmployee.setEmail("john.doe@example.com");
        permanentEmployee.setPhoneNumber("1234567890");
        permanentEmployee.setPfNumber("PF12345");
        permanentEmployee.setJoiningDate(LocalDate.now());
        permanentEmployee.setAnnualSalary(100000.0);
        permanentEmployeeRepository.save(permanentEmployee);

        ContractualEmployee contractualEmployee = new ContractualEmployee();
        contractualEmployee.setName("Jane Smith");
        contractualEmployee.setEmail("jane.smith@example.com");
        contractualEmployee.setPhoneNumber("9876543210");
        contractualEmployee.setContractDuration(6);
        contractualEmployee.setPayPerHour(40.0);
        contractualEmployee.setRenewable(true);
        contractualEmployeeRepository.save(contractualEmployee);
    }
}
