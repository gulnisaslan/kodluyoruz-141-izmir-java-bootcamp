package org.kodluyoruz.mybank.card.service;

import org.kodluyoruz.mybank.card.dto.CardRequestDto;
import org.kodluyoruz.mybank.card.dto.CardResponseDto;

public interface CardService {
    CardResponseDto createCreditCard(CardRequestDto cardRequestDto);
    CardResponseDto createDebitCard(CardRequestDto cardRequestDto);
}
