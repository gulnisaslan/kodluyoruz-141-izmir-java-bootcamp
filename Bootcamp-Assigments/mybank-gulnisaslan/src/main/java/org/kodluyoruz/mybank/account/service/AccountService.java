package org.kodluyoruz.mybank.account.service;

import org.kodluyoruz.mybank.account.dto.AccountRequestDto;
import org.kodluyoruz.mybank.account.dto.AccountResponseDto;
import org.kodluyoruz.mybank.account.model.Account;

/**
 * AccountService
 */
public interface AccountService {
    //Deposit And Saving ->> Account Types
    //TRY USD EUR -> CurrencyTypes

    AccountResponseDto createSavingAndTRYAccount(AccountRequestDto accountRequestDto);
    AccountResponseDto createDepositAndTRYAccount(AccountRequestDto accountRequestDto);

    AccountResponseDto createSavingAndUSDAccount(AccountRequestDto accountRequestDto);
    AccountResponseDto createDepositAndUSDAccount(AccountRequestDto accountRequestDto);
    AccountResponseDto createSavingAndEURccount(AccountRequestDto accountRequestDto);
    AccountResponseDto createDepositAndEURAccount(AccountRequestDto accountRequestDto);



    boolean deleteAccount(long id);
    Account getById(Long id);
    
}