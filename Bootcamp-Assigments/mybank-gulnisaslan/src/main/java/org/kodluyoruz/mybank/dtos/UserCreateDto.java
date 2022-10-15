package org.kodluyoruz.mybank.dtos;

import java.time.LocalDate;
import lombok.*;
import org.kodluyoruz.mybank.entity.User;

@Setter
public class UserCreateDto {

  private String firstname;
  private String lastname;
  private Long identityNumber;
  private LocalDate birthDate;
  private String email;
  private String phoneNumber;

  public User toUser() {
    return User
      .builder()
      .firstname(this.firstname)
      .lastname(this.lastname)
      .identityNumber(this.identityNumber)
      .birthDate(this.birthDate)
      .email(this.email)
      .phoneNumber(this.phoneNumber)
      .build();
  }
}
