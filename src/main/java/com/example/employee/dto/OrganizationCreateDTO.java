package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationCreateDTO {
    private String name;
    private String parentId;
    private RegionCreateDTO region;
}
