package com.comp.abc;

public class ThrowException {

	public static void main(String[] args) {
		
		ThrowException te = new ThrowException();
		te.Retirement(35);
		ThrowException te1 = new ThrowException();
		te1.Retirement(60);
		

	}
	public void Retirement(int age) throws ArithmeticException 
	{
		if(age>=60)
		{
		throw new ArithmeticException("Its time for u r retirement so Happy Retirement: ");
		}
		else
		{
			System.out.println("You can enjoy you are work for somemore years.. ");
		}
	}
	

}


