package org.kodluyoruz.mybank.service.impl;

import org.kodluyoruz.mybank.dtos.AccountCreateDto;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.enums.AccountType;
import org.kodluyoruz.mybank.repository.AccountRepository;
import org.kodluyoruz.mybank.service.AccountService;
import org.kodluyoruz.mybank.service.UserService;
import org.kodluyoruz.mybank.utils.NumberGenerator;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final UserService userService;


    public AccountServiceImpl(AccountRepository accountRepository, UserService userService) {
        this.accountRepository = accountRepository;
        this.userService = userService;

    }


    @Override
    public Account createAccount(AccountCreateDto accountCreateDto) {
        User byId = userService.getById(accountCreateDto.getId());
        Account account = Account.builder()
                .user(byId)
                .accountType(accountCreateDto.getAccountType())
                .currency(accountCreateDto.getCurrency())
                .ibanNo(NumberGenerator.ibanGenerator())
                .money(0.0)
                .build();

        return accountRepository.save(account);
    }


    @Override
    public Boolean deleteByAccountId(Long id) {
        Optional<Account> byId = Optional.ofNullable(this.accountRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found id" + id)));
        
        return this.accountRepository.deleteById(byId);
    }

    @Override
    public Account getById(Long id) {
        return this.accountRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Not Found Account id : "+ id));
    }



}
