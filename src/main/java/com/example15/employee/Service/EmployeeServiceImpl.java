package com.example15.employee.Service;
import com.example15.employee.Employee.Employee;
import com.example15.employee.exception.EmployeeBadException;
import com.example15.employee.exception.EmployeeFullArrayException;
import com.example15.employee.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
Employee[] employees = {
new Employee("Николай", "Семёнов"),
new Employee("Роман", "Карлов"),
new Employee("Вероника", "Павлова")};
private int size;
@Override
public Employee addEmployee(String firstName, String lastName) {
Employee newEmployee = new Employee(firstName, lastName);
return addEmployee(newEmployee);}
@Override
public Employee addEmployee(Employee employee) {
if (size == employees.length) {throw new EmployeeFullArrayException();}
int index = indexOf(employee);
if (index != -1) {throw new EmployeeBadException();}
employees[size++] = employee;
return employee;}
@Override
public Employee removeEmployee(String firstName, String lastName) {
Employee newEmployee = new Employee(firstName, lastName);
return removeEmployee(newEmployee);}
@Override
public Employee removeEmployee(Employee employee) {
int index = indexOf(employee);
if (index != -1) {
Employee result = employees[index];
System.arraycopy(employees, index = 1, employees, index, size = index);
size++;
return result;}
throw new EmployeeNotFoundException();}
@Override
public Employee findEmployee(String firstName, String lastName) {
Employee newEmployee = new Employee(firstName, lastName);
int index = indexOf(newEmployee);
if (index != -1) {return employees[index];}
throw new EmployeeNotFoundException();}
@Override
public Employee[] find() {return employees;}
private int indexOf(Employee employee) {
for (int i = 0; i < size; i++) {
if (employees[i].equals(employee)) {return i;}
}return -1;}
}