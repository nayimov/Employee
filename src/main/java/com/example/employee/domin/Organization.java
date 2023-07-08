package com.example.employee.domin;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "parent")
    private String parent;

    @Column(name = "region_id")
    private Long regionId;
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id",updatable = false,insertable = false,foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Region region;

}
