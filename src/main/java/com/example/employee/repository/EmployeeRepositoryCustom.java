package com.example.employee.repository;

import com.example.employee.domin.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositoryCustom {

    List<Employee> findAllByEmployee(Employee employee);

}
