package org.kodluyoruz.mybank.card.service.util;

import java.util.Random;

public class NumberGenerator {
    static Integer maxValue = 10000;
    static Integer minValue =1000;
    public static String generatedCardNo() {
        Random randomCard =  new Random();
        Random randomCard2 =  new Random();
        Random randomCard3 =  new Random();
        Random randomCard4 =  new Random();
       
        Integer cardNo = randomCard.nextInt((maxValue-minValue)+999);
        Integer cardNo2 = randomCard2.nextInt((maxValue-minValue)+999);
        Integer cardNo3 = randomCard3.nextInt((maxValue-minValue)+999);
        Integer cardNo4 = randomCard4.nextInt((maxValue-minValue)+999);

       StringBuilder cardNoString = new StringBuilder(cardNo.toString() + cardNo2.toString() +
               cardNo3.toString() + cardNo4.toString());

       if(cardNoString.length()!=16){
          return cardNoString.toString();
       }
       return cardNoString.toString();
    }

    static Integer maxValueCvc = 999;
    static Integer minValueCvc =100;
    public static String generatedCvcNo() {
        Random randomCard =  new Random();
       
        Integer cvc= randomCard.nextInt((maxValueCvc-minValueCvc)+999);
       
         
       return cvc.toString();
    }

    static Integer maxValuePassword = 999;
    static Integer minValuePassword =100;
    public static String generatedPassword() {
        Random randomCard =  new Random();
       
        Integer password= randomCard.nextInt((maxValuePassword-minValuePassword)+999);
       
         
       return password.toString();
    }
}
