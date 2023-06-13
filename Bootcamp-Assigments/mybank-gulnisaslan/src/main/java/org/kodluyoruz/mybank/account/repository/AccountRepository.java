package org.kodluyoruz.mybank.account.repository;


import org.kodluyoruz.mybank.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    
    
}
