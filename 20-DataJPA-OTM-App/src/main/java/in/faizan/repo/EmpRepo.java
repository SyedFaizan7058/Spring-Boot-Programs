package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer>{

}
