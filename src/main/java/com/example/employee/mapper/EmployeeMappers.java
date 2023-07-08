package com.example.employee.mapper;

import com.example.employee.domin.Employee;
import com.example.employee.dto.EmployeeCreateDTO;
import com.example.employee.dto.EmployeeDTO;
import com.example.employee.dto.EmployeeUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMappers {

    Employee toEntity(EmployeeCreateDTO dto);

    void updateEntity(@MappingTarget Employee employee, EmployeeUpdateDTO dto);

    EmployeeDTO getDTO(Employee employee);

}
