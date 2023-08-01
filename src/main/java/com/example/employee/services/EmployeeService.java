package com.example.employee.services;

import com.example.employee.domin.Employee;
import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import com.example.employee.exception.EntityNotFoundException;
import com.example.employee.mapper.EmployeeMappers;
import com.example.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repository;
    private final EmployeeMappers employeeMappers;


    public EmployeeCreateDTO createEmployee(EmployeeCreateDTO dto) {
        Employee employee = employeeMappers.toEntity(dto);
        repository.save(employee);
        return dto;
    }

    public void deleteEmployee(Long employeeId) {
        Employee employee = repository.findById(employeeId).orElseThrow(() ->  new EntityNotFoundException("Employee not found {}", employeeId));
        repository.delete(employee);
    }

    public void updateEmployee(EmployeeUpdateDTO dto) {
        Employee employee = repository.findById(dto.getId()).orElseThrow(() -> new EntityNotFoundException("Employee not found {} ",dto.getId()));
        employeeMappers.updateEntity(employee, dto);
        repository.save(employee);
    }

    public EmployeeDTO getEmployee(Long id) {
        Employee employee = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Employee not found {} ",id));
        return employeeMappers.getDTO(employee);
    }
}
