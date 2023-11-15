package org.kodluyoruz.mybank.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransferWithIbanRequestDto {
    private  String senderIban;
    private String receiverIban;
    private BigDecimal measureMoney;
    private  String receiverMessage;
}
