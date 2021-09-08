package com.test.mongo.service.impl;

import com.test.mongo.dao.EmployeeDAO;
import com.test.mongo.model.Employee;
import com.test.mongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl (EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Employee createEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    public Optional<Employee> getEmployeeById(String ID) {
        return employeeDAO.findById(ID);
    }

}
