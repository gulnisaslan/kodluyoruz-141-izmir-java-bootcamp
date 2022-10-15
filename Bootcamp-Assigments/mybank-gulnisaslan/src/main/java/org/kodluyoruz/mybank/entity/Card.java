package org.kodluyoruz.mybank.entity;

import lombok.*;
import org.kodluyoruz.mybank.enums.CardType;
import org.kodluyoruz.mybank.utils.NumberGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="cards")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="card_no")
    private  String CardNo;
    @Column(name="cvc")
    private String cvc;

    @Column(name="card_type")
    @Enumerated(EnumType.STRING)
    private CardType cardType;


    @Column(name="expired_date")
    private LocalDate expiredDate=LocalDate.now().plusYears(5);

    @Column(name="created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
    
    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
//
//    @JoinTable(
//          name = "creditCards",
//            joinColumns =@JoinColumn(name = "card_id",referencedColumnName = "id"),
//
//
//    )


}
