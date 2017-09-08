package com.MyComp.MyVoteMyOpinion.utility;

import java.util.Random;
import java.util.Scanner;

public class Testing {
	
	
	public static void getCount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Length of String Generate");
		resultValues = scanner.nextInt();
	}
	
	
	private static int resultValues;
	
	private static final String NUMBERS = "0123456789";
	private static final String UPPER_ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
	private static final String SPECIALCHARACTERS = "@#$%&*";
	private static final int MINLENGTHOFPASSWORD = 8;
	//private static final int MINLENGTHOFPASSWORD = resultValues;

	public static String getRandomPassword() {
		//getCount();
	    StringBuilder password = new StringBuilder();
	    int j = 0;
	    for (int i = 0; i < MINLENGTHOFPASSWORD; i++) {
	        password.append(getRandomPasswordCharacters(j));
	        j++;
	        if (j == 4) {
	            j = 0;
	        }
	    }
	    return password.toString();
	}

	private static String getRandomPasswordCharacters(int pos) {
	    Random randomNum = new Random();
	    StringBuilder randomChar = new StringBuilder();
	    switch (pos) {
	        case 0:
	            randomChar.append(NUMBERS.charAt(randomNum.nextInt(NUMBERS.length() - 1)));
	            break;
	        case 1:
	            randomChar.append(UPPER_ALPHABETS.charAt(randomNum.nextInt(UPPER_ALPHABETS.length() - 1)));
	            break;
	        case 2:
	            randomChar.append(SPECIALCHARACTERS.charAt(randomNum.nextInt(SPECIALCHARACTERS.length() - 1)));
	            break;
	        case 3:
	            randomChar.append(LOWER_ALPHABETS.charAt(randomNum.nextInt(LOWER_ALPHABETS.length() - 1)));
	            break;
	    }
	    return randomChar.toString();

	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String result = Testing.getRandomPassword();
		System.out.println(result);
		//Testing.getCount();
	}

}
