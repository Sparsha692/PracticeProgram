package com.comp.abc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter the numbers for the operations:=");
		Scanner scan=new Scanner(System.in);
		int one=scan.nextInt();
		int two= scan.nextInt();
		System.out.println("Enter your choice: ");
	    int option=scan.nextInt();
		double finalresult=0;

		switch(option)
		{
        case 1:
            finalresult=(one+two);
            break;
        case 2:
            finalresult=(one-two); 
            break;
        case 3:
            finalresult=(one*two); 
            break;
        case 4:
            finalresult=(one/two);
            break;
        
		}
        
		System.out.println("The result after the operation= " +finalresult);
	}
}

