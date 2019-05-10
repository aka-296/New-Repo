package com.springdataexample.services;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdataexample.model.Employee;

import com.springdataexample.repositories.EmployeeRepository;

@Service
@RestController
@RequestMapping("/employee")
public class EmployeeServiceImpl implements EmployeeService {

	/*
	 * private static final String PROPERTY_NAME_DATABASE_DRIVER =
	 * "spring.datasource.driverClassName"; private static final String
	 * PROPERTY_NAME_DATABASE_PASSWORD = "spring.datasource.password"; private
	 * static final String PROPERTY_NAME_DATABASE_URL = "spring.datasource.url";
	 * private static final String PROPERTY_NAME_DATABASE_USERNAME =
	 * "spring.datasource.username";
	 */
	
	/*
	 * @Autowired private EntityManagerFactory entityManagerFac;
	 */
	
	@Autowired
	private EmployeeRepository empRepository;

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public Employee addEmployee(Employee employee) {

		return empRepository.save(employee);
	}

	/*
	 * @Override public Employee getEmployee(Long id) {
	 * 
	 * return empRepository.findById(id); }
	 */

	@Override
	public void deleteEmployee(Long id) {
		empRepository.deleteById(id);

	}

	@GetMapping(value = "/view", produces = MediaType.APPLICATION_JSON_VALUE)
	@Override
	public List<Employee> getAllEmployees() {

		return (List<Employee>) empRepository.findAll();
	}

	@Override
	public Employee editEmployee(Employee employee) {

		return empRepository.save(employee);
	}

	/*
	 * public Employee addEmployee(Employee employee) {
	 * 
	 * return empRepository.save(employee); }
	 * 
	 * 
	 * public Optional<Employee> getEmployee(Long id) {
	 * 
	 * return empRepository.findById(id); }
	 * 
	 * 
	 * public void deleteEmployee(Long id) { empRepository.deleteById(id); ; }
	 * 
	 * 
	 * public List getAllEmployees() {
	 * 
	 * return (List) empRepository.findAll(); }
	 * 
	 * 
	 * public Employee editEmployee(Employee employee) {
	 * 
	 * return empRepository.save(employee); }
	 */
}
