package com.kunal.employeedbapp.dao;

import com.kunal.employeedbapp.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    int add(Employee e) throws Exception;
    Optional<Employee> findById(int id) throws Exception;
    List<Employee> findAll() throws Exception;
    boolean update(Employee e) throws Exception;
    boolean delete(int id) throws Exception;
}