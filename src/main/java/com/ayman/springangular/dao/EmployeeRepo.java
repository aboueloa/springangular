package com.ayman.springangular.dao;

import com.ayman.springangular.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
    public List<Employee> findAll();
}
