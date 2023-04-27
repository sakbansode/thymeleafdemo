package com.thymeleaf.demo.thymeleafdemo.services;


import com.thymeleaf.demo.thymeleafdemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}