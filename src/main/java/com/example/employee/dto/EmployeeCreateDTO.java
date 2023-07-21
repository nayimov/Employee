package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeCreateDTO {

    private String firstName;
    private String lastName;
    private Integer pinfl;
    private LocalDate hireDate;
    private Long organizationId;

}
