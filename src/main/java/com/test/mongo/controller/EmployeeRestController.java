package com.test.mongo.controller;

import com.test.mongo.model.Employee;
import com.test.mongo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/{version}/employee")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/{version}/employee/{id}")
    public ResponseEntity<?> getEmployeeByID(@PathVariable("id") String id) {
        return new ResponseEntity<>(Optional
                .ofNullable(employeeService.getEmployeeById("id"))
                .orElseThrow(() -> new RuntimeException("Data not found")), HttpStatus.OK);
    }

}
