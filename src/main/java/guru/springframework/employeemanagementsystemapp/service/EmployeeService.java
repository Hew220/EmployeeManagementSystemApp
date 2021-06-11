package guru.springframework.employeemanagementsystemapp.service;

import guru.springframework.employeemanagementsystemapp.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);



}
