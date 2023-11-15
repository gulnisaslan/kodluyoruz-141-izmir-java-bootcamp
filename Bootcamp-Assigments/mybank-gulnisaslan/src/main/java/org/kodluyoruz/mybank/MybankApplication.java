package org.kodluyoruz.mybank;

import org.kodluyoruz.mybank.user.utils.NumberGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybankApplication.class, args);


        System.out.println(NumberGenerator.generatedCustomerNo());
       
    }




}
