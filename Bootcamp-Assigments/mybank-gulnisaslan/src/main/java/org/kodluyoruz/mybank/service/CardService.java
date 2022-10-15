package org.kodluyoruz.mybank.service;

import org.kodluyoruz.mybank.dtos.CardCreateDto;
import org.kodluyoruz.mybank.entity.Card;

import java.util.Optional;

public interface CardService {
    Card createCard(CardCreateDto cardCreateDto);
    Boolean deleteCard(Long id);

    Optional<Card> getAccountIdAndUserId(Long accountId, Long userId);

}
