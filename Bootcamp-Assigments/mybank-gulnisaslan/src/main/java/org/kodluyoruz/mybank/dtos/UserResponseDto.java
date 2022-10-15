package org.kodluyoruz.mybank.dtos;

import java.time.LocalDate;


import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserResponseDto {
	private String customerNo;
	private String firstname;
	private String lastname;
	private Long identityNumber;
	private String email;
	private String phoneNumber;
    private LocalDate birthDate;






}
