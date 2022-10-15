package org.kodluyoruz.mybank.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CardResponseDto {
    private  String CardNo;
    private String cvc;
    private LocalDate expiredDate;
    private String customerName;
}
