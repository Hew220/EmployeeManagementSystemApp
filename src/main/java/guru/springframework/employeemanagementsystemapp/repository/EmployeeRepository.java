package guru.springframework.employeemanagementsystemapp.repository;

import guru.springframework.employeemanagementsystemapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
