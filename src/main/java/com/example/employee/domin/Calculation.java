package com.example.employee.domin;

import com.example.employee.enums.CalculationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Calculation")
public class Calculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "type")
    private CalculationType type;
    @Column(name = "rate")
    private BigDecimal rate;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "employee_id")
    private Long employeeId;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", updatable = false, insertable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Employee employee;
    @Column(name = "organization_id")
    private Long organizationId;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", updatable = false, insertable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Organization organization;

}
