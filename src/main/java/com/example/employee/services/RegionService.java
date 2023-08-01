package com.example.employee.services;

import com.example.employee.domin.Region;
import com.example.employee.dto.RegionCreateDTO;
import com.example.employee.dto.RegionDTO;
import com.example.employee.dto.RegionUpdateDTO;
import com.example.employee.exception.BadRequestException;
import com.example.employee.mapper.RegionMapper;
import com.example.employee.repository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository repository;
    private final RegionMapper regionMapper;

    public RegionCreateDTO createRegion(RegionCreateDTO createDTO) {
        Region region = regionMapper.toEntity(createDTO);
        repository.save(region);
        return createDTO;
    }


    public void deleteRegion(Long id) {
        Region region = repository.findById(id).orElseThrow(() -> new BadRequestException("Region not found"));
        repository.delete(region);
    }

    public RegionUpdateDTO updateRegion(RegionUpdateDTO updateDTO) {
        Region region = repository.findById(updateDTO.getId()).orElseThrow(() -> new BadRequestException("Region not found"));
        regionMapper.updateEntity(region, updateDTO);
        return updateDTO;
    }

    public RegionDTO getRegion(Long id) {
        Region region = repository.findById(id).orElseThrow(() -> new BadRequestException("Region not found"));
        return regionMapper.getDTO(region);
    }
}
