package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}