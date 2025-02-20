package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Employee;

public interface EmployeeDetailsRepository extends JpaRepository<Employee , Integer> {

}
