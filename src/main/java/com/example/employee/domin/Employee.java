package com.example.employee.domin;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "pinfl")
    private Integer pinfl;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "organization_id")
    private Long organizationId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", updatable = false, insertable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Organization organization;

}
