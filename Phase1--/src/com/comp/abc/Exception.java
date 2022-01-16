package com.comp.abc;

import java.util.Scanner;

public class Exception{

	public static void main(String[] args) {
		
				Scanner theScan = new Scanner(System.in);
				
				System.out.println("Enter  numbers for the purpose of operation:...");
				
				int firstNumber = theScan.nextInt();
				
				int secondNumber = theScan.nextInt();
				
				Exception ex=new Exception();
				ex.modulo(firstNumber,secondNumber);
				ex.addition(firstNumber, secondNumber);
				ex.divideNumbers(firstNumber, secondNumber);
				ex. subtraction(firstNumber, secondNumber);
				
	}

			
			
			void modulo(int firstNumber, int secondNumber) throws ArithmeticException {
				
				int result = 0;

				result = firstNumber  % secondNumber ;
				System.out.println("Modulo is : " + result);
				}
			
				
		

			
    void addition(int firstNumber, int secondNumber)throws ArithmeticException {
	
	int result = 0;
	
		result = firstNumber +secondNumber;
		System.out.println("Addition is : " + result);
	
	
	
}
    void divideNumbers(int firstNumber, int secondNumber) throws ArithmeticException {
		
		int result = 0;
		
           result = firstNumber / secondNumber;
			System.out.println("Division is : " + result);
	
		
	}
    void subtraction(int firstNumber, int secondNumber)throws ArithmeticException {
		
		int result = 0;
	
			result = firstNumber - secondNumber;
			System.out.println("subtraction is : " + result);
	
		
	}

}












