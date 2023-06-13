package org.kodluyoruz.mybank.card.dto;

import java.time.LocalDate;

import org.kodluyoruz.mybank.card.model.Card;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardResponseDto {
    private String cardNo;
    private String cvc;
    private String fullName;
    private LocalDate expiredCardDate;
    private String  password;

    public static CardResponseDto toCard(Card card){
       return CardResponseDto.builder()
       .cardNo(card.getCardNo())
       .cvc(card.getCvc())
       .expiredCardDate(card.getExpiredCardDate())
       .fullName(card.getCustomer().getFirstname()+" "+card.getCustomer().getLastname())
       .password(card.getPassword())
       .build();
    }
}
