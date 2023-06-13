package org.kodluyoruz.mybank.account.model;



import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import org.kodluyoruz.mybank.account.enums.AccountType;
import org.kodluyoruz.mybank.account.enums.CurrencyTypes;
import org.kodluyoruz.mybank.card.model.Card;
import org.kodluyoruz.mybank.core.model.AbstractEntity;
import org.kodluyoruz.mybank.user.model.Customer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="accounts")
@Builder
public class Account extends AbstractEntity{
    @NotBlank
    @Column(name = "iban_no")
    private String ibanNo ;
    
    @Column(name="account_type")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    
    @Column(name="currency_type")
    @Enumerated(EnumType.STRING)
    private CurrencyTypes currencyTypes;  
   
    @Column(name = "money") 
    private BigDecimal money;

    @Builder.Default
	@Column(name="created_date")
	private LocalDateTime createdDate= LocalDateTime.now();


	@Column(name="entry_date_time")
	private LocalDateTime entryDateTime;


	@Column(name="updated_date")
	private LocalDateTime updatedDate;

    @JsonIgnore
	@ManyToOne
	@JoinTable(
			name = "customers_accounts",
			joinColumns = @JoinColumn(name = "account_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "customer_id",referencedColumnName = "id")
	)
	private Customer customer;

    @OneToMany
    @JsonIgnore
    private List< Card> card;
   
    



}
