package com.example.employee.controler;

import com.example.employee.dto.RegionCreateDTO;
import com.example.employee.dto.RegionDTO;
import com.example.employee.services.RegionService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/region")
public class RegionResource {

    private final RegionService regionService;

    @Operation(tags = "Create region")
    @PostMapping
    public ResponseEntity<RegionCreateDTO> createRegion(@RequestBody RegionCreateDTO createDTO) {
        return ResponseEntity.ok(regionService.createRegion(createDTO));
    }

    @Operation(tags = "Delete region")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegion(@PathVariable Long id) {
        regionService.deleteRegion(id);
        return ResponseEntity.ok().build();
    }

    @Operation(tags = "Update region")
    @PutMapping
    public ResponseEntity<RegionDTO> updateRegion(@RequestBody RegionDTO updateDTO) {
        return ResponseEntity.ok(regionService.updateRegion(updateDTO));
    }

    @Operation(tags = "Get region")
    @GetMapping("/{id}")
    public ResponseEntity<RegionDTO> getRegion(@PathVariable Long id) {
        return ResponseEntity.ok(regionService.getRegion(id));
    }
}
