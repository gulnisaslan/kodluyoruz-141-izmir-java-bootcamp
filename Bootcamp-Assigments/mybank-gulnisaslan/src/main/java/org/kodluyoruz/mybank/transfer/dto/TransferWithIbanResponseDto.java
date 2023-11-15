package org.kodluyoruz.mybank.transfer.dto;

import java.math.BigDecimal;

public class TransferWithIbanResponseDto {
    private String senderFullName;
    private  String receiverFullName;
    private String senderIban;
    private  String receiverIban;
    private BigDecimal measureMoney;
    private  String message;
}
