package org.kodluyoruz.mybank.service;

import org.kodluyoruz.mybank.dtos.TransferCreateDto;
import org.kodluyoruz.mybank.dtos.TransferWithCardCreateDto;
import org.kodluyoruz.mybank.entity.Transfer;

public interface TransferService {
	
	Transfer transferWithIban(TransferCreateDto transferCreateDto);
	
	Transfer paymentWithCard(TransferWithCardCreateDto transferWithCardCreateDto);
	

}
