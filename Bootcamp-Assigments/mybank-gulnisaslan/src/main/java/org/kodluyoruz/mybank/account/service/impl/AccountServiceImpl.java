package org.kodluyoruz.mybank.account.service.impl;

import java.math.BigDecimal;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.kodluyoruz.mybank.account.dto.AccountRequestDto;
import org.kodluyoruz.mybank.account.dto.AccountResponseDto;
import org.kodluyoruz.mybank.account.enums.AccountType;
import org.kodluyoruz.mybank.account.enums.CurrencyTypes;
import org.kodluyoruz.mybank.account.model.Account;
import org.kodluyoruz.mybank.account.repository.AccountRepository;
import org.kodluyoruz.mybank.account.service.AccountService;
import org.kodluyoruz.mybank.account.utils.NumberGenerator;
import org.kodluyoruz.mybank.user.model.Customer;
import org.kodluyoruz.mybank.user.service.CustomerService;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService  customerService;
    



    @Override
    public AccountResponseDto createSavingAndTRYAccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoTRY())
                .money(new BigDecimal(0))
                .accountType(AccountType.SAVING)
                .currencyTypes(CurrencyTypes.TRY)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);

    }

    @Override
    public AccountResponseDto createDepositAndTRYAccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoTRY())
                .money(new BigDecimal(0))
                .accountType(AccountType.DEPOSIT)
                .currencyTypes(CurrencyTypes.TRY)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);
    }

    @Override
    public AccountResponseDto createSavingAndUSDAccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoUSD())
                .money(new BigDecimal(0))
                .accountType(AccountType.SAVING)
                .currencyTypes(CurrencyTypes.USD)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);
    }

    @Override
    public AccountResponseDto createDepositAndUSDAccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoUSD())
                .money(new BigDecimal(0))
                .accountType(AccountType.DEPOSIT)
                .currencyTypes(CurrencyTypes.USD)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);
    }

    @Override
    public AccountResponseDto createSavingAndEURccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoEUR())
                .money(new BigDecimal(0))
                .accountType(AccountType.SAVING)
                .currencyTypes(CurrencyTypes.EUR)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);
    }

    @Override
    public AccountResponseDto createDepositAndEURAccount(AccountRequestDto accountRequestDto) {
        Customer byId = this.customerService.getById(accountRequestDto.getCustomerId());

        //Mapping requestDto to entity
        Account createAccountRequest = Account.builder()
                .customer(byId)
                .ibanNo(NumberGenerator.generatedIbanNoEUR())
                .money(new BigDecimal(0))
                .accountType(AccountType.DEPOSIT)
                .currencyTypes(CurrencyTypes.EUR)
                .build();
        Account save = this.accountRepository.save(createAccountRequest);

        return accountResponseDto(save);
    }

    @Override
    public boolean deleteAccount(long id) {

        this.accountRepository.deleteById(id);

        return  true;
    } 




    @Override
    public Account getById(Long id) {
          Optional<Account> findById = this.accountRepository.findById(id);
          return findById.orElseThrow(EntityNotFoundException::new);
    
    }

    private AccountResponseDto accountResponseDto(Account account){
        return AccountResponseDto.builder()
                .customerNo(account.getCustomer().getCustomerNo())
                .userFullName(account.getCustomer().getFirstname()+" "+account.getCustomer().getLastname())
                .ibanNo(account.getIbanNo())
                .accountType(account.getAccountType())
                .currencyType(account.getCurrencyTypes())

                .money(account.getMoney())
                .build();
    }

    
}
