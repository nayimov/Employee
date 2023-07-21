package com.example.employee.controler;

import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import com.example.employee.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
@Tag(name = "Employee")
public class EmployeeResource {

    private final EmployeeService employeeService;

    @Operation(summary = "Create a new employee")
    @PostMapping
    public EmployeeCreateDTO createEmployee(@RequestBody EmployeeCreateDTO dto) {
        return employeeService.createEmployee(dto);
    }

    @Operation(summary = "Delete a employee")
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @Operation(summary = "Update a employee")
    @PutMapping
    public void updateEmployee(@RequestBody EmployeeUpdateDTO dto) {
        employeeService.updateEmployee(dto);
    }

    @Operation(summary = "Get employee")
    @GetMapping("/{id}")
    public EmployeeDTO getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }
}
