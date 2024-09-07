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

    //relación con la tabla departments
    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
    private Department department;

    //relación con la tabla jobs
    @ManyToOne
    @JoinColumn(name="job_id", nullable=false)
    private Job job;

}

