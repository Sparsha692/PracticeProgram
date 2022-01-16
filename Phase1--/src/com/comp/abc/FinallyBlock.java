package com.comp.abc;

public class FinallyBlock {

	public static void main(String[] args) {
	FinallyBlock fb = new FinallyBlock();
	fb.addition(10, 20);

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
		finally
		{
			System.out.println("just to print the finally block...");
		}

}
}
