package org.kodluyoruz.mybank.account.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import org.kodluyoruz.mybank.account.enums.AccountType;
import org.kodluyoruz.mybank.account.enums.CurrencyTypes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountResponseDto {
    private String customerNo;
    private String userFullName;
    private String ibanNo;
    private AccountType accountType;
    private CurrencyTypes currencyType; 
    private LocalDateTime createDate;
    private BigDecimal money;
}
