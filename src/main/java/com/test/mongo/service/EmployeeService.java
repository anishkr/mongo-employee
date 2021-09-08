package com.test.mongo.service;

import com.test.mongo.model.Employee;

import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Optional<Employee> getEmployeeById(String ID);
}
