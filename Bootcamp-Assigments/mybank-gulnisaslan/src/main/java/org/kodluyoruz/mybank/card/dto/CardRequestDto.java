package org.kodluyoruz.mybank.card.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardRequestDto {
    private Long accountId;
    private Long customerId;
}
