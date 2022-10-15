package org.kodluyoruz.mybank.dtos;

import lombok.Builder;
import lombok.Data;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.enums.AccountType;
import org.kodluyoruz.mybank.enums.Currency;

@Data
@Builder
public class AccountCreateDto {

    private Long  id;
    private AccountType accountType;
    private Currency currency;






}
