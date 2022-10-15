package org.kodluyoruz.mybank.controller;

import org.kodluyoruz.mybank.controller.responseDtoMapping.ResponseDtoMappingForController;
import org.kodluyoruz.mybank.dtos.CardCreateDto;
import org.kodluyoruz.mybank.dtos.CardResponseDto;
import org.kodluyoruz.mybank.entity.Card;
import org.kodluyoruz.mybank.service.CardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cards")
public class CardsController {
    private  final CardService cardService;

    public CardsController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(value = "/createCard")
    public CardResponseDto createCard(@RequestBody CardCreateDto cardCreateDto){
        Card card = cardService.createCard(cardCreateDto);
        return ResponseDtoMappingForController.toCard(card);

    }
}
