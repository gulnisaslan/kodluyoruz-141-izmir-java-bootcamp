package org.kodluyoruz.mybank.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.kodluyoruz.mybank.utils.NumberGenerator;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Data
@Builder
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;

	@NotNull

	@Column(name = "identity_number" ,unique = true)
	@Size(min = 11 ,max= 11 ,message = "Kimlik numarası 11 haneli olmalı")
	private Long  identityNumber;

	@Column(name="first_name")
	@Size(min = 1 ,max=50, message="İsim en fazla 50 karakter olmalı")
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
	private String customerNo;

	@Builder.Default
	@Column(name="created_date")
	private LocalDate createdDate= LocalDate.now();

	@Column(name="updated_date")
	private LocalDateTime updatedDate= LocalDateTime.now();

	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
	private List<Account> account;

	@JsonIgnore
	@OneToOne(mappedBy = "user",cascade = CascadeType.REMOVE)
	Card card;





}
