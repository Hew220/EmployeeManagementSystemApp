package guru.springframework.employeemanagementsystemapp.service;

import guru.springframework.employeemanagementsystemapp.model.Employee;
import guru.springframework.employeemanagementsystemapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
