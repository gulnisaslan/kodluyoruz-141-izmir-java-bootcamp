package org.kodluyoruz.mybank.service.impl;

import org.kodluyoruz.mybank.dtos.TransferCreateDto;
import org.kodluyoruz.mybank.dtos.TransferWithCardCreateDto;
import org.kodluyoruz.mybank.entity.Account;
import org.kodluyoruz.mybank.entity.Transfer;
import org.kodluyoruz.mybank.repository.TransferRepository;
import org.kodluyoruz.mybank.service.AccountService;
import org.kodluyoruz.mybank.service.TransferService;
import org.kodluyoruz.mybank.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    private final TransferRepository transferRepository;
    private  final AccountService accountService;
    private  final UserService userService;


    public TransferServiceImpl(TransferRepository transferRepository, AccountService accountService, UserService userService) {
        this.transferRepository = transferRepository;
        this.accountService = accountService;
        this.userService = userService;
    }


    @Override
    public Transfer transferWithIban(TransferCreateDto transferCreateDto) {
        Transfer fromIban = transferRepository.findByAccount_ibanNo(transferCreateDto.getFromIban());
        Transfer toIban  = transferRepository.findByAccount_ibanNo(transferCreateDto.getToIban());





        return null;
    }

    @Override
    public Transfer paymentWithCard(TransferWithCardCreateDto transferWithCardCreateDto) {
        return null;
    }
}
  
