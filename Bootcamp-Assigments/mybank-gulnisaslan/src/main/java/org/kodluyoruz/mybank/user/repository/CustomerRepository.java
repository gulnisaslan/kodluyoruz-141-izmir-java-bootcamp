package org.kodluyoruz.mybank.user.repository;

import java.util.Optional;

import org.kodluyoruz.mybank.user.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>{
    Optional<Customer> findByIdentityNumber(Long identityNumber);
    boolean deleteByIdentityNumber(Long identityNumber);
    boolean existsByIdentityNumber(Long identityNumber);
}
