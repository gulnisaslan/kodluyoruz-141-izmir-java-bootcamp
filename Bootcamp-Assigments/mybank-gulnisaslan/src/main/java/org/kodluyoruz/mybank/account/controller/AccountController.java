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

    @PostMapping(value = "createAccount")
    public AccountResponseDto createAccount(@RequestBody AccountRequestDto accountRequestDto) {
        return this.accountService.createAccount(accountRequestDto);
    }

    
}