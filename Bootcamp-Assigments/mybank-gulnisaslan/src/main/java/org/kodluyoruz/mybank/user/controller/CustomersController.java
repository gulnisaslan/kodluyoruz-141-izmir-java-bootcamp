package org.kodluyoruz.mybank.user.controller;

import org.kodluyoruz.mybank.user.dto.CustomerRequestDto;
import org.kodluyoruz.mybank.user.dto.CustomerResponseDto;
import org.kodluyoruz.mybank.user.dto.CustomerUpdateDto;
import org.kodluyoruz.mybank.user.service.CustomerService;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequestMapping(value="/api/v1/customers/")
@RestController
@RequiredArgsConstructor
public class CustomersController {
    private final CustomerService customerService;

    @PostMapping(value="createCustomer")
    public CustomerResponseDto createCustomer(@RequestBody CustomerRequestDto customerRequestDto) {
        return this.customerService.createCustomer(customerRequestDto);
        
    }
    @PutMapping(value="updateCustomer")
    public CustomerUpdateDto updateCustomer(@RequestBody CustomerUpdateDto customerRequestDto) {
        return this.customerService.updateCustomer(customerRequestDto);
        
    }
    @DeleteMapping(value = "deleteCustomer/identitynumber={identitynumber}")
    public  boolean deleteCustomerByIdentityNumber(@PathVariable("identitynumber") Long identityNumber){
        return  this.customerService.deleteCustomerIdentityNumber(identityNumber);
    }
    
}
