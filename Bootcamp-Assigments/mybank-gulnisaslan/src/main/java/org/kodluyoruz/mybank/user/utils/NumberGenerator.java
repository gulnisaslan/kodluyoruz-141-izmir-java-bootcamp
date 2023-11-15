package org.kodluyoruz.mybank.user.utils;

import java.util.Random;


import lombok.RequiredArgsConstructor;


public class NumberGenerator { 
    static Integer maxValue = 10000;
    static Integer minValue =1000;
    public static String generatedCustomerNo() {
        Random randomCustomerNo =  new Random();
        Random randomCustomerNo2 =  new Random();
       
        Integer customerNo = randomCustomerNo.nextInt((maxValue-minValue)+999);
        Integer customerNo2 = randomCustomerNo2.nextInt((maxValue-minValue)+999);

        StringBuilder genetartedCustomerNo = new StringBuilder(customerNo.toString() + " " + customerNo2.toString());

        isLengthCustomerNo(genetartedCustomerNo.toString());

        return genetartedCustomerNo.toString();
       
    }
    private static boolean isLengthCustomerNo(String customerNo){
        if(customerNo.length() != 8)
            return false ;
        return true;

    }

}
