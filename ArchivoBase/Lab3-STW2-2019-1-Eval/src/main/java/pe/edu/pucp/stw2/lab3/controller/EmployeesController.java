/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.stw2.lab3.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.pucp.stw2.lab3.model.bean.Employee;
import pe.edu.pucp.stw2.lab3.model.bean.Job;
import pe.edu.pucp.stw2.lab3.model.repository.EmployeeDAO;
import pe.edu.pucp.stw2.lab3.model.repository.EmployeeRepository;
import pe.edu.pucp.stw2.lab3.model.repository.JobDAO;

/**
 *
 * @author Oscar A. Díaz Barriga
 */

// Añadir la anotación para  el Controlador : @ ...
@Controller
@RequestMapping("/employee")
public class EmployeesController {

    final EmployeeRepository  employeeRepository;
    public EmployeesController(EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }


    /*
    private EmployeeDAO employeesDAO = new EmployeeDAO();
    private JobDAO  jobsDAO = new JobDAO();
*/

    @GetMapping({"employee/list", "employee"})
    public String listarEmpleados(Model model, @RequestParam(required=false) String zona) {
//      model.addAtribute("listaEmpleados", employee.findAll());
        return "XXXXXX";
    }

    @GetMapping("")
    public String informEmpleado() {
 //        COMPLETAR
        return "XXXXXX";
    }

    @GetMapping("")
    public String borrarEmpleado(Model model) {
        model.addAttribute("tipo_alert", "success");
        model.addAttribute("msg", "Se borro el empleado");
//        COMPLETAR
        return "XXXXXX";
    }

}
