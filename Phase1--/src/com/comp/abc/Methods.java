package com.comp.abc;

public class Methods {

	public static void main(String[] args) {
	
		Methods m = new Methods();
		m.addition(10,30);
		//Methods m1 = new Methods();
		m.subtraction(100.0,25.25);
		m.subtraction(75,25);
		
	}
	void addition(int number1,int number2)
	{
		int result =0;
		result=number1+number2;
		System.out.println("Addition of the given numbers: "+ result);
	}
	void subtraction(double firstnumber,double secondnumber)
	{
		double result = 0;
		result=firstnumber-secondnumber;
		System.out.println("Subtration of the given number: "+ result);
	}
	void subtraction(int first,int second)
	{
		int result = 0;
		result= first-second;
		System.out.println("Subtraction of the second time: "+ result);
	}

}
