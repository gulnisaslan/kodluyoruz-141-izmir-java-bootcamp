package org.kodluyoruz.mybank.card.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.kodluyoruz.mybank.account.model.Account;
import org.kodluyoruz.mybank.card.enums.CardType;
import org.kodluyoruz.mybank.core.model.AbstractEntity;
import org.kodluyoruz.mybank.user.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cards")
@Getter
@Setter
@Builder
@ToString(callSuper = true)
public class Card extends AbstractEntity {

    @Column(name="card_no")
    private String cardNo;
    @Column(name="cvc")
    private String cvc;
    @Column(name="create_card_date")
    private LocalDate createCardDate;
    @Column(name="expired_card_date")
    private LocalDate expiredCardDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "card_types")
    private CardType cardType;
    @Column(name = "password")
    @Size(max = 4,min = 4,message = "password must be 4 numbers")
    private String password;
    private BigDecimal money;

    @ManyToOne(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    Customer customer;

  
    @ManyToOne(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id",referencedColumnName = "id")
    Account account;
    
}
