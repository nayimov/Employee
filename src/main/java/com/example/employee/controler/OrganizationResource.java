package com.example.employee.controler;

import com.example.employee.dto.OrganizationCreateDTO;
import com.example.employee.dto.OrganizationDTO;
import com.example.employee.dto.OrganizationUpdateDTO;
import com.example.employee.services.OrganizationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizations")
@RequiredArgsConstructor
@Tag(name = "Organization")
public class OrganizationResource {
    private final OrganizationService organizationService;

    @Operation(summary = "Create Organization")
    @PostMapping
    public ResponseEntity<OrganizationCreateDTO> createOrganization(@RequestBody OrganizationCreateDTO createDTO) {
        return ResponseEntity.ok(organizationService.createOrganization(createDTO));
    }

    @Operation(summary = "Update Organization")
    @PutMapping
    public ResponseEntity<OrganizationUpdateDTO> updateOrganization(@RequestBody OrganizationUpdateDTO updateDTO) {
        return ResponseEntity.ok(organizationService.updateOrganization(updateDTO));
    }

    @Operation(summary = "Delete Organization")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrganization(@PathVariable Long id) {
        organizationService.deleteOrganization(id);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get Organization")
    @GetMapping("/{id}")
    public ResponseEntity<OrganizationDTO> getOrganization(@PathVariable Long id) {
        return ResponseEntity.ok(organizationService.getOrganization(id));
    }
}
