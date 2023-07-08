package com.example.employee.dto;

import com.example.employee.enums.CalculationType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculationDTO {
    private Long id;
    private EmployeeDTO employee;
    private String amount;
    private Double rate;
    private OrganizationDTO organization;
    private CalculationType type;
}
