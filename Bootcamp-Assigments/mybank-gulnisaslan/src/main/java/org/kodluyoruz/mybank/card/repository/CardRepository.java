package org.kodluyoruz.mybank.card.repository;

import org.kodluyoruz.mybank.card.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
    
}
