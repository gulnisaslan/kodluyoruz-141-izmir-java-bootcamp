package org.kodluyoruz.mybank.account.controller;

import org.kodluyoruz.mybank.account.dto.AccountRequestDto;
import org.kodluyoruz.mybank.account.dto.AccountResponseDto;
import org.kodluyoruz.mybank.account.service.AccountService;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import lombok.RequiredArgsConstructor;

/**
 * AccountController
 */
@RestController
@RequestMapping(value = "/api/v1/account")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @PostMapping(value = "createSavingAndTRYAccount")
    @ResponseStatus(value = HttpStatus.CREATED)
    public AccountResponseDto createSavingAndTRYAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createSavingAndTRYAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndTRYAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponseDto createDepositAndTRYAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndTRYAccount(accountRequestDto);
    }

    @PostMapping(value = "createSavingAndUSDAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponseDto createSavingAndUSDAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createSavingAndUSDAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndUSDAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponseDto createDepositAndUSDAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndUSDAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndEURAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponseDto createDepositAndEURAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndEURAccount(accountRequestDto);
    }
    @PostMapping(value = "createSavingAndEURAccount")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponseDto createSavingAndEURAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndEURAccount(accountRequestDto);
    }






}