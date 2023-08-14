package org.kodluyoruz.mybank.account.dto;


import org.kodluyoruz.mybank.account.enums.AccountType;
import org.kodluyoruz.mybank.account.enums.CurrencyTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequestDto {


    private Long customerId;
    
}
