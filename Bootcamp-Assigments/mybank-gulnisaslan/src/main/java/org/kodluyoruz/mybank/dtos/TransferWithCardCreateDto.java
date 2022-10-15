package org.kodluyoruz.mybank.dtos;

import org.kodluyoruz.mybank.enums.Currency;

import java.math.BigDecimal;

public class TransferWithCardCreateDto {
    private  String cardNo;
    private BigDecimal quantityToBeSendMoney;
    private Currency currency;
}
