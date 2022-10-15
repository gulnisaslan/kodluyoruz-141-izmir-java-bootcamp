package org.kodluyoruz.mybank.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.repository.UserRepository;
import org.kodluyoruz.mybank.utils.NumberGenerator;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl serviceImpl;


    @Test
    void createUser() {
    	User user = new User();
		User user1 = createUser(user);
		when(userRepository.save(user1)).thenReturn(user1);

		serviceImpl.createUser(user1);
		verify(userRepository,times(1)).save(user1);


	}

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
    
    private User createUser(User user) {
    	return User.builder()
    			.id(1L)
    			.identityNumber(12345678910L)
    			.firstname("Gülnisa")
    			.lastname("Aslan")
    			.customerNo(NumberGenerator.customerNoGenerator())
    			.email("gulnisaslan@hotmail.com")
    			.phoneNumber("5433121784")
    			.createdDate(LocalDate.now())
    			.build();
    }
}