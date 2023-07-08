package com.example.employee.services;

import com.example.employee.domin.Organization;
import com.example.employee.dto.OrganizationCreateDTO;
import com.example.employee.dto.OrganizationDTO;
import com.example.employee.dto.OrganizationUpdateDTO;
import com.example.employee.mapper.OrganizationMapper;
import com.example.employee.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository repository;
    private final OrganizationMapper organizationMapper;
    public OrganizationCreateDTO createOrganization(OrganizationCreateDTO createDTO) {
        Organization organization = organizationMapper.toEntity(createDTO);
        repository.save(organization);
        return createDTO;
    }

    public OrganizationUpdateDTO updateOrganization(OrganizationUpdateDTO updateDTO) {
        Organization organization = repository.findById(updateDTO.getId()).orElseThrow(() -> new IllegalStateException("Could not find organization"));
        organizationMapper.updateEntity(organization, updateDTO);
        return updateDTO;
    }

    public void deleteOrganization(Long id) {
        Organization organization = repository.findById(id).orElseThrow(() -> new IllegalStateException("Could not find organization"));
        repository.delete(organization);
    }


    public OrganizationDTO getOrganization(Long id) {
        Organization organization = repository.findById(id).orElseThrow(() -> new IllegalStateException("Could not find organization"));
        return organizationMapper.getDTO(organization);
    }
}
