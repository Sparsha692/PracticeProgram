package com.comp.abc;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		
				Scanner theScan = new Scanner(System.in);
				
				System.out.println("Enter two numbers for the purpose of addition:...");
				
				int firstNumber = theScan.nextInt();
				
				int secondNumber = theScan.nextInt();
				
				new TryCatch().addition(firstNumber, secondNumber);

			}
			
			void addition(int firstNumber, int secondNumber) {
				
				int result = 0;
				try {
					result = firstNumber +secondNumber;
					System.out.println("Addition is : " + result);
				}
				catch(ArithmeticException ae) {
					System.out.println("Sorry...");
				}
				
				
			}

		}

