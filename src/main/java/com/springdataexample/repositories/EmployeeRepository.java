package com.springdataexample.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.springdataexample.model.Employee;

@Component
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
