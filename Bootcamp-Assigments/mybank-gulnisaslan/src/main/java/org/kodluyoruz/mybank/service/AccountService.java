package org.kodluyoruz.mybank.service;


import org.kodluyoruz.mybank.dtos.AccountCreateDto;
import org.kodluyoruz.mybank.dtos.AccountResponseDto;
import org.kodluyoruz.mybank.entity.Account;

public interface AccountService {
    Account createAccount(AccountCreateDto accountCreateDto);

    Boolean deleteByAccountId(Long id);
    Account getById(Long id);


}

