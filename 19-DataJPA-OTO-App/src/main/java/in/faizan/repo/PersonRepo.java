package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
