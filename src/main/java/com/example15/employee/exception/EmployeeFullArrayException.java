package com.example15.employee.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
public class EmployeeFullArrayException extends RuntimeException{}
