package com.springdataexample.services;

import java.util.List;

import com.springdataexample.model.Employee;


public interface EmployeeService {

	Employee addEmployee(Employee employee);

	

	void deleteEmployee(Long id);

	List<Employee> getAllEmployees();

	Employee editEmployee(Employee employee);
}
