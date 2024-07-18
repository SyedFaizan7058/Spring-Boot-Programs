package in.faizan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.faizan.entity.Address;

public interface AddrRepo extends JpaRepository<Address, Integer>{

}
