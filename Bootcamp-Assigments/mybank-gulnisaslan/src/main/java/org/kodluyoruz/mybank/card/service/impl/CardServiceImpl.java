package org.kodluyoruz.mybank.card.service.impl;


import java.math.BigDecimal;
import java.time.LocalDate;

import org.kodluyoruz.mybank.account.model.Account;
import org.kodluyoruz.mybank.account.service.AccountService;
import org.kodluyoruz.mybank.card.dto.CardRequestDto;
import org.kodluyoruz.mybank.card.dto.CardResponseDto;
import org.kodluyoruz.mybank.card.enums.CardType;
import org.kodluyoruz.mybank.card.model.Card;
import org.kodluyoruz.mybank.card.repository.CardRepository;
import org.kodluyoruz.mybank.card.service.CardService;
import org.kodluyoruz.mybank.card.service.util.NumberGenerator;
import org.kodluyoruz.mybank.user.model.Customer;
import org.kodluyoruz.mybank.user.service.CustomerService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{
    private final CardRepository cardRepository;
    private final AccountService  accountService;
    private final CustomerService  customerService;

    @Override
    public CardResponseDto createDebitCard(CardRequestDto cardRequestDto) {
        Account account = this.accountService.getById(cardRequestDto.getAccountId());
        Customer customer = this.customerService.getById(cardRequestDto.getCustomerId());
        Card card1= Card.builder()
                .account(account)
                .customer(customer)
                .cardNo(NumberGenerator.generatedCardNo())
                .cvc(NumberGenerator.generatedCvcNo())
                .password(NumberGenerator.generatedPassword())
                .createCardDate(LocalDate.now())
                .expiredCardDate(LocalDate.now().plusYears(5))
                .cardType(CardType.DEBIT)
                .money(account.getMoney())
                .build();
        Card card = this.cardRepository.save(card1);
        return CardResponseDto.toCard(card);
    }

    @Override
    public CardResponseDto createCreditCard(CardRequestDto cardRequestDto) {
        Account account = this.accountService.getById(cardRequestDto.getAccountId());
        Customer customer = this.customerService.getById(cardRequestDto.getCustomerId());
        Card card1= Card.builder()
                .account(account)
                .customer(customer)
                .cardNo(NumberGenerator.generatedCardNo())
                .cvc(NumberGenerator.generatedCvcNo())
                .password(NumberGenerator.generatedPassword())
                .createCardDate(LocalDate.now())
                .expiredCardDate(LocalDate.now().plusYears(5))
                .cardType(CardType.CREDITCARD)
                .money(new BigDecimal(0))
                .build();
        Card card = this.cardRepository.save(card1);
        return CardResponseDto.toCard(card);
    }
   
   
    
}
