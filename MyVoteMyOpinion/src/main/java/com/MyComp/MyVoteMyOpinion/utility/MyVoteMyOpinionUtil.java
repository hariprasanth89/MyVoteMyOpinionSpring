package com.MyComp.MyVoteMyOpinion.utility;

import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;

@Repository("myVoteMyOpinion")
public class MyVoteMyOpinionUtil {

	Logger logger = Logger.getLogger(MyVoteMyOpinionUtil.class);

	private static String baseURL = "http://localhost:8080/myvotemyopinion";
	// private static String forgotPasswordMail;
	private static String webBaseURL;
	// private static String signUpMail;
	private static String basePath;

	private static Gson gson;

	public static enum UserType {
		MasterAdmin, // 0
		STUDENT, // 1
		LECTURER, // 2
		COLLEGE, // 3

	};

	public static enum StatusType {
		PENDING, // 0
		ACCEPT, // 1
		REJECT // 2

	};

	public enum GenderID {
		MALE, // 0
		FEMALE, // 1
		OTHER // 2
	};

	public enum Location {
		ONLINE, // 0
		OFFCAMPUS, // 1
		ONCAMUS// 2
	};

	public static String STATUS = "status";
	public static String DATA = "data";
	public static String SUCCESS = "success";
	public static String FAIL = "fail";
	public static String USER_ID = "userID";
	public static String USER_TYPE = "userType";
	public static String USER_EXIST = "userExist";// "User already registerd with
    // this E-mail ID";
	
	
	
	public static String getWebBaseURL() {
	    return webBaseURL;
	  }
	
	 public static void setWebBaseURL(String webBaseURL) {
		 MyVoteMyOpinionUtil.webBaseURL = webBaseURL;
	 }
	 
	 public void setBaseURL(String baseURL) {
		 System.out.println("Base URL " + baseURL);
		 MyVoteMyOpinionUtil.baseURL  = baseURL;
	 }
	 
	 public static String getBaseURL() {
		    return baseURL;
		  }

		  public static String getBasePath() {
		    return basePath;
		  }
		  
		  public static void setBasePath(String basePath) {
			  MyVoteMyOpinionUtil.basePath = basePath;
		  }
		    
		  
		  
		  private static final String NUMBERS = "0123456789";
		  private static final String UPPER_ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  private static final String LOWER_ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
		  private static final String SPECIALCHARACTERS = "@#$%&*";
		  private static final int MINLENGTHOFPASSWORD = 8;

		  public static String getRandomPassword() {
		      StringBuilder password = new StringBuilder();
		      int j = 0;
		      for (int i = 0; i < MINLENGTHOFPASSWORD; i++) {
		          password.append(getRandomPasswordCharacters(j));
		          j++;
		          if (j == 3) {
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
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	 

}
