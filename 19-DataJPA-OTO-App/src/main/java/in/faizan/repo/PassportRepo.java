package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer>{

}
