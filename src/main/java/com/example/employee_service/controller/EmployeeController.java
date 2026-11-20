
package com.example.employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_service.model.Employee;
import com.example.employee_service.model.EmployeeManager;
import com.example.employee_service.model.Employees;

@RestController
public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeManager.addEmployee(employee);
    }
}
