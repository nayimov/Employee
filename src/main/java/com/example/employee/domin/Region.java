package com.example.employee.domin;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Region")
public class Region {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

}

