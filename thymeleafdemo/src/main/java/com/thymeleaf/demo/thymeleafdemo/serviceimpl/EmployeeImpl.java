package com.thymeleaf.demo.thymeleafdemo.serviceimpl;



import com.thymeleaf.demo.thymeleafdemo.Entity.Employee;
import com.thymeleaf.demo.thymeleafdemo.Repository.EmployeeRepository;
import com.thymeleaf.demo.thymeleafdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl  implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List< Employee > getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional< Employee > optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }

}
