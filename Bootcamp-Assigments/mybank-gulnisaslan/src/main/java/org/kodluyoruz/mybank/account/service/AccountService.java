package org.kodluyoruz.mybank.account.service;

import org.kodluyoruz.mybank.account.dto.AccountRequestDto;
import org.kodluyoruz.mybank.account.dto.AccountResponseDto;
import org.kodluyoruz.mybank.account.model.Account;

/**
 * AccountService
 */
public interface AccountService {

    AccountResponseDto createAccount(AccountRequestDto accountRequestDto);
    boolean deleteAccount(long id);
    Account getById(Long id);
    
}