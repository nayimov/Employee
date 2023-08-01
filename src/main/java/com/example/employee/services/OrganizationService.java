package com.example.employee.services;

import com.example.employee.domin.Organization;
import com.example.employee.dto.OrganizationCreateDTO;
import com.example.employee.dto.OrganizationDTO;
import com.example.employee.dto.OrganizationUpdateDTO;
import com.example.employee.exception.BadRequestException;
import com.example.employee.exception.EntityNotFoundException;
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
        Organization organization = repository.findById(updateDTO.getId()).orElseThrow(() -> new EntityNotFoundException("Could not find organization {}", updateDTO.getId()));
        organizationMapper.updateEntity(organization, updateDTO);
        return updateDTO;
    }

    public void deleteOrganization(Long id) {
        Organization organization = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Could not find organization {}",id));
        repository.delete(organization);
    }


    public OrganizationDTO getOrganization(Long id) {
        Organization organization = repository.findById(id).orElseThrow(() -> new BadRequestException("Could not find organization"));
        return organizationMapper.getDTO(organization);
    }
}
