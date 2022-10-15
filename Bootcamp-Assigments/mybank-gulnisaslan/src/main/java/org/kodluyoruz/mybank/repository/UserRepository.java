package org.kodluyoruz.mybank.repository;

import org.kodluyoruz.mybank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
     User findByIdentityNumber(Long identityNumber);
    User findByEmail(String email);
	
	
}
