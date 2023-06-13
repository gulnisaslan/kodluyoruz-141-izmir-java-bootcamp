package org.kodluyoruz.mybank.user.service.businessRules;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BusinessData {
    private BigDecimal accountBalance;
    private BigDecimal creditCardDebt;
    
}
