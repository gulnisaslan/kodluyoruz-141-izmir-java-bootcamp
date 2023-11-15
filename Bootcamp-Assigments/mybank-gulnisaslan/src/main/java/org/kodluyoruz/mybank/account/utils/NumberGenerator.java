package org.kodluyoruz.mybank.account.utils;

import java.util.Random;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class NumberGenerator {
    static Integer maxValue = 10000;
    static Integer minValue = 1000;
    static String ibanNoTRY = "TR7400 0000 0000 0001 ";
    static String ibanNoUSD = "TR9400 0000 0000 0001 ";
    static String ibanNoEUR = "TR8400 0000 0000 0001 ";


    public static String generatedIbanNoTRY() {
        Random randomCustomerNo = new Random();
        Random randomCustomerNo2 = new Random();

        Integer ibanNo = randomCustomerNo.nextInt((maxValue - minValue) + 999);
        Integer ibanNo2 = randomCustomerNo2.nextInt((maxValue - minValue) + 999);

        StringBuilder ibanNoGenerateToString = new StringBuilder(ibanNoTRY.toUpperCase() + ibanNo.toString() + ibanNo2.toString());

        generatedIbanNoLength(ibanNoGenerateToString.toString());

        return ibanNoGenerateToString.toString();
    }

    public static String generatedIbanNoUSD() {
        Random randomCustomerNo = new Random();
        Random randomCustomerNo2 = new Random();

        Integer ibanNo = randomCustomerNo.nextInt((maxValue - minValue) + 999);
        Integer ibanNo2 = randomCustomerNo2.nextInt((maxValue - minValue) + 999);

        StringBuilder ibanNoGenerateToString = new StringBuilder(ibanNoUSD.toUpperCase() + ibanNo.toString() + ibanNo2.toString());
        generatedIbanNoLength(ibanNoGenerateToString.toString());
        return ibanNoGenerateToString.toString();
    }

    public static String generatedIbanNoEUR() {
        Random randomCustomerNo = new Random();
        Random randomCustomerNo2 = new Random();

        Integer ibanNo = randomCustomerNo.nextInt((maxValue - minValue) + 999);
        Integer ibanNo2 = randomCustomerNo2.nextInt((maxValue - minValue) + 999);

        StringBuilder ibanNoGenerateToString = new StringBuilder(ibanNoEUR.toUpperCase() + ibanNo.toString() + ibanNo2.toString());
        generatedIbanNoLength(ibanNoGenerateToString.toString());
        return ibanNoGenerateToString.toString();
    }

    private static boolean generatedIbanNoLength(String ibanNoGenerateToString) {
        if (ibanNoGenerateToString.length() != 26)
            return true;
        return  false;
    }

}
