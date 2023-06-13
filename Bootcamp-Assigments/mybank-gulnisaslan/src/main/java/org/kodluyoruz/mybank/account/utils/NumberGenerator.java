package org.kodluyoruz.mybank.account.utils;

import java.util.Random;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class NumberGenerator {
    static Integer maxValue = 10000;
    static Integer minValue =1000;
    static String ibanNoString  = "TR7400 0000 0000 0001 ";
    public static String generatedIbanNo() {
        Random randomCustomerNo =  new Random();
        Random randomCustomerNo2 =  new Random();
       
        Integer ibanNo = randomCustomerNo.nextInt((maxValue-minValue)+999);
        Integer ibanNo2 = randomCustomerNo2.nextInt((maxValue-minValue)+999);
         
       String ibanNoGenerateToString = ibanNoString + ibanNo.toString() + ibanNo2.toString();
        return ibanNoGenerateToString;
    }
}
