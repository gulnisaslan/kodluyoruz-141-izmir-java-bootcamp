package org.kodluyoruz.mybank.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerUpdateDto {
    
    private Long  identityNumber;
    
    private String email;
	
    private String phoneNumber;

}
