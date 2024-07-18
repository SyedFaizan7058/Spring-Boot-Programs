package in.faizan;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Person;
import in.faizan.entity.PersonPK;

public interface PersonRepo extends JpaRepository<Person, PersonPK>{

}
