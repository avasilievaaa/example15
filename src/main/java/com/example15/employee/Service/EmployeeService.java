package com.example15.employee.Service;

import com.example15.employee.Employee.Employee;

public interface EmployeeService {
public Employee addEmployee (String firstName, String lastName);
public Employee removeEmployee (String firstName, String lastName);
public Employee findEmployee (String firstName, String lastName);
public Employee addEmployee (Employee employee);
public Employee removeEmployee (Employee employee);
Employee[] find();
}