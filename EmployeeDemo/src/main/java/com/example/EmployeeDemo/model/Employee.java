package com.example.EmployeeDemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.CollectionCallback;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "Employee")
public class Employee {

    @Id
    public int id;
    public String name;
    public String Department;
    public int salary;


}
