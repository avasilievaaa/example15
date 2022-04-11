package com.example15.employee.controller;
import com.example15.employee.Employee.Employee;
import com.example15.employee.Service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
private final EmployeeServiceImpl employeeService;
public EmployeeController(EmployeeServiceImpl employeeService) {
    this.employeeService = employeeService;
}
@GetMapping("/add")
public String Employee (@RequestParam String firstName, @RequestParam String lastName) {return employeeService.addEmployee(firstName,lastName);}
@GetMapping("/remove")
public String remove (@RequestParam String firstName, @RequestParam String lastName) {return employeeService.removeEmployee(firstName,lastName);}
@GetMapping("/find")
public String find (@RequestParam String firstName, @RequestParam String lastName) {return employeeService.findEmployee(firstName,lastName);}
}
