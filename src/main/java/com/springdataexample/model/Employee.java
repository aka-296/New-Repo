package com.springdataexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "EMPLOYEE_TABLE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Emp_No", length = 30, nullable = false)
	private String empNo;

	@Column(name = "Emp_Name", nullable = false)
	private String name;

	@Column(name = "Emp_Designation", nullable = false)
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public Employee(String empNo, String name, String designation) {
		// super();
		// this.id = id;
		this.empNo = empNo;
		this.name = name;
		this.designation = designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	@Override
	public String toString() {
		return this.getEmpNo() + ", " + this.getName();
	}

}