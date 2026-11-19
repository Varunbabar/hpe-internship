package com.example.employee_service.model;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

    private final Employees employees = new Employees();

    public EmployeeManager() {
        employees.getEmployeeList().add(new Employee("1", "Aarav", "Sharma", "aarav.sharma@example.com", "Software Engineer"));
        employees.getEmployeeList().add(new Employee("2", "Priya", "Patil", "priya.patil@example.com", "QA Engineer"));
        employees.getEmployeeList().add(new Employee("3", "Rohan", "Mehta", "rohan.mehta@example.com", "Team Lead"));
        employees.getEmployeeList().add(new Employee("4", "Sneha", "Kulkarni", "sneha.kulkarni@example.com", "Project Manager"));
    }

    public Employees getEmployees() {
        return employees;
    }
}