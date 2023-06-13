package org.kodluyoruz.mybank.config;

import java.util.List;

import org.kodluyoruz.mybank.user.service.businessRules.BusinessData;
import org.kodluyoruz.mybank.user.service.businessRules.BusinessRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessRulesConfig {
    @Bean("deleteCustomerRule")
    public List<BusinessRule> configBusinessRule(List<BusinessRule> rules) {
       return rules;
        
        
    }
}
