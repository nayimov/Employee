package com.example.employee.controler;

import com.example.employee.dto.RegionCreateDTO;
import com.example.employee.dto.RegionDTO;
import com.example.employee.dto.RegionUpdateDTO;
import com.example.employee.services.RegionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/region")
@Tag(name = "Region")
public class RegionResource {

    private final RegionService regionService;

    @Operation(summary = "Create region")
    @PostMapping
    public ResponseEntity<RegionCreateDTO> createRegion(@RequestBody RegionCreateDTO createDTO) {
        return ResponseEntity.ok(regionService.createRegion(createDTO));
    }

    @Operation(summary = "Delete region")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegion(@PathVariable Long id) {
        regionService.deleteRegion(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Update region")
    @PutMapping
    public ResponseEntity<RegionUpdateDTO> updateRegion(@RequestBody RegionUpdateDTO updateDTO) {
        return ResponseEntity.ok(regionService.updateRegion(updateDTO));
    }

    @Operation(summary = "Get region")
    @GetMapping("/{id}")
    public ResponseEntity<RegionDTO> getRegion(@PathVariable Long id) {
        return ResponseEntity.ok(regionService.getRegion(id));
    }
}
