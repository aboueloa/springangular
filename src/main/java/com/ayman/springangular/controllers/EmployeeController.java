package com.ayman.springangular.controllers;

import com.ayman.springangular.dao.EmployeeRepo;
import com.ayman.springangular.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    EmployeeRepo employeeRepo;
    @PostMapping("/addEmployee")
    public List<Employee> saveEmployee(@RequestBody Employee emp){
        employeeRepo.save(emp);
        return employeeRepo.findAll();
    }
    @GetMapping("/addEmployee")
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
}
