package org.kodluyoruz.mybank.service.impl;

import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.User;
import org.kodluyoruz.mybank.repository.UserRepository;
import org.kodluyoruz.mybank.service.AccountService;
import org.kodluyoruz.mybank.service.UserService;
import org.kodluyoruz.mybank.utils.NumberGenerator;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRepository;
	


	public UserServiceImpl(UserRepository userRepository) {

		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		user.setCustomerNo(NumberGenerator.customerNoGenerator());
		return this.userRepository.save(user);


	}

	@Override
	public User updateUser(User user) {
	return this.userRepository.save(user);
	}

	@Override
	public User getById(Long id) {
		return  this.userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Not Found user id"+ id));
	}

	@Override
	public User getAllUsers() {
		return (User) this.userRepository.findAll();
	}

	@Override
	public Boolean deleteById(Long id) {
		User byId = getById(id);
		this.userRepository.delete(byId);


		return true;
	}

}