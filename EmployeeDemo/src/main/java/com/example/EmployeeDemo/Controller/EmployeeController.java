package com.example.EmployeeDemo.Controller;

import com.example.EmployeeDemo.model.Employee;
import com.example.EmployeeDemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired

    private EmployeeRepository repository;




    @GetMapping("/getEmployee/{id}")

    public Optional<Employee> getEmployee(@PathVariable int id){
        return repository.findById(id);
    }


    @DeleteMapping("/delete/{id}")

    public String deleteEmployee(@PathVariable int id){
        repository.deleteById(id);{
            return "Employee deleted with id" +id;
        }
    }

    @PostMapping("/addEmployee")

    public String saveEmployee(@RequestBody Employee emp) {


        repository.save(emp);
        emp.setDepartment("HR");

        if (emp.getId()>200){
            return "Please enter id less than 200";
        }
        return "Added Employee" + emp.getId();
    }
}
