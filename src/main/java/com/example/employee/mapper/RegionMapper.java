package com.example.employee.mapper;

import com.example.employee.domin.Region;
import com.example.employee.dto.RegionCreateDTO;
import com.example.employee.dto.RegionDTO;
import com.example.employee.dto.RegionUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface RegionMapper {

    Region toEntity(RegionCreateDTO createDTO);

    void updateEntity(@MappingTarget Region region, RegionUpdateDTO updateDTO);

    RegionDTO getDTO(Region region);
}
