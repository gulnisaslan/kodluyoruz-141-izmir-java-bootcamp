package org.kodluyoruz.mybank.core.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

@MappedSuperclass
public  class  AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(name="created_date")
    private LocalDateTime createdDate= LocalDateTime.now();


}
