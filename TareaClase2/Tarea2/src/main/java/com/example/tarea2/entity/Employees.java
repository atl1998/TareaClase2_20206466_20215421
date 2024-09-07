package com.example.tarea2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id", nullable=false)
    private Integer employee_id;

    @Column(name="first_name", nullable=false)
    private String first_name;

    @Column(name="last_name", nullable=false)
    private String last_name;

    @Column(name="email", nullable=false)
    private String email;
}
/*package com.example.tarea2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id",nullable=false)
    private Integer employeeid;

    @Column(name="first_name",nullable=false)
    private String nombre;

    @Column(name="last_name",nullable=false)
    private String apellido;

    @Column(name="email",nullable=false)
    private String correo;
}*/
