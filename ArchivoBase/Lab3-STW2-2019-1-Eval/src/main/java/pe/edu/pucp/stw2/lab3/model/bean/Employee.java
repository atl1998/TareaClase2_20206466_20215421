/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.stw2.lab3.model.bean;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;



/**
 *
 * @author Oscar A. Díaz Barriga
 */
@Entity (name="employee")
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeid", nullable=false)
    private int employeeId;

    @Column(name="firstname", nullable=false)
    private String firstName;
    @Column(name="lastname", nullable=false)
    private String lastName;




    // Añadir los atributos necesarios
    // No olvidar el encapsulamiento
}
