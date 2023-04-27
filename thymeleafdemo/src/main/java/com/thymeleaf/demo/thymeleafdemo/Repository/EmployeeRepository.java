package com.thymeleaf.demo.thymeleafdemo.Repository;



import com.thymeleaf.demo.thymeleafdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
