package org.kodluyoruz.mybank.account.controller;

import org.kodluyoruz.mybank.account.dto.AccountRequestDto;
import org.kodluyoruz.mybank.account.dto.AccountResponseDto;
import org.kodluyoruz.mybank.account.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    public AccountResponseDto createSavingAndTRYAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createSavingAndTRYAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndTRYAccount")
    public AccountResponseDto createDepositAndTRYAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndTRYAccount(accountRequestDto);
    }

    @PostMapping(value = "createSavingAndUSDAccount")
    public AccountResponseDto createSavingAndUSDAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createSavingAndUSDAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndUSDAccount")
    public AccountResponseDto createDepositAndUSDAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndUSDAccount(accountRequestDto);
    }

    @PostMapping(value = "createDepositAndEURAccount")
    public AccountResponseDto createDepositAndEURAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndEURAccount(accountRequestDto);
    }
    @PostMapping(value = "createSavingAndEURAccount")
    public AccountResponseDto createSavingAndEURAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createDepositAndEURAccount(accountRequestDto);
    }






}