package org.kodluyoruz.mybank.controller.responseDtoMapping;

import org.kodluyoruz.mybank.dtos.AccountResponseDto;
import org.kodluyoruz.mybank.dtos.CardResponseDto;
import org.kodluyoruz.mybank.dtos.UserResponseDto;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.Card;
import org.kodluyoruz.mybank.entity.User;

public class ResponseDtoMappingForController {

    public static UserResponseDto createUserForResponseDto(User user) {
        return UserResponseDto.builder()
                .customerNo(user.getCustomerNo())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .identityNumber(user.getIdentityNumber())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .birthDate(user.getBirthDate())
                .build();
    }

    //To Do Account Create Response
   public static AccountResponseDto toAccount(Account account) {
        User user = account.getUser();
       return AccountResponseDto.builder()
                .userResponseDto(createUserForResponseDto(user))
                .accountType(account.getAccountType())
                .currency(account.getCurrency())
                //.money(account.getMoney())
                .ibanNo(account.getIbanNo())
                .entryDateTime(account.getEntryDateTime())
                .build();
    }
    public static CardResponseDto toCard(Card card){
       return CardResponseDto.builder()
                .CardNo(card.getCardNo())
                .cvc(card.getCvc())
                .customerName(card.getUser().getFirstname()+" "+card.getUser().getLastname())
                .expiredDate(card.getExpiredDate())
                .build();
    }




}


