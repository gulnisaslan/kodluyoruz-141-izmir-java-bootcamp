package org.kodluyoruz.mybank.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import org.kodluyoruz.mybank.enums.AccountType;
import org.kodluyoruz.mybank.enums.Currency;

@Data
@Builder
public class AccountResponseDto {

  private UserResponseDto userResponseDto;
  private AccountType accountType;
  private Currency currency;
  private Double money;
  private String ibanNo;
  private LocalDateTime entryDateTime;
}
