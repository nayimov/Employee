package com.example.employee.controler;

import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import com.example.employee.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @Operation(tags = "Create a new employee")
    @PostMapping
    public EmployeeCreateDTO createEmployee(@RequestBody  EmployeeCreateDTO dto) {
        return employeeService.createEmployee(dto);
    }

    @Operation(tags = "Delete a employee")
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @Operation(tags = "Update a employee")
    @PutMapping
    public void updateEmployee(@RequestBody EmployeeUpdateDTO dto) {
        employeeService.updateEmployee(dto);
    }

    @Operation(tags = "Get employee")
    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }
}
