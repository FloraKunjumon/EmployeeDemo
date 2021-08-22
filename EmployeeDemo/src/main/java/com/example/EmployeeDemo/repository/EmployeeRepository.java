package com.example.EmployeeDemo.repository;

import com.example.EmployeeDemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
