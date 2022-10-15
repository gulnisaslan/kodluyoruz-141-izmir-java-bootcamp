package org.kodluyoruz.mybank.controller;

import org.kodluyoruz.mybank.controller.responseDtoMapping.ResponseDtoMappingForController;
import org.kodluyoruz.mybank.dtos.AccountCreateDto;
import org.kodluyoruz.mybank.dtos.AccountResponseDto;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AccountsController {
    private final AccountService accountService;

    public AccountsController(AccountService accountService) {
        this.accountService = accountService;
    }
    @PostMapping("createaccount")
    public AccountResponseDto createAccount(@RequestBody AccountCreateDto accountCreateDto){
        Account account = this.accountService.createAccount(accountCreateDto);
        return ResponseDtoMappingForController.toAccount(account);
    }




}
