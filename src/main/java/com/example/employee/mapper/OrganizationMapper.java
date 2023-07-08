package com.example.employee.mapper;

import com.example.employee.domin.Organization;
import com.example.employee.dto.OrganizationCreateDTO;
import com.example.employee.dto.OrganizationDTO;
import com.example.employee.dto.OrganizationUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface OrganizationMapper {
    Organization toEntity(OrganizationCreateDTO createDTO);

    void updateEntity(@MappingTarget Organization organization, OrganizationUpdateDTO updateDTO);

    OrganizationDTO getDTO(Organization organization);
}
