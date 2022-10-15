package org.kodluyoruz.mybank.service.impl;

import org.kodluyoruz.mybank.dtos.CardCreateDto;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.Card;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.repository.CardRepository;
import org.kodluyoruz.mybank.service.AccountService;
import org.kodluyoruz.mybank.service.CardService;
import org.kodluyoruz.mybank.service.UserService;
import org.kodluyoruz.mybank.utils.NumberGenerator;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;
    private final AccountService accountService;
    private  final UserService userService;
    public CardServiceImpl(CardRepository cardRepository, AccountService accountService, UserService userService) {
        this.cardRepository = cardRepository;
        this.accountService = accountService;
        this.userService = userService;
    }





    @Override
    public Card createCard(CardCreateDto cardCreateDto) {
        Account byId = accountService.getById(cardCreateDto.getAccountId());
        User byId1 = userService.getById(cardCreateDto.getUserId());

        Card card = Card.builder()
                .account(byId)
                .user(byId1)
                .CardNo(NumberGenerator.cardNumberGenerator())
                .cvc(NumberGenerator.cardCvcGenerator())
                .expiredDate(LocalDate.now().plusYears(5))
                .createdDate(LocalDateTime.now())
                .build();

        return cardRepository.save(card);
    }

    @Override
    public Boolean deleteCard(Long id) {
        this.cardRepository.deleteById(id);
        return true;
    }

    @Override
    public Optional<Card> getAccountIdAndUserId(Long accountId, Long userId) {
        Optional<Card> byAccount_idAndUser_id = Optional.ofNullable(this.cardRepository.findByAccount_IdAndUser_Id(accountId, userId)
                .orElseThrow(() -> new EntityNotFoundException("Not Found account id and user id for card")));
        return byAccount_idAndUser_id;
    }
}
