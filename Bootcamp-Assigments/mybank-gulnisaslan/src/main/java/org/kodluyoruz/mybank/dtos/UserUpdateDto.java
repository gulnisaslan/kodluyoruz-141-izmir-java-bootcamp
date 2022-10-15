package org.kodluyoruz.mybank.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kodluyoruz.mybank.entity.User;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserUpdateDto {
    private Long identityNumber;
    private String email;
    private String phoneNumber;
    public User toUserUpdate(){
        return  User.builder()
                .identityNumber(this.identityNumber)
                .email(this.email)
                .phoneNumber(this.phoneNumber)
                .build();
    }
}
