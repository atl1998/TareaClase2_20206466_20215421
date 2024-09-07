package com.example.tarea2.controller;

import java.util.List;
import com.example.tarea2.repository.EmployeesRepository;
import com.example.tarea2.entity.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeesRepository employeesRepository;

    public EmployeesController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }


    @GetMapping("/list")
    public String listarEmpleados(Model model) {
        List<Employees> lista = employeesRepository.findAll();
        model.addAttribute("listaEmployees", lista); // Añadimos la lista al modelo
        return "lista"; // Se enviarán los datos a la plantilla lista.html
    }

    /*pregunta3*/
    @GetMapping("/info/{id}")
    public String informEmpleado(@PathVariable("id") Integer id, Model model) {
        Employees employee = employeesRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado"));
        model.addAttribute("employee", employee);
        return "info"; // Página de detalles del empleado
    }
}
