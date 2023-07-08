package com.example.employee.controler;

import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import com.example.employee.services.EmployeeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @ApiOperation(value = "Create a new employee")
    @PostMapping
    public EmployeeCreateDTO createEmployee(EmployeeCreateDTO dto) {
        return employeeService.createEmployee(dto);
    }

    @ApiOperation(value = "Delete a employee")
    @DeleteMapping("/id")
    public void deleteEmployee(Long id) {
        employeeService.deleteEmployee(id);
    }

    @ApiOperation(value = "Update a employee")
    @PutMapping
    public void updateEmployee(EmployeeUpdateDTO dto) {
        employeeService.updateEmployee(dto);
    }

    @ApiOperation("Get employee")
    @GetMapping("/id")
    public EmployeeDTO getEmployee(Long id) {
        return employeeService.getEmployee(id);
    }
}
