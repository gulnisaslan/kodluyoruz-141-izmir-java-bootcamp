package org.kodluyoruz.mybank.transfer.repository;

import org.kodluyoruz.mybank.transfer.model.TransferWithIban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferWithIbanRepository extends JpaRepository<TransferWithIban,Long> {

}
