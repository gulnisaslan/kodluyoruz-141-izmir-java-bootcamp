package org.kodluyoruz.mybank.transfer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kodluyoruz.mybank.core.model.AbstractEntity;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transfer_with_iban")
@Data
public class TransferWithIban extends AbstractEntity {
    @NotBlank
    private  String senderIban;
    @NotBlank
    private String receiverIban;
    @NotBlank
    @Min(1)
    private BigDecimal measureMoney;
    private  String receiverMessage;
}
