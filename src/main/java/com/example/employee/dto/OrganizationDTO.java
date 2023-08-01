package com.example.employee.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganizationDTO {
    private Long id;
    private String name;
    private String parentId;
    private RegionDTO region;
}
