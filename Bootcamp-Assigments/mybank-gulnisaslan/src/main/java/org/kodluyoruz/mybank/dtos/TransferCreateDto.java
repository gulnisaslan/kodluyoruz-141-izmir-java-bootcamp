package org.kodluyoruz.mybank.dtos;

import lombok.Builder;
import lombok.Data;
import org.kodluyoruz.mybank.enums.Currency;

import java.math.BigDecimal;

@Data
@Builder
public class TransferCreateDto {
    private String fromIban;
    private String toIban;
    private BigDecimal quantityToBeSendMoney;
    private Currency currency;

}
