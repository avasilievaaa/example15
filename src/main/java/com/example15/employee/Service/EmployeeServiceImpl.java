package com.example15.employee.Service;
import com.example15.employee.Employee.Employee;
import com.example15.employee.exception.EmployeeBadException;
import com.example15.employee.exception.EmployeeFullArrayException;
import com.example15.employee.exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
Employee [] employees = {
new Employee("Николай", "Семёнов"),
new Employee("Роман", "Карлов"),
new Employee("Вероника", "Павлова") };
@Override
public String findEmployee (String firstName, String lastName) {
    for (int i = 0; i < employees.length; i++) {
    if (employees [i].getFirstName().equals(firstName) & employees [i].getLastName().equals(lastName)) {
    return "firstName: " + employees [i].getFirstName() + ", lastName: " + employees [i].getLastName();}
} throw new EmployeeBadException(); }
@Override
public String addEmployee (String firstName, String lastName) {
     int index = findFreeNumber ();
     if (index == -1) {throw new EmployeeFullArrayException();}
     employees [index] = new Employee(firstName, lastName);
     throw new EmployeeBadException();}
public int findFreeNumber ()  {
    for (int i = 0; i < employees.length; i++) {
    if (employees [i] == null) {return i;}}
    return -1;}
@Override
public String removeEmployee (String firstName, String lastName) {
    for (int i = 0; i < employees.length; i++) {
    if (employees [i].getFirstName().equals(firstName) & employees [i].getLastName().equals(lastName)) {
    employees [i] = null;
    return "Удален сотрудник: " + employees [i].getFirstName() + " " + employees [i].getLastName();}}
    throw new EmployeeNotFoundException();}
}