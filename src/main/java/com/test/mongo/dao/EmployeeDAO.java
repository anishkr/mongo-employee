package com.test.mongo.dao;

import com.test.mongo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeDAO extends MongoRepository<Employee, String> {
}
