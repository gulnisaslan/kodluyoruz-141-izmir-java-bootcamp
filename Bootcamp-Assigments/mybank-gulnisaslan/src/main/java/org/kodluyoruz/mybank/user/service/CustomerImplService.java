package org.kodluyoruz.mybank.user.service;



import java.math.BigDecimal;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.kodluyoruz.mybank.card.model.Card;
import org.kodluyoruz.mybank.core.exceptionHandling.AccountAndCreditException;
import org.kodluyoruz.mybank.user.dto.CustomerRequestDto;
import org.kodluyoruz.mybank.user.dto.CustomerResponseDto;
import org.kodluyoruz.mybank.user.dto.CustomerUpdateDto;
import org.kodluyoruz.mybank.user.model.Customer;
import org.kodluyoruz.mybank.user.repository.CustomerRepository;

import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerImplService implements CustomerService{

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;



    @Override
    public CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto) {
   
        Customer saveCustomer= this.customerRepository.save(modelMapper.map(customerRequestDto, Customer.class));
       
       return this.modelMapper.map(saveCustomer, CustomerResponseDto.class);
    }

    @Override
    public CustomerUpdateDto updateCustomer(CustomerUpdateDto customerUpdateDto) {

        Customer updateCustomer =  this.customerRepository.findByIdentityNumber(customerUpdateDto.getIdentityNumber())
        .orElseThrow(() -> new EntityNotFoundException("Customer not found"));
       
        updateCustomer.setEmail(customerUpdateDto.getEmail()== null ?
         updateCustomer.getEmail() : customerUpdateDto.getEmail());
        updateCustomer.setPhoneNumber(customerUpdateDto.getPhoneNumber() == null ?
        updateCustomer.getPhoneNumber() : customerUpdateDto.getPhoneNumber());
        
        Customer customer = this.customerRepository.save(updateCustomer);
        
        return modelMapper.map(customer,CustomerUpdateDto.class);
       
    }
    /* 
            To DO : business rules did not added  yet : if account and cards have money or debt 
            customer was not going to deleted 
    */
    @Override
    public boolean deleteCustomerIdentityNumber(Long identityNumber) {
        Customer findByIdentityNumber = findByIdentityNumber = this.customerRepository.findByIdentityNumber(identityNumber)
                .orElseThrow(() -> new EntityNotFoundException());
        findByIdentityNumber.getAccount().stream().map(account -> account.getCustomer().getIdentityNumber()).findFirst().orElseThrow(()->new AccountAndCreditException(""));
        BigDecimal money = findByIdentityNumber.getAccount().stream().map(account -> account.getMoney()).findAny().orElseThrow(() -> new AccountAndCreditException("Hesabınızda para bulunmaktadır"));
        BigDecimal cardMoney = findByIdentityNumber.getCards().stream().map(card -> card.getMoney()).findAny().orElseThrow(() -> new AccountAndCreditException("Kartınızda para bulunmaktadır"));

        this.customerRepository.deleteByIdentityNumber(findByIdentityNumber.getIdentityNumber());


        return true;

    }
    @Override
    public boolean deleteCustomer(Long id) {
        return true;
    }

    @Override
    public Customer getById(Long id) {
        return this.customerRepository.findById(id).orElseThrow(()->new EntityNotFoundException());
    }
    
}
