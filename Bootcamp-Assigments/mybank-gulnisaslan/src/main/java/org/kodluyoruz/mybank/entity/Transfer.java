package org.kodluyoruz.mybank.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.kodluyoruz.mybank.enums.Currency;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "transfers")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @NotNull(message = "Gönderen kişinin iban alanı boş olamaz.")
    @Column(name="from_iban")
    private  String fromIban;

    @NotNull(message = "Alıcının iban alanı eksik olamaz.")
    @Column(name = "to_iban")
    private  String toIban;

    @NotNull(message = "Gönderilecek miktar alanı boş olamaz.")
    @Column(name="quantity_to_be_send_money")
    private BigDecimal quantityToBeSendMoney;

    @Enumerated(EnumType.STRING)
    @Column(name="currency")
    private Currency currency;


    @Column(name="send_date")
    private LocalDate sendDate = LocalDate.now();

    @Column(name="is_send")
    private Boolean isSend;

    @ManyToOne
    @JoinTable(
            name="acounts_transfers",
            joinColumns = @JoinColumn(name="transfer_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="account_id",referencedColumnName =  "id")

    )
    public Account account;

}
