package com.example.tarea2.controller;

import java.util.List;
import com.example.tarea2.repository.EmployeesRepository;
import com.example.tarea2.entity.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

/*package com.example.tarea2.controller;
import java.util.List;
import com.example.tarea2.repository.EmployeesRepository;
import com.example.tarea2.entity.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// Añadir la anotación para  el Controlador : @ ...
@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeesRepository employeesRepository;
    public EmployeesController(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @GetMapping({"employee/list", "employee"})
    public String listarEmpleados(Model model) {
        List<Employees> lista = employeesRepository.findAll();
        for(Employees p:lista){
            System.out.print("ID: "+p.getEmployeeid());
            System.out.print("Nombre: "+p.getNombre());
            System.out.print("Apellido: "+p.getApellido());
            System.out.print("Correo: "+p.getCorreo());
        }
        model.addAttribute("listaEmployees",lista);
        return "lista";
    }
}*/
