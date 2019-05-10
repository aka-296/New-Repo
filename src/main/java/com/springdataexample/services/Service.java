package com.springdataexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springdataexample.model.Employee;

@Component
public class Service implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = employeeService.addEmployee(new Employee("1001", "ABC", "XYZ"));
	}

}
