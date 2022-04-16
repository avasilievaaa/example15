package com.example15.employee.Service;
import com.example15.employee.Employee.Employee;
import java.util.Collection;
import java.util.HashSet;
public interface EmployeeService {
Employee add (String firstName, String lastName);
Employee remove(String firstName, String lastName);
Employee find(String firstName, String lastName);
Collection <Employee> getEmployees ();}