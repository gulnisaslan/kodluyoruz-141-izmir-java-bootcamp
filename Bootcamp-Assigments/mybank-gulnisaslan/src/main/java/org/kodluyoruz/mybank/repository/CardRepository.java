package org.kodluyoruz.mybank.repository;

import org.hibernate.dialect.LobMergeStrategy;
import org.kodluyoruz.mybank.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card,Long> {

    Optional<Card> findByAccount_IdAndUser_Id(Long accountId, Long userId);

}
