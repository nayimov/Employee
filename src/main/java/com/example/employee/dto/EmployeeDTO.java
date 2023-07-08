package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer pinfl;
    private LocalDate hireDate;
    private OrganizationDTO organization;

}
