package org.kodluyoruz.mybank.user.service.businessRules;


import org.kodluyoruz.mybank.user.exceptionHandling.AccountAndCreditException;
import org.kodluyoruz.mybank.user.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class BusinessRule1 implements BusinessRule {
   
     @Override
    public boolean validateRule(BusinessData businessData) {
        if(!businessData.getAccountBalance().equals(0)&& !businessData.getCreditCardDebt().equals(0)){
            throw new AccountAndCreditException("Your Account has money or credit card debt");
        }
            
        return true;
    }

    
}