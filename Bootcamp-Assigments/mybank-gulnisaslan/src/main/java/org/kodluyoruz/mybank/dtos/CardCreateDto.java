package org.kodluyoruz.mybank.dtos;

import lombok.Data;
import org.kodluyoruz.mybank.enums.CardType;

@Data
public class CardCreateDto {
    private long userId;
    private long accountId;
    private CardType cardType;
}
