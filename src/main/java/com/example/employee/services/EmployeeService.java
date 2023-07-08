package com.example.employee.services;

import com.example.employee.domin.Employee;
import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeCreateDTO createEmployee(EmployeeCreateDTO dto) {
        Employee employee = new Employee();
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setHireDate(dto.getHireDate());
        employee.setPinfl(dto.getPinfl());
        repository.save(employee);
        return dto;
    }

    public void deleteEmployee(Long employeeId) {
        Employee employee = repository.findById(employeeId).orElseThrow();
        repository.delete(employee);
    }

    public void updateEmployee(EmployeeUpdateDTO dto) {
        Employee employee = repository.findById(dto.getId()).orElseThrow();
        employee.setFirstName(dto.getFirstName());
        employee.setLastName(dto.getLastName());
        employee.setPinfl(dto.getPinfl());
        employee.setHireDate(dto.getHireDate());
        employee.setOrganizationId(dto.getOrganizationId());

        repository.save(employee);
    }

    public EmployeeDTO getEmployee(Long id) {
        Employee employee = repository.findById(id).orElseThrow();
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employee.getId());
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setPinfl(employee.getPinfl());
        dto.setHireDate(employee.getHireDate());

        return dto;
    }
}
