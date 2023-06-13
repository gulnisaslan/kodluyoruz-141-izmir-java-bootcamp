package org.kodluyoruz.mybank.card.controller;

import org.kodluyoruz.mybank.card.dto.CardRequestDto;
import org.kodluyoruz.mybank.card.dto.CardResponseDto;
import org.kodluyoruz.mybank.card.service.CardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(name="api/v1/cards")

public class CardController {
    private  final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/createDebitCard")
   public CardResponseDto createDebitCard(@RequestBody CardRequestDto cardRequestDto){
       return this.cardService.createDebitCard(cardRequestDto);
   }
   @PostMapping("/createCreditCard")
    public CardResponseDto createCreditCard(@RequestBody CardRequestDto cardRequestDto){
        return this.cardService.createCreditCard(cardRequestDto);
    }
    
}
