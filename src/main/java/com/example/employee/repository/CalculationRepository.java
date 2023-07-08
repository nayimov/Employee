package com.example.employee.repository;

import com.example.employee.domin.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
