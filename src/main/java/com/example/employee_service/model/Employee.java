package com.example.employee_service.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	private String employeeId;
	
	@JsonProperty("employee_id")
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@JsonProperty("first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonProperty("last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String firstName;
	public Employee(String employeeId, String firstName, String lastName, String email, String title) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.title = title;
	}

	private String lastName;
	private String email;
	private String title;
	
	public Employee() {
		
	}
}
