package com.example.tarea2.entity;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="location_id")
    private Integer locationId;

    @Column(name="city", nullable=false)
    private String city;

    // Relación inversa con departments
    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Department> departments;
}
