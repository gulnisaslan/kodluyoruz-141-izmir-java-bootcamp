package org.kodluyoruz.mybank.service;

import org.kodluyoruz.mybank.entity.User;



public interface UserService {
	
   User createUser(User user);
    User updateUser(User user);
    User getById(Long id);
    User getAllUsers();

    Boolean deleteById(Long id);

	
	
	

}
