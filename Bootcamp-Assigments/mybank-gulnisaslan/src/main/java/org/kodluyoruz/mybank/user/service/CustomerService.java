package org.kodluyoruz.mybank.user.service;

import org.kodluyoruz.mybank.user.dto.CustomerRequestDto;
import org.kodluyoruz.mybank.user.dto.CustomerResponseDto;
import org.kodluyoruz.mybank.user.dto.CustomerUpdateDto;
import org.kodluyoruz.mybank.user.model.Customer;


public interface CustomerService {
    CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto);
    CustomerUpdateDto updateCustomer(CustomerUpdateDto customerUpdateDto);
    boolean deleteCustomer(Long id);
    boolean deleteCustomerIdentityNumber(Long identityNumber);

    Customer getById(Long id);

}
