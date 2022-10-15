package org.kodluyoruz.mybank.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kodluyoruz.mybank.enums.Currency;

import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferResponseDto {
    private String senderFullName;
    private String senderCustomerNo;
    private String senderIban;
    private  String receiverFullname;
    private String receiverIban;
    private String receiverCustomerNo;
    private BigDecimal quantityToBeSendMoney;
    private Currency currency;


}
