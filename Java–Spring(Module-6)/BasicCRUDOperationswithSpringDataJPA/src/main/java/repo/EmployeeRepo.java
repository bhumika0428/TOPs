package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
