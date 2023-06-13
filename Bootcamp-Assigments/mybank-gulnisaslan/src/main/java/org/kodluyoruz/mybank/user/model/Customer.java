package org.kodluyoruz.mybank.user.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.kodluyoruz.mybank.account.model.Account;
import org.kodluyoruz.mybank.core.model.AbstractEntity;
import org.kodluyoruz.mybank.user.utils.NumberGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="customers")
public class Customer extends AbstractEntity{
    @NotNull
	@Column(name = "identity_number" ,unique = true)
	@Size(min = 11 ,max= 11 ,message = "Kimlik numarası 11 haneli olmalı")
	private Long  identityNumber;

	@Column(name="first_name")
	@Size(min = 1 ,max=30, message="İsim en fazla 50 karakter olmalı")
	@Min(value =1)
	@Max(value = 30)
	private String firstname;

	@Column(name="last_name")
	@Size(min = 1 ,max=50, message="Soyad en fazla 50 karakter olmalı")
	private String lastname;

	@Column(name="birth_date")
	private LocalDate birthDate;
	
	@Column(name="email",unique = true)
	@NotNull
	@Email(message  ="Email formatında olmalı.")
	private String email;
	
	@Column(name="phone_number")
	@NotNull
	@Size(min = 10,max=10,message="Telefon numarasının uzunluğu en fazla 10 karakterdir"  )
	private String phoneNumber;

	@Column(name="customer_no",unique=true)
	private String customerNo = NumberGenerator.generatedCustomerNo();

	
	@Column(name="created_date")
	private LocalDate createdDate= LocalDate.now();

	@Column(name="updated_date")
	private LocalDateTime updatedDate= LocalDateTime.now();



	@JsonIgnore
	@OneToMany(mappedBy = "customer",cascade = CascadeType.REMOVE)
	private List<Account> account;
    

   
}
