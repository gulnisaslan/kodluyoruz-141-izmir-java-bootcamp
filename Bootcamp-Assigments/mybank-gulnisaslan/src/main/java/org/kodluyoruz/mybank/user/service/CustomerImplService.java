package org.kodluyoruz.mybank.user.service;



import javax.persistence.EntityNotFoundException;
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
        .orElseThrow(() -> new EntityNotFoundException());
       
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
