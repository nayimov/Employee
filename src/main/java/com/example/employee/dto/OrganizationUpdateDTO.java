package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationUpdateDTO {
    private Long id;
    private String name;
    private String parent;
    private Long regionId;
}
