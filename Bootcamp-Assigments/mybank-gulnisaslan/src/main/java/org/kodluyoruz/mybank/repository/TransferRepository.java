package org.kodluyoruz.mybank.repository;

import org.kodluyoruz.mybank.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends JpaRepository<Transfer,Long> {
	
	Transfer findByAccount_ibanNo(String ibanNo);
}
