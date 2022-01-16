package com.comp.abc;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
  
	    public static void main(String[] args) {
	       ArrayList<String> a = new ArrayList<String>();
	       a.add("divyaroyal@gmail.com");
	       a.add("lekharoyal.gmail.com");
	       a.add("divya%.com");
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String value = sc.nextLine();
	       System.out.println("The Email address " + value + " is " + (validation(value) ? "valid" : "invalid"));
	       
	   }
	
  public static boolean validation(String emails) {
		   String annotation = "^(.+)@(.+)$";
	       Pattern pattern = Pattern.compile(annotation);
	       Matcher matcher = pattern.matcher(emails);
	       return matcher.matches();

	       
	   }

	  
	   
}