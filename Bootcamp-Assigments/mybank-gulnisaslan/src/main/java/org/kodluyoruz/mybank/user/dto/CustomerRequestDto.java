package org.kodluyoruz.mybank.user.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerRequestDto {

	private Long  identityNumber;

	private String firstname;

	private String lastname;
	
	private LocalDate birthDate;
	
    private String email;

	private String phoneNumber;
}
