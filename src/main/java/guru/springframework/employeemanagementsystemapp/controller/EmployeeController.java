package guru.springframework.employeemanagementsystemapp.controller;

import guru.springframework.employeemanagementsystemapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {

        model.addAttribute("listEmployees", employeeService.getAllEmployee());

        return "index";
    }


}
