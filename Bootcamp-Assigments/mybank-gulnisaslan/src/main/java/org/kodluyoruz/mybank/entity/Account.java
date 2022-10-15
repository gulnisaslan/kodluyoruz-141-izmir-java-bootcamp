package org.kodluyoruz.mybank.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.kodluyoruz.mybank.enums.AccountType;
import org.kodluyoruz.mybank.enums.Currency;

import org.kodluyoruz.mybank.utils.NumberGenerator;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Builder(access = AccessLevel.PUBLIC)
@Entity
@Data
@Table(name="accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(name="account_type")
	AccountType accountType;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "currency")
	Currency currency;

	@Column(name="money")
	private BigDecimal money= BigDecimal.valueOf(0.0);



	@Column(name="iban_no",unique = true)
	private String ibanNo=NumberGenerator.ibanGenerator();

	@Builder.Default
	@Column(name="created_date")
	private LocalDate createdDate= LocalDate.now();

	@Column(name="entry_date_time")
	private LocalDateTime entryDateTime= LocalDateTime.now();


	@Column(name="updated_date")
	private LocalDate updatedDate= LocalDate.now();


	@JsonIgnore
	@ManyToOne
	@JoinTable(
			name = "users_accounts",
			joinColumns = @JoinColumn(name = "account_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id")
	)
	private User user;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name = "card_id")
	Card card;

	@JsonIgnore
	@OneToMany(mappedBy = "account",cascade = CascadeType.REMOVE)
	private List<Transfer>  transfers;


}
