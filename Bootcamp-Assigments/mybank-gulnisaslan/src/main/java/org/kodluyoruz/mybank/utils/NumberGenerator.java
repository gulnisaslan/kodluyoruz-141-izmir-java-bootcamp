package org.kodluyoruz.mybank.utils;

import java.util.Random;

public class NumberGenerator {

	public static String ibanGenerator() {
		 Random numberGenerator = new Random();
		 Random numberGenerator1 = new Random();
		 Integer numGenerator1= numberGenerator1.nextInt(9999);
		 Integer numGenerator = numberGenerator.nextInt(9999);
		String iban = "TR0074"+" "+"0000"+" "+"0000"+" "+ numGenerator.toString()+" "
	    + numGenerator1.toString();
		return iban;
		}

	public static String customerNoGenerator() {
		Random numberGenerator = new Random();
		Random numberGenerator1 = new Random();
		Integer numGenerator1= numberGenerator1.nextInt(9999);
		Integer numGenerator = numberGenerator.nextInt(9999);
			String customerNo =  numGenerator.toString()+" "
		    + numGenerator1.toString();
			return customerNo;
	}

	public  static  String cardNumberGenerator(){
	     Random numberGenerator = new Random();
		 Random numberGenerator1 = new Random();
		 Random numberGenerator2 = new Random();
	     Random numberGenerator3 = new Random();
		Integer  no1 = numberGenerator.nextInt(9999);
		Integer  no2 = numberGenerator1.nextInt(9999);
		Integer  no3 = numberGenerator2.nextInt(9999);
		Integer  no4 = numberGenerator3.nextInt(9999);


		String cardNo=no1.toString()+" "+no2.toString()+" "+no3.toString()+" "+no4.toString().toString();
		return cardNo;
	}

	public  static  String cardCvcGenerator(){
		 Random numberGenerator = new Random();

		Integer  no1 = numberGenerator.nextInt(999);
		String cvc=no1.toString();
		return cvc;
	}



}
